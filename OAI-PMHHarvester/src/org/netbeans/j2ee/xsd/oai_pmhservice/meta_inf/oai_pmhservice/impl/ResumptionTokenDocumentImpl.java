/*
 * An XML document type.
 * Localname: resumptionToken
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ResumptionTokenDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.impl;
/**
 * A document containing one resumptionToken(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public class ResumptionTokenDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ResumptionTokenDocument
{
    
    public ResumptionTokenDocumentImpl(org.apache.xmlbeans.SchemaType sType)
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
}
