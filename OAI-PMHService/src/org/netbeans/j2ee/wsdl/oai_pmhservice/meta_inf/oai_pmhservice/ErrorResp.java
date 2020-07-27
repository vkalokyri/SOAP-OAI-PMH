
/**
 * ErrorResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.1  Built on : Aug 31, 2011 (12:22:40 CEST)
 */

package org.netbeans.j2ee.wsdl.oai_pmhservice.meta_inf.oai_pmhservice;

public class ErrorResp extends java.lang.Exception{

    private static final long serialVersionUID = 1332425012203L;
    
    private org.openarchives.www.oai._2_0.OAIPMHDocument faultMessage;

    
        public ErrorResp() {
            super("ErrorResp");
        }

        public ErrorResp(java.lang.String s) {
           super(s);
        }

        public ErrorResp(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ErrorResp(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(org.openarchives.www.oai._2_0.OAIPMHDocument msg){
       faultMessage = msg;
    }
    
    public org.openarchives.www.oai._2_0.OAIPMHDocument getFaultMessage(){
       return faultMessage;
    }
}
    