package com.macro.mall.model;

import java.util.ArrayList;
import java.util.List;

public class VdcDcResStaticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VdcDcResStaticExample() {
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

        public Criteria andVdcIdIsNull() {
            addCriterion("vdc_id is null");
            return (Criteria) this;
        }

        public Criteria andVdcIdIsNotNull() {
            addCriterion("vdc_id is not null");
            return (Criteria) this;
        }

        public Criteria andVdcIdEqualTo(Long value) {
            addCriterion("vdc_id =", value, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdNotEqualTo(Long value) {
            addCriterion("vdc_id <>", value, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdGreaterThan(Long value) {
            addCriterion("vdc_id >", value, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vdc_id >=", value, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdLessThan(Long value) {
            addCriterion("vdc_id <", value, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdLessThanOrEqualTo(Long value) {
            addCriterion("vdc_id <=", value, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdIn(List<Long> values) {
            addCriterion("vdc_id in", values, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdNotIn(List<Long> values) {
            addCriterion("vdc_id not in", values, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdBetween(Long value1, Long value2) {
            addCriterion("vdc_id between", value1, value2, "vdcId");
            return (Criteria) this;
        }

        public Criteria andVdcIdNotBetween(Long value1, Long value2) {
            addCriterion("vdc_id not between", value1, value2, "vdcId");
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

        public Criteria andDcnameIsNull() {
            addCriterion("dcName is null");
            return (Criteria) this;
        }

        public Criteria andDcnameIsNotNull() {
            addCriterion("dcName is not null");
            return (Criteria) this;
        }

        public Criteria andDcnameEqualTo(String value) {
            addCriterion("dcName =", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotEqualTo(String value) {
            addCriterion("dcName <>", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameGreaterThan(String value) {
            addCriterion("dcName >", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameGreaterThanOrEqualTo(String value) {
            addCriterion("dcName >=", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLessThan(String value) {
            addCriterion("dcName <", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLessThanOrEqualTo(String value) {
            addCriterion("dcName <=", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameLike(String value) {
            addCriterion("dcName like", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotLike(String value) {
            addCriterion("dcName not like", value, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameIn(List<String> values) {
            addCriterion("dcName in", values, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotIn(List<String> values) {
            addCriterion("dcName not in", values, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameBetween(String value1, String value2) {
            addCriterion("dcName between", value1, value2, "dcname");
            return (Criteria) this;
        }

        public Criteria andDcnameNotBetween(String value1, String value2) {
            addCriterion("dcName not between", value1, value2, "dcname");
            return (Criteria) this;
        }

        public Criteria andInstancesIsNull() {
            addCriterion("instances is null");
            return (Criteria) this;
        }

        public Criteria andInstancesIsNotNull() {
            addCriterion("instances is not null");
            return (Criteria) this;
        }

        public Criteria andInstancesEqualTo(Integer value) {
            addCriterion("instances =", value, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesNotEqualTo(Integer value) {
            addCriterion("instances <>", value, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesGreaterThan(Integer value) {
            addCriterion("instances >", value, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesGreaterThanOrEqualTo(Integer value) {
            addCriterion("instances >=", value, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesLessThan(Integer value) {
            addCriterion("instances <", value, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesLessThanOrEqualTo(Integer value) {
            addCriterion("instances <=", value, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesIn(List<Integer> values) {
            addCriterion("instances in", values, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesNotIn(List<Integer> values) {
            addCriterion("instances not in", values, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesBetween(Integer value1, Integer value2) {
            addCriterion("instances between", value1, value2, "instances");
            return (Criteria) this;
        }

        public Criteria andInstancesNotBetween(Integer value1, Integer value2) {
            addCriterion("instances not between", value1, value2, "instances");
            return (Criteria) this;
        }

        public Criteria andCpuIsNull() {
            addCriterion("cpu is null");
            return (Criteria) this;
        }

        public Criteria andCpuIsNotNull() {
            addCriterion("cpu is not null");
            return (Criteria) this;
        }

        public Criteria andCpuEqualTo(Integer value) {
            addCriterion("cpu =", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotEqualTo(Integer value) {
            addCriterion("cpu <>", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThan(Integer value) {
            addCriterion("cpu >", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpu >=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThan(Integer value) {
            addCriterion("cpu <", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuLessThanOrEqualTo(Integer value) {
            addCriterion("cpu <=", value, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuIn(List<Integer> values) {
            addCriterion("cpu in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotIn(List<Integer> values) {
            addCriterion("cpu not in", values, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuBetween(Integer value1, Integer value2) {
            addCriterion("cpu between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuNotBetween(Integer value1, Integer value2) {
            addCriterion("cpu not between", value1, value2, "cpu");
            return (Criteria) this;
        }

        public Criteria andCpuRateIsNull() {
            addCriterion("cpu_rate is null");
            return (Criteria) this;
        }

        public Criteria andCpuRateIsNotNull() {
            addCriterion("cpu_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCpuRateEqualTo(Double value) {
            addCriterion("cpu_rate =", value, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateNotEqualTo(Double value) {
            addCriterion("cpu_rate <>", value, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateGreaterThan(Double value) {
            addCriterion("cpu_rate >", value, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateGreaterThanOrEqualTo(Double value) {
            addCriterion("cpu_rate >=", value, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateLessThan(Double value) {
            addCriterion("cpu_rate <", value, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateLessThanOrEqualTo(Double value) {
            addCriterion("cpu_rate <=", value, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateIn(List<Double> values) {
            addCriterion("cpu_rate in", values, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateNotIn(List<Double> values) {
            addCriterion("cpu_rate not in", values, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateBetween(Double value1, Double value2) {
            addCriterion("cpu_rate between", value1, value2, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andCpuRateNotBetween(Double value1, Double value2) {
            addCriterion("cpu_rate not between", value1, value2, "cpuRate");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNull() {
            addCriterion("MEMORY is null");
            return (Criteria) this;
        }

        public Criteria andMemoryIsNotNull() {
            addCriterion("MEMORY is not null");
            return (Criteria) this;
        }

        public Criteria andMemoryEqualTo(Integer value) {
            addCriterion("MEMORY =", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotEqualTo(Integer value) {
            addCriterion("MEMORY <>", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThan(Integer value) {
            addCriterion("MEMORY >", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMORY >=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThan(Integer value) {
            addCriterion("MEMORY <", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryLessThanOrEqualTo(Integer value) {
            addCriterion("MEMORY <=", value, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryIn(List<Integer> values) {
            addCriterion("MEMORY in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotIn(List<Integer> values) {
            addCriterion("MEMORY not in", values, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryBetween(Integer value1, Integer value2) {
            addCriterion("MEMORY between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemoryNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMORY not between", value1, value2, "memory");
            return (Criteria) this;
        }

        public Criteria andMemRateIsNull() {
            addCriterion("mem_rate is null");
            return (Criteria) this;
        }

        public Criteria andMemRateIsNotNull() {
            addCriterion("mem_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMemRateEqualTo(Double value) {
            addCriterion("mem_rate =", value, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateNotEqualTo(Double value) {
            addCriterion("mem_rate <>", value, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateGreaterThan(Double value) {
            addCriterion("mem_rate >", value, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateGreaterThanOrEqualTo(Double value) {
            addCriterion("mem_rate >=", value, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateLessThan(Double value) {
            addCriterion("mem_rate <", value, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateLessThanOrEqualTo(Double value) {
            addCriterion("mem_rate <=", value, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateIn(List<Double> values) {
            addCriterion("mem_rate in", values, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateNotIn(List<Double> values) {
            addCriterion("mem_rate not in", values, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateBetween(Double value1, Double value2) {
            addCriterion("mem_rate between", value1, value2, "memRate");
            return (Criteria) this;
        }

        public Criteria andMemRateNotBetween(Double value1, Double value2) {
            addCriterion("mem_rate not between", value1, value2, "memRate");
            return (Criteria) this;
        }

        public Criteria andDiskIsNull() {
            addCriterion("DISK is null");
            return (Criteria) this;
        }

        public Criteria andDiskIsNotNull() {
            addCriterion("DISK is not null");
            return (Criteria) this;
        }

        public Criteria andDiskEqualTo(Integer value) {
            addCriterion("DISK =", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskNotEqualTo(Integer value) {
            addCriterion("DISK <>", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskGreaterThan(Integer value) {
            addCriterion("DISK >", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISK >=", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskLessThan(Integer value) {
            addCriterion("DISK <", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskLessThanOrEqualTo(Integer value) {
            addCriterion("DISK <=", value, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskIn(List<Integer> values) {
            addCriterion("DISK in", values, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskNotIn(List<Integer> values) {
            addCriterion("DISK not in", values, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskBetween(Integer value1, Integer value2) {
            addCriterion("DISK between", value1, value2, "disk");
            return (Criteria) this;
        }

        public Criteria andDiskNotBetween(Integer value1, Integer value2) {
            addCriterion("DISK not between", value1, value2, "disk");
            return (Criteria) this;
        }

        public Criteria andRouterIsNull() {
            addCriterion("router is null");
            return (Criteria) this;
        }

        public Criteria andRouterIsNotNull() {
            addCriterion("router is not null");
            return (Criteria) this;
        }

        public Criteria andRouterEqualTo(Integer value) {
            addCriterion("router =", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotEqualTo(Integer value) {
            addCriterion("router <>", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThan(Integer value) {
            addCriterion("router >", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterGreaterThanOrEqualTo(Integer value) {
            addCriterion("router >=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThan(Integer value) {
            addCriterion("router <", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterLessThanOrEqualTo(Integer value) {
            addCriterion("router <=", value, "router");
            return (Criteria) this;
        }

        public Criteria andRouterIn(List<Integer> values) {
            addCriterion("router in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotIn(List<Integer> values) {
            addCriterion("router not in", values, "router");
            return (Criteria) this;
        }

        public Criteria andRouterBetween(Integer value1, Integer value2) {
            addCriterion("router between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andRouterNotBetween(Integer value1, Integer value2) {
            addCriterion("router not between", value1, value2, "router");
            return (Criteria) this;
        }

        public Criteria andFirewallsIsNull() {
            addCriterion("fireWalls is null");
            return (Criteria) this;
        }

        public Criteria andFirewallsIsNotNull() {
            addCriterion("fireWalls is not null");
            return (Criteria) this;
        }

        public Criteria andFirewallsEqualTo(Integer value) {
            addCriterion("fireWalls =", value, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsNotEqualTo(Integer value) {
            addCriterion("fireWalls <>", value, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsGreaterThan(Integer value) {
            addCriterion("fireWalls >", value, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsGreaterThanOrEqualTo(Integer value) {
            addCriterion("fireWalls >=", value, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsLessThan(Integer value) {
            addCriterion("fireWalls <", value, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsLessThanOrEqualTo(Integer value) {
            addCriterion("fireWalls <=", value, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsIn(List<Integer> values) {
            addCriterion("fireWalls in", values, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsNotIn(List<Integer> values) {
            addCriterion("fireWalls not in", values, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsBetween(Integer value1, Integer value2) {
            addCriterion("fireWalls between", value1, value2, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallsNotBetween(Integer value1, Integer value2) {
            addCriterion("fireWalls not between", value1, value2, "firewalls");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchIsNull() {
            addCriterion("fireWallSwitch is null");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchIsNotNull() {
            addCriterion("fireWallSwitch is not null");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchEqualTo(Byte value) {
            addCriterion("fireWallSwitch =", value, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchNotEqualTo(Byte value) {
            addCriterion("fireWallSwitch <>", value, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchGreaterThan(Byte value) {
            addCriterion("fireWallSwitch >", value, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchGreaterThanOrEqualTo(Byte value) {
            addCriterion("fireWallSwitch >=", value, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchLessThan(Byte value) {
            addCriterion("fireWallSwitch <", value, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchLessThanOrEqualTo(Byte value) {
            addCriterion("fireWallSwitch <=", value, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchIn(List<Byte> values) {
            addCriterion("fireWallSwitch in", values, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchNotIn(List<Byte> values) {
            addCriterion("fireWallSwitch not in", values, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchBetween(Byte value1, Byte value2) {
            addCriterion("fireWallSwitch between", value1, value2, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andFirewallswitchNotBetween(Byte value1, Byte value2) {
            addCriterion("fireWallSwitch not between", value1, value2, "firewallswitch");
            return (Criteria) this;
        }

        public Criteria andPubnetipIsNull() {
            addCriterion("pubNetIp is null");
            return (Criteria) this;
        }

        public Criteria andPubnetipIsNotNull() {
            addCriterion("pubNetIp is not null");
            return (Criteria) this;
        }

        public Criteria andPubnetipEqualTo(Integer value) {
            addCriterion("pubNetIp =", value, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipNotEqualTo(Integer value) {
            addCriterion("pubNetIp <>", value, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipGreaterThan(Integer value) {
            addCriterion("pubNetIp >", value, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipGreaterThanOrEqualTo(Integer value) {
            addCriterion("pubNetIp >=", value, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipLessThan(Integer value) {
            addCriterion("pubNetIp <", value, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipLessThanOrEqualTo(Integer value) {
            addCriterion("pubNetIp <=", value, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipIn(List<Integer> values) {
            addCriterion("pubNetIp in", values, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipNotIn(List<Integer> values) {
            addCriterion("pubNetIp not in", values, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipBetween(Integer value1, Integer value2) {
            addCriterion("pubNetIp between", value1, value2, "pubnetip");
            return (Criteria) this;
        }

        public Criteria andPubnetipNotBetween(Integer value1, Integer value2) {
            addCriterion("pubNetIp not between", value1, value2, "pubnetip");
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