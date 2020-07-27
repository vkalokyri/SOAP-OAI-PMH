
/**
 * OAIPMHserviceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
        package org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice;

        

        /*
        *  OAIPMHserviceStub java implementation
        */

        
        public class OAIPMHserviceStub extends org.apache.axis2.client.Stub
        {
        protected org.apache.axis2.description.AxisOperation[] _operations;

        //hashmaps to keep the fault mapping
        private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
        private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
        private java.util.HashMap faultMessageMap = new java.util.HashMap();

        private static int counter = 0;

        private static synchronized java.lang.String getUniqueSuffix(){
            // reset the counter if it is greater than 99999
            if (counter > 99999){
                counter = 0;
            }
            counter = counter + 1; 
            return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
        }

    
    private void populateAxisService() throws org.apache.axis2.AxisFault {

     //creating the Service with a unique name
     _service = new org.apache.axis2.description.AxisService("OAIPMHservice" + getUniqueSuffix());
     addAnonymousOperations();

        //creating the operations
        org.apache.axis2.description.AxisOperation __operation;

        _operations = new org.apache.axis2.description.AxisOperation[6];
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice", "getRecord"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[0]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice", "listMetadataFormats"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[1]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice", "listSets"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[2]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice", "listIdentifiers"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[3]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice", "identify"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[4]=__operation;
            
        
                   __operation = new org.apache.axis2.description.OutInAxisOperation();
                

            __operation.setName(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice", "listRecords"));
	    _service.addOperation(__operation);
	    

	    
	    
            _operations[5]=__operation;
            
        
        }

    //populates the faults
    private void populateFaults(){
         
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "GetRecord"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "GetRecord"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "GetRecord"),"org.openarchives.www.oai._2_0.OAIPMHDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListMetadataFormats"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListMetadataFormats"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListMetadataFormats"),"org.openarchives.www.oai._2_0.OAIPMHDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListSets"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListSets"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListSets"),"org.openarchives.www.oai._2_0.OAIPMHDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListIdentifiers"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListIdentifiers"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListIdentifiers"),"org.openarchives.www.oai._2_0.OAIPMHDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "Identify"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "Identify"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "Identify"),"org.openarchives.www.oai._2_0.OAIPMHDocument");
           
              faultExceptionNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListRecords"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultExceptionClassNameMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListRecords"),"org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp");
              faultMessageMap.put(new org.apache.axis2.client.FaultMapKey(new javax.xml.namespace.QName("http://www.openarchives.org/OAI/2.0/","OAI-PMH"), "ListRecords"),"org.openarchives.www.oai._2_0.OAIPMHDocument");
           


    }

    /**
      *Constructor that takes in a configContext
      */

    public OAIPMHserviceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
       java.lang.String targetEndpoint)
       throws org.apache.axis2.AxisFault {
         this(configurationContext,targetEndpoint,false);
   }


   /**
     * Constructor that takes in a configContext  and useseperate listner
     */
   public OAIPMHserviceStub(org.apache.axis2.context.ConfigurationContext configurationContext,
        java.lang.String targetEndpoint, boolean useSeparateListener)
        throws org.apache.axis2.AxisFault {
         //To populate AxisService
         populateAxisService();
         populateFaults();

        _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext,_service);
        
	
        _serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(
                targetEndpoint));
        _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
        
    
    }

    /**
     * Default Constructor
     */
    public OAIPMHserviceStub(org.apache.axis2.context.ConfigurationContext configurationContext) throws org.apache.axis2.AxisFault {
        
                    this(configurationContext,"http://localhost:8080/axis2/services/OAI-PMHservice/" );
                
    }

    /**
     * Default Constructor
     */
    public OAIPMHserviceStub() throws org.apache.axis2.AxisFault {
        
                    this("http://localhost:8080/axis2/services/OAI-PMHservice/" );
                
    }

    /**
     * Constructor taking the target endpoint
     */
    public OAIPMHserviceStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
        this(null,targetEndpoint);
    }



        
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.OAIPMHservice#getRecord
                     * @param getRecordRequest
                    
                     * @throws org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp : 
                     */

                    

                            public  org.openarchives.www.oai._2_0.OAIPMHDocument getRecord(

                            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument getRecordRequest)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[0].getName());
              _operationClient.getOptions().setAction("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice/OAI-PMHservicePortType/GetRecordRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    getRecordRequest,
                                                    optimizeContent(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "getRecord")), new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "getRecord"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.openarchives.www.oai._2_0.OAIPMHDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.openarchives.www.oai._2_0.OAIPMHDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetRecord"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetRecord"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"GetRecord"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp){
                          throw (org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.OAIPMHservice#listMetadataFormats
                     * @param listMetadataFormatsRequest
                    
                     * @throws org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp : 
                     */

                    

                            public  org.openarchives.www.oai._2_0.OAIPMHDocument listMetadataFormats(

                            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument listMetadataFormatsRequest)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[1].getName());
              _operationClient.getOptions().setAction("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice/OAI-PMHservicePortType/ListMetadataFormatsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listMetadataFormatsRequest,
                                                    optimizeContent(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listMetadataFormats")), new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listMetadataFormats"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.openarchives.www.oai._2_0.OAIPMHDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.openarchives.www.oai._2_0.OAIPMHDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListMetadataFormats"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListMetadataFormats"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListMetadataFormats"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp){
                          throw (org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.OAIPMHservice#listSets
                     * @param listSetsRequest
                    
                     * @throws org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp : 
                     */

                    

                            public  org.openarchives.www.oai._2_0.OAIPMHDocument listSets(

                            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument listSetsRequest)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[2].getName());
              _operationClient.getOptions().setAction("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice/OAI-PMHservicePortType/ListSetsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listSetsRequest,
                                                    optimizeContent(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listSets")), new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listSets"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.openarchives.www.oai._2_0.OAIPMHDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.openarchives.www.oai._2_0.OAIPMHDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListSets"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListSets"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListSets"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp){
                          throw (org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.OAIPMHservice#listIdentifiers
                     * @param listIdentifiersRequest
                    
                     * @throws org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp : 
                     */

                    

                            public  org.openarchives.www.oai._2_0.OAIPMHDocument listIdentifiers(

                            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument listIdentifiersRequest)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[3].getName());
              _operationClient.getOptions().setAction("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice/OAI-PMHservicePortType/ListIdentifiersRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listIdentifiersRequest,
                                                    optimizeContent(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listIdentifiers")), new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listIdentifiers"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.openarchives.www.oai._2_0.OAIPMHDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.openarchives.www.oai._2_0.OAIPMHDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListIdentifiers"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListIdentifiers"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListIdentifiers"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp){
                          throw (org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.OAIPMHservice#identify
                     * @param identifyRequest
                    
                     * @throws org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp : 
                     */

                    

                            public  org.openarchives.www.oai._2_0.OAIPMHDocument identify(

                            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument identifyRequest)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[4].getName());
              _operationClient.getOptions().setAction("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice/OAI-PMHservicePortType/IdentifyRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    identifyRequest,
                                                    optimizeContent(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "identify")), new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "identify"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.openarchives.www.oai._2_0.OAIPMHDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.openarchives.www.oai._2_0.OAIPMHDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Identify"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Identify"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"Identify"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp){
                          throw (org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            
                    /**
                     * Auto generated method signature
                     * 
                     * @see org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.OAIPMHservice#listRecords
                     * @param listRecordsRequest
                    
                     * @throws org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp : 
                     */

                    

                            public  org.openarchives.www.oai._2_0.OAIPMHDocument listRecords(

                            org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument listRecordsRequest)
                        

                    throws java.rmi.RemoteException
                    
                    
                        ,org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp{
              org.apache.axis2.context.MessageContext _messageContext = null;
              try{
               org.apache.axis2.client.OperationClient _operationClient = _serviceClient.createClient(_operations[5].getName());
              _operationClient.getOptions().setAction("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice/OAI-PMHservicePortType/ListRecordsRequest");
              _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

              
              
                  addPropertyToOperationClient(_operationClient,org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,"&");
              

              // create a message context
              _messageContext = new org.apache.axis2.context.MessageContext();

              

              // create SOAP envelope with that payload
              org.apache.axiom.soap.SOAPEnvelope env = null;
                    
                                                    
                                                    env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
                                                    listRecordsRequest,
                                                    optimizeContent(new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listRecords")), new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listRecords"));
                                                
        //adding SOAP soap_headers
         _serviceClient.addHeadersToEnvelope(env);
        // set the message context with that soap envelope
        _messageContext.setEnvelope(env);

        // add the message contxt to the operation client
        _operationClient.addMessageContext(_messageContext);

        //execute the operation client
        _operationClient.execute(true);

         
               org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient.getMessageContext(
                                           org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
                org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
                
                
                                java.lang.Object object = fromOM(
                                             _returnEnv.getBody().getFirstElement() ,
                                             org.openarchives.www.oai._2_0.OAIPMHDocument.class,
                                              getEnvelopeNamespaces(_returnEnv));

                               
                                        return (org.openarchives.www.oai._2_0.OAIPMHDocument)object;
                                   
         }catch(org.apache.axis2.AxisFault f){

            org.apache.axiom.om.OMElement faultElt = f.getDetail();
            if (faultElt!=null){
                if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListRecords"))){
                    //make the fault by reflection
                    try{
                        java.lang.String exceptionClassName = (java.lang.String)faultExceptionClassNameMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListRecords"));
                        java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
                        java.lang.Exception ex = (java.lang.Exception) exceptionClass.newInstance();
                        //message class
                        java.lang.String messageClassName = (java.lang.String)faultMessageMap.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),"ListRecords"));
                        java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
                        java.lang.Object messageObject = fromOM(faultElt,messageClass,null);
                        java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
                                   new java.lang.Class[]{messageClass});
                        m.invoke(ex,new java.lang.Object[]{messageObject});
                        
                        if (ex instanceof org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp){
                          throw (org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice.ErrorResp)ex;
                        }
                        

                        throw new java.rmi.RemoteException(ex.getMessage(), ex);
                    }catch(java.lang.ClassCastException e){
                       // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.ClassNotFoundException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }catch (java.lang.NoSuchMethodException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    } catch (java.lang.reflect.InvocationTargetException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }  catch (java.lang.IllegalAccessException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }   catch (java.lang.InstantiationException e) {
                        // we cannot intantiate the class - throw the original Axis fault
                        throw f;
                    }
                }else{
                    throw f;
                }
            }else{
                throw f;
            }
            } finally {
                if (_messageContext.getTransportOut() != null) {
                      _messageContext.getTransportOut().getSender().cleanup(_messageContext);
                }
            }
        }
            


       /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
       private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
            org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
            returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
       return returnMap;
    }

    
    
    private javax.xml.namespace.QName[] opNameArray = null;
    private boolean optimizeContent(javax.xml.namespace.QName opName) {
        

        if (opNameArray == null) {
            return false;
        }
        for (int i = 0; i < opNameArray.length; i++) {
            if (opName.equals(opNameArray[i])) {
                return true;   
            }
        }
        return false;
    }
     //http://localhost:8080/axis2/services/OAI-PMHservice/

            private  org.apache.axiom.om.OMElement  toOM(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(org.openarchives.www.oai._2_0.OAIPMHDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final org.openarchives.www.oai._2_0.OAIPMHDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        

            private  org.apache.axiom.om.OMElement  toOM(org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault{

            
                    return toOM(param);
                

            }

            private org.apache.axiom.om.OMElement toOM(final org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument param)
                    throws org.apache.axis2.AxisFault {

                org.apache.xmlbeans.XmlOptions xmlOptions = new org.apache.xmlbeans.XmlOptions();
                xmlOptions.setSaveNoXmlDecl();
                xmlOptions.setSaveAggressiveNamespaces();
                xmlOptions.setSaveNamespacesFirst();
                org.apache.axiom.om.OMXMLParserWrapper builder = org.apache.axiom.om.OMXMLBuilderFactory.createOMBuilder(
                        new javax.xml.transform.sax.SAXSource(new org.apache.axis2.xmlbeans.XmlBeansXMLReader(param, xmlOptions), new org.xml.sax.InputSource()));
                try {
                    return builder.getDocumentElement(true);
                } catch (java.lang.Exception e) {
                    throw org.apache.axis2.AxisFault.makeFault(e);
                }
            }
        
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            
                                
                                private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                                throws org.apache.axis2.AxisFault{
                                org.apache.axiom.soap.SOAPEnvelope envelope = factory.getDefaultEnvelope();
                                if (param != null){
                                envelope.getBody().addChild(toOM(param, optimizeContent));
                                }
                                return envelope;
                                }
                            


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }

        public org.apache.xmlbeans.XmlObject fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{
        try{
        

            if (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        

            if (org.openarchives.www.oai._2_0.OAIPMHDocument.class.equals(type)){
            if (extraNamespaces!=null){
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching(),
            new org.apache.xmlbeans.XmlOptions().setLoadAdditionalNamespaces(extraNamespaces));
            }else{
            return org.openarchives.www.oai._2_0.OAIPMHDocument.Factory.parse(
            param.getXMLStreamReaderWithoutCaching());
            }
            }

        
        }catch(java.lang.Exception e){
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        return null;
        }

        
        
   }
   