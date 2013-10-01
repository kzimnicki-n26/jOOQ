/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.h2.matchers.tables.records.VAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String>, org.jooq.examples.h2.matchers.tables.interfaces.IVAuthor {

	private static final long serialVersionUID = -716785886;

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.FIRST_NAME</code>. 
	 */
	@Override
	public void setFirstName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.FIRST_NAME</code>. 
	 */
	@Override
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.LAST_NAME</code>. 
	 */
	@Override
	public void setLastName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.LAST_NAME</code>. 
	 */
	@Override
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	@Override
	public void setDateOfBirth(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	@Override
	public java.sql.Date getDateOfBirth() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	@Override
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	@Override
	public java.lang.Integer getYearOfBirth() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>PUBLIC.V_AUTHOR.ADDRESS</code>. 
	 */
	@Override
	public void setAddress(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>PUBLIC.V_AUTHOR.ADDRESS</code>. 
	 */
	@Override
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.h2.matchers.tables.VAuthor.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.h2.matchers.tables.VAuthor.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.h2.matchers.tables.VAuthor.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.examples.h2.matchers.tables.VAuthor.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.examples.h2.matchers.tables.VAuthor.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.examples.h2.matchers.tables.VAuthor.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddress();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.examples.h2.matchers.tables.interfaces.IVAuthor from) {
		setId(from.getId());
		setFirstName(from.getFirstName());
		setLastName(from.getLastName());
		setDateOfBirth(from.getDateOfBirth());
		setYearOfBirth(from.getYearOfBirth());
		setAddress(from.getAddress());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.examples.h2.matchers.tables.interfaces.IVAuthor> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.examples.h2.matchers.tables.VAuthor.V_AUTHOR);
	}

	/**
	 * Create a detached, initialised VAuthorRecord
	 */
	public VAuthorRecord(java.lang.Integer id, java.lang.String firstName, java.lang.String lastName, java.sql.Date dateOfBirth, java.lang.Integer yearOfBirth, java.lang.String address) {
		super(org.jooq.examples.h2.matchers.tables.VAuthor.V_AUTHOR);

		setValue(0, id);
		setValue(1, firstName);
		setValue(2, lastName);
		setValue(3, dateOfBirth);
		setValue(4, yearOfBirth);
		setValue(5, address);
	}
}