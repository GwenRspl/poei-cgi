package fr.atatorus.bookservice.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.12
 * 2020-02-19T12:32:21.584+01:00
 * Generated source version: 3.2.12
 *
 */
@WebServiceClient(name = "CalcService",
                  wsdlLocation = "http://localhost:8080/bookservice/services/calc?wsdl",
                  targetNamespace = "http://services.bookservice.atatorus.fr/")
public class CalcService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.bookservice.atatorus.fr/", "CalcService");
    public final static QName CalcPort = new QName("http://services.bookservice.atatorus.fr/", "CalcPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/bookservice/services/calc?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CalcService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/bookservice/services/calc?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CalcService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CalcService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalcService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CalcService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CalcService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CalcService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Calc
     */
    @WebEndpoint(name = "CalcPort")
    public Calc getCalcPort() {
        return super.getPort(CalcPort, Calc.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calc
     */
    @WebEndpoint(name = "CalcPort")
    public Calc getCalcPort(WebServiceFeature... features) {
        return super.getPort(CalcPort, Calc.class, features);
    }

}
