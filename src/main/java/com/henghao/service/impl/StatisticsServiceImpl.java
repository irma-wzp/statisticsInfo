package com.henghao.service.impl;

import com.henghao.dao.IStatisticsDao;
import com.henghao.common.result.Result;
import com.henghao.service.IStatisticsService;
import com.henghao.util.BaiduMapUtil;
import com.henghao.util.DateUtils;
import com.henghao.util.DistanceUtil;
import com.henghao.common.vo.CarTargetVo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("statisticsService")
@SuppressWarnings("all")
public class StatisticsServiceImpl implements IStatisticsService {

//    @Resource
    private IStatisticsDao statisticsDao;
    Map<String, Object> resultMap = new HashMap();
    Map<String, Object> carMap = new HashMap();
    Map<String, Object> ajMap = new HashMap();
    Map<String, Object> csMap = new HashMap();
    Map<String, Object> fsMap = new HashMap();
    Map<String, Object> scMap = new HashMap();
    Map<String, Object> bfMap = new HashMap();
    Map<String, Object> csMap_month = new HashMap();
    Map<String, Object> fsMap_month = new HashMap();
    Map<String, Object> scMap_month = new HashMap();
    Map<String, Object> bfMap_month = new HashMap();

    public synchronized Result getAllInfo() {
        Result result = null;
        String currentDate = DateUtils.getCurrentDate("yyyy-MM-dd HH:mm");
        try {
            this.resultMap.put("PersonneStatistics",
                    this.statisticsDao.findPersonStatistics(currentDate));
        } catch (Exception e) {
            e.printStackTrace();
            this.resultMap.put("PersonneStatistics", null);
        }
        StringBuffer freeCar = new StringBuffer();
        StringBuffer outCar = new StringBuffer();
        StringBuffer upKeepCar = new StringBuffer();
        StringBuffer date = new StringBuffer();
        try {
            this.carMap.clear();
            String changeDay = currentDate;
            for (int i = 1; i <= 7; i++) {
                Map<String, Object> map = this.statisticsDao
                        .findCarStatistics(changeDay);
                String[] dates = changeDay.split("-");
                String now = dates[2];
                if (now.length() > 2) {
                    date.append(now.substring(0, 2) + ",");
                } else {
                    date.append(now + ",");
                }
                outCar.append(map.get("外出车辆") + ",");
                freeCar.append(map.get("空闲车辆") + ",");
                upKeepCar.append(map.get("保养车辆") + ",");

                changeDay = DateUtils.getSpecifiedDayAfter(changeDay,
                        "yyyy-MM-dd HH:mm");
            }
            this.carMap.put("freeCar", freeCar.substring(0, freeCar.length() - 1));
            this.carMap.put("outCar", outCar.substring(0, outCar.length() - 1));
            this.carMap.put("upKeepCar",
                    upKeepCar.substring(0, upKeepCar.length() - 1));
            this.carMap.put("date", date.substring(0, date.length() - 1));
            this.resultMap.put("CarStatistics", this.carMap);
        } catch (Exception e) {
            e.printStackTrace();
            this.resultMap.put("CarStatistics", null);
        }
        try {
            this.resultMap.put("GovernmentAffairs", this.statisticsDao.findAEAA());
        } catch (Exception e) {
            e.printStackTrace();
            this.resultMap.put("GovernmentAffairs", null);
        }
        result = new Result(0, "统计信息查询成功", this.resultMap);
        return result;
    }

