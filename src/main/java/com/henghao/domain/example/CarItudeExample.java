package com.henghao.domain.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wzp
 * @description: mybatis逆向生成 - 辅助类，若不使用可忽略。
 * @create on 2017/12/3.
 */
@SuppressWarnings("all")
public class CarItudeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarItudeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCarTestIdIsNull() {
            addCriterion("car_test_id is null");
            return (Criteria) this;
        }

        public Criteria andCarTestIdIsNotNull() {
            addCriterion("car_test_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarTestIdEqualTo(Integer value) {
            addCriterion("car_test_id =", value, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdNotEqualTo(Integer value) {
            addCriterion("car_test_id <>", value, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdGreaterThan(Integer value) {
            addCriterion("car_test_id >", value, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_test_id >=", value, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdLessThan(Integer value) {
            addCriterion("car_test_id <", value, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_test_id <=", value, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdIn(List<Integer> values) {
            addCriterion("car_test_id in", values, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdNotIn(List<Integer> values) {
            addCriterion("car_test_id not in", values, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdBetween(Integer value1, Integer value2) {
            addCriterion("car_test_id between", value1, value2, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarTestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_test_id not between", value1, value2, "carTestId");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeIsNull() {
            addCriterion("car_latitude is null");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeIsNotNull() {
            addCriterion("car_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeEqualTo(String value) {
            addCriterion("car_latitude =", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeNotEqualTo(String value) {
            addCriterion("car_latitude <>", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeGreaterThan(String value) {
            addCriterion("car_latitude >", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("car_latitude >=", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeLessThan(String value) {
            addCriterion("car_latitude <", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeLessThanOrEqualTo(String value) {
            addCriterion("car_latitude <=", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeLike(String value) {
            addCriterion("car_latitude like", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeNotLike(String value) {
            addCriterion("car_latitude not like", value, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeIn(List<String> values) {
            addCriterion("car_latitude in", values, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeNotIn(List<String> values) {
            addCriterion("car_latitude not in", values, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeBetween(String value1, String value2) {
            addCriterion("car_latitude between", value1, value2, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLatitudeNotBetween(String value1, String value2) {
            addCriterion("car_latitude not between", value1, value2, "carLatitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeIsNull() {
            addCriterion("car_longitude is null");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeIsNotNull() {
            addCriterion("car_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeEqualTo(String value) {
            addCriterion("car_longitude =", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeNotEqualTo(String value) {
            addCriterion("car_longitude <>", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeGreaterThan(String value) {
            addCriterion("car_longitude >", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("car_longitude >=", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeLessThan(String value) {
            addCriterion("car_longitude <", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeLessThanOrEqualTo(String value) {
            addCriterion("car_longitude <=", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeLike(String value) {
            addCriterion("car_longitude like", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeNotLike(String value) {
            addCriterion("car_longitude not like", value, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeIn(List<String> values) {
            addCriterion("car_longitude in", values, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeNotIn(List<String> values) {
            addCriterion("car_longitude not in", values, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeBetween(String value1, String value2) {
            addCriterion("car_longitude between", value1, value2, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarLongitudeNotBetween(String value1, String value2) {
            addCriterion("car_longitude not between", value1, value2, "carLongitude");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNull() {
            addCriterion("car_num is null");
            return (Criteria) this;
        }

        public Criteria andCarNumIsNotNull() {
            addCriterion("car_num is not null");
            return (Criteria) this;
        }

        public Criteria andCarNumEqualTo(String value) {
            addCriterion("car_num =", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotEqualTo(String value) {
            addCriterion("car_num <>", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThan(String value) {
            addCriterion("car_num >", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumGreaterThanOrEqualTo(String value) {
            addCriterion("car_num >=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThan(String value) {
            addCriterion("car_num <", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLessThanOrEqualTo(String value) {
            addCriterion("car_num <=", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumLike(String value) {
            addCriterion("car_num like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotLike(String value) {
            addCriterion("car_num not like", value, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumIn(List<String> values) {
            addCriterion("car_num in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotIn(List<String> values) {
            addCriterion("car_num not in", values, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumBetween(String value1, String value2) {
            addCriterion("car_num between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarNumNotBetween(String value1, String value2) {
            addCriterion("car_num not between", value1, value2, "carNum");
            return (Criteria) this;
        }

        public Criteria andCarUptimeIsNull() {
            addCriterion("car_upTime is null");
            return (Criteria) this;
        }

        public Criteria andCarUptimeIsNotNull() {
            addCriterion("car_upTime is not null");
            return (Criteria) this;
        }

        public Criteria andCarUptimeEqualTo(String value) {
            addCriterion("car_upTime =", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeNotEqualTo(String value) {
            addCriterion("car_upTime <>", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeGreaterThan(String value) {
            addCriterion("car_upTime >", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeGreaterThanOrEqualTo(String value) {
            addCriterion("car_upTime >=", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeLessThan(String value) {
            addCriterion("car_upTime <", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeLessThanOrEqualTo(String value) {
            addCriterion("car_upTime <=", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeLike(String value) {
            addCriterion("car_upTime like", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeNotLike(String value) {
            addCriterion("car_upTime not like", value, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeIn(List<String> values) {
            addCriterion("car_upTime in", values, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeNotIn(List<String> values) {
            addCriterion("car_upTime not in", values, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeBetween(String value1, String value2) {
            addCriterion("car_upTime between", value1, value2, "carUptime");
            return (Criteria) this;
        }

        public Criteria andCarUptimeNotBetween(String value1, String value2) {
            addCriterion("car_upTime not between", value1, value2, "carUptime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}