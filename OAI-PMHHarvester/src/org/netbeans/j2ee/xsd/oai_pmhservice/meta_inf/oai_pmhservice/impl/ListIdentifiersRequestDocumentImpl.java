/*
 * An XML document type.
 * Localname: ListIdentifiersRequest
 * Namespace: http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice
 * Java type: org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument
 *
 * Automatically generated - do not modify.
 */
package org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.impl;
/**
 * A document containing one ListIdentifiersRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice) element.
 *
 * This is a complex type.
 */
public class ListIdentifiersRequestDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument
{
    
    public ListIdentifiersRequestDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LISTIDENTIFIERSREQUEST$0 = 
        new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "ListIdentifiersRequest");
    
    
    /**
     * Gets the "ListIdentifiersRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest getListIdentifiersRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest)get_store().find_element_user(LISTIDENTIFIERSREQUEST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ListIdentifiersRequest" element
     */
    public void setListIdentifiersRequest(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest listIdentifiersRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest)get_store().find_element_user(LISTIDENTIFIERSREQUEST$0, 0);
            if (target == null)
            {
                target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest)get_store().add_element_user(LISTIDENTIFIERSREQUEST$0);
            }
            target.set(listIdentifiersRequest);
        }
    }
    
    /**
     * Appends and returns a new empty "ListIdentifiersRequest" element
     */
    public org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest addNewListIdentifiersRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest target = null;
            target = (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest)get_store().add_element_user(LISTIDENTIFIERSREQUEST$0);
            return target;
        }
    }
    /**
     * An XML ListIdentifiersRequest(@http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice).
     *
     * This is a complex type.
     */
    public static class ListIdentifiersRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest
    {
        
        public ListIdentifiersRequestImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESUMPTIONTOKEN$0 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "resumptionToken");
        private static final javax.xml.namespace.QName FROM$2 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "from");
        private static final javax.xml.namespace.QName UNTIL$4 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "until");
        private static final javax.xml.namespace.QName METADATAPREFIX$6 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "metadataPrefix");
        private static final javax.xml.namespace.QName SET$8 = 
            new javax.xml.namespace.QName("http://j2ee.netbeans.org/xsd/OAI-PMHservice/META-INF/OAI-PMHservice", "set");
        
        
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
        
        /**
         * Gets the "from" element
         */
        public java.util.Calendar getFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROM$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "from" element
         */
        public org.openarchives.www.oai._2_0.UTCdatetimeType xgetFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.UTCdatetimeType target = null;
                target = (org.openarchives.www.oai._2_0.UTCdatetimeType)get_store().find_element_user(FROM$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "from" element
         */
        public boolean isSetFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FROM$2) != 0;
            }
        }
        
        /**
         * Sets the "from" element
         */
        public void setFrom(java.util.Calendar from)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROM$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROM$2);
                }
                target.setCalendarValue(from);
            }
        }
        
        /**
         * Sets (as xml) the "from" element
         */
        public void xsetFrom(org.openarchives.www.oai._2_0.UTCdatetimeType from)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.UTCdatetimeType target = null;
                target = (org.openarchives.www.oai._2_0.UTCdatetimeType)get_store().find_element_user(FROM$2, 0);
                if (target == null)
                {
                    target = (org.openarchives.www.oai._2_0.UTCdatetimeType)get_store().add_element_user(FROM$2);
                }
                target.set(from);
            }
        }
        
        /**
         * Unsets the "from" element
         */
        public void unsetFrom()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FROM$2, 0);
            }
        }
        
        /**
         * Gets the "until" element
         */
        public java.util.Calendar getUntil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNTIL$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "until" element
         */
        public org.openarchives.www.oai._2_0.UTCdatetimeType xgetUntil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.UTCdatetimeType target = null;
                target = (org.openarchives.www.oai._2_0.UTCdatetimeType)get_store().find_element_user(UNTIL$4, 0);
                return target;
            }
        }
        
        /**
         * True if has "until" element
         */
        public boolean isSetUntil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UNTIL$4) != 0;
            }
        }
        
        /**
         * Sets the "until" element
         */
        public void setUntil(java.util.Calendar until)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNTIL$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNTIL$4);
                }
                target.setCalendarValue(until);
            }
        }
        
        /**
         * Sets (as xml) the "until" element
         */
        public void xsetUntil(org.openarchives.www.oai._2_0.UTCdatetimeType until)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.UTCdatetimeType target = null;
                target = (org.openarchives.www.oai._2_0.UTCdatetimeType)get_store().find_element_user(UNTIL$4, 0);
                if (target == null)
                {
                    target = (org.openarchives.www.oai._2_0.UTCdatetimeType)get_store().add_element_user(UNTIL$4);
                }
                target.set(until);
            }
        }
        
        /**
         * Unsets the "until" element
         */
        public void unsetUntil()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UNTIL$4, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAPREFIX$6, 0);
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
        public org.openarchives.www.oai._2_0.MetadataPrefixType xgetMetadataPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.MetadataPrefixType target = null;
                target = (org.openarchives.www.oai._2_0.MetadataPrefixType)get_store().find_element_user(METADATAPREFIX$6, 0);
                return target;
            }
        }
        
        /**
         * True if has "metadataPrefix" element
         */
        public boolean isSetMetadataPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(METADATAPREFIX$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(METADATAPREFIX$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(METADATAPREFIX$6);
                }
                target.setStringValue(metadataPrefix);
            }
        }
        
        /**
         * Sets (as xml) the "metadataPrefix" element
         */
        public void xsetMetadataPrefix(org.openarchives.www.oai._2_0.MetadataPrefixType metadataPrefix)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.MetadataPrefixType target = null;
                target = (org.openarchives.www.oai._2_0.MetadataPrefixType)get_store().find_element_user(METADATAPREFIX$6, 0);
                if (target == null)
                {
                    target = (org.openarchives.www.oai._2_0.MetadataPrefixType)get_store().add_element_user(METADATAPREFIX$6);
                }
                target.set(metadataPrefix);
            }
        }
        
        /**
         * Unsets the "metadataPrefix" element
         */
        public void unsetMetadataPrefix()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(METADATAPREFIX$6, 0);
            }
        }
        
        /**
         * Gets the "set" element
         */
        public java.lang.String getSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SET$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "set" element
         */
        public org.openarchives.www.oai._2_0.SetSpecType xgetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.SetSpecType target = null;
                target = (org.openarchives.www.oai._2_0.SetSpecType)get_store().find_element_user(SET$8, 0);
                return target;
            }
        }
        
        /**
         * True if has "set" element
         */
        public boolean isSetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(SET$8) != 0;
            }
        }
        
        /**
         * Sets the "set" element
         */
        public void setSet(java.lang.String set)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SET$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SET$8);
                }
                target.setStringValue(set);
            }
        }
        
        /**
         * Sets (as xml) the "set" element
         */
        public void xsetSet(org.openarchives.www.oai._2_0.SetSpecType set)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.openarchives.www.oai._2_0.SetSpecType target = null;
                target = (org.openarchives.www.oai._2_0.SetSpecType)get_store().find_element_user(SET$8, 0);
                if (target == null)
                {
                    target = (org.openarchives.www.oai._2_0.SetSpecType)get_store().add_element_user(SET$8);
                }
                target.set(set);
            }
        }
        
        /**
         * Unsets the "set" element
         */
        public void unsetSet()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(SET$8, 0);
            }
        }
    }
}
