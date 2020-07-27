/*
 * An XML document type.
 * Localname: IdentifyRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.impl;
/**
 * A document containing one IdentifyRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public class IdentifyRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument
{
    
    public IdentifyRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDENTIFYREQUEST$0 = 
        new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "IdentifyRequest");
    
    
    /**
     * Gets the "IdentifyRequest" element
     */
    public org.apache.xmlbeans.XmlObject getIdentifyRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFYREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdentifyRequest" element
     */
    public void setIdentifyRequest(org.apache.xmlbeans.XmlObject identifyRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(IDENTIFYREQUEST$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFYREQUEST$0);
            }
            target.set(identifyRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "IdentifyRequest" element
     */
    public org.apache.xmlbeans.XmlObject addNewIdentifyRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(IDENTIFYREQUEST$0);
            return target;
        }
    }
}
