package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class OmVdcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmVdcExample() {
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

        public Criteria andVdcnameIsNull() {
            addCriterion("vdcname is null");
            return (Criteria) this;
        }

        public Criteria andVdcnameIsNotNull() {
            addCriterion("vdcname is not null");
            return (Criteria) this;
        }

        public Criteria andVdcnameEqualTo(String value) {
            addCriterion("vdcname =", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameNotEqualTo(String value) {
            addCriterion("vdcname <>", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameGreaterThan(String value) {
            addCriterion("vdcname >", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameGreaterThanOrEqualTo(String value) {
            addCriterion("vdcname >=", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameLessThan(String value) {
            addCriterion("vdcname <", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameLessThanOrEqualTo(String value) {
            addCriterion("vdcname <=", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameLike(String value) {
            addCriterion("vdcname like", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameNotLike(String value) {
            addCriterion("vdcname not like", value, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameIn(List<String> values) {
            addCriterion("vdcname in", values, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameNotIn(List<String> values) {
            addCriterion("vdcname not in", values, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameBetween(String value1, String value2) {
            addCriterion("vdcname between", value1, value2, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcnameNotBetween(String value1, String value2) {
            addCriterion("vdcname not between", value1, value2, "vdcname");
            return (Criteria) this;
        }

        public Criteria andVdcdescIsNull() {
            addCriterion("vdcdesc is null");
            return (Criteria) this;
        }

        public Criteria andVdcdescIsNotNull() {
            addCriterion("vdcdesc is not null");
            return (Criteria) this;
        }

        public Criteria andVdcdescEqualTo(String value) {
            addCriterion("vdcdesc =", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescNotEqualTo(String value) {
            addCriterion("vdcdesc <>", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescGreaterThan(String value) {
            addCriterion("vdcdesc >", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescGreaterThanOrEqualTo(String value) {
            addCriterion("vdcdesc >=", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescLessThan(String value) {
            addCriterion("vdcdesc <", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescLessThanOrEqualTo(String value) {
            addCriterion("vdcdesc <=", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescLike(String value) {
            addCriterion("vdcdesc like", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescNotLike(String value) {
            addCriterion("vdcdesc not like", value, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescIn(List<String> values) {
            addCriterion("vdcdesc in", values, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescNotIn(List<String> values) {
            addCriterion("vdcdesc not in", values, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescBetween(String value1, String value2) {
            addCriterion("vdcdesc between", value1, value2, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andVdcdescNotBetween(String value1, String value2) {
            addCriterion("vdcdesc not between", value1, value2, "vdcdesc");
            return (Criteria) this;
        }

        public Criteria andDomainidIsNull() {
            addCriterion("domainid is null");
            return (Criteria) this;
        }

        public Criteria andDomainidIsNotNull() {
            addCriterion("domainid is not null");
            return (Criteria) this;
        }

        public Criteria andDomainidEqualTo(Long value) {
            addCriterion("domainid =", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidNotEqualTo(Long value) {
            addCriterion("domainid <>", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidGreaterThan(Long value) {
            addCriterion("domainid >", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidGreaterThanOrEqualTo(Long value) {
            addCriterion("domainid >=", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidLessThan(Long value) {
            addCriterion("domainid <", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidLessThanOrEqualTo(Long value) {
            addCriterion("domainid <=", value, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidIn(List<Long> values) {
            addCriterion("domainid in", values, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidNotIn(List<Long> values) {
            addCriterion("domainid not in", values, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidBetween(Long value1, Long value2) {
            addCriterion("domainid between", value1, value2, "domainid");
            return (Criteria) this;
        }

        public Criteria andDomainidNotBetween(Long value1, Long value2) {
            addCriterion("domainid not between", value1, value2, "domainid");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNull() {
            addCriterion("tenantid is null");
            return (Criteria) this;
        }

        public Criteria andTenantidIsNotNull() {
            addCriterion("tenantid is not null");
            return (Criteria) this;
        }

        public Criteria andTenantidEqualTo(Long value) {
            addCriterion("tenantid =", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotEqualTo(Long value) {
            addCriterion("tenantid <>", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThan(Long value) {
            addCriterion("tenantid >", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidGreaterThanOrEqualTo(Long value) {
            addCriterion("tenantid >=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThan(Long value) {
            addCriterion("tenantid <", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidLessThanOrEqualTo(Long value) {
            addCriterion("tenantid <=", value, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidIn(List<Long> values) {
            addCriterion("tenantid in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotIn(List<Long> values) {
            addCriterion("tenantid not in", values, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidBetween(Long value1, Long value2) {
            addCriterion("tenantid between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andTenantidNotBetween(Long value1, Long value2) {
            addCriterion("tenantid not between", value1, value2, "tenantid");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelIsNull() {
            addCriterion("infoSecurityLevel is null");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelIsNotNull() {
            addCriterion("infoSecurityLevel is not null");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelEqualTo(Integer value) {
            addCriterion("infoSecurityLevel =", value, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelNotEqualTo(Integer value) {
            addCriterion("infoSecurityLevel <>", value, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelGreaterThan(Integer value) {
            addCriterion("infoSecurityLevel >", value, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("infoSecurityLevel >=", value, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelLessThan(Integer value) {
            addCriterion("infoSecurityLevel <", value, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelLessThanOrEqualTo(Integer value) {
            addCriterion("infoSecurityLevel <=", value, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelIn(List<Integer> values) {
            addCriterion("infoSecurityLevel in", values, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelNotIn(List<Integer> values) {
            addCriterion("infoSecurityLevel not in", values, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelBetween(Integer value1, Integer value2) {
            addCriterion("infoSecurityLevel between", value1, value2, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andInfosecuritylevelNotBetween(Integer value1, Integer value2) {
            addCriterion("infoSecurityLevel not between", value1, value2, "infosecuritylevel");
            return (Criteria) this;
        }

        public Criteria andIsdisasterIsNull() {
            addCriterion("isdisaster is null");
            return (Criteria) this;
        }

        public Criteria andIsdisasterIsNotNull() {
            addCriterion("isdisaster is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisasterEqualTo(Byte value) {
            addCriterion("isdisaster =", value, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterNotEqualTo(Byte value) {
            addCriterion("isdisaster <>", value, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterGreaterThan(Byte value) {
            addCriterion("isdisaster >", value, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterGreaterThanOrEqualTo(Byte value) {
            addCriterion("isdisaster >=", value, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterLessThan(Byte value) {
            addCriterion("isdisaster <", value, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterLessThanOrEqualTo(Byte value) {
            addCriterion("isdisaster <=", value, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterIn(List<Byte> values) {
            addCriterion("isdisaster in", values, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterNotIn(List<Byte> values) {
            addCriterion("isdisaster not in", values, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterBetween(Byte value1, Byte value2) {
            addCriterion("isdisaster between", value1, value2, "isdisaster");
            return (Criteria) this;
        }

        public Criteria andIsdisasterNotBetween(Byte value1, Byte value2) {
            addCriterion("isdisaster not between", value1, value2, "isdisaster");
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