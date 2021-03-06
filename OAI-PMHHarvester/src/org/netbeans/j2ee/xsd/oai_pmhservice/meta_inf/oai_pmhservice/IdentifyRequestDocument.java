/*
 * An XML document type.
 * Localname: IdentifyRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice;


/**
 * A document containing one IdentifyRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public interface IdentifyRequestDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IdentifyRequestDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sFACEC922E044F47C2BCCEF7F9AF312FA").resolveHandle("identifyrequestc3b6doctype");
    
    /**
     * Gets the "IdentifyRequest" element
     */
    org.apache.xmlbeans.XmlObject getIdentifyRequest();
    
    /**
     * Sets the "IdentifyRequest" element
     */
    void setIdentifyRequest(org.apache.xmlbeans.XmlObject identifyRequest);
    
    /**
     * Appends and returns a new empty "IdentifyRequest" element
     */
    org.apache.xmlbeans.XmlObject addNewIdentifyRequest();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument newInstance() {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
