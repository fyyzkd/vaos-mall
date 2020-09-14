package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class InstanceDcVdcRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstanceDcVdcRelExample() {
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

        public Criteria andInstanceidIsNull() {
            addCriterion("instanceid is null");
            return (Criteria) this;
        }

        public Criteria andInstanceidIsNotNull() {
            addCriterion("instanceid is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceidEqualTo(Long value) {
            addCriterion("instanceid =", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotEqualTo(Long value) {
            addCriterion("instanceid <>", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThan(Long value) {
            addCriterion("instanceid >", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidGreaterThanOrEqualTo(Long value) {
            addCriterion("instanceid >=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThan(Long value) {
            addCriterion("instanceid <", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidLessThanOrEqualTo(Long value) {
            addCriterion("instanceid <=", value, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidIn(List<Long> values) {
            addCriterion("instanceid in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotIn(List<Long> values) {
            addCriterion("instanceid not in", values, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidBetween(Long value1, Long value2) {
            addCriterion("instanceid between", value1, value2, "instanceid");
            return (Criteria) this;
        }

        public Criteria andInstanceidNotBetween(Long value1, Long value2) {
            addCriterion("instanceid not between", value1, value2, "instanceid");
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

        public Criteria andDcidIsNull() {
            addCriterion("dcid is null");
            return (Criteria) this;
        }

        public Criteria andDcidIsNotNull() {
            addCriterion("dcid is not null");
            return (Criteria) this;
        }

        public Criteria andDcidEqualTo(Long value) {
            addCriterion("dcid =", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidNotEqualTo(Long value) {
            addCriterion("dcid <>", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidGreaterThan(Long value) {
            addCriterion("dcid >", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidGreaterThanOrEqualTo(Long value) {
            addCriterion("dcid >=", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidLessThan(Long value) {
            addCriterion("dcid <", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidLessThanOrEqualTo(Long value) {
            addCriterion("dcid <=", value, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidIn(List<Long> values) {
            addCriterion("dcid in", values, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidNotIn(List<Long> values) {
            addCriterion("dcid not in", values, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidBetween(Long value1, Long value2) {
            addCriterion("dcid between", value1, value2, "dcid");
            return (Criteria) this;
        }

        public Criteria andDcidNotBetween(Long value1, Long value2) {
            addCriterion("dcid not between", value1, value2, "dcid");
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