    public Result getCaseCount() {
        Result result = null;

        String currentDate = DateUtils.getCurrentDate("yyyy-MM");

        String year = currentDate.substring(0, 4);

        int day = DateUtils.getCurrentMonthLastDay();

        String sql_cs = "select count(*) from tw_hz_log where FLOWID='sichu(chucishenqing)' and NEXTNODEIDS='End1;' ";

        String sql_fs = "select count(*) from tw_hz_log where FLOWID='sichu(fushen)'  and NEXTNODEIDS='End4;' ";

        String sql_sc = "select count(*) from tw_hz_log where FLOWID='feimeikuangshan(yichu)'  and (NEXTNODEIDS='End1;'  or NEXTNODEIDS='End9;') ";

        String sql_bf = "select count(*) from tw_hz_log where FLOWID='djbf'  and NEXTNODEIDS='End4;' ";
        try {
            for (int i = 1; i <= 12; i++) {
                String month = i+"";
                if (i < 10) {
                    month = "0" + i;
                }
                String countYear = " and ACTIONTIME like '" + year + "-" +
                        month + "%' ";

                this.csMap.put("month" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_cs + countYear)));
                this.fsMap.put("month" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_fs + countYear)));
                this.scMap.put("month" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_sc + countYear)));
                this.bfMap.put("month" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_bf + countYear)));
            }
            for (int i = 1; i < day; i++) {
                String countMonth = " and ACTIONTIME like '" + currentDate +
                        "-" + i + "%'";

                this.csMap_month.put("day" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_cs + countMonth)));
                this.fsMap_month.put("day" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_fs + countMonth)));
                this.scMap_month.put("day" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_sc + countMonth)));
                this.bfMap_month.put("day" + i,
                        Integer.valueOf(this.statisticsDao.getCount(sql_bf + countMonth)));
            }
            Map<String, Object> map_year = new HashMap();
            Map<String, Object> map_month = new HashMap();
            Map<String, Object> map_day = new HashMap();

            String countYear = " and ACTIONTIME like '" + year + "%'";
            map_year.put("yearSCCS", Integer.valueOf(this.statisticsDao.getCount(sql_cs + countYear)));
            map_year.put("yearSCFS", Integer.valueOf(this.statisticsDao.getCount(sql_fs + countYear)));
            map_year.put("yearSJSC", Integer.valueOf(this.statisticsDao.getCount(sql_sc + countYear)));
            map_year.put("yearDJBF", Integer.valueOf(this.statisticsDao.getCount(sql_bf + countYear)));

            map_month.put("monthSCCS", this.csMap);
            map_month.put("monthSCFS", this.fsMap);
            map_month.put("monthSJSC", this.scMap);
            map_month.put("monthDJBF", this.bfMap);

            map_day.put("daySCCS", this.csMap_month);
            map_day.put("daySCFS", this.fsMap_month);
            map_day.put("daySJSC", this.scMap_month);
            map_day.put("dayDJBF", this.bfMap_month);

            this.ajMap.put("countYear", map_year);
            this.ajMap.put("countMonth", map_month);
            this.ajMap.put("countDay", map_day);

            result = new Result(0, "查询成功", this.ajMap);
        } catch (Exception e) {
            result = new Result(1, "系统繁忙", null);
        }
        return result;
    }

    public Result getImportent() {
        Result result = null;

        Map<String, Object> impor_month = new HashMap();
        String sql_count = "SELECT COUNT(*) FROM aj_great_meeting ";

        impor_month.put("month", getMonth(sql_count));
        impor_month.put("history", getHistory(sql_count));
        impor_month.put("problem", getProblem(sql_count));
        impor_month.put("dtype", getDType());
        result = new Result(0, "重大决策查询成功", impor_month);
        return result;
    }

    private Map<String, Object> getDType() {
        Map<String, Object> map_dtype = new HashMap();

        String sql_dept_list = "SELECT DEPT_NAME FROM to_horizon_dept ";
        List<String> list_dept = this.statisticsDao.getStrings(sql_dept_list);

        String sql_count = "SELECT COUNT(m.MTINITIATOR) FROM aj_great_meeting m,to_horizon_user u,to_horizon_dept d,tor_horizon_user_dept ud WHERE u.ID=ud.USER_ID AND d.ID=ud.DEPT_ID AND m.MTINITIATOR=u.`NAME` AND d.DEPT_NAME='";
        for (int i = 0; i < list_dept.size(); i++) {
            String dept = (String) list_dept.get(i);

            int count = this.statisticsDao.getCount(sql_count + dept + "'");
            if (count > 0) {
                map_dtype.put(dept, Integer.valueOf(count));
            }
        }
        return map_dtype;
    }

    private Map<String, Object> getHistory(String sql_count) {
        Map<String, Object> map_history = new HashMap();

        String sql_month = "SELECT DISTINCT DATE_FORMAT(`SXJSRQ`,'%Y') years FROM aj_great_meeting ";
        List<String> list = this.statisticsDao.getStrings(sql_month);
        Map<String, Object> map_year = new HashMap();
        if (list.size() < 1) {
            return map_history;
        }
        for (int i = 0; i < list.size(); i++) {
            String yrea = (String) list.get(i);
            map_year.put(
                    yrea,

                    Integer.valueOf(this.statisticsDao.getCount(sql_count +
                            " WHERE MTTYPE='重大问题决策' AND DATE_FORMAT(`SXJSRQ`,'%Y-%m-%d') LIKE ('" +
                            yrea + "%') ")));
        }
        map_history.put("infact", map_year);
        map_history.put("expect", map_year);
        return map_history;
    }

    private Map<String, Object> getMonth(String sql_count) {
        Map<String, Object> map_month = new HashMap();

        String year = DateUtils.getCurrentDate("yyyy");
        String month = "";
        for (int i = 1; i < 13; i++) {
            if (i < 10) {
                month = "0" + i;
            }
            String date = year + "-" + month;
            map_month.put(i - 1+"",
                    Integer.valueOf(this.statisticsDao.getCount(sql_count +
                            " WHERE DATE_FORMAT(`SXJSRQ`,'%Y-%m-%d') LIKE ('" +
                            date + "%') ")));
        }
        return map_month;
    }

    private Map<String, Object> getProblem(String sql_count) {
        Map<String, Object> map_month = new HashMap();

        String sql = "SELECT Title,MTTYPE,MTINITIATOR FROM aj_great_meeting WHERE MTTYPE='重大问题决策' ";

        String year_now = DateUtils.getCurrentDate("yyyy");

        String year_last = Integer.parseInt(year_now) - 1+"";

        map_month
                .put("year_now",

                        Integer.valueOf(this.statisticsDao.getCount(sql_count +
                                " WHERE MTTYPE='重大问题决策' AND DATE_FORMAT(`SXJSRQ`,'%Y-%m-%d') LIKE ('" +
                                year_now + "%')")));

        map_month
                .put("year_last",

                        Integer.valueOf(this.statisticsDao.getCount(sql_count +
                                " WHERE MTTYPE='重大问题决策' AND DATE_FORMAT(`SXJSRQ`,'%Y-%m-%d') LIKE ('" +
                                year_last + "%')")));

        map_month.put("list", this.statisticsDao.getIMVo(sql));
        return map_month;
    }

    public Result positionDeviation() {
        Result result = null;

        List<CarTargetVo> list = this.statisticsDao.getCarTargetVo();

        int carSize = list.size();
        if (carSize > 0) {
            for (int i = 0; i < carSize; i++) {
                CarTargetVo carvo = (CarTargetVo) list.get(i);

                String target = carvo.getDESTINATIONS();
                if ((target != null) && (!"".equals(target))) {
                    Map<String, Double> map_tude = null;
                    try {
                        map_tude = BaiduMapUtil.getLngAndLat(target);
                    } catch (Exception e) {
                        map_tude = null;
                    }
                    if (map_tude != null) {
                        int size = map_tude.size();
                        if (size > 0) {
                            Double y0 = (Double) map_tude.get("lng");

                            Double x0 = (Double) map_tude.get("lat");

                            Map<String, Double> carLatest = this.statisticsDao
                                    .getCarLatest(carvo.getCARNO(),
                                            carvo.getSTARTTIME(),
                                            carvo.getENDTIME());

                            double yi = ((Double) carLatest.get("lng")).doubleValue();

                            double xi = ((Double) carLatest.get("lat")).doubleValue();
                            if ((xi != 0.0D) || (yi != 0.0D)) {
                                DistanceUtil.getDistanceFromTwoPoints(x0.doubleValue(), y0.doubleValue(),
                                        xi, yi);
                            }
                        }
                    }
                }
            }
        }
        result = new Result(1, "无法查询目标地址经纬度", null);
        return result;
    }
}
