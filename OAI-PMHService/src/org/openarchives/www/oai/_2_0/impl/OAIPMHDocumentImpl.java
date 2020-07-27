/*
 * An XML document type.
 * Localname: OAI-PMH
 * Namespace: http://www.openarchives.org/OAI/2.0/
 * Java type: org.openarchives.www.oai._2_0.OAIPMHDocument
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.www.oai._2_0.impl;
/**
 * A document containing one OAI-PMH(@http://www.openarchives.org/OAI/2.0/) element.
 *
 * This is a complex type.
 */
public class OAIPMHDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openarchives.www.oai._2_0.OAIPMHDocument
{
    
    public OAIPMHDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OAIPMH$0 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/", "OAI-PMH");
    
    
    /**
     * Gets the "OAI-PMH" element
     */
    public org.openarchives.www.oai._2_0.OAIPMHtype getOAIPMH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.OAIPMHtype target = null;
            target = (org.openarchives.www.oai._2_0.OAIPMHtype)get_store().find_element_user(OAIPMH$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OAI-PMH" element
     */
    public void setOAIPMH(org.openarchives.www.oai._2_0.OAIPMHtype oaipmh)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.OAIPMHtype target = null;
            target = (org.openarchives.www.oai._2_0.OAIPMHtype)get_store().find_element_user(OAIPMH$0, 0);
            if (target == null)
            {
                target = (org.openarchives.www.oai._2_0.OAIPMHtype)get_store().add_element_user(OAIPMH$0);
            }
            target.set(oaipmh);
        }
    }
    
    /**
     * Appends and returns a new empty "OAI-PMH" element
     */
    public org.openarchives.www.oai._2_0.OAIPMHtype addNewOAIPMH()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.OAIPMHtype target = null;
            target = (org.openarchives.www.oai._2_0.OAIPMHtype)get_store().add_element_user(OAIPMH$0);
            return target;
        }
    }
}
