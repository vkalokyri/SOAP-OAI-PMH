/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice;

import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.axis2.AxisFault;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.ListIdentifiersRequest;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.ListRecordsRequest;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument;
import org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.ListSetsRequest;
import org.openarchives.www.oai._2_0.OAIPMHDocument;


/**
 *
 * @author suitcase
 */
public class XMLBeansClient {
    
     public static void main(java.lang.String args[]) throws AxisFault, RemoteException, ErrorResp, ParseException{

            System.out.println("XMLBeans OAI-PMH Service Client. Invoking Service...\n");
           // listMetadataFormats("1157b55f-ef0c-4891-8c06-4d0598670201");
        String str_date="2012-01-20";
        DateFormat formatter ; 
        Date date ; 
        formatter = new SimpleDateFormat("yyyy-mm-dd");
        date = (Date)formatter.parse(str_date); 
        Calendar from=Calendar.getInstance();
        from.setTime(date);
        
        str_date="2012-01-20";
        formatter = new SimpleDateFormat("yyyy-mm-dd");
        date = (Date)formatter.parse(str_date); 
        Calendar until=Calendar.getInstance();
        until.setTime(date);
            
        //listIdentifiers("myb", from, until, "04e071fa-3a43-41b7-b8cf-e669465f3691");
        //listIdentifiers("myb");
        //listIdentifiersWithResumptionToken("2ec14e0d-66dc-44d6-aa44-913d80507857");
        //listRecords("myb");
        //listRecords("myb", null, until);
        //listRecordsWithResumptionToken("f324d36e-0ca5-4aa7-b51c-16daf4515fd1");
        //getRecord("1157b55f-ef0c-4891-8c06-4d0598670201", "myb");
       // listSets("002cb1d1-46a2-4aaa-8adf-e0e34c7f38ff");
        listIdentifiers("dcterms");

    }
    
    public static void getRecord(String id, String metadataPrefix) throws AxisFault, RemoteException, ErrorResp{        
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        GetRecordRequestDocument get = GetRecordRequestDocument.Factory.newInstance();
        GetRecordRequestDocument.GetRecordRequest req = GetRecordRequestDocument.GetRecordRequest.Factory.newInstance();
        req.setIdentifier(id);
        req.setMetadataPrefix(metadataPrefix);
        get.setGetRecordRequest(req);
        OAIPMHDocument getResponse = stub.getRecord(get);
        System.out.print(getResponse);
    }
    
