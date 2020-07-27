/*
 * An XML document type.
 * Localname: ListMetadataFormatsRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice;


/**
 * A document containing one ListMetadataFormatsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public interface ListMetadataFormatsRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListMetadataFormatsRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFACEC922E044F47C2BCCEF7F9AF312FA").resolveHandle("listmetadataformatsrequest1645doctype");
    
    /**
     * Gets the "ListMetadataFormatsRequest" element
     */
    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest getListMetadataFormatsRequest();
    
    /**
     * Sets the "ListMetadataFormatsRequest" element
     */
    void setListMetadataFormatsRequest(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest listMetadataFormatsRequest);
    
    /**
     * Appends and returns a new empty "ListMetadataFormatsRequest" element
     */
    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest addNewListMetadataFormatsRequest();
    
    /**
     * An XML ListMetadataFormatsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice).
     *
     * This is a complex type.
     */
    public interface ListMetadataFormatsRequest extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ListMetadataFormatsRequest.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFACEC922E044F47C2BCCEF7F9AF312FA").resolveHandle("listmetadataformatsrequest4429elemtype");
        
        /**
         * Gets the "identifier" element
         */
        java.lang.String getIdentifier();
        
        /**
         * Gets (as xml) the "identifier" element
         */
        org.apache.xmlbeans.XmlAnyURI xgetIdentifier();
        
        /**
         * True if has "identifier" element
         */
        boolean isSetIdentifier();
        
        /**
         * Sets the "identifier" element
         */
        void setIdentifier(java.lang.String identifier);
        
        /**
         * Sets (as xml) the "identifier" element
         */
        void xsetIdentifier(org.apache.xmlbeans.XmlAnyURI identifier);
        
        /**
         * Unsets the "identifier" element
         */
        void unsetIdentifier();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest newInstance() {
              return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument newInstance() {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
