
package prjSOAPServer;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWSGwen", targetNamespace = "http://prjSOAPServer/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWSGwen {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://prjSOAPServer/", className = "prjsoapserver.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://prjSOAPServer/", className = "prjsoapserver.HelloResponse")
    @Action(input = "http://prjSOAPServer/HelloWSGwen/helloRequest", output = "http://prjSOAPServer/HelloWSGwen/helloResponse")
    public String hello();

    /**
     * 
     * @param x
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hellov2", targetNamespace = "http://prjSOAPServer/", className = "prjsoapserver.Hellov2")
    @ResponseWrapper(localName = "hellov2Response", targetNamespace = "http://prjSOAPServer/", className = "prjsoapserver.Hellov2Response")
    @Action(input = "http://prjSOAPServer/HelloWSGwen/hellov2Request", output = "http://prjSOAPServer/HelloWSGwen/hellov2Response")
    public String hellov2(
        @WebParam(name = "x", targetNamespace = "")
        String x);

}
