/*
 * An XML document type.
 * Localname: ListSetsRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.impl;
/**
 * A document containing one ListSetsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public class ListSetsRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument
{
    
    public ListSetsRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTSETSREQUEST$0 = 
        new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "ListSetsRequest");
    
    
    /**
     * Gets the "ListSetsRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest getListSetsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest)get_store().find_element_user(LISTSETSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListSetsRequest" element
     */
    public void setListSetsRequest(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest listSetsRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest)get_store().find_element_user(LISTSETSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest)get_store().add_element_user(LISTSETSREQUEST$0);
            }
            target.set(listSetsRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ListSetsRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest addNewListSetsRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest)get_store().add_element_user(LISTSETSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ListSetsRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice).
     *
     * This is a complex type.
     */
    public static class ListSetsRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest
    {
        
        public ListSetsRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESUMPTIONTOKEN$0 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "resumptionToken");
        
        
        /**
         * Gets the "resumptionToken" element
         */
        public java.lang.String getResumptionToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESUMPTIONTOKEN$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "resumptionToken" element
         */
        public org.apache.xmlbeans.XmlString xgetResumptionToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESUMPTIONTOKEN$0, 0);
                return target;
            }
        }
        
        /**
         * True if has "resumptionToken" element
         */
        public boolean isSetResumptionToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESUMPTIONTOKEN$0) != 0;
            }
        }
        
        /**
         * Sets the "resumptionToken" element
         */
        public void setResumptionToken(java.lang.String resumptionToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RESUMPTIONTOKEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RESUMPTIONTOKEN$0);
                }
                target.setStringValue(resumptionToken);
            }
        }
        
        /**
         * Sets (as xml) the "resumptionToken" element
         */
        public void xsetResumptionToken(org.apache.xmlbeans.XmlString resumptionToken)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RESUMPTIONTOKEN$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RESUMPTIONTOKEN$0);
                }
                target.set(resumptionToken);
            }
        }
        
        /**
         * Unsets the "resumptionToken" element
         */
        public void unsetResumptionToken()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESUMPTIONTOKEN$0, 0);
            }
        }
    }
}
