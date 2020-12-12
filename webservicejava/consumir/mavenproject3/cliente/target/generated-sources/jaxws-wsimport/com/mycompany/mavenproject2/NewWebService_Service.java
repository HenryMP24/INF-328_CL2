
package com.mycompany.mavenproject2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NewWebService", targetNamespace = "http://mavenproject2.mycompany.com/", wsdlLocation = "http://localhost:8080/NewWebService/NewWebService?wsdl")
public class NewWebService_Service
    extends Service
{

    private final static URL NEWWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException NEWWEBSERVICE_EXCEPTION;
    private final static QName NEWWEBSERVICE_QNAME = new QName("http://mavenproject2.mycompany.com/", "NewWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/NewWebService/NewWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NEWWEBSERVICE_WSDL_LOCATION = url;
        NEWWEBSERVICE_EXCEPTION = e;
    }

    public NewWebService_Service() {
        super(__getWsdlLocation(), NEWWEBSERVICE_QNAME);
    }

    public NewWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), NEWWEBSERVICE_QNAME, features);
    }

    public NewWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, NEWWEBSERVICE_QNAME);
    }

    public NewWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NEWWEBSERVICE_QNAME, features);
    }

    public NewWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NewWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns NewWebService
     */
    @WebEndpoint(name = "NewWebServicePort")
    public NewWebService getNewWebServicePort() {
        return super.getPort(new QName("http://mavenproject2.mycompany.com/", "NewWebServicePort"), NewWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns NewWebService
     */
    @WebEndpoint(name = "NewWebServicePort")
    public NewWebService getNewWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://mavenproject2.mycompany.com/", "NewWebServicePort"), NewWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NEWWEBSERVICE_EXCEPTION!= null) {
            throw NEWWEBSERVICE_EXCEPTION;
        }
        return NEWWEBSERVICE_WSDL_LOCATION;
    }

}
