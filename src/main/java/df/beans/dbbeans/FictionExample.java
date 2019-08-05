package df.beans.dbbeans;

import java.util.ArrayList;
import java.util.List;

public class FictionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FictionExample() {
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

        public Criteria andFictionNameIsNull() {
            addCriterion("fiction_name is null");
            return (Criteria) this;
        }

        public Criteria andFictionNameIsNotNull() {
            addCriterion("fiction_name is not null");
            return (Criteria) this;
        }

        public Criteria andFictionNameEqualTo(String value) {
            addCriterion("fiction_name =", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameNotEqualTo(String value) {
            addCriterion("fiction_name <>", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameGreaterThan(String value) {
            addCriterion("fiction_name >", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameGreaterThanOrEqualTo(String value) {
            addCriterion("fiction_name >=", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameLessThan(String value) {
            addCriterion("fiction_name <", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameLessThanOrEqualTo(String value) {
            addCriterion("fiction_name <=", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameLike(String value) {
            addCriterion("fiction_name like", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameNotLike(String value) {
            addCriterion("fiction_name not like", value, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameIn(List<String> values) {
            addCriterion("fiction_name in", values, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameNotIn(List<String> values) {
            addCriterion("fiction_name not in", values, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameBetween(String value1, String value2) {
            addCriterion("fiction_name between", value1, value2, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionNameNotBetween(String value1, String value2) {
            addCriterion("fiction_name not between", value1, value2, "fictionName");
            return (Criteria) this;
        }

        public Criteria andFictionDescIsNull() {
            addCriterion("fiction_desc is null");
            return (Criteria) this;
        }

        public Criteria andFictionDescIsNotNull() {
            addCriterion("fiction_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFictionDescEqualTo(String value) {
            addCriterion("fiction_desc =", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescNotEqualTo(String value) {
            addCriterion("fiction_desc <>", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescGreaterThan(String value) {
            addCriterion("fiction_desc >", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescGreaterThanOrEqualTo(String value) {
            addCriterion("fiction_desc >=", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescLessThan(String value) {
            addCriterion("fiction_desc <", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescLessThanOrEqualTo(String value) {
            addCriterion("fiction_desc <=", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescLike(String value) {
            addCriterion("fiction_desc like", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescNotLike(String value) {
            addCriterion("fiction_desc not like", value, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescIn(List<String> values) {
            addCriterion("fiction_desc in", values, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescNotIn(List<String> values) {
            addCriterion("fiction_desc not in", values, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescBetween(String value1, String value2) {
            addCriterion("fiction_desc between", value1, value2, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andFictionDescNotBetween(String value1, String value2) {
            addCriterion("fiction_desc not between", value1, value2, "fictionDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andFictiontypeIsNull() {
            addCriterion("fictiontype is null");
            return (Criteria) this;
        }

        public Criteria andFictiontypeIsNotNull() {
            addCriterion("fictiontype is not null");
            return (Criteria) this;
        }

        public Criteria andFictiontypeEqualTo(String value) {
            addCriterion("fictiontype =", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeNotEqualTo(String value) {
            addCriterion("fictiontype <>", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeGreaterThan(String value) {
            addCriterion("fictiontype >", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeGreaterThanOrEqualTo(String value) {
            addCriterion("fictiontype >=", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeLessThan(String value) {
            addCriterion("fictiontype <", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeLessThanOrEqualTo(String value) {
            addCriterion("fictiontype <=", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeLike(String value) {
            addCriterion("fictiontype like", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeNotLike(String value) {
            addCriterion("fictiontype not like", value, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeIn(List<String> values) {
            addCriterion("fictiontype in", values, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeNotIn(List<String> values) {
            addCriterion("fictiontype not in", values, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeBetween(String value1, String value2) {
            addCriterion("fictiontype between", value1, value2, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andFictiontypeNotBetween(String value1, String value2) {
            addCriterion("fictiontype not between", value1, value2, "fictiontype");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andLocalurlIsNull() {
            addCriterion("localUrl is null");
            return (Criteria) this;
        }

        public Criteria andLocalurlIsNotNull() {
            addCriterion("localUrl is not null");
            return (Criteria) this;
        }

        public Criteria andLocalurlEqualTo(String value) {
            addCriterion("localUrl =", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlNotEqualTo(String value) {
            addCriterion("localUrl <>", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlGreaterThan(String value) {
            addCriterion("localUrl >", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlGreaterThanOrEqualTo(String value) {
            addCriterion("localUrl >=", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlLessThan(String value) {
            addCriterion("localUrl <", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlLessThanOrEqualTo(String value) {
            addCriterion("localUrl <=", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlLike(String value) {
            addCriterion("localUrl like", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlNotLike(String value) {
            addCriterion("localUrl not like", value, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlIn(List<String> values) {
            addCriterion("localUrl in", values, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlNotIn(List<String> values) {
            addCriterion("localUrl not in", values, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlBetween(String value1, String value2) {
            addCriterion("localUrl between", value1, value2, "localurl");
            return (Criteria) this;
        }

        public Criteria andLocalurlNotBetween(String value1, String value2) {
            addCriterion("localUrl not between", value1, value2, "localurl");
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