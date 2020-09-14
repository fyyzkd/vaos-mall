package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInfoExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andVdcidIsNull() {
            addCriterion("vdcid is null");
            return (Criteria) this;
        }

        public Criteria andVdcidIsNotNull() {
            addCriterion("vdcid is not null");
            return (Criteria) this;
        }

        public Criteria andVdcidEqualTo(Long value) {
            addCriterion("vdcid =", value, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidNotEqualTo(Long value) {
            addCriterion("vdcid <>", value, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidGreaterThan(Long value) {
            addCriterion("vdcid >", value, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidGreaterThanOrEqualTo(Long value) {
            addCriterion("vdcid >=", value, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidLessThan(Long value) {
            addCriterion("vdcid <", value, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidLessThanOrEqualTo(Long value) {
            addCriterion("vdcid <=", value, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidIn(List<Long> values) {
            addCriterion("vdcid in", values, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidNotIn(List<Long> values) {
            addCriterion("vdcid not in", values, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidBetween(Long value1, Long value2) {
            addCriterion("vdcid between", value1, value2, "vdcid");
            return (Criteria) this;
        }

        public Criteria andVdcidNotBetween(Long value1, Long value2) {
            addCriterion("vdcid not between", value1, value2, "vdcid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNull() {
            addCriterion("orgid is null");
            return (Criteria) this;
        }

        public Criteria andOrgidIsNotNull() {
            addCriterion("orgid is not null");
            return (Criteria) this;
        }

        public Criteria andOrgidEqualTo(Long value) {
            addCriterion("orgid =", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotEqualTo(Long value) {
            addCriterion("orgid <>", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThan(Long value) {
            addCriterion("orgid >", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidGreaterThanOrEqualTo(Long value) {
            addCriterion("orgid >=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThan(Long value) {
            addCriterion("orgid <", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidLessThanOrEqualTo(Long value) {
            addCriterion("orgid <=", value, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidIn(List<Long> values) {
            addCriterion("orgid in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotIn(List<Long> values) {
            addCriterion("orgid not in", values, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidBetween(Long value1, Long value2) {
            addCriterion("orgid between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andOrgidNotBetween(Long value1, Long value2) {
            addCriterion("orgid not between", value1, value2, "orgid");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andExtraIsNull() {
            addCriterion("extra is null");
            return (Criteria) this;
        }

        public Criteria andExtraIsNotNull() {
            addCriterion("extra is not null");
            return (Criteria) this;
        }

        public Criteria andExtraEqualTo(String value) {
            addCriterion("extra =", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotEqualTo(String value) {
            addCriterion("extra <>", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThan(String value) {
            addCriterion("extra >", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraGreaterThanOrEqualTo(String value) {
            addCriterion("extra >=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThan(String value) {
            addCriterion("extra <", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLessThanOrEqualTo(String value) {
            addCriterion("extra <=", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraLike(String value) {
            addCriterion("extra like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotLike(String value) {
            addCriterion("extra not like", value, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraIn(List<String> values) {
            addCriterion("extra in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotIn(List<String> values) {
            addCriterion("extra not in", values, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraBetween(String value1, String value2) {
            addCriterion("extra between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andExtraNotBetween(String value1, String value2) {
            addCriterion("extra not between", value1, value2, "extra");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNull() {
            addCriterion("createdtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("createdtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Date value) {
            addCriterion("createdtime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Date value) {
            addCriterion("createdtime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Date value) {
            addCriterion("createdtime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createdtime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Date value) {
            addCriterion("createdtime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("createdtime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Date> values) {
            addCriterion("createdtime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Date> values) {
            addCriterion("createdtime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("createdtime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("createdtime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeIsNull() {
            addCriterion("auditedtime is null");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeIsNotNull() {
            addCriterion("auditedtime is not null");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeEqualTo(Date value) {
            addCriterion("auditedtime =", value, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeNotEqualTo(Date value) {
            addCriterion("auditedtime <>", value, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeGreaterThan(Date value) {
            addCriterion("auditedtime >", value, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("auditedtime >=", value, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeLessThan(Date value) {
            addCriterion("auditedtime <", value, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeLessThanOrEqualTo(Date value) {
            addCriterion("auditedtime <=", value, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeIn(List<Date> values) {
            addCriterion("auditedtime in", values, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeNotIn(List<Date> values) {
            addCriterion("auditedtime not in", values, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeBetween(Date value1, Date value2) {
            addCriterion("auditedtime between", value1, value2, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andAuditedtimeNotBetween(Date value1, Date value2) {
            addCriterion("auditedtime not between", value1, value2, "auditedtime");
            return (Criteria) this;
        }

        public Criteria andIslockIsNull() {
            addCriterion("islock is null");
            return (Criteria) this;
        }

        public Criteria andIslockIsNotNull() {
            addCriterion("islock is not null");
            return (Criteria) this;
        }

        public Criteria andIslockEqualTo(Integer value) {
            addCriterion("islock =", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotEqualTo(Integer value) {
            addCriterion("islock <>", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThan(Integer value) {
            addCriterion("islock >", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockGreaterThanOrEqualTo(Integer value) {
            addCriterion("islock >=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThan(Integer value) {
            addCriterion("islock <", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockLessThanOrEqualTo(Integer value) {
            addCriterion("islock <=", value, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockIn(List<Integer> values) {
            addCriterion("islock in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotIn(List<Integer> values) {
            addCriterion("islock not in", values, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockBetween(Integer value1, Integer value2) {
            addCriterion("islock between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andIslockNotBetween(Integer value1, Integer value2) {
            addCriterion("islock not between", value1, value2, "islock");
            return (Criteria) this;
        }

        public Criteria andLockperiodIsNull() {
            addCriterion("lockperiod is null");
            return (Criteria) this;
        }

        public Criteria andLockperiodIsNotNull() {
            addCriterion("lockperiod is not null");
            return (Criteria) this;
        }

        public Criteria andLockperiodEqualTo(Integer value) {
            addCriterion("lockperiod =", value, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodNotEqualTo(Integer value) {
            addCriterion("lockperiod <>", value, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodGreaterThan(Integer value) {
            addCriterion("lockperiod >", value, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodGreaterThanOrEqualTo(Integer value) {
            addCriterion("lockperiod >=", value, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodLessThan(Integer value) {
            addCriterion("lockperiod <", value, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodLessThanOrEqualTo(Integer value) {
            addCriterion("lockperiod <=", value, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodIn(List<Integer> values) {
            addCriterion("lockperiod in", values, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodNotIn(List<Integer> values) {
            addCriterion("lockperiod not in", values, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodBetween(Integer value1, Integer value2) {
            addCriterion("lockperiod between", value1, value2, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLockperiodNotBetween(Integer value1, Integer value2) {
            addCriterion("lockperiod not between", value1, value2, "lockperiod");
            return (Criteria) this;
        }

        public Criteria andLocktimeIsNull() {
            addCriterion("locktime is null");
            return (Criteria) this;
        }

        public Criteria andLocktimeIsNotNull() {
            addCriterion("locktime is not null");
            return (Criteria) this;
        }

        public Criteria andLocktimeEqualTo(Date value) {
            addCriterion("locktime =", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotEqualTo(Date value) {
            addCriterion("locktime <>", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeGreaterThan(Date value) {
            addCriterion("locktime >", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("locktime >=", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeLessThan(Date value) {
            addCriterion("locktime <", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeLessThanOrEqualTo(Date value) {
            addCriterion("locktime <=", value, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeIn(List<Date> values) {
            addCriterion("locktime in", values, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotIn(List<Date> values) {
            addCriterion("locktime not in", values, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeBetween(Date value1, Date value2) {
            addCriterion("locktime between", value1, value2, "locktime");
            return (Criteria) this;
        }

        public Criteria andLocktimeNotBetween(Date value1, Date value2) {
            addCriterion("locktime not between", value1, value2, "locktime");
            return (Criteria) this;
        }

        public Criteria andIsdisableIsNull() {
            addCriterion("isdisable is null");
            return (Criteria) this;
        }

        public Criteria andIsdisableIsNotNull() {
            addCriterion("isdisable is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisableEqualTo(Integer value) {
            addCriterion("isdisable =", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableNotEqualTo(Integer value) {
            addCriterion("isdisable <>", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableGreaterThan(Integer value) {
            addCriterion("isdisable >", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableGreaterThanOrEqualTo(Integer value) {
            addCriterion("isdisable >=", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableLessThan(Integer value) {
            addCriterion("isdisable <", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableLessThanOrEqualTo(Integer value) {
            addCriterion("isdisable <=", value, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableIn(List<Integer> values) {
            addCriterion("isdisable in", values, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableNotIn(List<Integer> values) {
            addCriterion("isdisable not in", values, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableBetween(Integer value1, Integer value2) {
            addCriterion("isdisable between", value1, value2, "isdisable");
            return (Criteria) this;
        }

        public Criteria andIsdisableNotBetween(Integer value1, Integer value2) {
            addCriterion("isdisable not between", value1, value2, "isdisable");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNull() {
            addCriterion("usedate is null");
            return (Criteria) this;
        }

        public Criteria andUsedateIsNotNull() {
            addCriterion("usedate is not null");
            return (Criteria) this;
        }

        public Criteria andUsedateEqualTo(String value) {
            addCriterion("usedate =", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotEqualTo(String value) {
            addCriterion("usedate <>", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThan(String value) {
            addCriterion("usedate >", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateGreaterThanOrEqualTo(String value) {
            addCriterion("usedate >=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThan(String value) {
            addCriterion("usedate <", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLessThanOrEqualTo(String value) {
            addCriterion("usedate <=", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateLike(String value) {
            addCriterion("usedate like", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotLike(String value) {
            addCriterion("usedate not like", value, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateIn(List<String> values) {
            addCriterion("usedate in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotIn(List<String> values) {
            addCriterion("usedate not in", values, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateBetween(String value1, String value2) {
            addCriterion("usedate between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andUsedateNotBetween(String value1, String value2) {
            addCriterion("usedate not between", value1, value2, "usedate");
            return (Criteria) this;
        }

        public Criteria andIplimitIsNull() {
            addCriterion("iplimit is null");
            return (Criteria) this;
        }

        public Criteria andIplimitIsNotNull() {
            addCriterion("iplimit is not null");
            return (Criteria) this;
        }

        public Criteria andIplimitEqualTo(Integer value) {
            addCriterion("iplimit =", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitNotEqualTo(Integer value) {
            addCriterion("iplimit <>", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitGreaterThan(Integer value) {
            addCriterion("iplimit >", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("iplimit >=", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitLessThan(Integer value) {
            addCriterion("iplimit <", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitLessThanOrEqualTo(Integer value) {
            addCriterion("iplimit <=", value, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitIn(List<Integer> values) {
            addCriterion("iplimit in", values, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitNotIn(List<Integer> values) {
            addCriterion("iplimit not in", values, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitBetween(Integer value1, Integer value2) {
            addCriterion("iplimit between", value1, value2, "iplimit");
            return (Criteria) this;
        }

        public Criteria andIplimitNotBetween(Integer value1, Integer value2) {
            addCriterion("iplimit not between", value1, value2, "iplimit");
            return (Criteria) this;
        }

        public Criteria andAllowipIsNull() {
            addCriterion("allowIp is null");
            return (Criteria) this;
        }

        public Criteria andAllowipIsNotNull() {
            addCriterion("allowIp is not null");
            return (Criteria) this;
        }

        public Criteria andAllowipEqualTo(String value) {
            addCriterion("allowIp =", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipNotEqualTo(String value) {
            addCriterion("allowIp <>", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipGreaterThan(String value) {
            addCriterion("allowIp >", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipGreaterThanOrEqualTo(String value) {
            addCriterion("allowIp >=", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipLessThan(String value) {
            addCriterion("allowIp <", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipLessThanOrEqualTo(String value) {
            addCriterion("allowIp <=", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipLike(String value) {
            addCriterion("allowIp like", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipNotLike(String value) {
            addCriterion("allowIp not like", value, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipIn(List<String> values) {
            addCriterion("allowIp in", values, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipNotIn(List<String> values) {
            addCriterion("allowIp not in", values, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipBetween(String value1, String value2) {
            addCriterion("allowIp between", value1, value2, "allowip");
            return (Criteria) this;
        }

        public Criteria andAllowipNotBetween(String value1, String value2) {
            addCriterion("allowIp not between", value1, value2, "allowip");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("begintime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("begintime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(String value) {
            addCriterion("begintime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(String value) {
            addCriterion("begintime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(String value) {
            addCriterion("begintime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(String value) {
            addCriterion("begintime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(String value) {
            addCriterion("begintime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(String value) {
            addCriterion("begintime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLike(String value) {
            addCriterion("begintime like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotLike(String value) {
            addCriterion("begintime not like", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<String> values) {
            addCriterion("begintime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<String> values) {
            addCriterion("begintime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(String value1, String value2) {
            addCriterion("begintime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(String value1, String value2) {
            addCriterion("begintime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(String value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(String value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(String value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(String value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(String value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLike(String value) {
            addCriterion("endtime like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotLike(String value) {
            addCriterion("endtime not like", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<String> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<String> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(String value1, String value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(String value1, String value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeIsNull() {
            addCriterion("maxtrytime is null");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeIsNotNull() {
            addCriterion("maxtrytime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeEqualTo(Integer value) {
            addCriterion("maxtrytime =", value, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeNotEqualTo(Integer value) {
            addCriterion("maxtrytime <>", value, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeGreaterThan(Integer value) {
            addCriterion("maxtrytime >", value, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxtrytime >=", value, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeLessThan(Integer value) {
            addCriterion("maxtrytime <", value, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeLessThanOrEqualTo(Integer value) {
            addCriterion("maxtrytime <=", value, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeIn(List<Integer> values) {
            addCriterion("maxtrytime in", values, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeNotIn(List<Integer> values) {
            addCriterion("maxtrytime not in", values, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeBetween(Integer value1, Integer value2) {
            addCriterion("maxtrytime between", value1, value2, "maxtrytime");
            return (Criteria) this;
        }

        public Criteria andMaxtrytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("maxtrytime not between", value1, value2, "maxtrytime");
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