    public static void identify() throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        IdentifyRequestDocument identifyReq = IdentifyRequestDocument.Factory.newInstance();  
        identifyReq.addNewIdentifyRequest();
        OAIPMHDocument identifyResponse = stub.identify(identifyReq);
        System.out.println(identifyResponse);
    }
    
    public static void listMetadataFormats() throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListMetadataFormatsRequestDocument listMetaFormatsReq = ListMetadataFormatsRequestDocument.Factory.newInstance();  
        listMetaFormatsReq.addNewListMetadataFormatsRequest();
        OAIPMHDocument listMetaFormatsResponse = stub.listMetadataFormats(listMetaFormatsReq);
        System.out.println(listMetaFormatsResponse);
    }
    
    public static void listMetadataFormats(String id) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListMetadataFormatsRequestDocument listMetaFormatsReq = ListMetadataFormatsRequestDocument.Factory.newInstance();  
        listMetaFormatsReq.addNewListMetadataFormatsRequest().setIdentifier(id);
        OAIPMHDocument listMetaFormatsResponse = stub.listMetadataFormats(listMetaFormatsReq);
        System.out.println(listMetaFormatsResponse);
    }
    
    public static void listIdentifiers(String metadataPrefix) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListIdentifiersRequestDocument listIdsReq = ListIdentifiersRequestDocument.Factory.newInstance();  
        listIdsReq.addNewListIdentifiersRequest().setMetadataPrefix(metadataPrefix);
        OAIPMHDocument listIdsResponse = stub.listIdentifiers(listIdsReq);
        System.out.println(listIdsResponse);
    }
    
    public static void listIdentifiers(String metadataPrefix,Calendar from, Calendar until) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListIdentifiersRequestDocument listIdsReq = ListIdentifiersRequestDocument.Factory.newInstance();  
        ListIdentifiersRequest listIdentifiersReq = listIdsReq.addNewListIdentifiersRequest();
        listIdentifiersReq.setMetadataPrefix(metadataPrefix);
        listIdentifiersReq.setFrom(from);
        listIdentifiersReq.setUntil(until);
        OAIPMHDocument listIdsResponse = stub.listIdentifiers(listIdsReq);
        System.out.println(listIdsResponse);
    }
    
    public static void listIdentifiers(String metadataPrefix,Calendar from, Calendar until, String set) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListIdentifiersRequestDocument listIdsReq = ListIdentifiersRequestDocument.Factory.newInstance();  
        ListIdentifiersRequest listIdentifiersReq = listIdsReq.addNewListIdentifiersRequest();
        listIdentifiersReq.setMetadataPrefix(metadataPrefix);
        listIdentifiersReq.setFrom(from);
        listIdentifiersReq.setUntil(until);
        listIdentifiersReq.setSet(set);
        OAIPMHDocument listIdsResponse = stub.listIdentifiers(listIdsReq);
        System.out.println(listIdsResponse);
    }
     
     public static void listIdentifiersWithResumptionToken(String resumptionToken) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListIdentifiersRequestDocument listIdsReq = ListIdentifiersRequestDocument.Factory.newInstance();
        ListIdentifiersRequest a = listIdsReq.addNewListIdentifiersRequest();
        a.setResumptionToken(resumptionToken);
        OAIPMHDocument listIdsResponse = stub.listIdentifiers(listIdsReq);
        System.out.println(listIdsResponse);
    }
     
     public static void listRecords(String metadataPrefix) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListRecordsRequestDocument listRecordsReq = ListRecordsRequestDocument.Factory.newInstance();  
        listRecordsReq.addNewListRecordsRequest().setMetadataPrefix(metadataPrefix);
        OAIPMHDocument listRecordsResponse = stub.listRecords(listRecordsReq);
        System.out.println(listRecordsResponse);
    }
     
     public static void listRecords(String metadataPrefix, Calendar from, Calendar until) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListRecordsRequestDocument listRecordsReqDoc = ListRecordsRequestDocument.Factory.newInstance();  
        ListRecordsRequest listRecordsReq = listRecordsReqDoc.addNewListRecordsRequest();
        listRecordsReq.setMetadataPrefix(metadataPrefix);
        listRecordsReq.setFrom(from);
        listRecordsReq.setUntil(until);
        OAIPMHDocument listRecordsResponse = stub.listRecords(listRecordsReqDoc);
        System.out.println(listRecordsResponse);
    }
     
     public static void listRecords(String metadataPrefix, Calendar from, Calendar until, String set) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListRecordsRequestDocument listRecordsReqDoc = ListRecordsRequestDocument.Factory.newInstance();  
        ListRecordsRequest listRecordsReq = listRecordsReqDoc.addNewListRecordsRequest();
        listRecordsReq.setMetadataPrefix(metadataPrefix);
        listRecordsReq.setFrom(from);
        listRecordsReq.setUntil(until);
        listRecordsReq.setSet(set);
        OAIPMHDocument listRecordsResponse = stub.listRecords(listRecordsReqDoc);
        System.out.println(listRecordsResponse);
    }
     
     public static void listRecordsWithResumptionToken(String resumptionToken) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListRecordsRequestDocument listRecordsReq = ListRecordsRequestDocument.Factory.newInstance();  
        listRecordsReq.addNewListRecordsRequest().setResumptionToken(resumptionToken);
        OAIPMHDocument listRecordsResponse = stub.listRecords(listRecordsReq);
        System.out.println(listRecordsResponse);
    }
     
     public static void listSets() throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListSetsRequestDocument listSetsReq = ListSetsRequestDocument.Factory.newInstance();  
        ListSetsRequest listSets = listSetsReq.addNewListSetsRequest();
        OAIPMHDocument listSetsResponse = stub.listSets(listSetsReq);
        System.out.println(listSetsResponse);
     }
     
     public static void listSets(String resumptionToken) throws AxisFault, RemoteException, ErrorResp{
        OAIPMHserviceStub stub = new OAIPMHserviceStub();
        ListSetsRequestDocument listSetsReq = ListSetsRequestDocument.Factory.newInstance();  
        listSetsReq.addNewListSetsRequest().setResumptionToken(resumptionToken);
        OAIPMHDocument listSetsResponse = stub.listSets(listSetsReq);
        System.out.println(listSetsResponse);
    }
  
}
