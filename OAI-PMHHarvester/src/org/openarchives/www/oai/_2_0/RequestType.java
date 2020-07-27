/*
 * XML Type:  requestType
 * Namespace: http://www.openarchives.org/OAI/2.0/
 * Java type: org.openarchives.www.oai._2_0.RequestType
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.www.oai._2_0;


/**
 * An XML requestType(@http://www.openarchives.org/OAI/2.0/).
 *
 * This is an atomic type that is a restriction of org.openarchives.www.oai._2_0.RequestType.
 */
public interface RequestType extends org.apache.xmlbeans.XmlAnyURI
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequestType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFACEC922E044F47C2BCCEF7F9AF312FA").resolveHandle("requesttype4aa8type");
    
    /**
     * Gets the "verb" attribute
     */
    org.openarchives.www.oai._2_0.VerbType.Enum getVerb();
    
    /**
     * Gets (as xml) the "verb" attribute
     */
    org.openarchives.www.oai._2_0.VerbType xgetVerb();
    
    /**
     * True if has "verb" attribute
     */
    boolean isSetVerb();
    
    /**
     * Sets the "verb" attribute
     */
    void setVerb(org.openarchives.www.oai._2_0.VerbType.Enum verb);
    
    /**
     * Sets (as xml) the "verb" attribute
     */
    void xsetVerb(org.openarchives.www.oai._2_0.VerbType verb);
    
    /**
     * Unsets the "verb" attribute
     */
    void unsetVerb();
    
    /**
     * Gets the "identifier" attribute
     */
    java.lang.String getIdentifier();
    
    /**
     * Gets (as xml) the "identifier" attribute
     */
    org.openarchives.www.oai._2_0.IdentifierType xgetIdentifier();
    
    /**
     * True if has "identifier" attribute
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" attribute
     */
    void setIdentifier(java.lang.String identifier);
    
    /**
     * Sets (as xml) the "identifier" attribute
     */
    void xsetIdentifier(org.openarchives.www.oai._2_0.IdentifierType identifier);
    
    /**
     * Unsets the "identifier" attribute
     */
    void unsetIdentifier();
    
    /**
     * Gets the "metadataPrefix" attribute
     */
    java.lang.String getMetadataPrefix();
    
    /**
     * Gets (as xml) the "metadataPrefix" attribute
     */
    org.openarchives.www.oai._2_0.MetadataPrefixType xgetMetadataPrefix();
    
    /**
     * True if has "metadataPrefix" attribute
     */
    boolean isSetMetadataPrefix();
    
    /**
     * Sets the "metadataPrefix" attribute
     */
    void setMetadataPrefix(java.lang.String metadataPrefix);
    
    /**
     * Sets (as xml) the "metadataPrefix" attribute
     */
    void xsetMetadataPrefix(org.openarchives.www.oai._2_0.MetadataPrefixType metadataPrefix);
    
    /**
     * Unsets the "metadataPrefix" attribute
     */
    void unsetMetadataPrefix();
    
    /**
     * Gets the "from" attribute
     */
    java.util.Calendar getFrom();
    
    /**
     * Gets (as xml) the "from" attribute
     */
    org.openarchives.www.oai._2_0.UTCdatetimeType xgetFrom();
    
    /**
     * True if has "from" attribute
     */
    boolean isSetFrom();
    
    /**
     * Sets the "from" attribute
     */
    void setFrom(java.util.Calendar from);
    
    /**
     * Sets (as xml) the "from" attribute
     */
    void xsetFrom(org.openarchives.www.oai._2_0.UTCdatetimeType from);
    
    /**
     * Unsets the "from" attribute
     */
    void unsetFrom();
    
    /**
     * Gets the "until" attribute
     */
    java.util.Calendar getUntil();
    
    /**
     * Gets (as xml) the "until" attribute
     */
    org.openarchives.www.oai._2_0.UTCdatetimeType xgetUntil();
    
    /**
     * True if has "until" attribute
     */
    boolean isSetUntil();
    
    /**
     * Sets the "until" attribute
     */
    void setUntil(java.util.Calendar until);
    
    /**
     * Sets (as xml) the "until" attribute
     */
    void xsetUntil(org.openarchives.www.oai._2_0.UTCdatetimeType until);
    
    /**
     * Unsets the "until" attribute
     */
    void unsetUntil();
    
    /**
     * Gets the "set" attribute
     */
    java.lang.String getSet();
    
    /**
     * Gets (as xml) the "set" attribute
     */
    org.openarchives.www.oai._2_0.SetSpecType xgetSet();
    
    /**
     * True if has "set" attribute
     */
    boolean isSetSet();
    
    /**
     * Sets the "set" attribute
     */
    void setSet(java.lang.String set);
    
    /**
     * Sets (as xml) the "set" attribute
     */
    void xsetSet(org.openarchives.www.oai._2_0.SetSpecType set);
    
    /**
     * Unsets the "set" attribute
     */
    void unsetSet();
    
    /**
     * Gets the "resumptionToken" attribute
     */
    java.lang.String getResumptionToken();
    
    /**
     * Gets (as xml) the "resumptionToken" attribute
     */
    org.apache.xmlbeans.XmlString xgetResumptionToken();
    
    /**
     * True if has "resumptionToken" attribute
     */
    boolean isSetResumptionToken();
    
    /**
     * Sets the "resumptionToken" attribute
     */
    void setResumptionToken(java.lang.String resumptionToken);
    
    /**
     * Sets (as xml) the "resumptionToken" attribute
     */
    void xsetResumptionToken(org.apache.xmlbeans.XmlString resumptionToken);
    
    /**
     * Unsets the "resumptionToken" attribute
     */
    void unsetResumptionToken();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openarchives.www.oai._2_0.RequestType newInstance() {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.openarchives.www.oai._2_0.RequestType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.openarchives.www.oai._2_0.RequestType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openarchives.www.oai._2_0.RequestType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openarchives.www.oai._2_0.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.openarchives.www.oai._2_0.RequestType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.openarchives.www.oai._2_0.RequestType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
