/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDatesDao extends org.jooq.impl.DAOImpl<org.jooq.test.jdbc.generatedclasses.tables.records.TDatesRecord, org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates, java.lang.Integer> {

	/**
	 * Create a new TDatesDao without any configuration
	 */
	public TDatesDao() {
		super(org.jooq.test.jdbc.generatedclasses.tables.TDates.T_DATES, org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates.class);
	}

	/**
	 * Create a new TDatesDao with an attached configuration
	 */
	public TDatesDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.jdbc.generatedclasses.tables.TDates.T_DATES, org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbc.generatedclasses.tables.TDates.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.jdbc.generatedclasses.tables.TDates.ID, value);
	}

	/**
	 * Fetch records that have <code>D IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates> fetchByD(java.sql.Date... values) {
		return fetch(org.jooq.test.jdbc.generatedclasses.tables.TDates.D, values);
	}

	/**
	 * Fetch records that have <code>T IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates> fetchByT(java.sql.Time... values) {
		return fetch(org.jooq.test.jdbc.generatedclasses.tables.TDates.T, values);
	}

	/**
	 * Fetch records that have <code>TS IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates> fetchByTs(java.sql.Timestamp... values) {
		return fetch(org.jooq.test.jdbc.generatedclasses.tables.TDates.TS, values);
	}

	/**
	 * Fetch records that have <code>D_INT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates> fetchByDInt(java.lang.Integer... values) {
		return fetch(org.jooq.test.jdbc.generatedclasses.tables.TDates.D_INT, values);
	}

	/**
	 * Fetch records that have <code>TS_BIGINT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.jdbc.generatedclasses.tables.pojos.TDates> fetchByTsBigint(java.lang.Long... values) {
		return fetch(org.jooq.test.jdbc.generatedclasses.tables.TDates.TS_BIGINT, values);
	}
}