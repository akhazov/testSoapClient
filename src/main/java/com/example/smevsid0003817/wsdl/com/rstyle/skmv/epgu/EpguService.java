
package com.example.smevsid0003817.wsdl.com.rstyle.skmv.epgu;

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
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EpguService", targetNamespace = "http://epgu.skmv.rstyle.com", wsdlLocation = "file:/home/drmun/software/test/test/src/main/webapp/schemas/schema.wsdl")
public class EpguService
    extends Service
{

    private final static URL EPGUSERVICE_WSDL_LOCATION;
    private final static WebServiceException EPGUSERVICE_EXCEPTION;
    private final static QName EPGUSERVICE_QNAME = new QName("http://epgu.skmv.rstyle.com", "EpguService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/drmun/software/test/test/src/main/webapp/schemas/schema.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EPGUSERVICE_WSDL_LOCATION = url;
        EPGUSERVICE_EXCEPTION = e;
    }

    public EpguService() {
        super(__getWsdlLocation(), EPGUSERVICE_QNAME);
    }

    public EpguService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EPGUSERVICE_QNAME, features);
    }

    public EpguService(URL wsdlLocation) {
        super(wsdlLocation, EPGUSERVICE_QNAME);
    }

    public EpguService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EPGUSERVICE_QNAME, features);
    }

    public EpguService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EpguService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EpguPortType
     */
    @WebEndpoint(name = "EpguPort")
    public EpguPortType getEpguPort() {
        return super.getPort(new QName("http://epgu.skmv.rstyle.com", "EpguPort"), EpguPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EpguPortType
     */
    @WebEndpoint(name = "EpguPort")
    public EpguPortType getEpguPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://epgu.skmv.rstyle.com", "EpguPort"), EpguPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EPGUSERVICE_EXCEPTION!= null) {
            throw EPGUSERVICE_EXCEPTION;
        }
        return EPGUSERVICE_WSDL_LOCATION;
    }

}
