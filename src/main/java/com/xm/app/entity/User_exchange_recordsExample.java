package com.xm.app.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User_exchange_recordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public User_exchange_recordsExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andBodyIsNull() {
            addCriterion("body is null");
            return (Criteria) this;
        }

        public Criteria andBodyIsNotNull() {
            addCriterion("body is not null");
            return (Criteria) this;
        }

        public Criteria andBodyEqualTo(String value) {
            addCriterion("body =", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotEqualTo(String value) {
            addCriterion("body <>", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThan(String value) {
            addCriterion("body >", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyGreaterThanOrEqualTo(String value) {
            addCriterion("body >=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThan(String value) {
            addCriterion("body <", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLessThanOrEqualTo(String value) {
            addCriterion("body <=", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyLike(String value) {
            addCriterion("body like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotLike(String value) {
            addCriterion("body not like", value, "body");
            return (Criteria) this;
        }

        public Criteria andBodyIn(List<String> values) {
            addCriterion("body in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotIn(List<String> values) {
            addCriterion("body not in", values, "body");
            return (Criteria) this;
        }

        public Criteria andBodyBetween(String value1, String value2) {
            addCriterion("body between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andBodyNotBetween(String value1, String value2) {
            addCriterion("body not between", value1, value2, "body");
            return (Criteria) this;
        }

        public Criteria andDiamondsIsNull() {
            addCriterion("diamonds is null");
            return (Criteria) this;
        }

        public Criteria andDiamondsIsNotNull() {
            addCriterion("diamonds is not null");
            return (Criteria) this;
        }

        public Criteria andDiamondsEqualTo(Integer value) {
            addCriterion("diamonds =", value, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsNotEqualTo(Integer value) {
            addCriterion("diamonds <>", value, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsGreaterThan(Integer value) {
            addCriterion("diamonds >", value, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("diamonds >=", value, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsLessThan(Integer value) {
            addCriterion("diamonds <", value, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsLessThanOrEqualTo(Integer value) {
            addCriterion("diamonds <=", value, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsIn(List<Integer> values) {
            addCriterion("diamonds in", values, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsNotIn(List<Integer> values) {
            addCriterion("diamonds not in", values, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsBetween(Integer value1, Integer value2) {
            addCriterion("diamonds between", value1, value2, "diamonds");
            return (Criteria) this;
        }

        public Criteria andDiamondsNotBetween(Integer value1, Integer value2) {
            addCriterion("diamonds not between", value1, value2, "diamonds");
            return (Criteria) this;
        }

        public Criteria andCoinsIsNull() {
            addCriterion("coins is null");
            return (Criteria) this;
        }

        public Criteria andCoinsIsNotNull() {
            addCriterion("coins is not null");
            return (Criteria) this;
        }

        public Criteria andCoinsEqualTo(Integer value) {
            addCriterion("coins =", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsNotEqualTo(Integer value) {
            addCriterion("coins <>", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsGreaterThan(Integer value) {
            addCriterion("coins >", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsGreaterThanOrEqualTo(Integer value) {
            addCriterion("coins >=", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsLessThan(Integer value) {
            addCriterion("coins <", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsLessThanOrEqualTo(Integer value) {
            addCriterion("coins <=", value, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsIn(List<Integer> values) {
            addCriterion("coins in", values, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsNotIn(List<Integer> values) {
            addCriterion("coins not in", values, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsBetween(Integer value1, Integer value2) {
            addCriterion("coins between", value1, value2, "coins");
            return (Criteria) this;
        }

        public Criteria andCoinsNotBetween(Integer value1, Integer value2) {
            addCriterion("coins not between", value1, value2, "coins");
            return (Criteria) this;
        }

        public Criteria andCashIsNull() {
            addCriterion("cash is null");
            return (Criteria) this;
        }

        public Criteria andCashIsNotNull() {
            addCriterion("cash is not null");
            return (Criteria) this;
        }

        public Criteria andCashEqualTo(Integer value) {
            addCriterion("cash =", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotEqualTo(Integer value) {
            addCriterion("cash <>", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThan(Integer value) {
            addCriterion("cash >", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash >=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThan(Integer value) {
            addCriterion("cash <", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashLessThanOrEqualTo(Integer value) {
            addCriterion("cash <=", value, "cash");
            return (Criteria) this;
        }

        public Criteria andCashIn(List<Integer> values) {
            addCriterion("cash in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotIn(List<Integer> values) {
            addCriterion("cash not in", values, "cash");
            return (Criteria) this;
        }

        public Criteria andCashBetween(Integer value1, Integer value2) {
            addCriterion("cash between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andCashNotBetween(Integer value1, Integer value2) {
            addCriterion("cash not between", value1, value2, "cash");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andFailedReasonIsNull() {
            addCriterion("failed_reason is null");
            return (Criteria) this;
        }

        public Criteria andFailedReasonIsNotNull() {
            addCriterion("failed_reason is not null");
            return (Criteria) this;
        }

        public Criteria andFailedReasonEqualTo(String value) {
            addCriterion("failed_reason =", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotEqualTo(String value) {
            addCriterion("failed_reason <>", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonGreaterThan(String value) {
            addCriterion("failed_reason >", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonGreaterThanOrEqualTo(String value) {
            addCriterion("failed_reason >=", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonLessThan(String value) {
            addCriterion("failed_reason <", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonLessThanOrEqualTo(String value) {
            addCriterion("failed_reason <=", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonLike(String value) {
            addCriterion("failed_reason like", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotLike(String value) {
            addCriterion("failed_reason not like", value, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonIn(List<String> values) {
            addCriterion("failed_reason in", values, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotIn(List<String> values) {
            addCriterion("failed_reason not in", values, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonBetween(String value1, String value2) {
            addCriterion("failed_reason between", value1, value2, "failedReason");
            return (Criteria) this;
        }

        public Criteria andFailedReasonNotBetween(String value1, String value2) {
            addCriterion("failed_reason not between", value1, value2, "failedReason");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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