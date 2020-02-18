
package projetsoapserverclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the projetsoapserverclient package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://projetSoapServerClient/", "helloResponse");
    private final static QName _Hellov2Response_QNAME = new QName("http://projetSoapServerClient/", "hellov2Response");
    private final static QName _Hello_QNAME = new QName("http://projetSoapServerClient/", "hello");
    private final static QName _Hellov2_QNAME = new QName("http://projetSoapServerClient/", "hellov2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: projetsoapserverclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hellov2Response }
     * 
     */
    public Hellov2Response createHellov2Response() {
        return new Hellov2Response();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hellov2 }
     * 
     */
    public Hellov2 createHellov2() {
        return new Hellov2();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetSoapServerClient/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hellov2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetSoapServerClient/", name = "hellov2Response")
    public JAXBElement<Hellov2Response> createHellov2Response(Hellov2Response value) {
        return new JAXBElement<Hellov2Response>(_Hellov2Response_QNAME, Hellov2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetSoapServerClient/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hellov2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://projetSoapServerClient/", name = "hellov2")
    public JAXBElement<Hellov2> createHellov2(Hellov2 value) {
        return new JAXBElement<Hellov2>(_Hellov2_QNAME, Hellov2 .class, null, value);
    }

}
