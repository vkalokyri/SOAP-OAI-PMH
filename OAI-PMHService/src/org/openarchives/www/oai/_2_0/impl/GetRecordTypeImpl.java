/*
 * XML Type:  GetRecordType
 * Namespace: http://www.openarchives.org/OAI/2.0/
 * Java type: org.openarchives.www.oai._2_0.GetRecordType
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.www.oai._2_0.impl;
/**
 * An XML GetRecordType(@http://www.openarchives.org/OAI/2.0/).
 *
 * This is a complex type.
 */
public class GetRecordTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openarchives.www.oai._2_0.GetRecordType
{
    
    public GetRecordTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECORD$0 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/", "record");
    
    
    /**
     * Gets the "record" element
     */
    public org.openarchives.www.oai._2_0.RecordType getRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.RecordType target = null;
            target = (org.openarchives.www.oai._2_0.RecordType)get_store().find_element_user(RECORD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "record" element
     */
    public void setRecord(org.openarchives.www.oai._2_0.RecordType record)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.RecordType target = null;
            target = (org.openarchives.www.oai._2_0.RecordType)get_store().find_element_user(RECORD$0, 0);
            if (target == null)
            {
                target = (org.openarchives.www.oai._2_0.RecordType)get_store().add_element_user(RECORD$0);
            }
            target.set(record);
        }
    }
    
    /**
     * Appends and returns a new empty "record" element
     */
    public org.openarchives.www.oai._2_0.RecordType addNewRecord()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.RecordType target = null;
            target = (org.openarchives.www.oai._2_0.RecordType)get_store().add_element_user(RECORD$0);
            return target;
        }
    }
}
