/*
 * An XML document type.
 * Localname: ListRecordsRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice;


/**
 * A document containing one ListRecordsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public interface ListRecordsRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListRecordsRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDF587002D9E07BFA80ACF1455E2F3137").resolveHandle("listrecordsrequest9910doctype");
    
    /**
     * Gets the "ListRecordsRequest" element
     */
    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest getListRecordsRequest();
    
    /**
     * Sets the "ListRecordsRequest" element
     */
    void setListRecordsRequest(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest listRecordsRequest);
    
    /**
     * Appends and returns a new empty "ListRecordsRequest" element
     */
    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest addNewListRecordsRequest();
    
    /**
     * An XML ListRecordsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice).
     *
     * This is a complex type.
     */
    public interface ListRecordsRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListRecordsRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sDF587002D9E07BFA80ACF1455E2F3137").resolveHandle("listrecordsrequestb609elemtype");
        
        /**
         * Gets the "resumptionToken" element
         */
        java.lang.String getResumptionToken();
        
        /**
         * Gets (as xml) the "resumptionToken" element
         */
        org.apache.xmlbeans.XmlString xgetResumptionToken();
        
        /**
         * True if has "resumptionToken" element
         */
        boolean isSetResumptionToken();
        
        /**
         * Sets the "resumptionToken" element
         */
        void setResumptionToken(java.lang.String resumptionToken);
        
        /**
         * Sets (as xml) the "resumptionToken" element
         */
        void xsetResumptionToken(org.apache.xmlbeans.XmlString resumptionToken);
        
        /**
         * Unsets the "resumptionToken" element
         */
        void unsetResumptionToken();
        
        /**
         * Gets the "from" element
         */
        java.util.Calendar getFrom();
        
        /**
         * Gets (as xml) the "from" element
         */
        org.openarchives.www.oai._2_0.UTCdatetimeType xgetFrom();
        
        /**
         * True if has "from" element
         */
        boolean isSetFrom();
        
        /**
         * Sets the "from" element
         */
        void setFrom(java.util.Calendar from);
        
        /**
         * Sets (as xml) the "from" element
         */
        void xsetFrom(org.openarchives.www.oai._2_0.UTCdatetimeType from);
        
        /**
         * Unsets the "from" element
         */
        void unsetFrom();
        
        /**
         * Gets the "until" element
         */
        java.util.Calendar getUntil();
        
        /**
         * Gets (as xml) the "until" element
         */
        org.openarchives.www.oai._2_0.UTCdatetimeType xgetUntil();
        
        /**
         * True if has "until" element
         */
        boolean isSetUntil();
        
        /**
         * Sets the "until" element
         */
        void setUntil(java.util.Calendar until);
        
        /**
         * Sets (as xml) the "until" element
         */
        void xsetUntil(org.openarchives.www.oai._2_0.UTCdatetimeType until);
        
        /**
         * Unsets the "until" element
         */
        void unsetUntil();
        
        /**
         * Gets the "metadataPrefix" element
         */
        java.lang.String getMetadataPrefix();
        
        /**
         * Gets (as xml) the "metadataPrefix" element
         */
        org.openarchives.www.oai._2_0.MetadataPrefixType xgetMetadataPrefix();
        
        /**
         * True if has "metadataPrefix" element
         */
        boolean isSetMetadataPrefix();
        
        /**
         * Sets the "metadataPrefix" element
         */
        void setMetadataPrefix(java.lang.String metadataPrefix);
        
        /**
         * Sets (as xml) the "metadataPrefix" element
         */
        void xsetMetadataPrefix(org.openarchives.www.oai._2_0.MetadataPrefixType metadataPrefix);
        
        /**
         * Unsets the "metadataPrefix" element
         */
        void unsetMetadataPrefix();
        
        /**
         * Gets the "set" element
         */
        java.lang.String getSet();
        
        /**
         * Gets (as xml) the "set" element
         */
        org.openarchives.www.oai._2_0.SetSpecType xgetSet();
        
        /**
         * True if has "set" element
         */
        boolean isSetSet();
        
        /**
         * Sets the "set" element
         */
        void setSet(java.lang.String set);
        
        /**
         * Sets (as xml) the "set" element
         */
        void xsetSet(org.openarchives.www.oai._2_0.SetSpecType set);
        
        /**
         * Unsets the "set" element
         */
        void unsetSet();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest newInstance() {
              return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument newInstance() {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
