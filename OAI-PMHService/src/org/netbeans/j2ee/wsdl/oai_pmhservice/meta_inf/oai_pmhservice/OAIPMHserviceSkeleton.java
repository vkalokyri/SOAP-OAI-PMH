
/**
 * OAIPMHserviceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
    package org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice;

import dao.DAOFactory;
import java.math.BigInteger;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import org.netbeans.xml.schema.myBookListSchema.BookListDocument.BookList;
import org.netbeans.xml.schema.myBookListSchema.CollectionListDocument.CollectionList;
import org.netbeans.xml.schema.myBookListSchema.HeaderInfo;
import org.netbeans.xml.schema.myBookSchema.CollectionDocument;
import org.openarchives.www.oai._2_0.DeletedRecordType;
import org.openarchives.www.oai._2_0.GetRecordType;
import org.openarchives.www.oai._2_0.GranularityType;
import org.openarchives.www.oai._2_0.HeaderType;
import org.openarchives.www.oai._2_0.IdentifyType;
import org.openarchives.www.oai._2_0.ListIdentifiersType;
import org.openarchives.www.oai._2_0.ListMetadataFormatsType;
import org.openarchives.www.oai._2_0.ListRecordsType;
import org.openarchives.www.oai._2_0.ListSetsType;
import org.openarchives.www.oai._2_0.MetadataFormatType;
import org.openarchives.www.oai._2_0.MetadataType;
import org.openarchives.www.oai._2_0.OAIPMHDocument;
import org.openarchives.www.oai._2_0.OAIPMHerrorType;
import org.openarchives.www.oai._2_0.OAIPMHerrorcodeType;
import org.openarchives.www.oai._2_0.OAIPMHtype;
import org.openarchives.www.oai._2_0.ProtocolVersionType;
import org.openarchives.www.oai._2_0.RecordType;
import org.openarchives.www.oai._2_0.RequestType;
import org.openarchives.www.oai._2_0.ResumptionTokenType;
import org.openarchives.www.oai._2_0.SetType;
import org.openarchives.www.oai._2_0.StatusType;
import org.openarchives.www.oai._2_0.VerbType;

    /**
     *  OAIPMHserviceSkeleton java skeleton for the axisService
     */
    public class OAIPMHserviceSkeleton implements OAIPMHserviceSkeletonInterface{
        
        static HashMap resumptionTokenHash = new HashMap();
        static HashMap cursorHash = new HashMap();
        static HashMap completedListHash = new HashMap();
        int returnedItems = 3;
        /**
         * Auto generated method signature
         * 
                                     * @param getRecordRequest5 
             * @return oAIPMH6 
             * @throws ErrorResp 
         */
        
                 public org.openarchives.www.oai._2_0.OAIPMHDocument getRecord
                  (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument getRecordRequest5
                  )
            throws ErrorResp{
                //Read input arguments
                String recordID = getRecordRequest5.getGetRecordRequest().getIdentifier();    
                String metadataPrefix = getRecordRequest5.getGetRecordRequest().getMetadataPrefix(); 
                
                OAIPMHDocument oaiResponse = OAIPMHDocument.Factory.newInstance();
                OAIPMHtype oaiType = oaiResponse.addNewOAIPMH();
                oaiType.setResponseDate(Calendar.getInstance());
                RequestType request = RequestType.Factory.newInstance();
                request.setVerb(VerbType.GET_RECORD);
                request.setIdentifier(recordID);
                request.setMetadataPrefix(metadataPrefix);
                oaiType.setRequest(request);
                
                if(recordID == null || metadataPrefix == null){                
                    OAIPMHerrorType errorType =  oaiType.addNewError();
                    errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                    errorType.setStringValue("The request is missing required arguments.");
                }else if(recordID.equals("") || metadataPrefix.equals("")){
                    OAIPMHerrorType errorType =  oaiType.addNewError();
                    errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                    errorType.setStringValue("The request includes illegal arguments.");
                }else if(!metadataPrefix.equals("dc") && !metadataPrefix.equals("myb") && !metadataPrefix.equals("dcterms")){
                    OAIPMHerrorType errorType =  oaiType.addNewError();
                    errorType.setCode(OAIPMHerrorcodeType.CANNOT_DISSEMINATE_FORMAT);
                    errorType.setStringValue("The value of the metadataPrefix argument is not supported by the item identified by the value of the identifier argument.");
                }else{
                    GetRecordType getRecordType = oaiType.addNewGetRecord();
                    HeaderInfo header = DAOFactory.getDAOFactory(DAOFactory.EXIST).getBookDAO().getBookHeader(recordID);                     
                    if (header == null){
                       OAIPMHerrorType errorType =  oaiType.addNewError();
                       errorType.setCode(OAIPMHerrorcodeType.ID_DOES_NOT_EXIST);
                       errorType.setStringValue("The value of the identifier argument is unknown or illegal in this repository.");
                    }else{
                        RecordType record = getRecordType.addNewRecord();
                        HeaderType headerType = record.addNewHeader();
                        headerType.setIdentifier(recordID);
                        headerType.setDatestamp(header.getLastModified().getDate());
                        if(header.getStatus().equals("DELETED")){
                            headerType.setStatus(StatusType.DELETED);
                        }else{
                            MetadataType metadata= record.addNewMetadata();
                            if(metadataPrefix.equals("dc")){
                                System.out.println("GETRECORD = " +DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(recordID,"dc"));
                                metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(recordID,"dc"));        
                            }else if(metadataPrefix.equals("dcterms")){
                                System.out.println("GETRECORD = " +DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(recordID,"dcterms"));
                                metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(recordID,"dcterms"));            
                            }else{
                                metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBook(recordID));        
                            }
                        }
                    }
                }                
                return oaiResponse;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param listMetadataFormatsRequest7 
             * @return oAIPMH8 
             * @throws ErrorResp 
         */
        
                 public org.openarchives.www.oai._2_0.OAIPMHDocument listMetadataFormats
                  (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument listMetadataFormatsRequest7
                  )
            throws ErrorResp{
                 String recordID = listMetadataFormatsRequest7.getListMetadataFormatsRequest().getIdentifier();    
                     
                OAIPMHDocument listMetadataFormatsResponseDoc = OAIPMHDocument.Factory.newInstance();
                OAIPMHtype oaiType = listMetadataFormatsResponseDoc.addNewOAIPMH();
                oaiType.setResponseDate(Calendar.getInstance());
                RequestType request = RequestType.Factory.newInstance();
                request.setVerb(VerbType.LIST_METADATA_FORMATS);
                oaiType.setRequest(request);
                if(recordID != null){ 
                    if(recordID.equals("")){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                        errorType.setStringValue("The request includes illegal arguments.");
                        return listMetadataFormatsResponseDoc;
                    }else{
                        HeaderInfo header = DAOFactory.getDAOFactory(DAOFactory.EXIST).getBookDAO().getBookHeader(recordID);                     
                        if (header == null){
                           OAIPMHerrorType errorType =  oaiType.addNewError();
                           errorType.setCode(OAIPMHerrorcodeType.ID_DOES_NOT_EXIST);
                           errorType.setStringValue("The value of the identifier argument is unknown or illegal in this repository.");
                           return listMetadataFormatsResponseDoc;
                        }
                    }
                }
                ListMetadataFormatsType metadataFormatType= oaiType.addNewListMetadataFormats();
                MetadataFormatType metadataFormat = metadataFormatType.addNewMetadataFormat();
                metadataFormat.setMetadataPrefix("dc");
                metadataFormat.setSchema("http://dublincore.org/schemas/xmls/qdc/2003/04/02/dc.xsd");
                metadataFormat.setMetadataNamespace("http://purl.org/dc/elements/1.1/");
                MetadataFormatType dctermsMetadataFormat = metadataFormatType.addNewMetadataFormat();
                dctermsMetadataFormat.setMetadataPrefix("dcterms");
                dctermsMetadataFormat.setSchema("http://dublincore.org/schemas/xmls/qdc/dcterms.xsd");
                dctermsMetadataFormat.setMetadataNamespace("http://purl.org/dc/terms/");
                MetadataFormatType dcMetadataFormat = metadataFormatType.addNewMetadataFormat();
                dcMetadataFormat.setMetadataPrefix("myb");
                dcMetadataFormat.setSchema("http://xml.netbeans.org/schema/MyBookSchema.xsd");
                dcMetadataFormat.setMetadataNamespace("http://xml.netbeans.org/schema/MyBookSchema/");                    
                
                
                return listMetadataFormatsResponseDoc;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param listSetsRequest9 
             * @return oAIPMH10 
             * @throws ErrorResp 
         */
        
                 public org.openarchives.www.oai._2_0.OAIPMHDocument listSets
                  (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument listSetsRequest9
                  )
            throws ErrorResp{
                String resumptionToken = listSetsRequest9.getListSetsRequest().getResumptionToken();
                OAIPMHDocument OAIPMHDoc = OAIPMHDocument.Factory.newInstance();
                OAIPMHtype oaiType = OAIPMHDoc.addNewOAIPMH();
                oaiType.setResponseDate(Calendar.getInstance());
                RequestType request = RequestType.Factory.newInstance();
                request.setVerb(VerbType.LIST_SETS);
                oaiType.setRequest(request);
                
                ListSetsType listSetsType = oaiType.addNewListSets();
                CollectionList collectionList = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getAllCollections();
               if(resumptionToken==null){
                   if(collectionList==null){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.NO_SET_HIERARCHY);
                        errorType.setStringValue("The repository does not support sets.");
                        return OAIPMHDoc;
                    }else if(collectionList.sizeOfCollectionArray()==0){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.NO_SET_HIERARCHY);
                        errorType.setStringValue("The repository does not support sets.");
                        return OAIPMHDoc;
                    }
                    if(collectionList.sizeOfCollectionArray()>returnedItems){
                        for(int i=0;i<returnedItems;i++){
                            HeaderInfo collHeader = collectionList.getCollectionArray(i).getHeader();
                            SetType set = listSetsType.addNewSet();                            
                            set.setSetSpec(collHeader.getId());
                            set.setSetName(collectionList.getCollectionArray(i).getMetadata().getTitleArray(0).getStringValue());
                        }
                        CollectionList remainingList = CollectionList.Factory.newInstance();
                        for(int i=returnedItems; i<collectionList.sizeOfCollectionArray(); i++){
                             remainingList.addNewCollection().set(collectionList.getCollectionArray(i));
                        }                        
                        String resTokenID = UUID.randomUUID().toString();
                        completedListHash.put(resTokenID, collectionList.sizeOfCollectionArray());
                        cursorHash.put(resTokenID, returnedItems);
                        resumptionTokenHash.put(resTokenID, remainingList);
                        ResumptionTokenType resToken = listSetsType.addNewResumptionToken();
                        resToken.setStringValue(resTokenID);
                        resToken.setCompleteListSize(BigInteger.valueOf(collectionList.sizeOfCollectionArray()));
                        resToken.setCursor(BigInteger.ZERO);
                   }else{
                        for(int i=0;i<collectionList.sizeOfCollectionArray();i++){
                            HeaderInfo collHeader = collectionList.getCollectionArray(i).getHeader();
                            SetType set = listSetsType.addNewSet();                            
                            set.setSetSpec(collHeader.getId());
                            set.setSetName(collectionList.getCollectionArray(i).getMetadata().getTitleArray(0).getStringValue());
                        }
                    }
                }else{
                    if(resumptionTokenHash.containsKey(resumptionToken)){
                        System.out.println("Yparxei sto hash");
                        CollectionList hashList = ((CollectionList)resumptionTokenHash.get(resumptionToken));
                        System.out.println("size" + hashList.sizeOfCollectionArray());
                        if(hashList.sizeOfCollectionArray()>returnedItems){
                            for(int i=0;i<returnedItems;i++){
                                HeaderInfo collHeader = hashList.getCollectionArray(i).getHeader();
                                SetType set = listSetsType.addNewSet();                            
                                set.setSetSpec(collHeader.getId());
                                set.setSetName(hashList.getCollectionArray(i).getMetadata().getTitleArray(0).getStringValue());
                            }
                            CollectionList remainingList = CollectionList.Factory.newInstance();
                            for(int i=returnedItems; i<hashList.sizeOfCollectionArray(); i++){
                                 remainingList.addNewCollection().set(hashList.getCollectionArray(i));
                            }
                            String resTokenID = UUID.randomUUID().toString();
                            resumptionTokenHash.put(resTokenID, remainingList);                   
                            int newCursor = ((Integer)cursorHash.get(resumptionToken)) + returnedItems;
                            cursorHash.put(resTokenID,newCursor);
                            completedListHash.put(resTokenID, completedListHash.get(resumptionToken));
                            ResumptionTokenType resToken = listSetsType.addNewResumptionToken();
                            resToken.setStringValue(resTokenID);
                            resToken.setCompleteListSize(BigInteger.valueOf(((Integer)completedListHash.get(resumptionToken))));
                            BigInteger cursor = BigInteger.valueOf(((Integer)cursorHash.get(resumptionToken)));
                            resToken.setCursor(cursor);
                        }else{
                            for(int i=0;i<hashList.sizeOfCollectionArray();i++){
                                HeaderInfo collHeader = hashList.getCollectionArray(i).getHeader();
                                SetType set = listSetsType.addNewSet();
                                set.setSetSpec(collHeader.getId());
                                set.setSetName(hashList.getCollectionArray(i).getMetadata().getTitleArray(0).getStringValue());
                            }
                            ResumptionTokenType resToken = listSetsType.addNewResumptionToken();
                            resToken.setCompleteListSize(BigInteger.valueOf(((Integer)completedListHash.get(resumptionToken))));
                            BigInteger cursor = BigInteger.valueOf(((Integer)cursorHash.get(resumptionToken)));
                            resToken.setCursor(cursor);
                        }
                    }else{
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_RESUMPTION_TOKEN);
                        errorType.setStringValue("The value of the resumptionToken argument is invalid.");
                        return OAIPMHDoc;
                    }
                }  
                
                return OAIPMHDoc;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param listIdentifiersRequest11 
             * @return oAIPMH12 
             * @throws ErrorResp 
         */
        
                 public org.openarchives.www.oai._2_0.OAIPMHDocument listIdentifiers
                  (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument listIdentifiersRequest11
                  )
            throws ErrorResp{
                
                String metadataPrefix = listIdentifiersRequest11.getListIdentifiersRequest().getMetadataPrefix();    
                Calendar from = listIdentifiersRequest11.getListIdentifiersRequest().getFrom();
                Calendar until = listIdentifiersRequest11.getListIdentifiersRequest().getUntil();
                String set = listIdentifiersRequest11.getListIdentifiersRequest().getSet();
                String resumptionToken = listIdentifiersRequest11.getListIdentifiersRequest().getResumptionToken();
                
                OAIPMHDocument listIdentifiersResponseDoc = OAIPMHDocument.Factory.newInstance();            
                OAIPMHtype oaiType =  listIdentifiersResponseDoc.addNewOAIPMH();
                oaiType.setResponseDate(Calendar.getInstance());
                RequestType request = RequestType.Factory.newInstance();
                request.setVerb(VerbType.LIST_IDENTIFIERS);                
                
                ListIdentifiersType listIdentifiersType = oaiType.addNewListIdentifiers();
                BookList bookList = null;


               if(resumptionToken==null){
                    if(from!=null) 
                        request.setFrom(from);
                    if(until!=null) 
                        request.setUntil(until);
                    if(set!=null) 
                        request.setSet(set);
                    if(resumptionToken!=null) 
                        request.setResumptionToken(resumptionToken);
                    if(metadataPrefix!=null){ 
                        request.setMetadataPrefix(metadataPrefix);
                    }else{
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                        errorType.setStringValue("The request is missing required arguments.");
                        return listIdentifiersResponseDoc;
                    }
                        
                    oaiType.setRequest(request);
                    if (!metadataPrefix.equals("dc") && !metadataPrefix.equals("myb") && !metadataPrefix.equals("dcterms")){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.CANNOT_DISSEMINATE_FORMAT);
                        errorType.setStringValue("The value of the metadataPrefix argument is not supported by the repository.");
                        return listIdentifiersResponseDoc;
                    }
                    if(set==null) {
                         bookList = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getAllBooks(from, until);
                    }else if(set.equals("")) {
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                        errorType.setStringValue("The request includes illegal arguments.");
                        return listIdentifiersResponseDoc;
                    }else{
                             bookList = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getAllBooks(from, until, set);
                       
                    }

                    if(bookList==null){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.NO_RECORDS_MATCH);
                        errorType.setStringValue("The combination of the values of the from, until, and set arguments results in an empty list.");
                        return listIdentifiersResponseDoc;
                    }else if(bookList.sizeOfBookArray()==0){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.NO_RECORDS_MATCH);
                        errorType.setStringValue("The combination of the values of the from, until, and set arguments results in an empty list.");
                        return listIdentifiersResponseDoc;
                    }
                    if(bookList.sizeOfBookArray()>returnedItems){
                        for(int i=0;i<returnedItems;i++){
                            HeaderInfo bookHeader = bookList.getBookArray(i).getHeader();
                            HeaderType header = listIdentifiersType.addNewHeader();
                            if(bookHeader.getStatus().equals("DELETED"))
                                header.setStatus(StatusType.DELETED);
                            header.setDatestamp(bookHeader.getLastModified().getDate());
                            header.setIdentifier(bookHeader.getId());
                            CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                            header.addSetSpec(coll.getCollection().getHeader().getId());
                            header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                        }
                        BookList remainingList = BookList.Factory.newInstance();
                        for(int i=returnedItems; i<bookList.sizeOfBookArray(); i++){
                             remainingList.addNewBook().set(bookList.getBookArray(i));
                        }                        
                        String resTokenID = UUID.randomUUID().toString();
                        completedListHash.put(resTokenID, bookList.sizeOfBookArray());
                        cursorHash.put(resTokenID, returnedItems);
                        resumptionTokenHash.put(resTokenID, remainingList);
                        ResumptionTokenType resToken = listIdentifiersType.addNewResumptionToken();
                        resToken.setStringValue(resTokenID);
                        resToken.setCompleteListSize(BigInteger.valueOf(bookList.sizeOfBookArray()));
                        resToken.setCursor(BigInteger.ZERO);
                   }else{
                        for(int i=0;i<bookList.sizeOfBookArray();i++){
                            HeaderInfo bookHeader = bookList.getBookArray(i).getHeader();
                            HeaderType header = listIdentifiersType.addNewHeader();
                            if(bookHeader.getStatus().equals("DELETED"))
                                header.setStatus(StatusType.DELETED);
                            header.setDatestamp(bookHeader.getLastModified().getDate());
                            header.setIdentifier(bookHeader.getId());
                            CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                            header.addSetSpec(coll.getCollection().getHeader().getId());
                            header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                        }
                    }
                }else{
                   if(from!=null || until!=null || set!=null || metadataPrefix!=null) {
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                        errorType.setStringValue("Resumption token is an exlusive argument.");
                        return listIdentifiersResponseDoc;
                    }
                    if(resumptionTokenHash.containsKey(resumptionToken)){
                        System.out.println("Yparxei sto hash");
                        BookList hashList = ((BookList)resumptionTokenHash.get(resumptionToken));
                        if(hashList.sizeOfBookArray()>returnedItems){
                            for(int i=0;i<returnedItems;i++){
                                HeaderInfo bookHeader = hashList.getBookArray(i).getHeader();
                                HeaderType header = listIdentifiersType.addNewHeader();
                                if(bookHeader.getStatus().equals("DELETED"))
                                    header.setStatus(StatusType.DELETED);
                                header.setDatestamp(bookHeader.getLastModified().getDate());
                                header.setIdentifier(bookHeader.getId());
                                CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                                header.addSetSpec(coll.getCollection().getHeader().getId());
                                header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                            }
                            BookList remainingList = BookList.Factory.newInstance();
                            for(int i=returnedItems; i<hashList.sizeOfBookArray(); i++){
                                 remainingList.addNewBook().set(hashList.getBookArray(i));
                            }
                            String resTokenID = UUID.randomUUID().toString();
                            resumptionTokenHash.put(resTokenID, remainingList);                   
                            int newCursor = ((Integer)cursorHash.get(resumptionToken)) + returnedItems;
                            cursorHash.put(resTokenID,newCursor);
                            completedListHash.put(resTokenID, completedListHash.get(resumptionToken));
                            ResumptionTokenType resToken = listIdentifiersType.addNewResumptionToken();
                            resToken.setStringValue(resTokenID);
                            resToken.setCompleteListSize(BigInteger.valueOf(((Integer)completedListHash.get(resumptionToken))));
                            BigInteger cursor = BigInteger.valueOf(((Integer)cursorHash.get(resumptionToken)));
                            resToken.setCursor(cursor);
                        }else{
                            for(int i=0;i<hashList.sizeOfBookArray();i++){
                                HeaderInfo bookHeader = hashList.getBookArray(i).getHeader();
                                HeaderType header = listIdentifiersType.addNewHeader();
                                if(bookHeader.getStatus().equals("DELETED"))
                                    header.setStatus(StatusType.DELETED);
                                header.setDatestamp(bookHeader.getLastModified().getDate());
                                header.setIdentifier(bookHeader.getId());
                                CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                                header.addSetSpec(coll.getCollection().getHeader().getId());
                                header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                            }
                            ResumptionTokenType resToken = listIdentifiersType.addNewResumptionToken();
                            resToken.setCompleteListSize(BigInteger.valueOf(((Integer)completedListHash.get(resumptionToken))));
                            BigInteger cursor = BigInteger.valueOf(((Integer)cursorHash.get(resumptionToken)));
                            resToken.setCursor(cursor);
                        }
                    }else{
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_RESUMPTION_TOKEN);
                        errorType.setStringValue("The value of the resumptionToken argument is invalid.");
                        return listIdentifiersResponseDoc;
                    }
                }  
                
                return listIdentifiersResponseDoc;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param identifyRequest13 
             * @return oAIPMH14 
             * @throws ErrorResp 
         */
        
                 public org.openarchives.www.oai._2_0.OAIPMHDocument identify
                  (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument identifyRequest13
                  )
            throws ErrorResp{
                OAIPMHDocument identifyResponseDoc = OAIPMHDocument.Factory.newInstance();
                OAIPMHtype oaiType = identifyResponseDoc.addNewOAIPMH();
                oaiType.setResponseDate(Calendar.getInstance());
                RequestType request = RequestType.Factory.newInstance();
                request.setVerb(VerbType.IDENTIFY);
                oaiType.setRequest(request);
                if(!identifyRequest13.getIdentifyRequest().isNil()){ 
                    IdentifyType identify = oaiType.addNewIdentify();
                    identify.setRepositoryName("eXistDB_BookStoreRepository");
                    identify.setBaseURL("http://localhost:8081/exist");
                    identify.setProtocolVersion(ProtocolVersionType.X_2_0);
                    identify.setEarliestDatestamp(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getEarliestDatestamp());
                    identify.setDeletedRecord(DeletedRecordType.PERSISTENT);
                    identify.setGranularity(GranularityType.YYYY_MM_DD_THH_MM_SS_Z);
                    identify.addAdminEmail("vkalokyri@isc.tuc.gr");
                }else{
                    OAIPMHerrorType errorType =  oaiType.addNewError();
                    errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                    errorType.setStringValue("The request includes illegal arguments.");
                }
                
                return identifyResponseDoc;
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param listRecordsRequest15 
             * @return oAIPMH16 
             * @throws ErrorResp 
         */
        
                 public org.openarchives.www.oai._2_0.OAIPMHDocument listRecords
                  (
                  org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument listRecordsRequest15
                  )
            throws ErrorResp{
                String metadataPrefix = listRecordsRequest15.getListRecordsRequest().getMetadataPrefix();    
                Calendar from = listRecordsRequest15.getListRecordsRequest().getFrom();
                Calendar until = listRecordsRequest15.getListRecordsRequest().getUntil();
                String set = listRecordsRequest15.getListRecordsRequest().getSet();
                String resumptionToken = listRecordsRequest15.getListRecordsRequest().getResumptionToken();
                
                OAIPMHDocument listRecordsResponseDoc = OAIPMHDocument.Factory.newInstance();               
                OAIPMHtype oaiType =  listRecordsResponseDoc.addNewOAIPMH();
                oaiType.setResponseDate(Calendar.getInstance());
                RequestType request = RequestType.Factory.newInstance();
                request.setVerb(VerbType.LIST_RECORDS);
                
                oaiType.setRequest(request);
                
                ListRecordsType listRecordsType = oaiType.addNewListRecords();
                BookList bookList = null;
                
                if(resumptionToken==null){
                    if(from!=null) 
                        request.setFrom(from);
                    if(until!=null) 
                        request.setUntil(until);
                    if(set!=null) 
                        request.setSet(set);
                     if(metadataPrefix!=null){ 
                        request.setMetadataPrefix(metadataPrefix);
                    }else{
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                        errorType.setStringValue("The request is missing required arguments.");
                        return listRecordsResponseDoc;
                    }
                    
                    if (!metadataPrefix.equals("dc") && !metadataPrefix.equals("myb") && !metadataPrefix.equals("dcterms")){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.CANNOT_DISSEMINATE_FORMAT);
                        errorType.setStringValue("The value of the metadataPrefix argument is not supported by the repository.");
                        return listRecordsResponseDoc;
                    }
                    if(set==null) {   
                        if(metadataPrefix.equals("myb")){
                             bookList = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getAllBooks(from, until);
                        }else{
                            System.out.println("getrecords = " +DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getAllBooksInDCFormat(from, until, metadataPrefix));
                             bookList = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getAllBooksInDCFormat(from, until, metadataPrefix);
                        }
                       
                    }else if(set.equals("")) {
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                        errorType.setStringValue("The request includes illegal arguments.");
                        return listRecordsResponseDoc;
                    }else{
                        if(metadataPrefix.equals("myb")){
                              bookList = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getAllBooks(from, until, set);
                        }else{
                             bookList = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getAllBooksInDCFormat(from, until, set, metadataPrefix);
                        }
                       
                    }

                    if(bookList==null){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.NO_RECORDS_MATCH);
                        errorType.setStringValue("The combination of the values of the from, until, set and metadataPrefix arguments results in an empty list.");
                        return listRecordsResponseDoc;
                    }else if(bookList.sizeOfBookArray()==0){
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.NO_RECORDS_MATCH);
                        errorType.setStringValue("The combination of the values of the from, until, set and metadataPrefix arguments results in an empty list.");
                        return listRecordsResponseDoc;
                    }
                    if(bookList.sizeOfBookArray()>returnedItems){
                        for(int i=0;i<returnedItems;i++){
                            HeaderInfo bookHeader = bookList.getBookArray(i).getHeader();
                            RecordType record= listRecordsType.addNewRecord();
                            HeaderType header = record.addNewHeader();                            
                            header.setDatestamp(bookHeader.getLastModified().getDate());
                            header.setIdentifier(bookHeader.getId());
                            CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                            header.addSetSpec(coll.getCollection().getHeader().getId());
                            header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                            if(bookHeader.getStatus().equals("DELETED")){
                                header.setStatus(StatusType.DELETED);
                            }else{
                                MetadataType metadata= record.addNewMetadata();
                                 if(metadataPrefix.equals("myb")){
                                      metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBook(bookHeader.getId()));         
                                }else{
                                     metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(bookHeader.getId(), metadataPrefix));         
                                }                                  
                            }
                        }
                        BookList remainingList = BookList.Factory.newInstance();
                        for(int i=returnedItems; i<bookList.sizeOfBookArray(); i++){
                             remainingList.addNewBook().set(bookList.getBookArray(i));
                        }                        
                        String resTokenID = UUID.randomUUID().toString();
                        completedListHash.put(resTokenID, bookList.sizeOfBookArray());
                        cursorHash.put(resTokenID, returnedItems);
                        resumptionTokenHash.put(resTokenID, remainingList);
                        ResumptionTokenType resToken = listRecordsType.addNewResumptionToken();
                        resToken.setStringValue(resTokenID);
                        resToken.setCompleteListSize(BigInteger.valueOf(bookList.sizeOfBookArray()));
                        resToken.setCursor(BigInteger.ZERO);
                   }else{
                        for(int i=0;i<bookList.sizeOfBookArray();i++){
                            HeaderInfo bookHeader = bookList.getBookArray(i).getHeader();
                            RecordType record= listRecordsType.addNewRecord();
                            HeaderType header = record.addNewHeader();
                            header.setDatestamp(bookHeader.getLastModified().getDate());
                            header.setIdentifier(bookHeader.getId());
                            CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                            header.addSetSpec(coll.getCollection().getHeader().getId());
                            header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                            if(bookHeader.getStatus().equals("DELETED")){
                                header.setStatus(StatusType.DELETED);
                            }else{
                                MetadataType metadata= record.addNewMetadata();
                                if(metadataPrefix.equals("myb")){
                                      metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBook(bookHeader.getId()));         
                                }else{
                                     metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(bookHeader.getId(), metadataPrefix));         
                                } 
                            }
                        }
                    }
                }else{
                    if(from!=null || until!=null || set!=null || metadataPrefix!=null) {
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_ARGUMENT);
                        errorType.setStringValue("Resumption token is an exlusive argument.");
                        return listRecordsResponseDoc;
                    }

                    request.setResumptionToken(resumptionToken);
                    if(resumptionTokenHash.containsKey(resumptionToken)){
                        BookList hashList = ((BookList)resumptionTokenHash.get(resumptionToken));
                        System.out.println("size" + hashList.sizeOfBookArray());
                        if(hashList.sizeOfBookArray()>returnedItems){
                            for(int i=0;i<returnedItems;i++){
                                HeaderInfo bookHeader = hashList.getBookArray(i).getHeader();
                                RecordType record= listRecordsType.addNewRecord();
                                HeaderType header = record.addNewHeader();
                                header.setDatestamp(bookHeader.getLastModified().getDate());
                                header.setIdentifier(bookHeader.getId());
                                CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                                header.addSetSpec(coll.getCollection().getHeader().getId());
                                header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                                if(bookHeader.getStatus().equals("DELETED")){
                                    header.setStatus(StatusType.DELETED);
                                }else{
                                    MetadataType metadata= record.addNewMetadata();
                                    if(metadataPrefix.equals("myb")){
                                      metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBook(bookHeader.getId()));         
                                    }else{
                                         metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(bookHeader.getId(), metadataPrefix));         
                                    } 
                                }
                            }
                            BookList remainingList = BookList.Factory.newInstance();
                            for(int i=returnedItems; i<hashList.sizeOfBookArray(); i++){
                                 remainingList.addNewBook().set(hashList.getBookArray(i));
                            }
                            String resTokenID = UUID.randomUUID().toString();
                            resumptionTokenHash.put(resTokenID, remainingList);                   
                            int newCursor = ((Integer)cursorHash.get(resumptionToken)) + returnedItems;
                            cursorHash.put(resTokenID,newCursor);
                            completedListHash.put(resTokenID, completedListHash.get(resumptionToken));
                            ResumptionTokenType resToken = listRecordsType.addNewResumptionToken();
                            resToken.setStringValue(resTokenID);
                            resToken.setCompleteListSize(BigInteger.valueOf(((Integer)completedListHash.get(resumptionToken))));
                            BigInteger cursor = BigInteger.valueOf(((Integer)cursorHash.get(resumptionToken)));
                            resToken.setCursor(cursor);
                        }else{
                            for(int i=0;i<hashList.sizeOfBookArray();i++){
                                HeaderInfo bookHeader = hashList.getBookArray(i).getHeader();
                                RecordType record= listRecordsType.addNewRecord();
                                HeaderType header = record.addNewHeader();
                                header.setDatestamp(bookHeader.getLastModified().getDate());
                                header.setIdentifier(bookHeader.getId());
                                CollectionDocument coll = DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_CollectionDAO().getCollection(null, bookHeader.getId());
                                header.addSetSpec(coll.getCollection().getHeader().getId());
                                header.addSetSpec(coll.getCollection().getMetadata().getTitleArray(0).getStringValue());
                                if(bookHeader.getStatus().equals("DELETED")){
                                    header.setStatus(StatusType.DELETED);
                                }else{
                                    MetadataType metadata= record.addNewMetadata();
                                    if(metadataPrefix.equals("myb")){
                                      metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBook(bookHeader.getId()));         
                                    }else{
                                         metadata.set(DAOFactory.getDAOFactory(DAOFactory.EXIST).getOAI_BookDAO().getBookInDCFormat(bookHeader.getId(), metadataPrefix));         
                                    }                                    
                                }
                            }
                            ResumptionTokenType resToken = listRecordsType.addNewResumptionToken();
                            resToken.setCompleteListSize(BigInteger.valueOf(((Integer)completedListHash.get(resumptionToken))));
                            BigInteger cursor = BigInteger.valueOf(((Integer)cursorHash.get(resumptionToken)));
                            resToken.setCursor(cursor);
                        }
                    }else{
                        OAIPMHerrorType errorType =  oaiType.addNewError();
                        errorType.setCode(OAIPMHerrorcodeType.BAD_RESUMPTION_TOKEN);
                        errorType.setStringValue("The value of the resumptionToken argument is invalid.");
                        return listRecordsResponseDoc;
                    }
                }  

                return listRecordsResponseDoc;
        }
     
    }
    