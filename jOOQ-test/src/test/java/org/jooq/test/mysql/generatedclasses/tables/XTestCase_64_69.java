/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_64_69 extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 268933183;

	/**
	 * The singleton instance of <code>test.x_test_case_64_69</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.mysql.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>test.x_test_case_64_69.ID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_TEST_CASE_64_69, "");

	/**
	 * The column <code>test.x_test_case_64_69.UNUSED_ID</code>.
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_64_69, "");

	/**
	 * No further instances allowed
	 */
	private XTestCase_64_69() {
		this("x_test_case_64_69", null);
	}

	private XTestCase_64_69(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_64_69(java.lang.String alias, org.jooq.Table<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.mysql.generatedclasses.Test.TEST, aliased, parameters, "An unused table in the same schema.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_X_TEST_CASE_64_69_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_X_TEST_CASE_64_69_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.mysql.generatedclasses.Keys.FK_X_TEST_CASE_64_69A, org.jooq.test.mysql.generatedclasses.Keys.FK_X_TEST_CASE_64_69B);
	}
}