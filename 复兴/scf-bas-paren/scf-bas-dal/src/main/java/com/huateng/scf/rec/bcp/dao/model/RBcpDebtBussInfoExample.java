package com.huateng.scf.rec.bcp.dao.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RBcpDebtBussInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RBcpDebtBussInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    protected RBcpDebtBussInfoExample(RBcpDebtBussInfoExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
        this.distinct = example.distinct;
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
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected GeneratedCriteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
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

        public Criteria andAppnoIsNull() {
            addCriterion("APPNO is null");
            return (Criteria) this;
        }

        public Criteria andAppnoIsNotNull() {
            addCriterion("APPNO is not null");
            return (Criteria) this;
        }

        public Criteria andAppnoEqualTo(String value) {
            addCriterion("APPNO =", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotEqualTo(String value) {
            addCriterion("APPNO <>", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoGreaterThan(String value) {
            addCriterion("APPNO >", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoGreaterThanOrEqualTo(String value) {
            addCriterion("APPNO >=", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoLessThan(String value) {
            addCriterion("APPNO <", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoLessThanOrEqualTo(String value) {
            addCriterion("APPNO <=", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoLike(String value) {
            addCriterion("APPNO like", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotLike(String value) {
            addCriterion("APPNO not like", value, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoIn(List<String> values) {
            addCriterion("APPNO in", values, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotIn(List<String> values) {
            addCriterion("APPNO not in", values, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoBetween(String value1, String value2) {
            addCriterion("APPNO between", value1, value2, "appno");
            return (Criteria) this;
        }

        public Criteria andAppnoNotBetween(String value1, String value2) {
            addCriterion("APPNO not between", value1, value2, "appno");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNull() {
            addCriterion("APPLY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIsNotNull() {
            addCriterion("APPLY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTypeEqualTo(String value) {
            addCriterion("APPLY_TYPE =", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotEqualTo(String value) {
            addCriterion("APPLY_TYPE <>", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThan(String value) {
            addCriterion("APPLY_TYPE >", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE >=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThan(String value) {
            addCriterion("APPLY_TYPE <", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLessThanOrEqualTo(String value) {
            addCriterion("APPLY_TYPE <=", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeLike(String value) {
            addCriterion("APPLY_TYPE like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotLike(String value) {
            addCriterion("APPLY_TYPE not like", value, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeIn(List<String> values) {
            addCriterion("APPLY_TYPE in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotIn(List<String> values) {
            addCriterion("APPLY_TYPE not in", values, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andApplyTypeNotBetween(String value1, String value2) {
            addCriterion("APPLY_TYPE not between", value1, value2, "applyType");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerIsNull() {
            addCriterion("CUSTCD_SALLER is null");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerIsNotNull() {
            addCriterion("CUSTCD_SALLER is not null");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerEqualTo(String value) {
            addCriterion("CUSTCD_SALLER =", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerNotEqualTo(String value) {
            addCriterion("CUSTCD_SALLER <>", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerGreaterThan(String value) {
            addCriterion("CUSTCD_SALLER >", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCD_SALLER >=", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerLessThan(String value) {
            addCriterion("CUSTCD_SALLER <", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerLessThanOrEqualTo(String value) {
            addCriterion("CUSTCD_SALLER <=", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerLike(String value) {
            addCriterion("CUSTCD_SALLER like", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerNotLike(String value) {
            addCriterion("CUSTCD_SALLER not like", value, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerIn(List<String> values) {
            addCriterion("CUSTCD_SALLER in", values, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerNotIn(List<String> values) {
            addCriterion("CUSTCD_SALLER not in", values, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerBetween(String value1, String value2) {
            addCriterion("CUSTCD_SALLER between", value1, value2, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdSallerNotBetween(String value1, String value2) {
            addCriterion("CUSTCD_SALLER not between", value1, value2, "custcdSaller");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerIsNull() {
            addCriterion("CUSTCD_BUYER is null");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerIsNotNull() {
            addCriterion("CUSTCD_BUYER is not null");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerEqualTo(String value) {
            addCriterion("CUSTCD_BUYER =", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerNotEqualTo(String value) {
            addCriterion("CUSTCD_BUYER <>", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerGreaterThan(String value) {
            addCriterion("CUSTCD_BUYER >", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTCD_BUYER >=", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerLessThan(String value) {
            addCriterion("CUSTCD_BUYER <", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerLessThanOrEqualTo(String value) {
            addCriterion("CUSTCD_BUYER <=", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerLike(String value) {
            addCriterion("CUSTCD_BUYER like", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerNotLike(String value) {
            addCriterion("CUSTCD_BUYER not like", value, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerIn(List<String> values) {
            addCriterion("CUSTCD_BUYER in", values, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerNotIn(List<String> values) {
            addCriterion("CUSTCD_BUYER not in", values, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerBetween(String value1, String value2) {
            addCriterion("CUSTCD_BUYER between", value1, value2, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andCustcdBuyerNotBetween(String value1, String value2) {
            addCriterion("CUSTCD_BUYER not between", value1, value2, "custcdBuyer");
            return (Criteria) this;
        }

        public Criteria andMastContnoIsNull() {
            addCriterion("MAST_CONTNO is null");
            return (Criteria) this;
        }

        public Criteria andMastContnoIsNotNull() {
            addCriterion("MAST_CONTNO is not null");
            return (Criteria) this;
        }

        public Criteria andMastContnoEqualTo(String value) {
            addCriterion("MAST_CONTNO =", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoNotEqualTo(String value) {
            addCriterion("MAST_CONTNO <>", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoGreaterThan(String value) {
            addCriterion("MAST_CONTNO >", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoGreaterThanOrEqualTo(String value) {
            addCriterion("MAST_CONTNO >=", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoLessThan(String value) {
            addCriterion("MAST_CONTNO <", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoLessThanOrEqualTo(String value) {
            addCriterion("MAST_CONTNO <=", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoLike(String value) {
            addCriterion("MAST_CONTNO like", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoNotLike(String value) {
            addCriterion("MAST_CONTNO not like", value, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoIn(List<String> values) {
            addCriterion("MAST_CONTNO in", values, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoNotIn(List<String> values) {
            addCriterion("MAST_CONTNO not in", values, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoBetween(String value1, String value2) {
            addCriterion("MAST_CONTNO between", value1, value2, "mastContno");
            return (Criteria) this;
        }

        public Criteria andMastContnoNotBetween(String value1, String value2) {
            addCriterion("MAST_CONTNO not between", value1, value2, "mastContno");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNull() {
            addCriterion("INSERT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInsertDateIsNotNull() {
            addCriterion("INSERT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInsertDateEqualTo(String value) {
            addCriterion("INSERT_DATE =", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotEqualTo(String value) {
            addCriterion("INSERT_DATE <>", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThan(String value) {
            addCriterion("INSERT_DATE >", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateGreaterThanOrEqualTo(String value) {
            addCriterion("INSERT_DATE >=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThan(String value) {
            addCriterion("INSERT_DATE <", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLessThanOrEqualTo(String value) {
            addCriterion("INSERT_DATE <=", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateLike(String value) {
            addCriterion("INSERT_DATE like", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotLike(String value) {
            addCriterion("INSERT_DATE not like", value, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateIn(List<String> values) {
            addCriterion("INSERT_DATE in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotIn(List<String> values) {
            addCriterion("INSERT_DATE not in", values, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateBetween(String value1, String value2) {
            addCriterion("INSERT_DATE between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andInsertDateNotBetween(String value1, String value2) {
            addCriterion("INSERT_DATE not between", value1, value2, "insertDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNull() {
            addCriterion("PURCHASE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIsNotNull() {
            addCriterion("PURCHASE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateEqualTo(String value) {
            addCriterion("PURCHASE_DATE =", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotEqualTo(String value) {
            addCriterion("PURCHASE_DATE <>", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThan(String value) {
            addCriterion("PURCHASE_DATE >", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateGreaterThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DATE >=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThan(String value) {
            addCriterion("PURCHASE_DATE <", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLessThanOrEqualTo(String value) {
            addCriterion("PURCHASE_DATE <=", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateLike(String value) {
            addCriterion("PURCHASE_DATE like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotLike(String value) {
            addCriterion("PURCHASE_DATE not like", value, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateIn(List<String> values) {
            addCriterion("PURCHASE_DATE in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotIn(List<String> values) {
            addCriterion("PURCHASE_DATE not in", values, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateBetween(String value1, String value2) {
            addCriterion("PURCHASE_DATE between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andPurchaseDateNotBetween(String value1, String value2) {
            addCriterion("PURCHASE_DATE not between", value1, value2, "purchaseDate");
            return (Criteria) this;
        }

        public Criteria andDebtNumIsNull() {
            addCriterion("DEBT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andDebtNumIsNotNull() {
            addCriterion("DEBT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andDebtNumEqualTo(BigDecimal value) {
            addCriterion("DEBT_NUM =", value, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumNotEqualTo(BigDecimal value) {
            addCriterion("DEBT_NUM <>", value, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumGreaterThan(BigDecimal value) {
            addCriterion("DEBT_NUM >", value, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEBT_NUM >=", value, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumLessThan(BigDecimal value) {
            addCriterion("DEBT_NUM <", value, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEBT_NUM <=", value, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumIn(List<BigDecimal> values) {
            addCriterion("DEBT_NUM in", values, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumNotIn(List<BigDecimal> values) {
            addCriterion("DEBT_NUM not in", values, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEBT_NUM between", value1, value2, "debtNum");
            return (Criteria) this;
        }

        public Criteria andDebtNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEBT_NUM not between", value1, value2, "debtNum");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountIsNull() {
            addCriterion("TOTAL_DEBT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountIsNotNull() {
            addCriterion("TOTAL_DEBT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT_AMOUNT =", value, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT_AMOUNT <>", value, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_DEBT_AMOUNT >", value, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT_AMOUNT >=", value, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_DEBT_AMOUNT <", value, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_DEBT_AMOUNT <=", value, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DEBT_AMOUNT in", values, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_DEBT_AMOUNT not in", values, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DEBT_AMOUNT between", value1, value2, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andTotalDebtAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_DEBT_AMOUNT not between", value1, value2, "totalDebtAmount");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNull() {
            addCriterion("CHARGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIsNotNull() {
            addCriterion("CHARGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeTypeEqualTo(String value) {
            addCriterion("CHARGE_TYPE =", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotEqualTo(String value) {
            addCriterion("CHARGE_TYPE <>", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThan(String value) {
            addCriterion("CHARGE_TYPE >", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_TYPE >=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThan(String value) {
            addCriterion("CHARGE_TYPE <", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_TYPE <=", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeLike(String value) {
            addCriterion("CHARGE_TYPE like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotLike(String value) {
            addCriterion("CHARGE_TYPE not like", value, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeIn(List<String> values) {
            addCriterion("CHARGE_TYPE in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotIn(List<String> values) {
            addCriterion("CHARGE_TYPE not in", values, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeBetween(String value1, String value2) {
            addCriterion("CHARGE_TYPE between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andChargeTypeNotBetween(String value1, String value2) {
            addCriterion("CHARGE_TYPE not between", value1, value2, "chargeType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeIsNull() {
            addCriterion("FINACING_DISCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeIsNotNull() {
            addCriterion("FINACING_DISCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeEqualTo(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE =", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeNotEqualTo(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE <>", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeGreaterThan(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE >", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE >=", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeLessThan(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE <", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeLessThanOrEqualTo(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE <=", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeLike(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE like", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeNotLike(String value) {
            addCriterion("FINACING_DISCOUNT_TYPE not like", value, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeIn(List<String> values) {
            addCriterion("FINACING_DISCOUNT_TYPE in", values, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeNotIn(List<String> values) {
            addCriterion("FINACING_DISCOUNT_TYPE not in", values, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeBetween(String value1, String value2) {
            addCriterion("FINACING_DISCOUNT_TYPE between", value1, value2, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingDiscountTypeNotBetween(String value1, String value2) {
            addCriterion("FINACING_DISCOUNT_TYPE not between", value1, value2, "finacingDiscountType");
            return (Criteria) this;
        }

        public Criteria andFinacingCostIsNull() {
            addCriterion("FINACING_COST is null");
            return (Criteria) this;
        }

        public Criteria andFinacingCostIsNotNull() {
            addCriterion("FINACING_COST is not null");
            return (Criteria) this;
        }

        public Criteria andFinacingCostEqualTo(BigDecimal value) {
            addCriterion("FINACING_COST =", value, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostNotEqualTo(BigDecimal value) {
            addCriterion("FINACING_COST <>", value, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostGreaterThan(BigDecimal value) {
            addCriterion("FINACING_COST >", value, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINACING_COST >=", value, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostLessThan(BigDecimal value) {
            addCriterion("FINACING_COST <", value, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINACING_COST <=", value, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostIn(List<BigDecimal> values) {
            addCriterion("FINACING_COST in", values, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostNotIn(List<BigDecimal> values) {
            addCriterion("FINACING_COST not in", values, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINACING_COST between", value1, value2, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andFinacingCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINACING_COST not between", value1, value2, "finacingCost");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("COST is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("COST is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("COST =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("COST <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("COST >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("COST <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("COST in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("COST not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNull() {
            addCriterion("HANDLING_FEE is null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIsNotNull() {
            addCriterion("HANDLING_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE =", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE <>", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThan(BigDecimal value) {
            addCriterion("HANDLING_FEE >", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE >=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThan(BigDecimal value) {
            addCriterion("HANDLING_FEE <", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HANDLING_FEE <=", value, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeIn(List<BigDecimal> values) {
            addCriterion("HANDLING_FEE in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotIn(List<BigDecimal> values) {
            addCriterion("HANDLING_FEE not in", values, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLING_FEE between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andHandlingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HANDLING_FEE not between", value1, value2, "handlingFee");
            return (Criteria) this;
        }

        public Criteria andReduceAmountIsNull() {
            addCriterion("REDUCE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReduceAmountIsNotNull() {
            addCriterion("REDUCE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReduceAmountEqualTo(BigDecimal value) {
            addCriterion("REDUCE_AMOUNT =", value, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountNotEqualTo(BigDecimal value) {
            addCriterion("REDUCE_AMOUNT <>", value, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountGreaterThan(BigDecimal value) {
            addCriterion("REDUCE_AMOUNT >", value, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REDUCE_AMOUNT >=", value, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountLessThan(BigDecimal value) {
            addCriterion("REDUCE_AMOUNT <", value, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REDUCE_AMOUNT <=", value, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountIn(List<BigDecimal> values) {
            addCriterion("REDUCE_AMOUNT in", values, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountNotIn(List<BigDecimal> values) {
            addCriterion("REDUCE_AMOUNT not in", values, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REDUCE_AMOUNT between", value1, value2, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andReduceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REDUCE_AMOUNT not between", value1, value2, "reduceAmount");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNull() {
            addCriterion("TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIsNotNull() {
            addCriterion("TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalFeeEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE =", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE <>", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_FEE >", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE >=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThan(BigDecimal value) {
            addCriterion("TOTAL_FEE <", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_FEE <=", value, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeIn(List<BigDecimal> values) {
            addCriterion("TOTAL_FEE in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_FEE not in", values, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_FEE between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_FEE not between", value1, value2, "totalFee");
            return (Criteria) this;
        }

        public Criteria andTotalReduceIsNull() {
            addCriterion("TOTAL_REDUCE is null");
            return (Criteria) this;
        }

        public Criteria andTotalReduceIsNotNull() {
            addCriterion("TOTAL_REDUCE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalReduceEqualTo(BigDecimal value) {
            addCriterion("TOTAL_REDUCE =", value, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_REDUCE <>", value, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_REDUCE >", value, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_REDUCE >=", value, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceLessThan(BigDecimal value) {
            addCriterion("TOTAL_REDUCE <", value, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_REDUCE <=", value, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceIn(List<BigDecimal> values) {
            addCriterion("TOTAL_REDUCE in", values, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_REDUCE not in", values, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_REDUCE between", value1, value2, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andTotalReduceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_REDUCE not between", value1, value2, "totalReduce");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountIsNull() {
            addCriterion("RECEIVE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountIsNotNull() {
            addCriterion("RECEIVE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_AMOUNT =", value, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_AMOUNT <>", value, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountGreaterThan(BigDecimal value) {
            addCriterion("RECEIVE_AMOUNT >", value, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_AMOUNT >=", value, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountLessThan(BigDecimal value) {
            addCriterion("RECEIVE_AMOUNT <", value, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVE_AMOUNT <=", value, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_AMOUNT in", values, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVE_AMOUNT not in", values, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_AMOUNT between", value1, value2, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andReceiveAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVE_AMOUNT not between", value1, value2, "receiveAmount");
            return (Criteria) this;
        }

        public Criteria andCostAccountIsNull() {
            addCriterion("COST_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCostAccountIsNotNull() {
            addCriterion("COST_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCostAccountEqualTo(String value) {
            addCriterion("COST_ACCOUNT =", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountNotEqualTo(String value) {
            addCriterion("COST_ACCOUNT <>", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountGreaterThan(String value) {
            addCriterion("COST_ACCOUNT >", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountGreaterThanOrEqualTo(String value) {
            addCriterion("COST_ACCOUNT >=", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountLessThan(String value) {
            addCriterion("COST_ACCOUNT <", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountLessThanOrEqualTo(String value) {
            addCriterion("COST_ACCOUNT <=", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountLike(String value) {
            addCriterion("COST_ACCOUNT like", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountNotLike(String value) {
            addCriterion("COST_ACCOUNT not like", value, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountIn(List<String> values) {
            addCriterion("COST_ACCOUNT in", values, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountNotIn(List<String> values) {
            addCriterion("COST_ACCOUNT not in", values, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountBetween(String value1, String value2) {
            addCriterion("COST_ACCOUNT between", value1, value2, "costAccount");
            return (Criteria) this;
        }

        public Criteria andCostAccountNotBetween(String value1, String value2) {
            addCriterion("COST_ACCOUNT not between", value1, value2, "costAccount");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthIsNull() {
            addCriterion("PAY_DAY_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthIsNotNull() {
            addCriterion("PAY_DAY_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthEqualTo(String value) {
            addCriterion("PAY_DAY_MONTH =", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthNotEqualTo(String value) {
            addCriterion("PAY_DAY_MONTH <>", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthGreaterThan(String value) {
            addCriterion("PAY_DAY_MONTH >", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_DAY_MONTH >=", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthLessThan(String value) {
            addCriterion("PAY_DAY_MONTH <", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthLessThanOrEqualTo(String value) {
            addCriterion("PAY_DAY_MONTH <=", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthLike(String value) {
            addCriterion("PAY_DAY_MONTH like", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthNotLike(String value) {
            addCriterion("PAY_DAY_MONTH not like", value, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthIn(List<String> values) {
            addCriterion("PAY_DAY_MONTH in", values, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthNotIn(List<String> values) {
            addCriterion("PAY_DAY_MONTH not in", values, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthBetween(String value1, String value2) {
            addCriterion("PAY_DAY_MONTH between", value1, value2, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andPayDayMonthNotBetween(String value1, String value2) {
            addCriterion("PAY_DAY_MONTH not between", value1, value2, "payDayMonth");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeIsNull() {
            addCriterion("RATE_COLLECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeIsNotNull() {
            addCriterion("RATE_COLLECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeEqualTo(String value) {
            addCriterion("RATE_COLLECT_TYPE =", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeNotEqualTo(String value) {
            addCriterion("RATE_COLLECT_TYPE <>", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeGreaterThan(String value) {
            addCriterion("RATE_COLLECT_TYPE >", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RATE_COLLECT_TYPE >=", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeLessThan(String value) {
            addCriterion("RATE_COLLECT_TYPE <", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeLessThanOrEqualTo(String value) {
            addCriterion("RATE_COLLECT_TYPE <=", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeLike(String value) {
            addCriterion("RATE_COLLECT_TYPE like", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeNotLike(String value) {
            addCriterion("RATE_COLLECT_TYPE not like", value, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeIn(List<String> values) {
            addCriterion("RATE_COLLECT_TYPE in", values, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeNotIn(List<String> values) {
            addCriterion("RATE_COLLECT_TYPE not in", values, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeBetween(String value1, String value2) {
            addCriterion("RATE_COLLECT_TYPE between", value1, value2, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andRateCollectTypeNotBetween(String value1, String value2) {
            addCriterion("RATE_COLLECT_TYPE not between", value1, value2, "rateCollectType");
            return (Criteria) this;
        }

        public Criteria andOverDueRateIsNull() {
            addCriterion("OVER_DUE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andOverDueRateIsNotNull() {
            addCriterion("OVER_DUE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andOverDueRateEqualTo(String value) {
            addCriterion("OVER_DUE_RATE =", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateNotEqualTo(String value) {
            addCriterion("OVER_DUE_RATE <>", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateGreaterThan(String value) {
            addCriterion("OVER_DUE_RATE >", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateGreaterThanOrEqualTo(String value) {
            addCriterion("OVER_DUE_RATE >=", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateLessThan(String value) {
            addCriterion("OVER_DUE_RATE <", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateLessThanOrEqualTo(String value) {
            addCriterion("OVER_DUE_RATE <=", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateLike(String value) {
            addCriterion("OVER_DUE_RATE like", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateNotLike(String value) {
            addCriterion("OVER_DUE_RATE not like", value, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateIn(List<String> values) {
            addCriterion("OVER_DUE_RATE in", values, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateNotIn(List<String> values) {
            addCriterion("OVER_DUE_RATE not in", values, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateBetween(String value1, String value2) {
            addCriterion("OVER_DUE_RATE between", value1, value2, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andOverDueRateNotBetween(String value1, String value2) {
            addCriterion("OVER_DUE_RATE not between", value1, value2, "overDueRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateIsNull() {
            addCriterion("EXECUTE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andExecuteRateIsNotNull() {
            addCriterion("EXECUTE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andExecuteRateEqualTo(String value) {
            addCriterion("EXECUTE_RATE =", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateNotEqualTo(String value) {
            addCriterion("EXECUTE_RATE <>", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateGreaterThan(String value) {
            addCriterion("EXECUTE_RATE >", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateGreaterThanOrEqualTo(String value) {
            addCriterion("EXECUTE_RATE >=", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateLessThan(String value) {
            addCriterion("EXECUTE_RATE <", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateLessThanOrEqualTo(String value) {
            addCriterion("EXECUTE_RATE <=", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateLike(String value) {
            addCriterion("EXECUTE_RATE like", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateNotLike(String value) {
            addCriterion("EXECUTE_RATE not like", value, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateIn(List<String> values) {
            addCriterion("EXECUTE_RATE in", values, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateNotIn(List<String> values) {
            addCriterion("EXECUTE_RATE not in", values, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateBetween(String value1, String value2) {
            addCriterion("EXECUTE_RATE between", value1, value2, "executeRate");
            return (Criteria) this;
        }

        public Criteria andExecuteRateNotBetween(String value1, String value2) {
            addCriterion("EXECUTE_RATE not between", value1, value2, "executeRate");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentIsNull() {
            addCriterion("UP_DOWN_PERCENT is null");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentIsNotNull() {
            addCriterion("UP_DOWN_PERCENT is not null");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentEqualTo(String value) {
            addCriterion("UP_DOWN_PERCENT =", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentNotEqualTo(String value) {
            addCriterion("UP_DOWN_PERCENT <>", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentGreaterThan(String value) {
            addCriterion("UP_DOWN_PERCENT >", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentGreaterThanOrEqualTo(String value) {
            addCriterion("UP_DOWN_PERCENT >=", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentLessThan(String value) {
            addCriterion("UP_DOWN_PERCENT <", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentLessThanOrEqualTo(String value) {
            addCriterion("UP_DOWN_PERCENT <=", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentLike(String value) {
            addCriterion("UP_DOWN_PERCENT like", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentNotLike(String value) {
            addCriterion("UP_DOWN_PERCENT not like", value, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentIn(List<String> values) {
            addCriterion("UP_DOWN_PERCENT in", values, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentNotIn(List<String> values) {
            addCriterion("UP_DOWN_PERCENT not in", values, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentBetween(String value1, String value2) {
            addCriterion("UP_DOWN_PERCENT between", value1, value2, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownPercentNotBetween(String value1, String value2) {
            addCriterion("UP_DOWN_PERCENT not between", value1, value2, "upDownPercent");
            return (Criteria) this;
        }

        public Criteria andUpDownIsNull() {
            addCriterion("UP_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andUpDownIsNotNull() {
            addCriterion("UP_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andUpDownEqualTo(String value) {
            addCriterion("UP_DOWN =", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotEqualTo(String value) {
            addCriterion("UP_DOWN <>", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownGreaterThan(String value) {
            addCriterion("UP_DOWN >", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownGreaterThanOrEqualTo(String value) {
            addCriterion("UP_DOWN >=", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownLessThan(String value) {
            addCriterion("UP_DOWN <", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownLessThanOrEqualTo(String value) {
            addCriterion("UP_DOWN <=", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownLike(String value) {
            addCriterion("UP_DOWN like", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotLike(String value) {
            addCriterion("UP_DOWN not like", value, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownIn(List<String> values) {
            addCriterion("UP_DOWN in", values, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotIn(List<String> values) {
            addCriterion("UP_DOWN not in", values, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownBetween(String value1, String value2) {
            addCriterion("UP_DOWN between", value1, value2, "upDown");
            return (Criteria) this;
        }

        public Criteria andUpDownNotBetween(String value1, String value2) {
            addCriterion("UP_DOWN not between", value1, value2, "upDown");
            return (Criteria) this;
        }

        public Criteria andBaseRateIsNull() {
            addCriterion("BASE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andBaseRateIsNotNull() {
            addCriterion("BASE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseRateEqualTo(String value) {
            addCriterion("BASE_RATE =", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotEqualTo(String value) {
            addCriterion("BASE_RATE <>", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateGreaterThan(String value) {
            addCriterion("BASE_RATE >", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateGreaterThanOrEqualTo(String value) {
            addCriterion("BASE_RATE >=", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateLessThan(String value) {
            addCriterion("BASE_RATE <", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateLessThanOrEqualTo(String value) {
            addCriterion("BASE_RATE <=", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateLike(String value) {
            addCriterion("BASE_RATE like", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotLike(String value) {
            addCriterion("BASE_RATE not like", value, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateIn(List<String> values) {
            addCriterion("BASE_RATE in", values, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotIn(List<String> values) {
            addCriterion("BASE_RATE not in", values, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateBetween(String value1, String value2) {
            addCriterion("BASE_RATE between", value1, value2, "baseRate");
            return (Criteria) this;
        }

        public Criteria andBaseRateNotBetween(String value1, String value2) {
            addCriterion("BASE_RATE not between", value1, value2, "baseRate");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNull() {
            addCriterion("RATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andRateIdIsNotNull() {
            addCriterion("RATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRateIdEqualTo(String value) {
            addCriterion("RATE_ID =", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotEqualTo(String value) {
            addCriterion("RATE_ID <>", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThan(String value) {
            addCriterion("RATE_ID >", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdGreaterThanOrEqualTo(String value) {
            addCriterion("RATE_ID >=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThan(String value) {
            addCriterion("RATE_ID <", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLessThanOrEqualTo(String value) {
            addCriterion("RATE_ID <=", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdLike(String value) {
            addCriterion("RATE_ID like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotLike(String value) {
            addCriterion("RATE_ID not like", value, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdIn(List<String> values) {
            addCriterion("RATE_ID in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotIn(List<String> values) {
            addCriterion("RATE_ID not in", values, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdBetween(String value1, String value2) {
            addCriterion("RATE_ID between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateIdNotBetween(String value1, String value2) {
            addCriterion("RATE_ID not between", value1, value2, "rateId");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNull() {
            addCriterion("RATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRateTypeIsNotNull() {
            addCriterion("RATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRateTypeEqualTo(String value) {
            addCriterion("RATE_TYPE =", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotEqualTo(String value) {
            addCriterion("RATE_TYPE <>", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThan(String value) {
            addCriterion("RATE_TYPE >", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RATE_TYPE >=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThan(String value) {
            addCriterion("RATE_TYPE <", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLessThanOrEqualTo(String value) {
            addCriterion("RATE_TYPE <=", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeLike(String value) {
            addCriterion("RATE_TYPE like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotLike(String value) {
            addCriterion("RATE_TYPE not like", value, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeIn(List<String> values) {
            addCriterion("RATE_TYPE in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotIn(List<String> values) {
            addCriterion("RATE_TYPE not in", values, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeBetween(String value1, String value2) {
            addCriterion("RATE_TYPE between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andRateTypeNotBetween(String value1, String value2) {
            addCriterion("RATE_TYPE not between", value1, value2, "rateType");
            return (Criteria) this;
        }

        public Criteria andBussTypeIsNull() {
            addCriterion("BUSS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBussTypeIsNotNull() {
            addCriterion("BUSS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBussTypeEqualTo(String value) {
            addCriterion("BUSS_TYPE =", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeNotEqualTo(String value) {
            addCriterion("BUSS_TYPE <>", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeGreaterThan(String value) {
            addCriterion("BUSS_TYPE >", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSS_TYPE >=", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeLessThan(String value) {
            addCriterion("BUSS_TYPE <", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSS_TYPE <=", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeLike(String value) {
            addCriterion("BUSS_TYPE like", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeNotLike(String value) {
            addCriterion("BUSS_TYPE not like", value, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeIn(List<String> values) {
            addCriterion("BUSS_TYPE in", values, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeNotIn(List<String> values) {
            addCriterion("BUSS_TYPE not in", values, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeBetween(String value1, String value2) {
            addCriterion("BUSS_TYPE between", value1, value2, "bussType");
            return (Criteria) this;
        }

        public Criteria andBussTypeNotBetween(String value1, String value2) {
            addCriterion("BUSS_TYPE not between", value1, value2, "bussType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNull() {
            addCriterion("LOAN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIsNotNull() {
            addCriterion("LOAN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanTypeEqualTo(String value) {
            addCriterion("LOAN_TYPE =", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotEqualTo(String value) {
            addCriterion("LOAN_TYPE <>", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThan(String value) {
            addCriterion("LOAN_TYPE >", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_TYPE >=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThan(String value) {
            addCriterion("LOAN_TYPE <", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLessThanOrEqualTo(String value) {
            addCriterion("LOAN_TYPE <=", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeLike(String value) {
            addCriterion("LOAN_TYPE like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotLike(String value) {
            addCriterion("LOAN_TYPE not like", value, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeIn(List<String> values) {
            addCriterion("LOAN_TYPE in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotIn(List<String> values) {
            addCriterion("LOAN_TYPE not in", values, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeBetween(String value1, String value2) {
            addCriterion("LOAN_TYPE between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andLoanTypeNotBetween(String value1, String value2) {
            addCriterion("LOAN_TYPE not between", value1, value2, "loanType");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNull() {
            addCriterion("BANKNO is null");
            return (Criteria) this;
        }

        public Criteria andBanknoIsNotNull() {
            addCriterion("BANKNO is not null");
            return (Criteria) this;
        }

        public Criteria andBanknoEqualTo(String value) {
            addCriterion("BANKNO =", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotEqualTo(String value) {
            addCriterion("BANKNO <>", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThan(String value) {
            addCriterion("BANKNO >", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("BANKNO >=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThan(String value) {
            addCriterion("BANKNO <", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLessThanOrEqualTo(String value) {
            addCriterion("BANKNO <=", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoLike(String value) {
            addCriterion("BANKNO like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotLike(String value) {
            addCriterion("BANKNO not like", value, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoIn(List<String> values) {
            addCriterion("BANKNO in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotIn(List<String> values) {
            addCriterion("BANKNO not in", values, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoBetween(String value1, String value2) {
            addCriterion("BANKNO between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBanknoNotBetween(String value1, String value2) {
            addCriterion("BANKNO not between", value1, value2, "bankno");
            return (Criteria) this;
        }

        public Criteria andBrcode2IsNull() {
            addCriterion("BRCODE2 is null");
            return (Criteria) this;
        }

        public Criteria andBrcode2IsNotNull() {
            addCriterion("BRCODE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBrcode2EqualTo(String value) {
            addCriterion("BRCODE2 =", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2NotEqualTo(String value) {
            addCriterion("BRCODE2 <>", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2GreaterThan(String value) {
            addCriterion("BRCODE2 >", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2GreaterThanOrEqualTo(String value) {
            addCriterion("BRCODE2 >=", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2LessThan(String value) {
            addCriterion("BRCODE2 <", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2LessThanOrEqualTo(String value) {
            addCriterion("BRCODE2 <=", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2Like(String value) {
            addCriterion("BRCODE2 like", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2NotLike(String value) {
            addCriterion("BRCODE2 not like", value, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2In(List<String> values) {
            addCriterion("BRCODE2 in", values, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2NotIn(List<String> values) {
            addCriterion("BRCODE2 not in", values, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2Between(String value1, String value2) {
            addCriterion("BRCODE2 between", value1, value2, "brcode2");
            return (Criteria) this;
        }

        public Criteria andBrcode2NotBetween(String value1, String value2) {
            addCriterion("BRCODE2 not between", value1, value2, "brcode2");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNull() {
            addCriterion("APP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAppDateIsNotNull() {
            addCriterion("APP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAppDateEqualTo(String value) {
            addCriterion("APP_DATE =", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotEqualTo(String value) {
            addCriterion("APP_DATE <>", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThan(String value) {
            addCriterion("APP_DATE >", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateGreaterThanOrEqualTo(String value) {
            addCriterion("APP_DATE >=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThan(String value) {
            addCriterion("APP_DATE <", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLessThanOrEqualTo(String value) {
            addCriterion("APP_DATE <=", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateLike(String value) {
            addCriterion("APP_DATE like", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotLike(String value) {
            addCriterion("APP_DATE not like", value, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateIn(List<String> values) {
            addCriterion("APP_DATE in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotIn(List<String> values) {
            addCriterion("APP_DATE not in", values, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateBetween(String value1, String value2) {
            addCriterion("APP_DATE between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppDateNotBetween(String value1, String value2) {
            addCriterion("APP_DATE not between", value1, value2, "appDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateIsNull() {
            addCriterion("APP_LOAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateIsNotNull() {
            addCriterion("APP_LOAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateEqualTo(String value) {
            addCriterion("APP_LOAN_DATE =", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateNotEqualTo(String value) {
            addCriterion("APP_LOAN_DATE <>", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateGreaterThan(String value) {
            addCriterion("APP_LOAN_DATE >", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateGreaterThanOrEqualTo(String value) {
            addCriterion("APP_LOAN_DATE >=", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateLessThan(String value) {
            addCriterion("APP_LOAN_DATE <", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateLessThanOrEqualTo(String value) {
            addCriterion("APP_LOAN_DATE <=", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateLike(String value) {
            addCriterion("APP_LOAN_DATE like", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateNotLike(String value) {
            addCriterion("APP_LOAN_DATE not like", value, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateIn(List<String> values) {
            addCriterion("APP_LOAN_DATE in", values, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateNotIn(List<String> values) {
            addCriterion("APP_LOAN_DATE not in", values, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateBetween(String value1, String value2) {
            addCriterion("APP_LOAN_DATE between", value1, value2, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andAppLoanDateNotBetween(String value1, String value2) {
            addCriterion("APP_LOAN_DATE not between", value1, value2, "appLoanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateIsNull() {
            addCriterion("LOAN_DUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateIsNotNull() {
            addCriterion("LOAN_DUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateEqualTo(String value) {
            addCriterion("LOAN_DUE_DATE =", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateNotEqualTo(String value) {
            addCriterion("LOAN_DUE_DATE <>", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateGreaterThan(String value) {
            addCriterion("LOAN_DUE_DATE >", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateGreaterThanOrEqualTo(String value) {
            addCriterion("LOAN_DUE_DATE >=", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateLessThan(String value) {
            addCriterion("LOAN_DUE_DATE <", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateLessThanOrEqualTo(String value) {
            addCriterion("LOAN_DUE_DATE <=", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateLike(String value) {
            addCriterion("LOAN_DUE_DATE like", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateNotLike(String value) {
            addCriterion("LOAN_DUE_DATE not like", value, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateIn(List<String> values) {
            addCriterion("LOAN_DUE_DATE in", values, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateNotIn(List<String> values) {
            addCriterion("LOAN_DUE_DATE not in", values, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateBetween(String value1, String value2) {
            addCriterion("LOAN_DUE_DATE between", value1, value2, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andLoanDueDateNotBetween(String value1, String value2) {
            addCriterion("LOAN_DUE_DATE not between", value1, value2, "loanDueDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("RETURN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("RETURN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(String value) {
            addCriterion("RETURN_DATE =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(String value) {
            addCriterion("RETURN_DATE <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(String value) {
            addCriterion("RETURN_DATE >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_DATE >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(String value) {
            addCriterion("RETURN_DATE <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(String value) {
            addCriterion("RETURN_DATE <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLike(String value) {
            addCriterion("RETURN_DATE like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotLike(String value) {
            addCriterion("RETURN_DATE not like", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<String> values) {
            addCriterion("RETURN_DATE in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<String> values) {
            addCriterion("RETURN_DATE not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(String value1, String value2) {
            addCriterion("RETURN_DATE between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(String value1, String value2) {
            addCriterion("RETURN_DATE not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andCurcdIsNull() {
            addCriterion("CURCD is null");
            return (Criteria) this;
        }

        public Criteria andCurcdIsNotNull() {
            addCriterion("CURCD is not null");
            return (Criteria) this;
        }

        public Criteria andCurcdEqualTo(String value) {
            addCriterion("CURCD =", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdNotEqualTo(String value) {
            addCriterion("CURCD <>", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdGreaterThan(String value) {
            addCriterion("CURCD >", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdGreaterThanOrEqualTo(String value) {
            addCriterion("CURCD >=", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdLessThan(String value) {
            addCriterion("CURCD <", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdLessThanOrEqualTo(String value) {
            addCriterion("CURCD <=", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdLike(String value) {
            addCriterion("CURCD like", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdNotLike(String value) {
            addCriterion("CURCD not like", value, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdIn(List<String> values) {
            addCriterion("CURCD in", values, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdNotIn(List<String> values) {
            addCriterion("CURCD not in", values, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdBetween(String value1, String value2) {
            addCriterion("CURCD between", value1, value2, "curcd");
            return (Criteria) this;
        }

        public Criteria andCurcdNotBetween(String value1, String value2) {
            addCriterion("CURCD not between", value1, value2, "curcd");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andCommonDateIsNull() {
            addCriterion("COMMON_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCommonDateIsNotNull() {
            addCriterion("COMMON_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCommonDateEqualTo(String value) {
            addCriterion("COMMON_DATE =", value, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateNotEqualTo(String value) {
            addCriterion("COMMON_DATE <>", value, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateGreaterThan(String value) {
            addCriterion("COMMON_DATE >", value, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateGreaterThanOrEqualTo(String value) {
            addCriterion("COMMON_DATE >=", value, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateLessThan(String value) {
            addCriterion("COMMON_DATE <", value, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateLessThanOrEqualTo(String value) {
            addCriterion("COMMON_DATE <=", value, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateIn(List<String> values) {
            addCriterion("COMMON_DATE in", values, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateNotIn(List<String> values) {
            addCriterion("COMMON_DATE not in", values, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateBetween(String value1, String value2) {
            addCriterion("COMMON_DATE between", value1, value2, "commonDate");
            return (Criteria) this;
        }

        public Criteria andCommonDateNotBetween(String value1, String value2) {
            addCriterion("COMMON_DATE not between", value1, value2, "commonDate");
            return (Criteria) this;
        }

        public Criteria andTlrcdIsNull() {
            addCriterion("TLRCD is null");
            return (Criteria) this;
        }

        public Criteria andTlrcdIsNotNull() {
            addCriterion("TLRCD is not null");
            return (Criteria) this;
        }

        public Criteria andTlrcdEqualTo(String value) {
            addCriterion("TLRCD =", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdNotEqualTo(String value) {
            addCriterion("TLRCD <>", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdGreaterThan(String value) {
            addCriterion("TLRCD >", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdGreaterThanOrEqualTo(String value) {
            addCriterion("TLRCD >=", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdLessThan(String value) {
            addCriterion("TLRCD <", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdLessThanOrEqualTo(String value) {
            addCriterion("TLRCD <=", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdLike(String value) {
            addCriterion("TLRCD like", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdNotLike(String value) {
            addCriterion("TLRCD not like", value, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdIn(List<String> values) {
            addCriterion("TLRCD in", values, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdNotIn(List<String> values) {
            addCriterion("TLRCD not in", values, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdBetween(String value1, String value2) {
            addCriterion("TLRCD between", value1, value2, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andTlrcdNotBetween(String value1, String value2) {
            addCriterion("TLRCD not between", value1, value2, "tlrcd");
            return (Criteria) this;
        }

        public Criteria andBrcodeIsNull() {
            addCriterion("BRCODE is null");
            return (Criteria) this;
        }

        public Criteria andBrcodeIsNotNull() {
            addCriterion("BRCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBrcodeEqualTo(String value) {
            addCriterion("BRCODE =", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeNotEqualTo(String value) {
            addCriterion("BRCODE <>", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeGreaterThan(String value) {
            addCriterion("BRCODE >", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BRCODE >=", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeLessThan(String value) {
            addCriterion("BRCODE <", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeLessThanOrEqualTo(String value) {
            addCriterion("BRCODE <=", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeLike(String value) {
            addCriterion("BRCODE like", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeNotLike(String value) {
            addCriterion("BRCODE not like", value, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeIn(List<String> values) {
            addCriterion("BRCODE in", values, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeNotIn(List<String> values) {
            addCriterion("BRCODE not in", values, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeBetween(String value1, String value2) {
            addCriterion("BRCODE between", value1, value2, "brcode");
            return (Criteria) this;
        }

        public Criteria andBrcodeNotBetween(String value1, String value2) {
            addCriterion("BRCODE not between", value1, value2, "brcode");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("RETURN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("RETURN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(String value) {
            addCriterion("RETURN_TYPE =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(String value) {
            addCriterion("RETURN_TYPE <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(String value) {
            addCriterion("RETURN_TYPE >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_TYPE >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(String value) {
            addCriterion("RETURN_TYPE <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_TYPE <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLike(String value) {
            addCriterion("RETURN_TYPE like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotLike(String value) {
            addCriterion("RETURN_TYPE not like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<String> values) {
            addCriterion("RETURN_TYPE in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<String> values) {
            addCriterion("RETURN_TYPE not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(String value1, String value2) {
            addCriterion("RETURN_TYPE between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(String value1, String value2) {
            addCriterion("RETURN_TYPE not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagIsNull() {
            addCriterion("TO_SALLER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagIsNotNull() {
            addCriterion("TO_SALLER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagEqualTo(String value) {
            addCriterion("TO_SALLER_FLAG =", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagNotEqualTo(String value) {
            addCriterion("TO_SALLER_FLAG <>", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagGreaterThan(String value) {
            addCriterion("TO_SALLER_FLAG >", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TO_SALLER_FLAG >=", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagLessThan(String value) {
            addCriterion("TO_SALLER_FLAG <", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagLessThanOrEqualTo(String value) {
            addCriterion("TO_SALLER_FLAG <=", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagLike(String value) {
            addCriterion("TO_SALLER_FLAG like", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagNotLike(String value) {
            addCriterion("TO_SALLER_FLAG not like", value, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagIn(List<String> values) {
            addCriterion("TO_SALLER_FLAG in", values, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagNotIn(List<String> values) {
            addCriterion("TO_SALLER_FLAG not in", values, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagBetween(String value1, String value2) {
            addCriterion("TO_SALLER_FLAG between", value1, value2, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andToSallerFlagNotBetween(String value1, String value2) {
            addCriterion("TO_SALLER_FLAG not between", value1, value2, "toSallerFlag");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNull() {
            addCriterion("RETURN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIsNotNull() {
            addCriterion("RETURN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAmountEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMOUNT =", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMOUNT <>", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("RETURN_AMOUNT >", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMOUNT >=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThan(BigDecimal value) {
            addCriterion("RETURN_AMOUNT <", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_AMOUNT <=", value, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountIn(List<BigDecimal> values) {
            addCriterion("RETURN_AMOUNT in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_AMOUNT not in", values, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_AMOUNT between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_AMOUNT not between", value1, value2, "returnAmount");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonIsNull() {
            addCriterion("OTHER_REASON is null");
            return (Criteria) this;
        }

        public Criteria andOtherReasonIsNotNull() {
            addCriterion("OTHER_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andOtherReasonEqualTo(String value) {
            addCriterion("OTHER_REASON =", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonNotEqualTo(String value) {
            addCriterion("OTHER_REASON <>", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonGreaterThan(String value) {
            addCriterion("OTHER_REASON >", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_REASON >=", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonLessThan(String value) {
            addCriterion("OTHER_REASON <", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonLessThanOrEqualTo(String value) {
            addCriterion("OTHER_REASON <=", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonLike(String value) {
            addCriterion("OTHER_REASON like", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonNotLike(String value) {
            addCriterion("OTHER_REASON not like", value, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonIn(List<String> values) {
            addCriterion("OTHER_REASON in", values, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonNotIn(List<String> values) {
            addCriterion("OTHER_REASON not in", values, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonBetween(String value1, String value2) {
            addCriterion("OTHER_REASON between", value1, value2, "otherReason");
            return (Criteria) this;
        }

        public Criteria andOtherReasonNotBetween(String value1, String value2) {
            addCriterion("OTHER_REASON not between", value1, value2, "otherReason");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("ACCOUNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("ACCOUNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("ACCOUNT_NO =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("ACCOUNT_NO <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("ACCOUNT_NO >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("ACCOUNT_NO <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("ACCOUNT_NO like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("ACCOUNT_NO not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("ACCOUNT_NO in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("ACCOUNT_NO not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andReturnMethodIsNull() {
            addCriterion("RETURN_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andReturnMethodIsNotNull() {
            addCriterion("RETURN_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andReturnMethodEqualTo(String value) {
            addCriterion("RETURN_METHOD =", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodNotEqualTo(String value) {
            addCriterion("RETURN_METHOD <>", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodGreaterThan(String value) {
            addCriterion("RETURN_METHOD >", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_METHOD >=", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodLessThan(String value) {
            addCriterion("RETURN_METHOD <", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodLessThanOrEqualTo(String value) {
            addCriterion("RETURN_METHOD <=", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodLike(String value) {
            addCriterion("RETURN_METHOD like", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodNotLike(String value) {
            addCriterion("RETURN_METHOD not like", value, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodIn(List<String> values) {
            addCriterion("RETURN_METHOD in", values, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodNotIn(List<String> values) {
            addCriterion("RETURN_METHOD not in", values, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodBetween(String value1, String value2) {
            addCriterion("RETURN_METHOD between", value1, value2, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnMethodNotBetween(String value1, String value2) {
            addCriterion("RETURN_METHOD not between", value1, value2, "returnMethod");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountIsNull() {
            addCriterion("RETURN_INTEREST_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountIsNotNull() {
            addCriterion("RETURN_INTEREST_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountEqualTo(BigDecimal value) {
            addCriterion("RETURN_INTEREST_AMOUNT =", value, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_INTEREST_AMOUNT <>", value, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountGreaterThan(BigDecimal value) {
            addCriterion("RETURN_INTEREST_AMOUNT >", value, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_INTEREST_AMOUNT >=", value, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountLessThan(BigDecimal value) {
            addCriterion("RETURN_INTEREST_AMOUNT <", value, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_INTEREST_AMOUNT <=", value, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountIn(List<BigDecimal> values) {
            addCriterion("RETURN_INTEREST_AMOUNT in", values, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_INTEREST_AMOUNT not in", values, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_INTEREST_AMOUNT between", value1, value2, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnInterestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_INTEREST_AMOUNT not between", value1, value2, "returnInterestAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountIsNull() {
            addCriterion("RETURN_CAPITAL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountIsNotNull() {
            addCriterion("RETURN_CAPITAL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountEqualTo(BigDecimal value) {
            addCriterion("RETURN_CAPITAL_AMOUNT =", value, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_CAPITAL_AMOUNT <>", value, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountGreaterThan(BigDecimal value) {
            addCriterion("RETURN_CAPITAL_AMOUNT >", value, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_CAPITAL_AMOUNT >=", value, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountLessThan(BigDecimal value) {
            addCriterion("RETURN_CAPITAL_AMOUNT <", value, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_CAPITAL_AMOUNT <=", value, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountIn(List<BigDecimal> values) {
            addCriterion("RETURN_CAPITAL_AMOUNT in", values, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_CAPITAL_AMOUNT not in", values, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_CAPITAL_AMOUNT between", value1, value2, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_CAPITAL_AMOUNT not between", value1, value2, "returnCapitalAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountIsNull() {
            addCriterion("TO_SALLER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountIsNotNull() {
            addCriterion("TO_SALLER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountEqualTo(BigDecimal value) {
            addCriterion("TO_SALLER_AMOUNT =", value, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountNotEqualTo(BigDecimal value) {
            addCriterion("TO_SALLER_AMOUNT <>", value, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountGreaterThan(BigDecimal value) {
            addCriterion("TO_SALLER_AMOUNT >", value, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TO_SALLER_AMOUNT >=", value, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountLessThan(BigDecimal value) {
            addCriterion("TO_SALLER_AMOUNT <", value, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TO_SALLER_AMOUNT <=", value, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountIn(List<BigDecimal> values) {
            addCriterion("TO_SALLER_AMOUNT in", values, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountNotIn(List<BigDecimal> values) {
            addCriterion("TO_SALLER_AMOUNT not in", values, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TO_SALLER_AMOUNT between", value1, value2, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToSallerAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TO_SALLER_AMOUNT not between", value1, value2, "toSallerAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountIsNull() {
            addCriterion("TO_POOL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountIsNotNull() {
            addCriterion("TO_POOL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountEqualTo(BigDecimal value) {
            addCriterion("TO_POOL_AMOUNT =", value, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountNotEqualTo(BigDecimal value) {
            addCriterion("TO_POOL_AMOUNT <>", value, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountGreaterThan(BigDecimal value) {
            addCriterion("TO_POOL_AMOUNT >", value, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TO_POOL_AMOUNT >=", value, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountLessThan(BigDecimal value) {
            addCriterion("TO_POOL_AMOUNT <", value, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TO_POOL_AMOUNT <=", value, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountIn(List<BigDecimal> values) {
            addCriterion("TO_POOL_AMOUNT in", values, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountNotIn(List<BigDecimal> values) {
            addCriterion("TO_POOL_AMOUNT not in", values, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TO_POOL_AMOUNT between", value1, value2, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andToPoolAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TO_POOL_AMOUNT not between", value1, value2, "toPoolAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountIsNull() {
            addCriterion("RETURN_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andReturnAccountIsNotNull() {
            addCriterion("RETURN_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAccountEqualTo(String value) {
            addCriterion("RETURN_ACCOUNT =", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountNotEqualTo(String value) {
            addCriterion("RETURN_ACCOUNT <>", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountGreaterThan(String value) {
            addCriterion("RETURN_ACCOUNT >", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_ACCOUNT >=", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountLessThan(String value) {
            addCriterion("RETURN_ACCOUNT <", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountLessThanOrEqualTo(String value) {
            addCriterion("RETURN_ACCOUNT <=", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountLike(String value) {
            addCriterion("RETURN_ACCOUNT like", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountNotLike(String value) {
            addCriterion("RETURN_ACCOUNT not like", value, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountIn(List<String> values) {
            addCriterion("RETURN_ACCOUNT in", values, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountNotIn(List<String> values) {
            addCriterion("RETURN_ACCOUNT not in", values, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBetween(String value1, String value2) {
            addCriterion("RETURN_ACCOUNT between", value1, value2, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountNotBetween(String value1, String value2) {
            addCriterion("RETURN_ACCOUNT not between", value1, value2, "returnAccount");
            return (Criteria) this;
        }

        public Criteria andTransactionNoIsNull() {
            addCriterion("TRANSACTION_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransactionNoIsNotNull() {
            addCriterion("TRANSACTION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionNoEqualTo(String value) {
            addCriterion("TRANSACTION_NO =", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoNotEqualTo(String value) {
            addCriterion("TRANSACTION_NO <>", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoGreaterThan(String value) {
            addCriterion("TRANSACTION_NO >", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_NO >=", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoLessThan(String value) {
            addCriterion("TRANSACTION_NO <", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_NO <=", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoLike(String value) {
            addCriterion("TRANSACTION_NO like", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoNotLike(String value) {
            addCriterion("TRANSACTION_NO not like", value, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoIn(List<String> values) {
            addCriterion("TRANSACTION_NO in", values, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoNotIn(List<String> values) {
            addCriterion("TRANSACTION_NO not in", values, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoBetween(String value1, String value2) {
            addCriterion("TRANSACTION_NO between", value1, value2, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTransactionNoNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_NO not between", value1, value2, "transactionNo");
            return (Criteria) this;
        }

        public Criteria andTobailAmountIsNull() {
            addCriterion("TOBAIL_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTobailAmountIsNotNull() {
            addCriterion("TOBAIL_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTobailAmountEqualTo(BigDecimal value) {
            addCriterion("TOBAIL_AMOUNT =", value, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOBAIL_AMOUNT <>", value, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountGreaterThan(BigDecimal value) {
            addCriterion("TOBAIL_AMOUNT >", value, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOBAIL_AMOUNT >=", value, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountLessThan(BigDecimal value) {
            addCriterion("TOBAIL_AMOUNT <", value, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOBAIL_AMOUNT <=", value, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountIn(List<BigDecimal> values) {
            addCriterion("TOBAIL_AMOUNT in", values, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOBAIL_AMOUNT not in", values, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOBAIL_AMOUNT between", value1, value2, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andTobailAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOBAIL_AMOUNT not between", value1, value2, "tobailAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNull() {
            addCriterion("REBATE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIsNotNull() {
            addCriterion("REBATE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andRebateAmountEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT =", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT <>", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThan(BigDecimal value) {
            addCriterion("REBATE_AMOUNT >", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT >=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThan(BigDecimal value) {
            addCriterion("REBATE_AMOUNT <", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REBATE_AMOUNT <=", value, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountIn(List<BigDecimal> values) {
            addCriterion("REBATE_AMOUNT in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotIn(List<BigDecimal> values) {
            addCriterion("REBATE_AMOUNT not in", values, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_AMOUNT between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andRebateAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REBATE_AMOUNT not between", value1, value2, "rebateAmount");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceIsNull() {
            addCriterion("RETURN_ACCOUNT_BALANCE is null");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceIsNotNull() {
            addCriterion("RETURN_ACCOUNT_BALANCE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceEqualTo(BigDecimal value) {
            addCriterion("RETURN_ACCOUNT_BALANCE =", value, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_ACCOUNT_BALANCE <>", value, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceGreaterThan(BigDecimal value) {
            addCriterion("RETURN_ACCOUNT_BALANCE >", value, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_ACCOUNT_BALANCE >=", value, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceLessThan(BigDecimal value) {
            addCriterion("RETURN_ACCOUNT_BALANCE <", value, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_ACCOUNT_BALANCE <=", value, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceIn(List<BigDecimal> values) {
            addCriterion("RETURN_ACCOUNT_BALANCE in", values, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_ACCOUNT_BALANCE not in", values, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_ACCOUNT_BALANCE between", value1, value2, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andReturnAccountBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_ACCOUNT_BALANCE not between", value1, value2, "returnAccountBalance");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountIsNull() {
            addCriterion("TOTAL_OVER_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountIsNotNull() {
            addCriterion("TOTAL_OVER_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OVER_AMOUNT =", value, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OVER_AMOUNT <>", value, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_OVER_AMOUNT >", value, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OVER_AMOUNT >=", value, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountLessThan(BigDecimal value) {
            addCriterion("TOTAL_OVER_AMOUNT <", value, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_OVER_AMOUNT <=", value, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountIn(List<BigDecimal> values) {
            addCriterion("TOTAL_OVER_AMOUNT in", values, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_OVER_AMOUNT not in", values, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_OVER_AMOUNT between", value1, value2, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andTotalOverAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_OVER_AMOUNT not between", value1, value2, "totalOverAmount");
            return (Criteria) this;
        }

        public Criteria andAssignRuleIsNull() {
            addCriterion("ASSIGN_RULE is null");
            return (Criteria) this;
        }

        public Criteria andAssignRuleIsNotNull() {
            addCriterion("ASSIGN_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andAssignRuleEqualTo(String value) {
            addCriterion("ASSIGN_RULE =", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleNotEqualTo(String value) {
            addCriterion("ASSIGN_RULE <>", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleGreaterThan(String value) {
            addCriterion("ASSIGN_RULE >", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleGreaterThanOrEqualTo(String value) {
            addCriterion("ASSIGN_RULE >=", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleLessThan(String value) {
            addCriterion("ASSIGN_RULE <", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleLessThanOrEqualTo(String value) {
            addCriterion("ASSIGN_RULE <=", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleLike(String value) {
            addCriterion("ASSIGN_RULE like", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleNotLike(String value) {
            addCriterion("ASSIGN_RULE not like", value, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleIn(List<String> values) {
            addCriterion("ASSIGN_RULE in", values, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleNotIn(List<String> values) {
            addCriterion("ASSIGN_RULE not in", values, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleBetween(String value1, String value2) {
            addCriterion("ASSIGN_RULE between", value1, value2, "assignRule");
            return (Criteria) this;
        }

        public Criteria andAssignRuleNotBetween(String value1, String value2) {
            addCriterion("ASSIGN_RULE not between", value1, value2, "assignRule");
            return (Criteria) this;
        }

        public Criteria andSettleMethodIsNull() {
            addCriterion("SETTLE_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andSettleMethodIsNotNull() {
            addCriterion("SETTLE_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andSettleMethodEqualTo(String value) {
            addCriterion("SETTLE_METHOD =", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodNotEqualTo(String value) {
            addCriterion("SETTLE_METHOD <>", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodGreaterThan(String value) {
            addCriterion("SETTLE_METHOD >", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLE_METHOD >=", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodLessThan(String value) {
            addCriterion("SETTLE_METHOD <", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodLessThanOrEqualTo(String value) {
            addCriterion("SETTLE_METHOD <=", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodLike(String value) {
            addCriterion("SETTLE_METHOD like", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodNotLike(String value) {
            addCriterion("SETTLE_METHOD not like", value, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodIn(List<String> values) {
            addCriterion("SETTLE_METHOD in", values, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodNotIn(List<String> values) {
            addCriterion("SETTLE_METHOD not in", values, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodBetween(String value1, String value2) {
            addCriterion("SETTLE_METHOD between", value1, value2, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andSettleMethodNotBetween(String value1, String value2) {
            addCriterion("SETTLE_METHOD not between", value1, value2, "settleMethod");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeIsNull() {
            addCriterion("REPAY_PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeIsNotNull() {
            addCriterion("REPAY_PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeEqualTo(String value) {
            addCriterion("REPAY_PURPOSE =", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeNotEqualTo(String value) {
            addCriterion("REPAY_PURPOSE <>", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeGreaterThan(String value) {
            addCriterion("REPAY_PURPOSE >", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("REPAY_PURPOSE >=", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeLessThan(String value) {
            addCriterion("REPAY_PURPOSE <", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeLessThanOrEqualTo(String value) {
            addCriterion("REPAY_PURPOSE <=", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeLike(String value) {
            addCriterion("REPAY_PURPOSE like", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeNotLike(String value) {
            addCriterion("REPAY_PURPOSE not like", value, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeIn(List<String> values) {
            addCriterion("REPAY_PURPOSE in", values, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeNotIn(List<String> values) {
            addCriterion("REPAY_PURPOSE not in", values, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeBetween(String value1, String value2) {
            addCriterion("REPAY_PURPOSE between", value1, value2, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andRepayPurposeNotBetween(String value1, String value2) {
            addCriterion("REPAY_PURPOSE not between", value1, value2, "repayPurpose");
            return (Criteria) this;
        }

        public Criteria andPayerIsNull() {
            addCriterion("PAYER is null");
            return (Criteria) this;
        }

        public Criteria andPayerIsNotNull() {
            addCriterion("PAYER is not null");
            return (Criteria) this;
        }

        public Criteria andPayerEqualTo(String value) {
            addCriterion("PAYER =", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotEqualTo(String value) {
            addCriterion("PAYER <>", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThan(String value) {
            addCriterion("PAYER >", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER >=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThan(String value) {
            addCriterion("PAYER <", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLessThanOrEqualTo(String value) {
            addCriterion("PAYER <=", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerLike(String value) {
            addCriterion("PAYER like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotLike(String value) {
            addCriterion("PAYER not like", value, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerIn(List<String> values) {
            addCriterion("PAYER in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotIn(List<String> values) {
            addCriterion("PAYER not in", values, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerBetween(String value1, String value2) {
            addCriterion("PAYER between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerNotBetween(String value1, String value2) {
            addCriterion("PAYER not between", value1, value2, "payer");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoIsNull() {
            addCriterion("PAYER_ACCT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoIsNotNull() {
            addCriterion("PAYER_ACCT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoEqualTo(String value) {
            addCriterion("PAYER_ACCT_NO =", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoNotEqualTo(String value) {
            addCriterion("PAYER_ACCT_NO <>", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoGreaterThan(String value) {
            addCriterion("PAYER_ACCT_NO >", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_ACCT_NO >=", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoLessThan(String value) {
            addCriterion("PAYER_ACCT_NO <", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoLessThanOrEqualTo(String value) {
            addCriterion("PAYER_ACCT_NO <=", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoLike(String value) {
            addCriterion("PAYER_ACCT_NO like", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoNotLike(String value) {
            addCriterion("PAYER_ACCT_NO not like", value, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoIn(List<String> values) {
            addCriterion("PAYER_ACCT_NO in", values, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoNotIn(List<String> values) {
            addCriterion("PAYER_ACCT_NO not in", values, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoBetween(String value1, String value2) {
            addCriterion("PAYER_ACCT_NO between", value1, value2, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerAcctNoNotBetween(String value1, String value2) {
            addCriterion("PAYER_ACCT_NO not between", value1, value2, "payerAcctNo");
            return (Criteria) this;
        }

        public Criteria andPayerBankIsNull() {
            addCriterion("PAYER_BANK is null");
            return (Criteria) this;
        }

        public Criteria andPayerBankIsNotNull() {
            addCriterion("PAYER_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andPayerBankEqualTo(String value) {
            addCriterion("PAYER_BANK =", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankNotEqualTo(String value) {
            addCriterion("PAYER_BANK <>", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankGreaterThan(String value) {
            addCriterion("PAYER_BANK >", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK >=", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankLessThan(String value) {
            addCriterion("PAYER_BANK <", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankLessThanOrEqualTo(String value) {
            addCriterion("PAYER_BANK <=", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankLike(String value) {
            addCriterion("PAYER_BANK like", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankNotLike(String value) {
            addCriterion("PAYER_BANK not like", value, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankIn(List<String> values) {
            addCriterion("PAYER_BANK in", values, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankNotIn(List<String> values) {
            addCriterion("PAYER_BANK not in", values, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankBetween(String value1, String value2) {
            addCriterion("PAYER_BANK between", value1, value2, "payerBank");
            return (Criteria) this;
        }

        public Criteria andPayerBankNotBetween(String value1, String value2) {
            addCriterion("PAYER_BANK not between", value1, value2, "payerBank");
            return (Criteria) this;
        }

        public Criteria andTransferAmtIsNull() {
            addCriterion("TRANSFER_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTransferAmtIsNotNull() {
            addCriterion("TRANSFER_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransferAmtEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMT =", value, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtNotEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMT <>", value, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtGreaterThan(BigDecimal value) {
            addCriterion("TRANSFER_AMT >", value, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMT >=", value, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtLessThan(BigDecimal value) {
            addCriterion("TRANSFER_AMT <", value, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFER_AMT <=", value, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtIn(List<BigDecimal> values) {
            addCriterion("TRANSFER_AMT in", values, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtNotIn(List<BigDecimal> values) {
            addCriterion("TRANSFER_AMT not in", values, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFER_AMT between", value1, value2, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransferAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFER_AMT not between", value1, value2, "transferAmt");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNull() {
            addCriterion("TRANSACTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNotNull() {
            addCriterion("TRANSACTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateEqualTo(String value) {
            addCriterion("TRANSACTION_DATE =", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotEqualTo(String value) {
            addCriterion("TRANSACTION_DATE <>", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThan(String value) {
            addCriterion("TRANSACTION_DATE >", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_DATE >=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThan(String value) {
            addCriterion("TRANSACTION_DATE <", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThanOrEqualTo(String value) {
            addCriterion("TRANSACTION_DATE <=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLike(String value) {
            addCriterion("TRANSACTION_DATE like", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotLike(String value) {
            addCriterion("TRANSACTION_DATE not like", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIn(List<String> values) {
            addCriterion("TRANSACTION_DATE in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotIn(List<String> values) {
            addCriterion("TRANSACTION_DATE not in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateBetween(String value1, String value2) {
            addCriterion("TRANSACTION_DATE between", value1, value2, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotBetween(String value1, String value2) {
            addCriterion("TRANSACTION_DATE not between", value1, value2, "transactionDate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}