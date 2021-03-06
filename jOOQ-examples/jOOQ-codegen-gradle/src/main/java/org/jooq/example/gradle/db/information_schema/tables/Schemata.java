/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Schemata extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord> {

	private static final long serialVersionUID = -651356875;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.SCHEMATA</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.Schemata SCHEMATA = new org.jooq.example.gradle.db.information_schema.tables.Schemata();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.String> CATALOG_NAME = createField("CATALOG_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.String> SCHEMA_OWNER = createField("SCHEMA_OWNER", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.String> DEFAULT_CHARACTER_SET_NAME = createField("DEFAULT_CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.String> DEFAULT_COLLATION_NAME = createField("DEFAULT_COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.IS_DEFAULT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.Boolean> IS_DEFAULT = createField("IS_DEFAULT", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.REMARKS</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.String> REMARKS = createField("REMARKS", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.SCHEMATA.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
	 */
	public Schemata() {
		this("SCHEMATA", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
	 */
	public Schemata(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.Schemata.SCHEMATA);
	}

	private Schemata(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord> aliased) {
		this(alias, aliased, null);
	}

	private Schemata(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.SchemataRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.Schemata as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.Schemata(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.Schemata rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.Schemata(name, null);
	}
}
