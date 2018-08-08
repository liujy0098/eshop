package jxufe.lwl.eshop.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public GoodsCommentExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andScommIdIsNull() {
            addCriterion("scomm_id is null");
            return (Criteria) this;
        }

        public Criteria andScommIdIsNotNull() {
            addCriterion("scomm_id is not null");
            return (Criteria) this;
        }

        public Criteria andScommIdEqualTo(Integer value) {
            addCriterion("scomm_id =", value, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdNotEqualTo(Integer value) {
            addCriterion("scomm_id <>", value, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdGreaterThan(Integer value) {
            addCriterion("scomm_id >", value, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scomm_id >=", value, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdLessThan(Integer value) {
            addCriterion("scomm_id <", value, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdLessThanOrEqualTo(Integer value) {
            addCriterion("scomm_id <=", value, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdIn(List<Integer> values) {
            addCriterion("scomm_id in", values, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdNotIn(List<Integer> values) {
            addCriterion("scomm_id not in", values, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdBetween(Integer value1, Integer value2) {
            addCriterion("scomm_id between", value1, value2, "scommId");
            return (Criteria) this;
        }

        public Criteria andScommIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scomm_id not between", value1, value2, "scommId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdIsNull() {
            addCriterion("goodis_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodisIdIsNotNull() {
            addCriterion("goodis_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodisIdEqualTo(Integer value) {
            addCriterion("goodis_id =", value, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdNotEqualTo(Integer value) {
            addCriterion("goodis_id <>", value, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdGreaterThan(Integer value) {
            addCriterion("goodis_id >", value, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodis_id >=", value, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdLessThan(Integer value) {
            addCriterion("goodis_id <", value, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdLessThanOrEqualTo(Integer value) {
            addCriterion("goodis_id <=", value, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdIn(List<Integer> values) {
            addCriterion("goodis_id in", values, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdNotIn(List<Integer> values) {
            addCriterion("goodis_id not in", values, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdBetween(Integer value1, Integer value2) {
            addCriterion("goodis_id between", value1, value2, "goodisId");
            return (Criteria) this;
        }

        public Criteria andGoodisIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goodis_id not between", value1, value2, "goodisId");
            return (Criteria) this;
        }

        public Criteria andScommContentIsNull() {
            addCriterion("scomm_content is null");
            return (Criteria) this;
        }

        public Criteria andScommContentIsNotNull() {
            addCriterion("scomm_content is not null");
            return (Criteria) this;
        }

        public Criteria andScommContentEqualTo(String value) {
            addCriterion("scomm_content =", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentNotEqualTo(String value) {
            addCriterion("scomm_content <>", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentGreaterThan(String value) {
            addCriterion("scomm_content >", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentGreaterThanOrEqualTo(String value) {
            addCriterion("scomm_content >=", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentLessThan(String value) {
            addCriterion("scomm_content <", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentLessThanOrEqualTo(String value) {
            addCriterion("scomm_content <=", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentLike(String value) {
            addCriterion("scomm_content like", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentNotLike(String value) {
            addCriterion("scomm_content not like", value, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentIn(List<String> values) {
            addCriterion("scomm_content in", values, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentNotIn(List<String> values) {
            addCriterion("scomm_content not in", values, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentBetween(String value1, String value2) {
            addCriterion("scomm_content between", value1, value2, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommContentNotBetween(String value1, String value2) {
            addCriterion("scomm_content not between", value1, value2, "scommContent");
            return (Criteria) this;
        }

        public Criteria andScommMemberidIsNull() {
            addCriterion("scomm_memberid is null");
            return (Criteria) this;
        }

        public Criteria andScommMemberidIsNotNull() {
            addCriterion("scomm_memberid is not null");
            return (Criteria) this;
        }

        public Criteria andScommMemberidEqualTo(Integer value) {
            addCriterion("scomm_memberid =", value, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidNotEqualTo(Integer value) {
            addCriterion("scomm_memberid <>", value, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidGreaterThan(Integer value) {
            addCriterion("scomm_memberid >", value, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scomm_memberid >=", value, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidLessThan(Integer value) {
            addCriterion("scomm_memberid <", value, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("scomm_memberid <=", value, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidIn(List<Integer> values) {
            addCriterion("scomm_memberid in", values, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidNotIn(List<Integer> values) {
            addCriterion("scomm_memberid not in", values, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidBetween(Integer value1, Integer value2) {
            addCriterion("scomm_memberid between", value1, value2, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("scomm_memberid not between", value1, value2, "scommMemberid");
            return (Criteria) this;
        }

        public Criteria andScommMembernameIsNull() {
            addCriterion("scomm_membername is null");
            return (Criteria) this;
        }

        public Criteria andScommMembernameIsNotNull() {
            addCriterion("scomm_membername is not null");
            return (Criteria) this;
        }

        public Criteria andScommMembernameEqualTo(String value) {
            addCriterion("scomm_membername =", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameNotEqualTo(String value) {
            addCriterion("scomm_membername <>", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameGreaterThan(String value) {
            addCriterion("scomm_membername >", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameGreaterThanOrEqualTo(String value) {
            addCriterion("scomm_membername >=", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameLessThan(String value) {
            addCriterion("scomm_membername <", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameLessThanOrEqualTo(String value) {
            addCriterion("scomm_membername <=", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameLike(String value) {
            addCriterion("scomm_membername like", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameNotLike(String value) {
            addCriterion("scomm_membername not like", value, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameIn(List<String> values) {
            addCriterion("scomm_membername in", values, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameNotIn(List<String> values) {
            addCriterion("scomm_membername not in", values, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameBetween(String value1, String value2) {
            addCriterion("scomm_membername between", value1, value2, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMembernameNotBetween(String value1, String value2) {
            addCriterion("scomm_membername not between", value1, value2, "scommMembername");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarIsNull() {
            addCriterion("scomm_memberavatar is null");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarIsNotNull() {
            addCriterion("scomm_memberavatar is not null");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarEqualTo(String value) {
            addCriterion("scomm_memberavatar =", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarNotEqualTo(String value) {
            addCriterion("scomm_memberavatar <>", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarGreaterThan(String value) {
            addCriterion("scomm_memberavatar >", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarGreaterThanOrEqualTo(String value) {
            addCriterion("scomm_memberavatar >=", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarLessThan(String value) {
            addCriterion("scomm_memberavatar <", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarLessThanOrEqualTo(String value) {
            addCriterion("scomm_memberavatar <=", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarLike(String value) {
            addCriterion("scomm_memberavatar like", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarNotLike(String value) {
            addCriterion("scomm_memberavatar not like", value, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarIn(List<String> values) {
            addCriterion("scomm_memberavatar in", values, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarNotIn(List<String> values) {
            addCriterion("scomm_memberavatar not in", values, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarBetween(String value1, String value2) {
            addCriterion("scomm_memberavatar between", value1, value2, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andScommMemberavatarNotBetween(String value1, String value2) {
            addCriterion("scomm_memberavatar not between", value1, value2, "scommMemberavatar");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeIsNull() {
            addCriterion("scomm_time is null");
            return (Criteria) this;
        }

        public Criteria andScommTimeIsNotNull() {
            addCriterion("scomm_time is not null");
            return (Criteria) this;
        }

        public Criteria andScommTimeEqualTo(Date value) {
            addCriterion("scomm_time =", value, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeNotEqualTo(Date value) {
            addCriterion("scomm_time <>", value, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeGreaterThan(Date value) {
            addCriterion("scomm_time >", value, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("scomm_time >=", value, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeLessThan(Date value) {
            addCriterion("scomm_time <", value, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeLessThanOrEqualTo(Date value) {
            addCriterion("scomm_time <=", value, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeIn(List<Date> values) {
            addCriterion("scomm_time in", values, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeNotIn(List<Date> values) {
            addCriterion("scomm_time not in", values, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeBetween(Date value1, Date value2) {
            addCriterion("scomm_time between", value1, value2, "scommTime");
            return (Criteria) this;
        }

        public Criteria andScommTimeNotBetween(Date value1, Date value2) {
            addCriterion("scomm_time not between", value1, value2, "scommTime");
            return (Criteria) this;
        }
    }

    /**
     */
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