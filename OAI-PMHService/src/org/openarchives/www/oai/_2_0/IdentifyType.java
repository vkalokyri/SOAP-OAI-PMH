/*
 * XML Type:  IdentifyType
 * Namespace: http://www.openarchives.org/OAI/2.0/
 * Java type: org.openarchives.www.oai._2_0.IdentifyType
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.www.oai._2_0;


/**
 * An XML IdentifyType(@http://www.openarchives.org/OAI/2.0/).
 *
 * This is a complex type.
 */
public interface IdentifyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDF587002D9E07BFA80ACF1455E2F3137").resolveHandle("identifytype22f9type");
    
    /**
     * Gets the "repositoryName" element
     */
    java.lang.String getRepositoryName();
    
    /**
     * Gets (as xml) the "repositoryName" element
     */
    org.apache.xmlbeans.XmlString xgetRepositoryName();
    
    /**
     * Sets the "repositoryName" element
     */
    void setRepositoryName(java.lang.String repositoryName);
    
    /**
     * Sets (as xml) the "repositoryName" element
     */
    void xsetRepositoryName(org.apache.xmlbeans.XmlString repositoryName);
    
    /**
     * Gets the "baseURL" element
     */
    java.lang.String getBaseURL();
    
    /**
     * Gets (as xml) the "baseURL" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetBaseURL();
    
    /**
     * Sets the "baseURL" element
     */
    void setBaseURL(java.lang.String baseURL);
    
    /**
     * Sets (as xml) the "baseURL" element
     */
    void xsetBaseURL(org.apache.xmlbeans.XmlAnyURI baseURL);
    
    /**
     * Gets the "protocolVersion" element
     */
    org.openarchives.www.oai._2_0.ProtocolVersionType.Enum getProtocolVersion();
    
    /**
     * Gets (as xml) the "protocolVersion" element
     */
    org.openarchives.www.oai._2_0.ProtocolVersionType xgetProtocolVersion();
    
    /**
     * Sets the "protocolVersion" element
     */
    void setProtocolVersion(org.openarchives.www.oai._2_0.ProtocolVersionType.Enum protocolVersion);
    
    /**
     * Sets (as xml) the "protocolVersion" element
     */
    void xsetProtocolVersion(org.openarchives.www.oai._2_0.ProtocolVersionType protocolVersion);
    
    /**
     * Gets array of all "adminEmail" elements
     */
    java.lang.String[] getAdminEmailArray();
    
    /**
     * Gets ith "adminEmail" element
     */
    java.lang.String getAdminEmailArray(int i);
    
    /**
     * Gets (as xml) array of all "adminEmail" elements
     */
    org.openarchives.www.oai._2_0.EmailType[] xgetAdminEmailArray();
    
    /**
     * Gets (as xml) ith "adminEmail" element
     */
    org.openarchives.www.oai._2_0.EmailType xgetAdminEmailArray(int i);
    
    /**
     * Returns number of "adminEmail" element
     */
    int sizeOfAdminEmailArray();
    
    /**
     * Sets array of all "adminEmail" element
     */
    void setAdminEmailArray(java.lang.String[] adminEmailArray);
    
    /**
     * Sets ith "adminEmail" element
     */
    void setAdminEmailArray(int i, java.lang.String adminEmail);
    
    /**
     * Sets (as xml) array of all "adminEmail" element
     */
    void xsetAdminEmailArray(org.openarchives.www.oai._2_0.EmailType[] adminEmailArray);
    
    /**
     * Sets (as xml) ith "adminEmail" element
     */
    void xsetAdminEmailArray(int i, org.openarchives.www.oai._2_0.EmailType adminEmail);
    
    /**
     * Inserts the value as the ith "adminEmail" element
     */
    void insertAdminEmail(int i, java.lang.String adminEmail);
    
    /**
     * Appends the value as the last "adminEmail" element
     */
    void addAdminEmail(java.lang.String adminEmail);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "adminEmail" element
     */
    org.openarchives.www.oai._2_0.EmailType insertNewAdminEmail(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "adminEmail" element
     */
    org.openarchives.www.oai._2_0.EmailType addNewAdminEmail();
    
    /**
     * Removes the ith "adminEmail" element
     */
    void removeAdminEmail(int i);
    
    /**
     * Gets the "earliestDatestamp" element
     */
    java.util.Calendar getEarliestDatestamp();
    
    /**
     * Gets (as xml) the "earliestDatestamp" element
     */
    org.openarchives.www.oai._2_0.UTCdatetimeType xgetEarliestDatestamp();
    
    /**
     * Sets the "earliestDatestamp" element
     */
    void setEarliestDatestamp(java.util.Calendar earliestDatestamp);
    
    /**
     * Sets (as xml) the "earliestDatestamp" element
     */
    void xsetEarliestDatestamp(org.openarchives.www.oai._2_0.UTCdatetimeType earliestDatestamp);
    
    /**
     * Gets the "deletedRecord" element
     */
    org.openarchives.www.oai._2_0.DeletedRecordType.Enum getDeletedRecord();
    
    /**
     * Gets (as xml) the "deletedRecord" element
     */
    org.openarchives.www.oai._2_0.DeletedRecordType xgetDeletedRecord();
    
    /**
     * Sets the "deletedRecord" element
     */
    void setDeletedRecord(org.openarchives.www.oai._2_0.DeletedRecordType.Enum deletedRecord);
    
    /**
     * Sets (as xml) the "deletedRecord" element
     */
    void xsetDeletedRecord(org.openarchives.www.oai._2_0.DeletedRecordType deletedRecord);
    
    /**
     * Gets the "granularity" element
     */
    org.openarchives.www.oai._2_0.GranularityType.Enum getGranularity();
    
    /**
     * Gets (as xml) the "granularity" element
     */
    org.openarchives.www.oai._2_0.GranularityType xgetGranularity();
    
    /**
     * Sets the "granularity" element
     */
    void setGranularity(org.openarchives.www.oai._2_0.GranularityType.Enum granularity);
    
    /**
     * Sets (as xml) the "granularity" element
     */
    void xsetGranularity(org.openarchives.www.oai._2_0.GranularityType granularity);
    
    /**
     * Gets array of all "compression" elements
     */
    java.lang.String[] getCompressionArray();
    
    /**
     * Gets ith "compression" element
     */
    java.lang.String getCompressionArray(int i);
    
    /**
     * Gets (as xml) array of all "compression" elements
     */
    org.apache.xmlbeans.XmlString[] xgetCompressionArray();
    
    /**
     * Gets (as xml) ith "compression" element
     */
    org.apache.xmlbeans.XmlString xgetCompressionArray(int i);
    
    /**
     * Returns number of "compression" element
     */
    int sizeOfCompressionArray();
    
    /**
     * Sets array of all "compression" element
     */
    void setCompressionArray(java.lang.String[] compressionArray);
    
    /**
     * Sets ith "compression" element
     */
    void setCompressionArray(int i, java.lang.String compression);
    
    /**
     * Sets (as xml) array of all "compression" element
     */
    void xsetCompressionArray(org.apache.xmlbeans.XmlString[] compressionArray);
    
    /**
     * Sets (as xml) ith "compression" element
     */
    void xsetCompressionArray(int i, org.apache.xmlbeans.XmlString compression);
    
    /**
     * Inserts the value as the ith "compression" element
     */
    void insertCompression(int i, java.lang.String compression);
    
    /**
     * Appends the value as the last "compression" element
     */
    void addCompression(java.lang.String compression);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "compression" element
     */
    org.apache.xmlbeans.XmlString insertNewCompression(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "compression" element
     */
    org.apache.xmlbeans.XmlString addNewCompression();
    
    /**
     * Removes the ith "compression" element
     */
    void removeCompression(int i);
    
    /**
     * Gets array of all "description" elements
     */
    org.openarchives.www.oai._2_0.DescriptionType[] getDescriptionArray();
    
    /**
     * Gets ith "description" element
     */
    org.openarchives.www.oai._2_0.DescriptionType getDescriptionArray(int i);
    
    /**
     * Returns number of "description" element
     */
    int sizeOfDescriptionArray();
    
    /**
     * Sets array of all "description" element
     */
    void setDescriptionArray(org.openarchives.www.oai._2_0.DescriptionType[] descriptionArray);
    
    /**
     * Sets ith "description" element
     */
    void setDescriptionArray(int i, org.openarchives.www.oai._2_0.DescriptionType description);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "description" element
     */
    org.openarchives.www.oai._2_0.DescriptionType insertNewDescription(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "description" element
     */
    org.openarchives.www.oai._2_0.DescriptionType addNewDescription();
    
    /**
     * Removes the ith "description" element
     */
    void removeDescription(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openarchives.www.oai._2_0.IdentifyType newInstance() {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openarchives.www.oai._2_0.IdentifyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openarchives.www.oai._2_0.IdentifyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openarchives.www.oai._2_0.IdentifyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openarchives.www.oai._2_0.IdentifyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
