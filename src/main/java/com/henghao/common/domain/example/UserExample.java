package com.henghao.common.domain.example;

import java.util.ArrayList;
import java.util.List;
/**
 * @author wzp
 * @description: mybatis逆向生成 - 辅助类，若不使用可忽略。
 * @create on 2017/12/3.
 */
@SuppressWarnings("all")
public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("LOGIN_NAME =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("LOGIN_NAME <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("LOGIN_NAME >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("LOGIN_NAME <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_NAME <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("LOGIN_NAME like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("LOGIN_NAME not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("LOGIN_NAME in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("LOGIN_NAME not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("LOGIN_NAME not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("ACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("ACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("ACTIVE =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("ACTIVE <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("ACTIVE >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("ACTIVE >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("ACTIVE <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("ACTIVE <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("ACTIVE in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("ACTIVE not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVE between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("ACTIVE not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNull() {
            addCriterion("USER_STYLE is null");
            return (Criteria) this;
        }

        public Criteria andUserStyleIsNotNull() {
            addCriterion("USER_STYLE is not null");
            return (Criteria) this;
        }

        public Criteria andUserStyleEqualTo(String value) {
            addCriterion("USER_STYLE =", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotEqualTo(String value) {
            addCriterion("USER_STYLE <>", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThan(String value) {
            addCriterion("USER_STYLE >", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STYLE >=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThan(String value) {
            addCriterion("USER_STYLE <", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLessThanOrEqualTo(String value) {
            addCriterion("USER_STYLE <=", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleLike(String value) {
            addCriterion("USER_STYLE like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotLike(String value) {
            addCriterion("USER_STYLE not like", value, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleIn(List<String> values) {
            addCriterion("USER_STYLE in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotIn(List<String> values) {
            addCriterion("USER_STYLE not in", values, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleBetween(String value1, String value2) {
            addCriterion("USER_STYLE between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andUserStyleNotBetween(String value1, String value2) {
            addCriterion("USER_STYLE not between", value1, value2, "userStyle");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("DELETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("DELETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(String value) {
            addCriterion("DELETE_TIME =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(String value) {
            addCriterion("DELETE_TIME <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(String value) {
            addCriterion("DELETE_TIME >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DELETE_TIME >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(String value) {
            addCriterion("DELETE_TIME <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(String value) {
            addCriterion("DELETE_TIME <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLike(String value) {
            addCriterion("DELETE_TIME like", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotLike(String value) {
            addCriterion("DELETE_TIME not like", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<String> values) {
            addCriterion("DELETE_TIME in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<String> values) {
            addCriterion("DELETE_TIME not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(String value1, String value2) {
            addCriterion("DELETE_TIME between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(String value1, String value2) {
            addCriterion("DELETE_TIME not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeEqualTo(String value) {
            addCriterion("REGISTER_TIME =", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotEqualTo(String value) {
            addCriterion("REGISTER_TIME <>", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThan(String value) {
            addCriterion("REGISTER_TIME >", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME >=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThan(String value) {
            addCriterion("REGISTER_TIME <", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_TIME <=", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeLike(String value) {
            addCriterion("REGISTER_TIME like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotLike(String value) {
            addCriterion("REGISTER_TIME not like", value, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeIn(List<String> values) {
            addCriterion("REGISTER_TIME in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotIn(List<String> values) {
            addCriterion("REGISTER_TIME not in", values, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andRegisterTimeNotBetween(String value1, String value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "registerTime");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("FIRSTNAME is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("FIRSTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("FIRSTNAME =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("FIRSTNAME <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("FIRSTNAME >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("FIRSTNAME >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("FIRSTNAME <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("FIRSTNAME <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("FIRSTNAME like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("FIRSTNAME not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("FIRSTNAME in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("FIRSTNAME not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("FIRSTNAME between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("FIRSTNAME not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andGivennameIsNull() {
            addCriterion("GIVENNAME is null");
            return (Criteria) this;
        }

        public Criteria andGivennameIsNotNull() {
            addCriterion("GIVENNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGivennameEqualTo(String value) {
            addCriterion("GIVENNAME =", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameNotEqualTo(String value) {
            addCriterion("GIVENNAME <>", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameGreaterThan(String value) {
            addCriterion("GIVENNAME >", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameGreaterThanOrEqualTo(String value) {
            addCriterion("GIVENNAME >=", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameLessThan(String value) {
            addCriterion("GIVENNAME <", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameLessThanOrEqualTo(String value) {
            addCriterion("GIVENNAME <=", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameLike(String value) {
            addCriterion("GIVENNAME like", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameNotLike(String value) {
            addCriterion("GIVENNAME not like", value, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameIn(List<String> values) {
            addCriterion("GIVENNAME in", values, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameNotIn(List<String> values) {
            addCriterion("GIVENNAME not in", values, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameBetween(String value1, String value2) {
            addCriterion("GIVENNAME between", value1, value2, "givenname");
            return (Criteria) this;
        }

        public Criteria andGivennameNotBetween(String value1, String value2) {
            addCriterion("GIVENNAME not between", value1, value2, "givenname");
            return (Criteria) this;
        }

        public Criteria andEmpNumIsNull() {
            addCriterion("EMP_NUM is null");
            return (Criteria) this;
        }

        public Criteria andEmpNumIsNotNull() {
            addCriterion("EMP_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNumEqualTo(String value) {
            addCriterion("EMP_NUM =", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumNotEqualTo(String value) {
            addCriterion("EMP_NUM <>", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumGreaterThan(String value) {
            addCriterion("EMP_NUM >", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumGreaterThanOrEqualTo(String value) {
            addCriterion("EMP_NUM >=", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumLessThan(String value) {
            addCriterion("EMP_NUM <", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumLessThanOrEqualTo(String value) {
            addCriterion("EMP_NUM <=", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumLike(String value) {
            addCriterion("EMP_NUM like", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumNotLike(String value) {
            addCriterion("EMP_NUM not like", value, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumIn(List<String> values) {
            addCriterion("EMP_NUM in", values, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumNotIn(List<String> values) {
            addCriterion("EMP_NUM not in", values, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumBetween(String value1, String value2) {
            addCriterion("EMP_NUM between", value1, value2, "empNum");
            return (Criteria) this;
        }

        public Criteria andEmpNumNotBetween(String value1, String value2) {
            addCriterion("EMP_NUM not between", value1, value2, "empNum");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("CERTIFICATE is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("CERTIFICATE is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("CERTIFICATE =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("CERTIFICATE <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("CERTIFICATE >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("CERTIFICATE <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("CERTIFICATE like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("CERTIFICATE not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("CERTIFICATE in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("CERTIFICATE not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("CERTIFICATE between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("BIRTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("BIRTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(String value) {
            addCriterion("BIRTH_DATE =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(String value) {
            addCriterion("BIRTH_DATE <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(String value) {
            addCriterion("BIRTH_DATE >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH_DATE >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(String value) {
            addCriterion("BIRTH_DATE <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(String value) {
            addCriterion("BIRTH_DATE <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLike(String value) {
            addCriterion("BIRTH_DATE like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotLike(String value) {
            addCriterion("BIRTH_DATE not like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<String> values) {
            addCriterion("BIRTH_DATE in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<String> values) {
            addCriterion("BIRTH_DATE not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(String value1, String value2) {
            addCriterion("BIRTH_DATE between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(String value1, String value2) {
            addCriterion("BIRTH_DATE not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andHasImageIsNull() {
            addCriterion("HAS_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andHasImageIsNotNull() {
            addCriterion("HAS_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andHasImageEqualTo(Integer value) {
            addCriterion("HAS_IMAGE =", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageNotEqualTo(Integer value) {
            addCriterion("HAS_IMAGE <>", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageGreaterThan(Integer value) {
            addCriterion("HAS_IMAGE >", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageGreaterThanOrEqualTo(Integer value) {
            addCriterion("HAS_IMAGE >=", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageLessThan(Integer value) {
            addCriterion("HAS_IMAGE <", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageLessThanOrEqualTo(Integer value) {
            addCriterion("HAS_IMAGE <=", value, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageIn(List<Integer> values) {
            addCriterion("HAS_IMAGE in", values, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageNotIn(List<Integer> values) {
            addCriterion("HAS_IMAGE not in", values, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageBetween(Integer value1, Integer value2) {
            addCriterion("HAS_IMAGE between", value1, value2, "hasImage");
            return (Criteria) this;
        }

        public Criteria andHasImageNotBetween(Integer value1, Integer value2) {
            addCriterion("HAS_IMAGE not between", value1, value2, "hasImage");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("TELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("TELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("TELEPHONE =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("TELEPHONE <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("TELEPHONE >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("TELEPHONE <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("TELEPHONE like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("TELEPHONE not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("TELEPHONE in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("TELEPHONE not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("TELEPHONE between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNull() {
            addCriterion("CELLPHONE is null");
            return (Criteria) this;
        }

        public Criteria andCellphoneIsNotNull() {
            addCriterion("CELLPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andCellphoneEqualTo(String value) {
            addCriterion("CELLPHONE =", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotEqualTo(String value) {
            addCriterion("CELLPHONE <>", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThan(String value) {
            addCriterion("CELLPHONE >", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneGreaterThanOrEqualTo(String value) {
            addCriterion("CELLPHONE >=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThan(String value) {
            addCriterion("CELLPHONE <", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLessThanOrEqualTo(String value) {
            addCriterion("CELLPHONE <=", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneLike(String value) {
            addCriterion("CELLPHONE like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotLike(String value) {
            addCriterion("CELLPHONE not like", value, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneIn(List<String> values) {
            addCriterion("CELLPHONE in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotIn(List<String> values) {
            addCriterion("CELLPHONE not in", values, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneBetween(String value1, String value2) {
            addCriterion("CELLPHONE between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCellphoneNotBetween(String value1, String value2) {
            addCriterion("CELLPHONE not between", value1, value2, "cellphone");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNull() {
            addCriterion("CERT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCertTypeIsNotNull() {
            addCriterion("CERT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCertTypeEqualTo(String value) {
            addCriterion("CERT_TYPE =", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotEqualTo(String value) {
            addCriterion("CERT_TYPE <>", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThan(String value) {
            addCriterion("CERT_TYPE >", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE >=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThan(String value) {
            addCriterion("CERT_TYPE <", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLessThanOrEqualTo(String value) {
            addCriterion("CERT_TYPE <=", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeLike(String value) {
            addCriterion("CERT_TYPE like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotLike(String value) {
            addCriterion("CERT_TYPE not like", value, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeIn(List<String> values) {
            addCriterion("CERT_TYPE in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotIn(List<String> values) {
            addCriterion("CERT_TYPE not in", values, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeBetween(String value1, String value2) {
            addCriterion("CERT_TYPE between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertTypeNotBetween(String value1, String value2) {
            addCriterion("CERT_TYPE not between", value1, value2, "certType");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("CERT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("CERT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("CERT_NO =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("CERT_NO <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("CERT_NO >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERT_NO >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("CERT_NO <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("CERT_NO <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("CERT_NO like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("CERT_NO not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("CERT_NO in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("CERT_NO not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("CERT_NO between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("CERT_NO not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("POSTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("POSTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("POSTCODE =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("POSTCODE <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("POSTCODE >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSTCODE >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("POSTCODE <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("POSTCODE <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("POSTCODE like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("POSTCODE not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("POSTCODE in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("POSTCODE not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("POSTCODE between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("POSTCODE not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("IP is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("IP is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("IP =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("IP <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("IP >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("IP >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("IP <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("IP <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("IP like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("IP not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("IP in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("IP not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("IP between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("IP not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andSecIdIsNull() {
            addCriterion("SEC_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecIdIsNotNull() {
            addCriterion("SEC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecIdEqualTo(String value) {
            addCriterion("SEC_ID =", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdNotEqualTo(String value) {
            addCriterion("SEC_ID <>", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdGreaterThan(String value) {
            addCriterion("SEC_ID >", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdGreaterThanOrEqualTo(String value) {
            addCriterion("SEC_ID >=", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdLessThan(String value) {
            addCriterion("SEC_ID <", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdLessThanOrEqualTo(String value) {
            addCriterion("SEC_ID <=", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdLike(String value) {
            addCriterion("SEC_ID like", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdNotLike(String value) {
            addCriterion("SEC_ID not like", value, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdIn(List<String> values) {
            addCriterion("SEC_ID in", values, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdNotIn(List<String> values) {
            addCriterion("SEC_ID not in", values, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdBetween(String value1, String value2) {
            addCriterion("SEC_ID between", value1, value2, "secId");
            return (Criteria) this;
        }

        public Criteria andSecIdNotBetween(String value1, String value2) {
            addCriterion("SEC_ID not between", value1, value2, "secId");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNull() {
            addCriterion("ENGNAME is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("ENGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("ENGNAME =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("ENGNAME <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("ENGNAME >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGNAME >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("ENGNAME <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("ENGNAME <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("ENGNAME like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("ENGNAME not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("ENGNAME in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("ENGNAME not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("ENGNAME between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("ENGNAME not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andDnIsNull() {
            addCriterion("DN is null");
            return (Criteria) this;
        }

        public Criteria andDnIsNotNull() {
            addCriterion("DN is not null");
            return (Criteria) this;
        }

        public Criteria andDnEqualTo(String value) {
            addCriterion("DN =", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotEqualTo(String value) {
            addCriterion("DN <>", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThan(String value) {
            addCriterion("DN >", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnGreaterThanOrEqualTo(String value) {
            addCriterion("DN >=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThan(String value) {
            addCriterion("DN <", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLessThanOrEqualTo(String value) {
            addCriterion("DN <=", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnLike(String value) {
            addCriterion("DN like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotLike(String value) {
            addCriterion("DN not like", value, "dn");
            return (Criteria) this;
        }

        public Criteria andDnIn(List<String> values) {
            addCriterion("DN in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotIn(List<String> values) {
            addCriterion("DN not in", values, "dn");
            return (Criteria) this;
        }

        public Criteria andDnBetween(String value1, String value2) {
            addCriterion("DN between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andDnNotBetween(String value1, String value2) {
            addCriterion("DN not between", value1, value2, "dn");
            return (Criteria) this;
        }

        public Criteria andWorkDescIsNull() {
            addCriterion("WORK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andWorkDescIsNotNull() {
            addCriterion("WORK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDescEqualTo(String value) {
            addCriterion("WORK_DESC =", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescNotEqualTo(String value) {
            addCriterion("WORK_DESC <>", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescGreaterThan(String value) {
            addCriterion("WORK_DESC >", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_DESC >=", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescLessThan(String value) {
            addCriterion("WORK_DESC <", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescLessThanOrEqualTo(String value) {
            addCriterion("WORK_DESC <=", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescLike(String value) {
            addCriterion("WORK_DESC like", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescNotLike(String value) {
            addCriterion("WORK_DESC not like", value, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescIn(List<String> values) {
            addCriterion("WORK_DESC in", values, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescNotIn(List<String> values) {
            addCriterion("WORK_DESC not in", values, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescBetween(String value1, String value2) {
            addCriterion("WORK_DESC between", value1, value2, "workDesc");
            return (Criteria) this;
        }

        public Criteria andWorkDescNotBetween(String value1, String value2) {
            addCriterion("WORK_DESC not between", value1, value2, "workDesc");
            return (Criteria) this;
        }

        public Criteria andF1IsNull() {
            addCriterion("F1 is null");
            return (Criteria) this;
        }

        public Criteria andF1IsNotNull() {
            addCriterion("F1 is not null");
            return (Criteria) this;
        }

        public Criteria andF1EqualTo(String value) {
            addCriterion("F1 =", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotEqualTo(String value) {
            addCriterion("F1 <>", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThan(String value) {
            addCriterion("F1 >", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1GreaterThanOrEqualTo(String value) {
            addCriterion("F1 >=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThan(String value) {
            addCriterion("F1 <", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1LessThanOrEqualTo(String value) {
            addCriterion("F1 <=", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Like(String value) {
            addCriterion("F1 like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotLike(String value) {
            addCriterion("F1 not like", value, "f1");
            return (Criteria) this;
        }

        public Criteria andF1In(List<String> values) {
            addCriterion("F1 in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotIn(List<String> values) {
            addCriterion("F1 not in", values, "f1");
            return (Criteria) this;
        }

        public Criteria andF1Between(String value1, String value2) {
            addCriterion("F1 between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF1NotBetween(String value1, String value2) {
            addCriterion("F1 not between", value1, value2, "f1");
            return (Criteria) this;
        }

        public Criteria andF2IsNull() {
            addCriterion("F2 is null");
            return (Criteria) this;
        }

        public Criteria andF2IsNotNull() {
            addCriterion("F2 is not null");
            return (Criteria) this;
        }

        public Criteria andF2EqualTo(String value) {
            addCriterion("F2 =", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotEqualTo(String value) {
            addCriterion("F2 <>", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThan(String value) {
            addCriterion("F2 >", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2GreaterThanOrEqualTo(String value) {
            addCriterion("F2 >=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThan(String value) {
            addCriterion("F2 <", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2LessThanOrEqualTo(String value) {
            addCriterion("F2 <=", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Like(String value) {
            addCriterion("F2 like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotLike(String value) {
            addCriterion("F2 not like", value, "f2");
            return (Criteria) this;
        }

        public Criteria andF2In(List<String> values) {
            addCriterion("F2 in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotIn(List<String> values) {
            addCriterion("F2 not in", values, "f2");
            return (Criteria) this;
        }

        public Criteria andF2Between(String value1, String value2) {
            addCriterion("F2 between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF2NotBetween(String value1, String value2) {
            addCriterion("F2 not between", value1, value2, "f2");
            return (Criteria) this;
        }

        public Criteria andF3IsNull() {
            addCriterion("F3 is null");
            return (Criteria) this;
        }

        public Criteria andF3IsNotNull() {
            addCriterion("F3 is not null");
            return (Criteria) this;
        }

        public Criteria andF3EqualTo(String value) {
            addCriterion("F3 =", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotEqualTo(String value) {
            addCriterion("F3 <>", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThan(String value) {
            addCriterion("F3 >", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3GreaterThanOrEqualTo(String value) {
            addCriterion("F3 >=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThan(String value) {
            addCriterion("F3 <", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3LessThanOrEqualTo(String value) {
            addCriterion("F3 <=", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Like(String value) {
            addCriterion("F3 like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotLike(String value) {
            addCriterion("F3 not like", value, "f3");
            return (Criteria) this;
        }

        public Criteria andF3In(List<String> values) {
            addCriterion("F3 in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotIn(List<String> values) {
            addCriterion("F3 not in", values, "f3");
            return (Criteria) this;
        }

        public Criteria andF3Between(String value1, String value2) {
            addCriterion("F3 between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF3NotBetween(String value1, String value2) {
            addCriterion("F3 not between", value1, value2, "f3");
            return (Criteria) this;
        }

        public Criteria andF4IsNull() {
            addCriterion("F4 is null");
            return (Criteria) this;
        }

        public Criteria andF4IsNotNull() {
            addCriterion("F4 is not null");
            return (Criteria) this;
        }

        public Criteria andF4EqualTo(String value) {
            addCriterion("F4 =", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotEqualTo(String value) {
            addCriterion("F4 <>", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThan(String value) {
            addCriterion("F4 >", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4GreaterThanOrEqualTo(String value) {
            addCriterion("F4 >=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThan(String value) {
            addCriterion("F4 <", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4LessThanOrEqualTo(String value) {
            addCriterion("F4 <=", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Like(String value) {
            addCriterion("F4 like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotLike(String value) {
            addCriterion("F4 not like", value, "f4");
            return (Criteria) this;
        }

        public Criteria andF4In(List<String> values) {
            addCriterion("F4 in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotIn(List<String> values) {
            addCriterion("F4 not in", values, "f4");
            return (Criteria) this;
        }

        public Criteria andF4Between(String value1, String value2) {
            addCriterion("F4 between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF4NotBetween(String value1, String value2) {
            addCriterion("F4 not between", value1, value2, "f4");
            return (Criteria) this;
        }

        public Criteria andF5IsNull() {
            addCriterion("F5 is null");
            return (Criteria) this;
        }

        public Criteria andF5IsNotNull() {
            addCriterion("F5 is not null");
            return (Criteria) this;
        }

        public Criteria andF5EqualTo(String value) {
            addCriterion("F5 =", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotEqualTo(String value) {
            addCriterion("F5 <>", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThan(String value) {
            addCriterion("F5 >", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5GreaterThanOrEqualTo(String value) {
            addCriterion("F5 >=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThan(String value) {
            addCriterion("F5 <", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5LessThanOrEqualTo(String value) {
            addCriterion("F5 <=", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Like(String value) {
            addCriterion("F5 like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotLike(String value) {
            addCriterion("F5 not like", value, "f5");
            return (Criteria) this;
        }

        public Criteria andF5In(List<String> values) {
            addCriterion("F5 in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotIn(List<String> values) {
            addCriterion("F5 not in", values, "f5");
            return (Criteria) this;
        }

        public Criteria andF5Between(String value1, String value2) {
            addCriterion("F5 between", value1, value2, "f5");
            return (Criteria) this;
        }

        public Criteria andF5NotBetween(String value1, String value2) {
            addCriterion("F5 not between", value1, value2, "f5");
            return (Criteria) this;
        }

        public Criteria andF6IsNull() {
            addCriterion("F6 is null");
            return (Criteria) this;
        }

        public Criteria andF6IsNotNull() {
            addCriterion("F6 is not null");
            return (Criteria) this;
        }

        public Criteria andF6EqualTo(String value) {
            addCriterion("F6 =", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotEqualTo(String value) {
            addCriterion("F6 <>", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6GreaterThan(String value) {
            addCriterion("F6 >", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6GreaterThanOrEqualTo(String value) {
            addCriterion("F6 >=", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6LessThan(String value) {
            addCriterion("F6 <", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6LessThanOrEqualTo(String value) {
            addCriterion("F6 <=", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6Like(String value) {
            addCriterion("F6 like", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotLike(String value) {
            addCriterion("F6 not like", value, "f6");
            return (Criteria) this;
        }

        public Criteria andF6In(List<String> values) {
            addCriterion("F6 in", values, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotIn(List<String> values) {
            addCriterion("F6 not in", values, "f6");
            return (Criteria) this;
        }

        public Criteria andF6Between(String value1, String value2) {
            addCriterion("F6 between", value1, value2, "f6");
            return (Criteria) this;
        }

        public Criteria andF6NotBetween(String value1, String value2) {
            addCriterion("F6 not between", value1, value2, "f6");
            return (Criteria) this;
        }

        public Criteria andF7IsNull() {
            addCriterion("F7 is null");
            return (Criteria) this;
        }

        public Criteria andF7IsNotNull() {
            addCriterion("F7 is not null");
            return (Criteria) this;
        }

        public Criteria andF7EqualTo(String value) {
            addCriterion("F7 =", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotEqualTo(String value) {
            addCriterion("F7 <>", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7GreaterThan(String value) {
            addCriterion("F7 >", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7GreaterThanOrEqualTo(String value) {
            addCriterion("F7 >=", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7LessThan(String value) {
            addCriterion("F7 <", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7LessThanOrEqualTo(String value) {
            addCriterion("F7 <=", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7Like(String value) {
            addCriterion("F7 like", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotLike(String value) {
            addCriterion("F7 not like", value, "f7");
            return (Criteria) this;
        }

        public Criteria andF7In(List<String> values) {
            addCriterion("F7 in", values, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotIn(List<String> values) {
            addCriterion("F7 not in", values, "f7");
            return (Criteria) this;
        }

        public Criteria andF7Between(String value1, String value2) {
            addCriterion("F7 between", value1, value2, "f7");
            return (Criteria) this;
        }

        public Criteria andF7NotBetween(String value1, String value2) {
            addCriterion("F7 not between", value1, value2, "f7");
            return (Criteria) this;
        }

        public Criteria andF8IsNull() {
            addCriterion("F8 is null");
            return (Criteria) this;
        }

        public Criteria andF8IsNotNull() {
            addCriterion("F8 is not null");
            return (Criteria) this;
        }

        public Criteria andF8EqualTo(String value) {
            addCriterion("F8 =", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotEqualTo(String value) {
            addCriterion("F8 <>", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8GreaterThan(String value) {
            addCriterion("F8 >", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8GreaterThanOrEqualTo(String value) {
            addCriterion("F8 >=", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8LessThan(String value) {
            addCriterion("F8 <", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8LessThanOrEqualTo(String value) {
            addCriterion("F8 <=", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8Like(String value) {
            addCriterion("F8 like", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotLike(String value) {
            addCriterion("F8 not like", value, "f8");
            return (Criteria) this;
        }

        public Criteria andF8In(List<String> values) {
            addCriterion("F8 in", values, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotIn(List<String> values) {
            addCriterion("F8 not in", values, "f8");
            return (Criteria) this;
        }

        public Criteria andF8Between(String value1, String value2) {
            addCriterion("F8 between", value1, value2, "f8");
            return (Criteria) this;
        }

        public Criteria andF8NotBetween(String value1, String value2) {
            addCriterion("F8 not between", value1, value2, "f8");
            return (Criteria) this;
        }

        public Criteria andF9IsNull() {
            addCriterion("F9 is null");
            return (Criteria) this;
        }

        public Criteria andF9IsNotNull() {
            addCriterion("F9 is not null");
            return (Criteria) this;
        }

        public Criteria andF9EqualTo(String value) {
            addCriterion("F9 =", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotEqualTo(String value) {
            addCriterion("F9 <>", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9GreaterThan(String value) {
            addCriterion("F9 >", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9GreaterThanOrEqualTo(String value) {
            addCriterion("F9 >=", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9LessThan(String value) {
            addCriterion("F9 <", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9LessThanOrEqualTo(String value) {
            addCriterion("F9 <=", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9Like(String value) {
            addCriterion("F9 like", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotLike(String value) {
            addCriterion("F9 not like", value, "f9");
            return (Criteria) this;
        }

        public Criteria andF9In(List<String> values) {
            addCriterion("F9 in", values, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotIn(List<String> values) {
            addCriterion("F9 not in", values, "f9");
            return (Criteria) this;
        }

        public Criteria andF9Between(String value1, String value2) {
            addCriterion("F9 between", value1, value2, "f9");
            return (Criteria) this;
        }

        public Criteria andF9NotBetween(String value1, String value2) {
            addCriterion("F9 not between", value1, value2, "f9");
            return (Criteria) this;
        }

        public Criteria andF10IsNull() {
            addCriterion("F10 is null");
            return (Criteria) this;
        }

        public Criteria andF10IsNotNull() {
            addCriterion("F10 is not null");
            return (Criteria) this;
        }

        public Criteria andF10EqualTo(String value) {
            addCriterion("F10 =", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotEqualTo(String value) {
            addCriterion("F10 <>", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThan(String value) {
            addCriterion("F10 >", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10GreaterThanOrEqualTo(String value) {
            addCriterion("F10 >=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThan(String value) {
            addCriterion("F10 <", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10LessThanOrEqualTo(String value) {
            addCriterion("F10 <=", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Like(String value) {
            addCriterion("F10 like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotLike(String value) {
            addCriterion("F10 not like", value, "f10");
            return (Criteria) this;
        }

        public Criteria andF10In(List<String> values) {
            addCriterion("F10 in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotIn(List<String> values) {
            addCriterion("F10 not in", values, "f10");
            return (Criteria) this;
        }

        public Criteria andF10Between(String value1, String value2) {
            addCriterion("F10 between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andF10NotBetween(String value1, String value2) {
            addCriterion("F10 not between", value1, value2, "f10");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeIsNull() {
            addCriterion("TELEPHONE_HOME is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeIsNotNull() {
            addCriterion("TELEPHONE_HOME is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeEqualTo(String value) {
            addCriterion("TELEPHONE_HOME =", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeNotEqualTo(String value) {
            addCriterion("TELEPHONE_HOME <>", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeGreaterThan(String value) {
            addCriterion("TELEPHONE_HOME >", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeGreaterThanOrEqualTo(String value) {
            addCriterion("TELEPHONE_HOME >=", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeLessThan(String value) {
            addCriterion("TELEPHONE_HOME <", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeLessThanOrEqualTo(String value) {
            addCriterion("TELEPHONE_HOME <=", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeLike(String value) {
            addCriterion("TELEPHONE_HOME like", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeNotLike(String value) {
            addCriterion("TELEPHONE_HOME not like", value, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeIn(List<String> values) {
            addCriterion("TELEPHONE_HOME in", values, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeNotIn(List<String> values) {
            addCriterion("TELEPHONE_HOME not in", values, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeBetween(String value1, String value2) {
            addCriterion("TELEPHONE_HOME between", value1, value2, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andTelephoneHomeNotBetween(String value1, String value2) {
            addCriterion("TELEPHONE_HOME not between", value1, value2, "telephoneHome");
            return (Criteria) this;
        }

        public Criteria andOtherPositionIsNull() {
            addCriterion("OTHER_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andOtherPositionIsNotNull() {
            addCriterion("OTHER_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andOtherPositionEqualTo(String value) {
            addCriterion("OTHER_POSITION =", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionNotEqualTo(String value) {
            addCriterion("OTHER_POSITION <>", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionGreaterThan(String value) {
            addCriterion("OTHER_POSITION >", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_POSITION >=", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionLessThan(String value) {
            addCriterion("OTHER_POSITION <", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionLessThanOrEqualTo(String value) {
            addCriterion("OTHER_POSITION <=", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionLike(String value) {
            addCriterion("OTHER_POSITION like", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionNotLike(String value) {
            addCriterion("OTHER_POSITION not like", value, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionIn(List<String> values) {
            addCriterion("OTHER_POSITION in", values, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionNotIn(List<String> values) {
            addCriterion("OTHER_POSITION not in", values, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionBetween(String value1, String value2) {
            addCriterion("OTHER_POSITION between", value1, value2, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andOtherPositionNotBetween(String value1, String value2) {
            addCriterion("OTHER_POSITION not between", value1, value2, "otherPosition");
            return (Criteria) this;
        }

        public Criteria andLdapUnidIsNull() {
            addCriterion("LDAP_UNID is null");
            return (Criteria) this;
        }

        public Criteria andLdapUnidIsNotNull() {
            addCriterion("LDAP_UNID is not null");
            return (Criteria) this;
        }

        public Criteria andLdapUnidEqualTo(String value) {
            addCriterion("LDAP_UNID =", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidNotEqualTo(String value) {
            addCriterion("LDAP_UNID <>", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidGreaterThan(String value) {
            addCriterion("LDAP_UNID >", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidGreaterThanOrEqualTo(String value) {
            addCriterion("LDAP_UNID >=", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidLessThan(String value) {
            addCriterion("LDAP_UNID <", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidLessThanOrEqualTo(String value) {
            addCriterion("LDAP_UNID <=", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidLike(String value) {
            addCriterion("LDAP_UNID like", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidNotLike(String value) {
            addCriterion("LDAP_UNID not like", value, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidIn(List<String> values) {
            addCriterion("LDAP_UNID in", values, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidNotIn(List<String> values) {
            addCriterion("LDAP_UNID not in", values, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidBetween(String value1, String value2) {
            addCriterion("LDAP_UNID between", value1, value2, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andLdapUnidNotBetween(String value1, String value2) {
            addCriterion("LDAP_UNID not between", value1, value2, "ldapUnid");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNull() {
            addCriterion("birthDate is null");
            return (Criteria) this;
        }

        public Criteria andBirthdateIsNotNull() {
            addCriterion("birthDate is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdateEqualTo(String value) {
            addCriterion("birthDate =", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotEqualTo(String value) {
            addCriterion("birthDate <>", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThan(String value) {
            addCriterion("birthDate >", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateGreaterThanOrEqualTo(String value) {
            addCriterion("birthDate >=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThan(String value) {
            addCriterion("birthDate <", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLessThanOrEqualTo(String value) {
            addCriterion("birthDate <=", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateLike(String value) {
            addCriterion("birthDate like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotLike(String value) {
            addCriterion("birthDate not like", value, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateIn(List<String> values) {
            addCriterion("birthDate in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotIn(List<String> values) {
            addCriterion("birthDate not in", values, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateBetween(String value1, String value2) {
            addCriterion("birthDate between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andBirthdateNotBetween(String value1, String value2) {
            addCriterion("birthDate not between", value1, value2, "birthdate");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNull() {
            addCriterion("certNo is null");
            return (Criteria) this;
        }

        public Criteria andCertnoIsNotNull() {
            addCriterion("certNo is not null");
            return (Criteria) this;
        }

        public Criteria andCertnoEqualTo(String value) {
            addCriterion("certNo =", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotEqualTo(String value) {
            addCriterion("certNo <>", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThan(String value) {
            addCriterion("certNo >", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoGreaterThanOrEqualTo(String value) {
            addCriterion("certNo >=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThan(String value) {
            addCriterion("certNo <", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLessThanOrEqualTo(String value) {
            addCriterion("certNo <=", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoLike(String value) {
            addCriterion("certNo like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotLike(String value) {
            addCriterion("certNo not like", value, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoIn(List<String> values) {
            addCriterion("certNo in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotIn(List<String> values) {
            addCriterion("certNo not in", values, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoBetween(String value1, String value2) {
            addCriterion("certNo between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andCertnoNotBetween(String value1, String value2) {
            addCriterion("certNo not between", value1, value2, "certno");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNull() {
            addCriterion("certType is null");
            return (Criteria) this;
        }

        public Criteria andCerttypeIsNotNull() {
            addCriterion("certType is not null");
            return (Criteria) this;
        }

        public Criteria andCerttypeEqualTo(String value) {
            addCriterion("certType =", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotEqualTo(String value) {
            addCriterion("certType <>", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThan(String value) {
            addCriterion("certType >", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeGreaterThanOrEqualTo(String value) {
            addCriterion("certType >=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThan(String value) {
            addCriterion("certType <", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLessThanOrEqualTo(String value) {
            addCriterion("certType <=", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeLike(String value) {
            addCriterion("certType like", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotLike(String value) {
            addCriterion("certType not like", value, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeIn(List<String> values) {
            addCriterion("certType in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotIn(List<String> values) {
            addCriterion("certType not in", values, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeBetween(String value1, String value2) {
            addCriterion("certType between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andCerttypeNotBetween(String value1, String value2) {
            addCriterion("certType not between", value1, value2, "certtype");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNull() {
            addCriterion("deleteTime is null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIsNotNull() {
            addCriterion("deleteTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletetimeEqualTo(String value) {
            addCriterion("deleteTime =", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotEqualTo(String value) {
            addCriterion("deleteTime <>", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThan(String value) {
            addCriterion("deleteTime >", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeGreaterThanOrEqualTo(String value) {
            addCriterion("deleteTime >=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThan(String value) {
            addCriterion("deleteTime <", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLessThanOrEqualTo(String value) {
            addCriterion("deleteTime <=", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeLike(String value) {
            addCriterion("deleteTime like", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotLike(String value) {
            addCriterion("deleteTime not like", value, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeIn(List<String> values) {
            addCriterion("deleteTime in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotIn(List<String> values) {
            addCriterion("deleteTime not in", values, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeBetween(String value1, String value2) {
            addCriterion("deleteTime between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andDeletetimeNotBetween(String value1, String value2) {
            addCriterion("deleteTime not between", value1, value2, "deletetime");
            return (Criteria) this;
        }

        public Criteria andEmpnumIsNull() {
            addCriterion("empNum is null");
            return (Criteria) this;
        }

        public Criteria andEmpnumIsNotNull() {
            addCriterion("empNum is not null");
            return (Criteria) this;
        }

        public Criteria andEmpnumEqualTo(String value) {
            addCriterion("empNum =", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotEqualTo(String value) {
            addCriterion("empNum <>", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThan(String value) {
            addCriterion("empNum >", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumGreaterThanOrEqualTo(String value) {
            addCriterion("empNum >=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThan(String value) {
            addCriterion("empNum <", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLessThanOrEqualTo(String value) {
            addCriterion("empNum <=", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumLike(String value) {
            addCriterion("empNum like", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotLike(String value) {
            addCriterion("empNum not like", value, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumIn(List<String> values) {
            addCriterion("empNum in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotIn(List<String> values) {
            addCriterion("empNum not in", values, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumBetween(String value1, String value2) {
            addCriterion("empNum between", value1, value2, "empnum");
            return (Criteria) this;
        }

        public Criteria andEmpnumNotBetween(String value1, String value2) {
            addCriterion("empNum not between", value1, value2, "empnum");
            return (Criteria) this;
        }

        public Criteria andHasimageIsNull() {
            addCriterion("hasImage is null");
            return (Criteria) this;
        }

        public Criteria andHasimageIsNotNull() {
            addCriterion("hasImage is not null");
            return (Criteria) this;
        }

        public Criteria andHasimageEqualTo(Integer value) {
            addCriterion("hasImage =", value, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageNotEqualTo(Integer value) {
            addCriterion("hasImage <>", value, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageGreaterThan(Integer value) {
            addCriterion("hasImage >", value, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageGreaterThanOrEqualTo(Integer value) {
            addCriterion("hasImage >=", value, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageLessThan(Integer value) {
            addCriterion("hasImage <", value, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageLessThanOrEqualTo(Integer value) {
            addCriterion("hasImage <=", value, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageIn(List<Integer> values) {
            addCriterion("hasImage in", values, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageNotIn(List<Integer> values) {
            addCriterion("hasImage not in", values, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageBetween(Integer value1, Integer value2) {
            addCriterion("hasImage between", value1, value2, "hasimage");
            return (Criteria) this;
        }

        public Criteria andHasimageNotBetween(Integer value1, Integer value2) {
            addCriterion("hasImage not between", value1, value2, "hasimage");
            return (Criteria) this;
        }

        public Criteria andLdapunidIsNull() {
            addCriterion("ldapUnid is null");
            return (Criteria) this;
        }

        public Criteria andLdapunidIsNotNull() {
            addCriterion("ldapUnid is not null");
            return (Criteria) this;
        }

        public Criteria andLdapunidEqualTo(String value) {
            addCriterion("ldapUnid =", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidNotEqualTo(String value) {
            addCriterion("ldapUnid <>", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidGreaterThan(String value) {
            addCriterion("ldapUnid >", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidGreaterThanOrEqualTo(String value) {
            addCriterion("ldapUnid >=", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidLessThan(String value) {
            addCriterion("ldapUnid <", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidLessThanOrEqualTo(String value) {
            addCriterion("ldapUnid <=", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidLike(String value) {
            addCriterion("ldapUnid like", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidNotLike(String value) {
            addCriterion("ldapUnid not like", value, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidIn(List<String> values) {
            addCriterion("ldapUnid in", values, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidNotIn(List<String> values) {
            addCriterion("ldapUnid not in", values, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidBetween(String value1, String value2) {
            addCriterion("ldapUnid between", value1, value2, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLdapunidNotBetween(String value1, String value2) {
            addCriterion("ldapUnid not between", value1, value2, "ldapunid");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNull() {
            addCriterion("loginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("loginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("loginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("loginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("loginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("loginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("loginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("loginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("loginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("loginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("loginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("loginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("loginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("loginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(Integer value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(Integer value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(Integer value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(Integer value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(Integer value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<Integer> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<Integer> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(Integer value1, Integer value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOtherpositionIsNull() {
            addCriterion("otherPosition is null");
            return (Criteria) this;
        }

        public Criteria andOtherpositionIsNotNull() {
            addCriterion("otherPosition is not null");
            return (Criteria) this;
        }

        public Criteria andOtherpositionEqualTo(String value) {
            addCriterion("otherPosition =", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionNotEqualTo(String value) {
            addCriterion("otherPosition <>", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionGreaterThan(String value) {
            addCriterion("otherPosition >", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionGreaterThanOrEqualTo(String value) {
            addCriterion("otherPosition >=", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionLessThan(String value) {
            addCriterion("otherPosition <", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionLessThanOrEqualTo(String value) {
            addCriterion("otherPosition <=", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionLike(String value) {
            addCriterion("otherPosition like", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionNotLike(String value) {
            addCriterion("otherPosition not like", value, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionIn(List<String> values) {
            addCriterion("otherPosition in", values, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionNotIn(List<String> values) {
            addCriterion("otherPosition not in", values, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionBetween(String value1, String value2) {
            addCriterion("otherPosition between", value1, value2, "otherposition");
            return (Criteria) this;
        }

        public Criteria andOtherpositionNotBetween(String value1, String value2) {
            addCriterion("otherPosition not between", value1, value2, "otherposition");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("registerTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("registerTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(String value) {
            addCriterion("registerTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(String value) {
            addCriterion("registerTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(String value) {
            addCriterion("registerTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(String value) {
            addCriterion("registerTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(String value) {
            addCriterion("registerTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(String value) {
            addCriterion("registerTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLike(String value) {
            addCriterion("registerTime like", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotLike(String value) {
            addCriterion("registerTime not like", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<String> values) {
            addCriterion("registerTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<String> values) {
            addCriterion("registerTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(String value1, String value2) {
            addCriterion("registerTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(String value1, String value2) {
            addCriterion("registerTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andSecidIsNull() {
            addCriterion("secId is null");
            return (Criteria) this;
        }

        public Criteria andSecidIsNotNull() {
            addCriterion("secId is not null");
            return (Criteria) this;
        }

        public Criteria andSecidEqualTo(String value) {
            addCriterion("secId =", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotEqualTo(String value) {
            addCriterion("secId <>", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidGreaterThan(String value) {
            addCriterion("secId >", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidGreaterThanOrEqualTo(String value) {
            addCriterion("secId >=", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidLessThan(String value) {
            addCriterion("secId <", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidLessThanOrEqualTo(String value) {
            addCriterion("secId <=", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidLike(String value) {
            addCriterion("secId like", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotLike(String value) {
            addCriterion("secId not like", value, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidIn(List<String> values) {
            addCriterion("secId in", values, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotIn(List<String> values) {
            addCriterion("secId not in", values, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidBetween(String value1, String value2) {
            addCriterion("secId between", value1, value2, "secid");
            return (Criteria) this;
        }

        public Criteria andSecidNotBetween(String value1, String value2) {
            addCriterion("secId not between", value1, value2, "secid");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeIsNull() {
            addCriterion("telephoneHome is null");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeIsNotNull() {
            addCriterion("telephoneHome is not null");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeEqualTo(String value) {
            addCriterion("telephoneHome =", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeNotEqualTo(String value) {
            addCriterion("telephoneHome <>", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeGreaterThan(String value) {
            addCriterion("telephoneHome >", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeGreaterThanOrEqualTo(String value) {
            addCriterion("telephoneHome >=", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeLessThan(String value) {
            addCriterion("telephoneHome <", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeLessThanOrEqualTo(String value) {
            addCriterion("telephoneHome <=", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeLike(String value) {
            addCriterion("telephoneHome like", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeNotLike(String value) {
            addCriterion("telephoneHome not like", value, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeIn(List<String> values) {
            addCriterion("telephoneHome in", values, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeNotIn(List<String> values) {
            addCriterion("telephoneHome not in", values, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeBetween(String value1, String value2) {
            addCriterion("telephoneHome between", value1, value2, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andTelephonehomeNotBetween(String value1, String value2) {
            addCriterion("telephoneHome not between", value1, value2, "telephonehome");
            return (Criteria) this;
        }

        public Criteria andUserstyleIsNull() {
            addCriterion("userStyle is null");
            return (Criteria) this;
        }

        public Criteria andUserstyleIsNotNull() {
            addCriterion("userStyle is not null");
            return (Criteria) this;
        }

        public Criteria andUserstyleEqualTo(String value) {
            addCriterion("userStyle =", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotEqualTo(String value) {
            addCriterion("userStyle <>", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleGreaterThan(String value) {
            addCriterion("userStyle >", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleGreaterThanOrEqualTo(String value) {
            addCriterion("userStyle >=", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLessThan(String value) {
            addCriterion("userStyle <", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLessThanOrEqualTo(String value) {
            addCriterion("userStyle <=", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleLike(String value) {
            addCriterion("userStyle like", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotLike(String value) {
            addCriterion("userStyle not like", value, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleIn(List<String> values) {
            addCriterion("userStyle in", values, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotIn(List<String> values) {
            addCriterion("userStyle not in", values, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleBetween(String value1, String value2) {
            addCriterion("userStyle between", value1, value2, "userstyle");
            return (Criteria) this;
        }

        public Criteria andUserstyleNotBetween(String value1, String value2) {
            addCriterion("userStyle not between", value1, value2, "userstyle");
            return (Criteria) this;
        }

        public Criteria andWorkdescIsNull() {
            addCriterion("workDesc is null");
            return (Criteria) this;
        }

        public Criteria andWorkdescIsNotNull() {
            addCriterion("workDesc is not null");
            return (Criteria) this;
        }

        public Criteria andWorkdescEqualTo(String value) {
            addCriterion("workDesc =", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescNotEqualTo(String value) {
            addCriterion("workDesc <>", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescGreaterThan(String value) {
            addCriterion("workDesc >", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescGreaterThanOrEqualTo(String value) {
            addCriterion("workDesc >=", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescLessThan(String value) {
            addCriterion("workDesc <", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescLessThanOrEqualTo(String value) {
            addCriterion("workDesc <=", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescLike(String value) {
            addCriterion("workDesc like", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescNotLike(String value) {
            addCriterion("workDesc not like", value, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescIn(List<String> values) {
            addCriterion("workDesc in", values, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescNotIn(List<String> values) {
            addCriterion("workDesc not in", values, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescBetween(String value1, String value2) {
            addCriterion("workDesc between", value1, value2, "workdesc");
            return (Criteria) this;
        }

        public Criteria andWorkdescNotBetween(String value1, String value2) {
            addCriterion("workDesc not between", value1, value2, "workdesc");
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