/**
 * This class is generated by jOOQ
 */
package digitallibrary.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DocumentsRecord extends org.jooq.impl.UpdatableRecordImpl<digitallibrary.generated.tables.records.DocumentsRecord> implements org.jooq.Record10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -533173048;

	/**
	 * Setter for <code>digitallibrary.documents.documentid</code>.
	 */
	public void setDocumentid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.documentid</code>.
	 */
	public java.lang.Integer getDocumentid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>digitallibrary.documents.filename</code>.
	 */
	public void setFilename(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.filename</code>.
	 */
	public java.lang.String getFilename() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>digitallibrary.documents.md5</code>.
	 */
	public void setMd5(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.md5</code>.
	 */
	public java.lang.String getMd5() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>digitallibrary.documents.title</code>.
	 */
	public void setTitle(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.title</code>.
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>digitallibrary.documents.author</code>.
	 */
	public void setAuthor(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.author</code>.
	 */
	public java.lang.String getAuthor() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>digitallibrary.documents.keywords</code>.
	 */
	public void setKeywords(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.keywords</code>.
	 */
	public java.lang.String getKeywords() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>digitallibrary.documents.related_author</code>.
	 */
	public void setRelatedAuthor(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.related_author</code>.
	 */
	public java.lang.String getRelatedAuthor() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>digitallibrary.documents.studygroup</code>.
	 */
	public void setStudygroup(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.studygroup</code>.
	 */
	public java.lang.String getStudygroup() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>digitallibrary.documents.classification</code>.
	 */
	public void setClassification(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.classification</code>.
	 */
	public java.lang.String getClassification() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>digitallibrary.documents.publicationdate</code>.
	 */
	public void setPublicationdate(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>digitallibrary.documents.publicationdate</code>.
	 */
	public java.lang.String getPublicationdate() {
		return (java.lang.String) getValue(9);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.DOCUMENTID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.FILENAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.MD5;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.KEYWORDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.RELATED_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.STUDYGROUP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.CLASSIFICATION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return digitallibrary.generated.tables.Documents.DOCUMENTS.PUBLICATIONDATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getDocumentid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFilename();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getMd5();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getKeywords();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getRelatedAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getStudygroup();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getClassification();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getPublicationdate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value1(java.lang.Integer value) {
		setDocumentid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value2(java.lang.String value) {
		setFilename(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value3(java.lang.String value) {
		setMd5(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value4(java.lang.String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value5(java.lang.String value) {
		setAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value6(java.lang.String value) {
		setKeywords(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value7(java.lang.String value) {
		setRelatedAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value8(java.lang.String value) {
		setStudygroup(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value9(java.lang.String value) {
		setClassification(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord value10(java.lang.String value) {
		setPublicationdate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public DocumentsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.String value7, java.lang.String value8, java.lang.String value9, java.lang.String value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached DocumentsRecord
	 */
	public DocumentsRecord() {
		super(digitallibrary.generated.tables.Documents.DOCUMENTS);
	}

	/**
	 * Create a detached, initialised DocumentsRecord
	 */
	public DocumentsRecord(java.lang.Integer documentid, java.lang.String filename, java.lang.String md5, java.lang.String title, java.lang.String author, java.lang.String keywords, java.lang.String relatedAuthor, java.lang.String studygroup, java.lang.String classification, java.lang.String publicationdate) {
		super(digitallibrary.generated.tables.Documents.DOCUMENTS);

		setValue(0, documentid);
		setValue(1, filename);
		setValue(2, md5);
		setValue(3, title);
		setValue(4, author);
		setValue(5, keywords);
		setValue(6, relatedAuthor);
		setValue(7, studygroup);
		setValue(8, classification);
		setValue(9, publicationdate);
	}
}
