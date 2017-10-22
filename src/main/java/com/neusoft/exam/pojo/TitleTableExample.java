package com.neusoft.exam.pojo;

import java.util.ArrayList;
import java.util.List;

public class TitleTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TitleTableExample() {
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

        public Criteria andTitleIdIsNull() {
            addCriterion("title_id is null");
            return (Criteria) this;
        }

        public Criteria andTitleIdIsNotNull() {
            addCriterion("title_id is not null");
            return (Criteria) this;
        }

        public Criteria andTitleIdEqualTo(Integer value) {
            addCriterion("title_id =", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdNotEqualTo(Integer value) {
            addCriterion("title_id <>", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdGreaterThan(Integer value) {
            addCriterion("title_id >", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_id >=", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdLessThan(Integer value) {
            addCriterion("title_id <", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdLessThanOrEqualTo(Integer value) {
            addCriterion("title_id <=", value, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdIn(List<Integer> values) {
            addCriterion("title_id in", values, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdNotIn(List<Integer> values) {
            addCriterion("title_id not in", values, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdBetween(Integer value1, Integer value2) {
            addCriterion("title_id between", value1, value2, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("title_id not between", value1, value2, "titleId");
            return (Criteria) this;
        }

        public Criteria andTitleTextIsNull() {
            addCriterion("title_text is null");
            return (Criteria) this;
        }

        public Criteria andTitleTextIsNotNull() {
            addCriterion("title_text is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTextEqualTo(String value) {
            addCriterion("title_text =", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotEqualTo(String value) {
            addCriterion("title_text <>", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextGreaterThan(String value) {
            addCriterion("title_text >", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextGreaterThanOrEqualTo(String value) {
            addCriterion("title_text >=", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLessThan(String value) {
            addCriterion("title_text <", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLessThanOrEqualTo(String value) {
            addCriterion("title_text <=", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextLike(String value) {
            addCriterion("title_text like", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotLike(String value) {
            addCriterion("title_text not like", value, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextIn(List<String> values) {
            addCriterion("title_text in", values, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotIn(List<String> values) {
            addCriterion("title_text not in", values, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextBetween(String value1, String value2) {
            addCriterion("title_text between", value1, value2, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleTextNotBetween(String value1, String value2) {
            addCriterion("title_text not between", value1, value2, "titleText");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIsNull() {
            addCriterion("title_level is null");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIsNotNull() {
            addCriterion("title_level is not null");
            return (Criteria) this;
        }

        public Criteria andTitleLevelEqualTo(Integer value) {
            addCriterion("title_level =", value, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelNotEqualTo(Integer value) {
            addCriterion("title_level <>", value, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelGreaterThan(Integer value) {
            addCriterion("title_level >", value, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_level >=", value, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelLessThan(Integer value) {
            addCriterion("title_level <", value, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelLessThanOrEqualTo(Integer value) {
            addCriterion("title_level <=", value, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelIn(List<Integer> values) {
            addCriterion("title_level in", values, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelNotIn(List<Integer> values) {
            addCriterion("title_level not in", values, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelBetween(Integer value1, Integer value2) {
            addCriterion("title_level between", value1, value2, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("title_level not between", value1, value2, "titleLevel");
            return (Criteria) this;
        }

        public Criteria andTitleMajorIsNull() {
            addCriterion("title_major is null");
            return (Criteria) this;
        }

        public Criteria andTitleMajorIsNotNull() {
            addCriterion("title_major is not null");
            return (Criteria) this;
        }

        public Criteria andTitleMajorEqualTo(String value) {
            addCriterion("title_major =", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorNotEqualTo(String value) {
            addCriterion("title_major <>", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorGreaterThan(String value) {
            addCriterion("title_major >", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorGreaterThanOrEqualTo(String value) {
            addCriterion("title_major >=", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorLessThan(String value) {
            addCriterion("title_major <", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorLessThanOrEqualTo(String value) {
            addCriterion("title_major <=", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorLike(String value) {
            addCriterion("title_major like", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorNotLike(String value) {
            addCriterion("title_major not like", value, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorIn(List<String> values) {
            addCriterion("title_major in", values, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorNotIn(List<String> values) {
            addCriterion("title_major not in", values, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorBetween(String value1, String value2) {
            addCriterion("title_major between", value1, value2, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleMajorNotBetween(String value1, String value2) {
            addCriterion("title_major not between", value1, value2, "titleMajor");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudIsNull() {
            addCriterion("title_backgroud is null");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudIsNotNull() {
            addCriterion("title_backgroud is not null");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudEqualTo(Integer value) {
            addCriterion("title_backgroud =", value, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudNotEqualTo(Integer value) {
            addCriterion("title_backgroud <>", value, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudGreaterThan(Integer value) {
            addCriterion("title_backgroud >", value, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_backgroud >=", value, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudLessThan(Integer value) {
            addCriterion("title_backgroud <", value, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudLessThanOrEqualTo(Integer value) {
            addCriterion("title_backgroud <=", value, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudIn(List<Integer> values) {
            addCriterion("title_backgroud in", values, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudNotIn(List<Integer> values) {
            addCriterion("title_backgroud not in", values, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudBetween(Integer value1, Integer value2) {
            addCriterion("title_backgroud between", value1, value2, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleBackgroudNotBetween(Integer value1, Integer value2) {
            addCriterion("title_backgroud not between", value1, value2, "titleBackgroud");
            return (Criteria) this;
        }

        public Criteria andTitleOptionAIsNull() {
            addCriterion("title_option_a is null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionAIsNotNull() {
            addCriterion("title_option_a is not null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionAEqualTo(String value) {
            addCriterion("title_option_a =", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionANotEqualTo(String value) {
            addCriterion("title_option_a <>", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionAGreaterThan(String value) {
            addCriterion("title_option_a >", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionAGreaterThanOrEqualTo(String value) {
            addCriterion("title_option_a >=", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionALessThan(String value) {
            addCriterion("title_option_a <", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionALessThanOrEqualTo(String value) {
            addCriterion("title_option_a <=", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionALike(String value) {
            addCriterion("title_option_a like", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionANotLike(String value) {
            addCriterion("title_option_a not like", value, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionAIn(List<String> values) {
            addCriterion("title_option_a in", values, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionANotIn(List<String> values) {
            addCriterion("title_option_a not in", values, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionABetween(String value1, String value2) {
            addCriterion("title_option_a between", value1, value2, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionANotBetween(String value1, String value2) {
            addCriterion("title_option_a not between", value1, value2, "titleOptionA");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBIsNull() {
            addCriterion("title_option_b is null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBIsNotNull() {
            addCriterion("title_option_b is not null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBEqualTo(String value) {
            addCriterion("title_option_b =", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBNotEqualTo(String value) {
            addCriterion("title_option_b <>", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBGreaterThan(String value) {
            addCriterion("title_option_b >", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBGreaterThanOrEqualTo(String value) {
            addCriterion("title_option_b >=", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBLessThan(String value) {
            addCriterion("title_option_b <", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBLessThanOrEqualTo(String value) {
            addCriterion("title_option_b <=", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBLike(String value) {
            addCriterion("title_option_b like", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBNotLike(String value) {
            addCriterion("title_option_b not like", value, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBIn(List<String> values) {
            addCriterion("title_option_b in", values, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBNotIn(List<String> values) {
            addCriterion("title_option_b not in", values, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBBetween(String value1, String value2) {
            addCriterion("title_option_b between", value1, value2, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionBNotBetween(String value1, String value2) {
            addCriterion("title_option_b not between", value1, value2, "titleOptionB");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCIsNull() {
            addCriterion("title_option_c is null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCIsNotNull() {
            addCriterion("title_option_c is not null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCEqualTo(String value) {
            addCriterion("title_option_c =", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCNotEqualTo(String value) {
            addCriterion("title_option_c <>", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCGreaterThan(String value) {
            addCriterion("title_option_c >", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCGreaterThanOrEqualTo(String value) {
            addCriterion("title_option_c >=", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCLessThan(String value) {
            addCriterion("title_option_c <", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCLessThanOrEqualTo(String value) {
            addCriterion("title_option_c <=", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCLike(String value) {
            addCriterion("title_option_c like", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCNotLike(String value) {
            addCriterion("title_option_c not like", value, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCIn(List<String> values) {
            addCriterion("title_option_c in", values, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCNotIn(List<String> values) {
            addCriterion("title_option_c not in", values, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCBetween(String value1, String value2) {
            addCriterion("title_option_c between", value1, value2, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionCNotBetween(String value1, String value2) {
            addCriterion("title_option_c not between", value1, value2, "titleOptionC");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDIsNull() {
            addCriterion("title_option_d is null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDIsNotNull() {
            addCriterion("title_option_d is not null");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDEqualTo(String value) {
            addCriterion("title_option_d =", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDNotEqualTo(String value) {
            addCriterion("title_option_d <>", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDGreaterThan(String value) {
            addCriterion("title_option_d >", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDGreaterThanOrEqualTo(String value) {
            addCriterion("title_option_d >=", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDLessThan(String value) {
            addCriterion("title_option_d <", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDLessThanOrEqualTo(String value) {
            addCriterion("title_option_d <=", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDLike(String value) {
            addCriterion("title_option_d like", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDNotLike(String value) {
            addCriterion("title_option_d not like", value, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDIn(List<String> values) {
            addCriterion("title_option_d in", values, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDNotIn(List<String> values) {
            addCriterion("title_option_d not in", values, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDBetween(String value1, String value2) {
            addCriterion("title_option_d between", value1, value2, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleOptionDNotBetween(String value1, String value2) {
            addCriterion("title_option_d not between", value1, value2, "titleOptionD");
            return (Criteria) this;
        }

        public Criteria andTitleExplainIsNull() {
            addCriterion("title_explain is null");
            return (Criteria) this;
        }

        public Criteria andTitleExplainIsNotNull() {
            addCriterion("title_explain is not null");
            return (Criteria) this;
        }

        public Criteria andTitleExplainEqualTo(String value) {
            addCriterion("title_explain =", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainNotEqualTo(String value) {
            addCriterion("title_explain <>", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainGreaterThan(String value) {
            addCriterion("title_explain >", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainGreaterThanOrEqualTo(String value) {
            addCriterion("title_explain >=", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainLessThan(String value) {
            addCriterion("title_explain <", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainLessThanOrEqualTo(String value) {
            addCriterion("title_explain <=", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainLike(String value) {
            addCriterion("title_explain like", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainNotLike(String value) {
            addCriterion("title_explain not like", value, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainIn(List<String> values) {
            addCriterion("title_explain in", values, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainNotIn(List<String> values) {
            addCriterion("title_explain not in", values, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainBetween(String value1, String value2) {
            addCriterion("title_explain between", value1, value2, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleExplainNotBetween(String value1, String value2) {
            addCriterion("title_explain not between", value1, value2, "titleExplain");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNull() {
            addCriterion("title_type is null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIsNotNull() {
            addCriterion("title_type is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTypeEqualTo(Integer value) {
            addCriterion("title_type =", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotEqualTo(Integer value) {
            addCriterion("title_type <>", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThan(Integer value) {
            addCriterion("title_type >", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_type >=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThan(Integer value) {
            addCriterion("title_type <", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeLessThanOrEqualTo(Integer value) {
            addCriterion("title_type <=", value, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeIn(List<Integer> values) {
            addCriterion("title_type in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotIn(List<Integer> values) {
            addCriterion("title_type not in", values, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeBetween(Integer value1, Integer value2) {
            addCriterion("title_type between", value1, value2, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("title_type not between", value1, value2, "titleType");
            return (Criteria) this;
        }

        public Criteria andTitleStatusIsNull() {
            addCriterion("title_status is null");
            return (Criteria) this;
        }

        public Criteria andTitleStatusIsNotNull() {
            addCriterion("title_status is not null");
            return (Criteria) this;
        }

        public Criteria andTitleStatusEqualTo(Integer value) {
            addCriterion("title_status =", value, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusNotEqualTo(Integer value) {
            addCriterion("title_status <>", value, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusGreaterThan(Integer value) {
            addCriterion("title_status >", value, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_status >=", value, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusLessThan(Integer value) {
            addCriterion("title_status <", value, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("title_status <=", value, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusIn(List<Integer> values) {
            addCriterion("title_status in", values, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusNotIn(List<Integer> values) {
            addCriterion("title_status not in", values, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusBetween(Integer value1, Integer value2) {
            addCriterion("title_status between", value1, value2, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("title_status not between", value1, value2, "titleStatus");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerIsNull() {
            addCriterion("title_answer is null");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerIsNotNull() {
            addCriterion("title_answer is not null");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerEqualTo(String value) {
            addCriterion("title_answer =", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerNotEqualTo(String value) {
            addCriterion("title_answer <>", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerGreaterThan(String value) {
            addCriterion("title_answer >", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("title_answer >=", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerLessThan(String value) {
            addCriterion("title_answer <", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerLessThanOrEqualTo(String value) {
            addCriterion("title_answer <=", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerLike(String value) {
            addCriterion("title_answer like", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerNotLike(String value) {
            addCriterion("title_answer not like", value, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerIn(List<String> values) {
            addCriterion("title_answer in", values, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerNotIn(List<String> values) {
            addCriterion("title_answer not in", values, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerBetween(String value1, String value2) {
            addCriterion("title_answer between", value1, value2, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleAnswerNotBetween(String value1, String value2) {
            addCriterion("title_answer not between", value1, value2, "titleAnswer");
            return (Criteria) this;
        }

        public Criteria andTitleTimeIsNull() {
            addCriterion("title_time is null");
            return (Criteria) this;
        }

        public Criteria andTitleTimeIsNotNull() {
            addCriterion("title_time is not null");
            return (Criteria) this;
        }

        public Criteria andTitleTimeEqualTo(String value) {
            addCriterion("title_time =", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeNotEqualTo(String value) {
            addCriterion("title_time <>", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeGreaterThan(String value) {
            addCriterion("title_time >", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("title_time >=", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeLessThan(String value) {
            addCriterion("title_time <", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeLessThanOrEqualTo(String value) {
            addCriterion("title_time <=", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeLike(String value) {
            addCriterion("title_time like", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeNotLike(String value) {
            addCriterion("title_time not like", value, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeIn(List<String> values) {
            addCriterion("title_time in", values, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeNotIn(List<String> values) {
            addCriterion("title_time not in", values, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeBetween(String value1, String value2) {
            addCriterion("title_time between", value1, value2, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleTimeNotBetween(String value1, String value2) {
            addCriterion("title_time not between", value1, value2, "titleTime");
            return (Criteria) this;
        }

        public Criteria andTitleNumIsNull() {
            addCriterion("title_num is null");
            return (Criteria) this;
        }

        public Criteria andTitleNumIsNotNull() {
            addCriterion("title_num is not null");
            return (Criteria) this;
        }

        public Criteria andTitleNumEqualTo(Integer value) {
            addCriterion("title_num =", value, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumNotEqualTo(Integer value) {
            addCriterion("title_num <>", value, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumGreaterThan(Integer value) {
            addCriterion("title_num >", value, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("title_num >=", value, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumLessThan(Integer value) {
            addCriterion("title_num <", value, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumLessThanOrEqualTo(Integer value) {
            addCriterion("title_num <=", value, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumIn(List<Integer> values) {
            addCriterion("title_num in", values, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumNotIn(List<Integer> values) {
            addCriterion("title_num not in", values, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumBetween(Integer value1, Integer value2) {
            addCriterion("title_num between", value1, value2, "titleNum");
            return (Criteria) this;
        }

        public Criteria andTitleNumNotBetween(Integer value1, Integer value2) {
            addCriterion("title_num not between", value1, value2, "titleNum");
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