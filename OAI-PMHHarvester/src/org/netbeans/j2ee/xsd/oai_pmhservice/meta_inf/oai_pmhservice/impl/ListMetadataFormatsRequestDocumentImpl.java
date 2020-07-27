/*
 * An XML document type.
 * Localname: ListMetadataFormatsRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.impl;
/**
 * A document containing one ListMetadataFormatsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public class ListMetadataFormatsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument
{
    
    public ListMetadataFormatsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTMETADATAFORMATSREQUEST$0 = 
        new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "ListMetadataFormatsRequest");
    
    
    /**
     * Gets the "ListMetadataFormatsRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest getListMetadataFormatsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest)get_store().find_element_user(LISTMETADATAFORMATSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListMetadataFormatsRequest" element
     */
    public void setListMetadataFormatsRequest(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest listMetadataFormatsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest)get_store().find_element_user(LISTMETADATAFORMATSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest)get_store().add_element_user(LISTMETADATAFORMATSREQUEST$0);
            }
            target.set(listMetadataFormatsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ListMetadataFormatsRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest addNewListMetadataFormatsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest)get_store().add_element_user(LISTMETADATAFORMATSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ListMetadataFormatsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice).
     *
     * This is a complex type.
     */
    public static class ListMetadataFormatsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.ListMetadataFormatsRequest
    {
        
        public ListMetadataFormatsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IDENTIFIER$0 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "identifier");
        
        
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
         * True if has "identifier" element
         */
        public boolean isSetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(IDENTIFIER$0) != 0;
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
         * Unsets the "identifier" element
         */
        public void unsetIdentifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(IDENTIFIER$0, 0);
            }
        }
    }
}
