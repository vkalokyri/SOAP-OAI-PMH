/*
 * An XML document type.
 * Localname: GetRecordRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.impl;
/**
 * A document containing one GetRecordRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public class GetRecordRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument
{
    
    public GetRecordRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETRECORDREQUEST$0 = 
        new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "GetRecordRequest");
    
    
    /**
     * Gets the "GetRecordRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest getGetRecordRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest)get_store().find_element_user(GETRECORDREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "GetRecordRequest" element
     */
    public void setGetRecordRequest(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest getRecordRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest)get_store().find_element_user(GETRECORDREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest)get_store().add_element_user(GETRECORDREQUEST$0);
            }
            target.set(getRecordRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "GetRecordRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest addNewGetRecordRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest)get_store().add_element_user(GETRECORDREQUEST$0);
            return target;
        }
    }
    /**
     * An XML GetRecordRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice).
     *
     * This is a complex type.
     */
    public static class GetRecordRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.GetRecordRequest
    {
        
        public GetRecordRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "identifier");
        private static final javax.xml.namespace.QName METADATAPREFIX$2 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "metadataPrefix");
        
        
        /**
         * Gets the "identifier" element
         */
        public java.lang.String getIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "identifier" element
         */
        public org.apache.xmlbeans.XmlAnyURI xgetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "identifier" element
         */
        public void setIdentifier(java.lang.String identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$0);
                }
                target.setStringValue(identifier);
            }
        }
        
        /**
         * Sets (as xml) the "identifier" element
         */
        public void xsetIdentifier(org.apache.xmlbeans.XmlAnyURI identifier)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnyURI target = null;
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(IDENTIFIER$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(IDENTIFIER$0);
                }
                target.set(identifier);
            }
        }
        
        /**
         * Gets the "metadataPrefix" element
         */
        public java.lang.String getMetadataPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAPREFIX$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "metadataPrefix" element
         */
        public org.apache.xmlbeans.XmlString xgetMetadataPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAPREFIX$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "metadataPrefix" element
         */
        public void setMetadataPrefix(java.lang.String metadataPrefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAPREFIX$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATAPREFIX$2);
                }
                target.setStringValue(metadataPrefix);
            }
        }
        
        /**
         * Sets (as xml) the "metadataPrefix" element
         */
        public void xsetMetadataPrefix(org.apache.xmlbeans.XmlString metadataPrefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(METADATAPREFIX$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(METADATAPREFIX$2);
                }
                target.set(metadataPrefix);
            }
        }
    }
}
