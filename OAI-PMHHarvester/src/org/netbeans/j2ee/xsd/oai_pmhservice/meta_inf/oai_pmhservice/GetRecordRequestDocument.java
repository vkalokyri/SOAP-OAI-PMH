/*
 * An XML document type.
 * Localname: GetRecordRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice;


/**
 * A document containing one GetRecordRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public interface GetRecordRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRecordRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFACEC922E044F47C2BCCEF7F9AF312FA").resolveHandle("getrecordrequestbbeddoctype");
    
    /**
     * Gets the "GetRecordRequest" element
     */
    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest getGetRecordRequest();
    
    /**
     * Sets the "GetRecordRequest" element
     */
    void setGetRecordRequest(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest getRecordRequest);
    
    /**
     * Appends and returns a new empty "GetRecordRequest" element
     */
    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest addNewGetRecordRequest();
    
    /**
     * An XML GetRecordRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice).
     *
     * This is a complex type.
     */
    public interface GetRecordRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GetRecordRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFACEC922E044F47C2BCCEF7F9AF312FA").resolveHandle("getrecordrequest2d69elemtype");
        
        /**
         * Gets the "identifier" element
         */
        java.lang.String getIdentifier();
        
        /**
         * Gets (as xml) the "identifier" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetIdentifier();
        
        /**
         * Sets the "identifier" element
         */
        void setIdentifier(java.lang.String identifier);
        
        /**
         * Sets (as xml) the "identifier" element
         */
        void xsetIdentifier(org.apache.xmlbeans.XmlAnyURI identifier);
        
        /**
         * Gets the "metadataPrefix" element
         */
        java.lang.String getMetadataPrefix();
        
        /**
         * Gets (as xml) the "metadataPrefix" element
         */
        org.apache.xmlbeans.XmlString xgetMetadataPrefix();
        
        /**
         * Sets the "metadataPrefix" element
         */
        void setMetadataPrefix(java.lang.String metadataPrefix);
        
        /**
         * Sets (as xml) the "metadataPrefix" element
         */
        void xsetMetadataPrefix(org.apache.xmlbeans.XmlString metadataPrefix);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest newInstance() {
              return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument newInstance() {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
