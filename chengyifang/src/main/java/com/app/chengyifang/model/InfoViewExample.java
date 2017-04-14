package com.app.chengyifang.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InfoViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InfoViewExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleIsNull() {
            addCriterion("infoViewTtle is null");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleIsNotNull() {
            addCriterion("infoViewTtle is not null");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleEqualTo(String value) {
            addCriterion("infoViewTtle =", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleNotEqualTo(String value) {
            addCriterion("infoViewTtle <>", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleGreaterThan(String value) {
            addCriterion("infoViewTtle >", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleGreaterThanOrEqualTo(String value) {
            addCriterion("infoViewTtle >=", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleLessThan(String value) {
            addCriterion("infoViewTtle <", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleLessThanOrEqualTo(String value) {
            addCriterion("infoViewTtle <=", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleLike(String value) {
            addCriterion("infoViewTtle like", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleNotLike(String value) {
            addCriterion("infoViewTtle not like", value, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleIn(List<String> values) {
            addCriterion("infoViewTtle in", values, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleNotIn(List<String> values) {
            addCriterion("infoViewTtle not in", values, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleBetween(String value1, String value2) {
            addCriterion("infoViewTtle between", value1, value2, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewttleNotBetween(String value1, String value2) {
            addCriterion("infoViewTtle not between", value1, value2, "infoviewttle");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1IsNull() {
            addCriterion("infoViewText1 is null");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1IsNotNull() {
            addCriterion("infoViewText1 is not null");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1EqualTo(String value) {
            addCriterion("infoViewText1 =", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1NotEqualTo(String value) {
            addCriterion("infoViewText1 <>", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1GreaterThan(String value) {
            addCriterion("infoViewText1 >", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1GreaterThanOrEqualTo(String value) {
            addCriterion("infoViewText1 >=", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1LessThan(String value) {
            addCriterion("infoViewText1 <", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1LessThanOrEqualTo(String value) {
            addCriterion("infoViewText1 <=", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1Like(String value) {
            addCriterion("infoViewText1 like", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1NotLike(String value) {
            addCriterion("infoViewText1 not like", value, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1In(List<String> values) {
            addCriterion("infoViewText1 in", values, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1NotIn(List<String> values) {
            addCriterion("infoViewText1 not in", values, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1Between(String value1, String value2) {
            addCriterion("infoViewText1 between", value1, value2, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext1NotBetween(String value1, String value2) {
            addCriterion("infoViewText1 not between", value1, value2, "infoviewtext1");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2IsNull() {
            addCriterion("infoViewText2 is null");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2IsNotNull() {
            addCriterion("infoViewText2 is not null");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2EqualTo(String value) {
            addCriterion("infoViewText2 =", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2NotEqualTo(String value) {
            addCriterion("infoViewText2 <>", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2GreaterThan(String value) {
            addCriterion("infoViewText2 >", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2GreaterThanOrEqualTo(String value) {
            addCriterion("infoViewText2 >=", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2LessThan(String value) {
            addCriterion("infoViewText2 <", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2LessThanOrEqualTo(String value) {
            addCriterion("infoViewText2 <=", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2Like(String value) {
            addCriterion("infoViewText2 like", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2NotLike(String value) {
            addCriterion("infoViewText2 not like", value, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2In(List<String> values) {
            addCriterion("infoViewText2 in", values, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2NotIn(List<String> values) {
            addCriterion("infoViewText2 not in", values, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2Between(String value1, String value2) {
            addCriterion("infoViewText2 between", value1, value2, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andInfoviewtext2NotBetween(String value1, String value2) {
            addCriterion("infoViewText2 not between", value1, value2, "infoviewtext2");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andEditetimeIsNull() {
            addCriterion("editetime is null");
            return (Criteria) this;
        }

        public Criteria andEditetimeIsNotNull() {
            addCriterion("editetime is not null");
            return (Criteria) this;
        }

        public Criteria andEditetimeEqualTo(Date value) {
            addCriterion("editetime =", value, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeNotEqualTo(Date value) {
            addCriterion("editetime <>", value, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeGreaterThan(Date value) {
            addCriterion("editetime >", value, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("editetime >=", value, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeLessThan(Date value) {
            addCriterion("editetime <", value, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeLessThanOrEqualTo(Date value) {
            addCriterion("editetime <=", value, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeIn(List<Date> values) {
            addCriterion("editetime in", values, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeNotIn(List<Date> values) {
            addCriterion("editetime not in", values, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeBetween(Date value1, Date value2) {
            addCriterion("editetime between", value1, value2, "editetime");
            return (Criteria) this;
        }

        public Criteria andEditetimeNotBetween(Date value1, Date value2) {
            addCriterion("editetime not between", value1, value2, "editetime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
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