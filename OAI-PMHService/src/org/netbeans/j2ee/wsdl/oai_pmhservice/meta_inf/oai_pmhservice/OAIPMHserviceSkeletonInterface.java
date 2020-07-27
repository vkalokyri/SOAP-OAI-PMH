
/**
 * OAIPMHserviceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice;
    /**
     *  OAIPMHserviceSkeletonInterface java skeleton interface for the axisService
     */
    public interface OAIPMHserviceSkeletonInterface {
     
         
        /**
         * Auto generated method signature
         * 
                                    * @param getRecordRequest
             * @throws ErrorResp : 
         */

        
                public org.openarchives.www.oai._2_0.OAIPMHDocument getRecord
                (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument getRecordRequest
                 )
            throws ErrorResp;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listMetadataFormatsRequest
             * @throws ErrorResp : 
         */

        
                public org.openarchives.www.oai._2_0.OAIPMHDocument listMetadataFormats
                (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument listMetadataFormatsRequest
                 )
            throws ErrorResp;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listSetsRequest
             * @throws ErrorResp : 
         */

        
                public org.openarchives.www.oai._2_0.OAIPMHDocument listSets
                (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument listSetsRequest
                 )
            throws ErrorResp;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listIdentifiersRequest
             * @throws ErrorResp : 
         */

        
                public org.openarchives.www.oai._2_0.OAIPMHDocument listIdentifiers
                (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument listIdentifiersRequest
                 )
            throws ErrorResp;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param identifyRequest
             * @throws ErrorResp : 
         */

        
                public org.openarchives.www.oai._2_0.OAIPMHDocument identify
                (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument identifyRequest
                 )
            throws ErrorResp;
        
         
        /**
         * Auto generated method signature
         * 
                                    * @param listRecordsRequest
             * @throws ErrorResp : 
         */

        
                public org.openarchives.www.oai._2_0.OAIPMHDocument listRecords
                (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument listRecordsRequest
                 )
            throws ErrorResp;
        
         }
    