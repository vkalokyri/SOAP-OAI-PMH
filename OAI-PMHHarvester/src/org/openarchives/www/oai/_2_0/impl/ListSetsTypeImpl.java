/*
 * XML Type:  ListSetsType
 * Namespace: http://www.openarchives.org/OAI/2.0/
 * Java type: org.openarchives.www.oai._2_0.ListSetsType
 *
 * Automatically generated - do not modify.
 */
package org.openarchives.www.oai._2_0.impl;
/**
 * An XML ListSetsType(@http://www.openarchives.org/OAI/2.0/).
 *
 * This is a complex type.
 */
public class ListSetsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openarchives.www.oai._2_0.ListSetsType
{
    
    public ListSetsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SET$0 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/", "set");
    private static final javax.xml.namespace.QName RESUMPTIONTOKEN$2 = 
        new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/", "resumptionToken");
    
    
    /**
     * Gets array of all "set" elements
     */
    public org.openarchives.www.oai._2_0.SetType[] getSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SET$0, targetList);
            org.openarchives.www.oai._2_0.SetType[] result = new org.openarchives.www.oai._2_0.SetType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "set" element
     */
    public org.openarchives.www.oai._2_0.SetType getSetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.SetType target = null;
            target = (org.openarchives.www.oai._2_0.SetType)get_store().find_element_user(SET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "set" element
     */
    public int sizeOfSetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SET$0);
        }
    }
    
    /**
     * Sets array of all "set" element
     */
    public void setSetArray(org.openarchives.www.oai._2_0.SetType[] setArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(setArray, SET$0);
        }
    }
    
    /**
     * Sets ith "set" element
     */
    public void setSetArray(int i, org.openarchives.www.oai._2_0.SetType set)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.SetType target = null;
            target = (org.openarchives.www.oai._2_0.SetType)get_store().find_element_user(SET$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(set);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "set" element
     */
    public org.openarchives.www.oai._2_0.SetType insertNewSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.SetType target = null;
            target = (org.openarchives.www.oai._2_0.SetType)get_store().insert_element_user(SET$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "set" element
     */
    public org.openarchives.www.oai._2_0.SetType addNewSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.SetType target = null;
            target = (org.openarchives.www.oai._2_0.SetType)get_store().add_element_user(SET$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "set" element
     */
    public void removeSet(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SET$0, i);
        }
    }
    
    /**
     * Gets the "resumptionToken" element
     */
    public org.openarchives.www.oai._2_0.ResumptionTokenType getResumptionToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.ResumptionTokenType target = null;
            target = (org.openarchives.www.oai._2_0.ResumptionTokenType)get_store().find_element_user(RESUMPTIONTOKEN$2, 0);
            if (target == null)
            {
                return null;
            }
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
            return get_store().count_elements(RESUMPTIONTOKEN$2) != 0;
        }
    }
    
    /**
     * Sets the "resumptionToken" element
     */
    public void setResumptionToken(org.openarchives.www.oai._2_0.ResumptionTokenType resumptionToken)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.ResumptionTokenType target = null;
            target = (org.openarchives.www.oai._2_0.ResumptionTokenType)get_store().find_element_user(RESUMPTIONTOKEN$2, 0);
            if (target == null)
            {
                target = (org.openarchives.www.oai._2_0.ResumptionTokenType)get_store().add_element_user(RESUMPTIONTOKEN$2);
            }
            target.set(resumptionToken);
        }
    }
    
    /**
     * Appends and returns a new empty "resumptionToken" element
     */
    public org.openarchives.www.oai._2_0.ResumptionTokenType addNewResumptionToken()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openarchives.www.oai._2_0.ResumptionTokenType target = null;
            target = (org.openarchives.www.oai._2_0.ResumptionTokenType)get_store().add_element_user(RESUMPTIONTOKEN$2);
            return target;
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
            get_store().remove_element(RESUMPTIONTOKEN$2, 0);
        }
    }
}
