/**
 * This class is generated by jOOQ
 */
package digitallibrary.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Groups extends org.jooq.impl.TableImpl<digitallibrary.generated.tables.records.GroupsRecord> {

	private static final long serialVersionUID = 1156935010;

	/**
	 * The singleton instance of <code>digitallibrary.groups</code>
	 */
	public static final digitallibrary.generated.tables.Groups GROUPS = new digitallibrary.generated.tables.Groups();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<digitallibrary.generated.tables.records.GroupsRecord> getRecordType() {
		return digitallibrary.generated.tables.records.GroupsRecord.class;
	}

	/**
	 * The column <code>digitallibrary.groups.groupid</code>.
	 */
	public final org.jooq.TableField<digitallibrary.generated.tables.records.GroupsRecord, java.lang.Integer> GROUPID = createField("groupid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>digitallibrary.groups.groupname</code>.
	 */
	public final org.jooq.TableField<digitallibrary.generated.tables.records.GroupsRecord, java.lang.String> GROUPNAME = createField("groupname", org.jooq.impl.SQLDataType.VARCHAR.length(20), this, "");

	/**
	 * The column <code>digitallibrary.groups.members</code>.
	 */
	public final org.jooq.TableField<digitallibrary.generated.tables.records.GroupsRecord, java.lang.String> MEMBERS = createField("members", org.jooq.impl.SQLDataType.VARCHAR.length(150), this, "");

	/**
	 * Create a <code>digitallibrary.groups</code> table reference
	 */
	public Groups() {
		this("groups", null);
	}

	/**
	 * Create an aliased <code>digitallibrary.groups</code> table reference
	 */
	public Groups(java.lang.String alias) {
		this(alias, digitallibrary.generated.tables.Groups.GROUPS);
	}

	private Groups(java.lang.String alias, org.jooq.Table<digitallibrary.generated.tables.records.GroupsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Groups(java.lang.String alias, org.jooq.Table<digitallibrary.generated.tables.records.GroupsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, digitallibrary.generated.Digitallibrary.DIGITALLIBRARY, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<digitallibrary.generated.tables.records.GroupsRecord, java.lang.Integer> getIdentity() {
		return digitallibrary.generated.Keys.IDENTITY_GROUPS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<digitallibrary.generated.tables.records.GroupsRecord> getPrimaryKey() {
		return digitallibrary.generated.Keys.KEY_GROUPS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<digitallibrary.generated.tables.records.GroupsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<digitallibrary.generated.tables.records.GroupsRecord>>asList(digitallibrary.generated.Keys.KEY_GROUPS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public digitallibrary.generated.tables.Groups as(java.lang.String alias) {
		return new digitallibrary.generated.tables.Groups(alias, this);
	}

	/**
	 * Rename this table
	 */
	public digitallibrary.generated.tables.Groups rename(java.lang.String name) {
		return new digitallibrary.generated.tables.Groups(name, null);
	}
}
