package com.henghao.service.impl;

import com.henghao.common.domain.entity.CarItude;
import com.henghao.common.result.Result;
import com.henghao.service.ICarItudeTestService;

import org.springframework.stereotype.Service;

@Service("carTest")
public class CarItudeTestServiceImpl implements ICarItudeTestService {

//    @Resource
//    private ICarItudeTestDao carDao;

    public Result addItude(CarItude carItude) {
        Result result = null;
/*
        String car_num = carItude.getCar_num();

        String longitude = carItude.getCar_longitude();

        String latitude = carItude.getCar_latitude();
        if ((car_num == null) || ("".equals(car_num))) {
            result = new Result(1, "车牌号为空", null);
            return result;
        }
        if ((longitude == null) || (latitude == null) || ("".equals(longitude)) || ("".equals(latitude))) {
            result = new Result(1, "用户上传经纬度为空", null);
            return result;
        }
        String upTime = DateUtils.getCurrentDate("yyyy-MM-dd HH:mm:ss");

        carItude.setCar_upTime(upTime);

        Itude cari = new Itude(longitude, latitude, upTime, car_num);
        try {
            this.carDao.addManyToMany(cari);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "车辆经纬度添加失败", null);
        }
        ItudeNum itudeNum = new ItudeNum(cari.getItude_id(), car_num, longitude, latitude, upTime);
        try {
            this.carDao.addItudeNum(itudeNum);
            result = new Result(0, "车辆经纬度添加成功", null);
        } catch (Exception e) {
            result = new Result(1, "车辆经纬度添加失败", null);
        }*/
        return result;
    }

    public Result findAllItude() {
        Result result = null;
/*
        String upTime = DateUtils.getCurrentDate("yyyy-MM-dd");
        try {
            List<Map<String, Object>> list = this.carDao.getAllItude(upTime);
            result = new Result(0, "nice", list);
        } catch (Exception e) {
            result = new Result(1, "no~~~", null);
            e.printStackTrace();
        }*/
        return result;
    }

    public Result findLatest() {
        Result result = null;/*
        try {
            List<Map<String, Object>> latest = this.carDao.getLatest();
            result = new Result(0, "nice", latest);
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result(0, "no", null);
        }*/
        return result;
    }

    public Result positionDeviation(String target) {
        Result result = null;
/*
        Map<String, Double> map_tude = BaiduMapUtil.getLngAndLat(target);
        int size = map_tude.size();
        if (size > 0) {
            Double x0 = (Double) map_tude.get("lng");

            Double y0 = (Double) map_tude.get("lat");

            double xi = 0.0D;

            double yi = 0.0D;

            Math.sqrt(Math.pow(xi - x0.doubleValue(), 2.0D) + Math.pow(yi - y0.doubleValue(), 2.0D));
        }
        result = new Result(1, "无法查询目标地址经纬度", null);*/
        return result;
    }
}
