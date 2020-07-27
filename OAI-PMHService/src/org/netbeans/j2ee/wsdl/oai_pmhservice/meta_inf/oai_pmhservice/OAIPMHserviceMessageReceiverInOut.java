
/**
 * OAIPMHserviceMessageReceiverInOut.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */
        package org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice;

        /**
        *  OAIPMHserviceMessageReceiverInOut message receiver
        */

        public class OAIPMHserviceMessageReceiverInOut extends org.apache.axis2.receivers.AbstractInOutMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext, org.apache.axis2.context.MessageContext newMsgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        OAIPMHserviceSkeletonInterface skel = (OAIPMHserviceSkeletonInterface)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){


        

            if("getRecord".equals(methodName)){
                
                org.openarchives.www.oai._2_0.OAIPMHDocument oAIPMH18 = null;
	                        org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument wrappedParam =
                                                             (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.GetRecordRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               oAIPMH18 =
                                                   
                                                   
                                                         skel.getRecord(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), oAIPMH18, false, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "getRecord"));
                                    } else 

            if("listMetadataFormats".equals(methodName)){
                
                org.openarchives.www.oai._2_0.OAIPMHDocument oAIPMH20 = null;
	                        org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument wrappedParam =
                                                             (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListMetadataFormatsRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               oAIPMH20 =
                                                   
                                                   
                                                         skel.listMetadataFormats(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), oAIPMH20, false, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listMetadataFormats"));
                                    } else 

            if("listSets".equals(methodName)){
                
                org.openarchives.www.oai._2_0.OAIPMHDocument oAIPMH22 = null;
	                        org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument wrappedParam =
                                                             (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListSetsRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               oAIPMH22 =
                                                   
                                                   
                                                         skel.listSets(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), oAIPMH22, false, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listSets"));
                                    } else 

            if("listIdentifiers".equals(methodName)){
                
                org.openarchives.www.oai._2_0.OAIPMHDocument oAIPMH24 = null;
	                        org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument wrappedParam =
                                                             (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListIdentifiersRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               oAIPMH24 =
                                                   
                                                   
                                                         skel.listIdentifiers(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), oAIPMH24, false, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listIdentifiers"));
                                    } else 

            if("identify".equals(methodName)){
                
                org.openarchives.www.oai._2_0.OAIPMHDocument oAIPMH26 = null;
	                        org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument wrappedParam =
                                                             (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.IdentifyRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               oAIPMH26 =
                                                   
                                                   
                                                         skel.identify(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), oAIPMH26, false, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "identify"));
                                    } else 

            if("listRecords".equals(methodName)){
                
                org.openarchives.www.oai._2_0.OAIPMHDocument oAIPMH28 = null;
	                        org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument wrappedParam =
                                                             (org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument)fromOM(
                                    msgContext.getEnvelope().getBody().getFirstElement(),
                                    org.netbeans.j2ee.xsd.oai_pmhservice.meta_inf.oai_pmhservice.ListRecordsRequestDocument.class,
                                    getEnvelopeNamespaces(msgContext.getEnvelope()));
                                                
                                               oAIPMH28 =
                                                   
                                                   
                                                         skel.listRecords(wrappedParam)
                                                    ;
                                            
                                        envelope = toEnvelope(getSOAPFactory(msgContext), oAIPMH28, false, new javax.xml.namespace.QName("http://j2ee.netbeans.org/wsdl/OAI-PMHservice/META-INF/OAI-PMHservice",
                                                    "listRecords"));
                                    
            } else {
              throw new java.lang.RuntimeException("method not found");
            }
        

        newMsgContext.setEnvelope(envelope);
        }
        } catch (ErrorResp e) {

            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"OAI-PMH");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //

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
        
                            private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, org.openarchives.www.oai._2_0.OAIPMHDocument param, boolean optimizeContent, javax.xml.namespace.QName methodQName)
                            throws org.apache.axis2.AxisFault {
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

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    