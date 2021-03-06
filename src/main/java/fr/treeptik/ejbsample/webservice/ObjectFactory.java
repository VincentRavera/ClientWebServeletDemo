
package fr.treeptik.ejbsample.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.treeptik.ejbsample.webservice package. 
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

    private final static QName _SaveFromWebServiceResponse_QNAME = new QName("http://webservice.ejbsample.treeptik.fr/", "saveFromWebServiceResponse");
    private final static QName _SaveFromWebService_QNAME = new QName("http://webservice.ejbsample.treeptik.fr/", "saveFromWebService");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.treeptik.ejbsample.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaveFromWebService }
     * 
     */
    public SaveFromWebService createSaveFromWebService() {
        return new SaveFromWebService();
    }

    /**
     * Create an instance of {@link SaveFromWebServiceResponse }
     * 
     */
    public SaveFromWebServiceResponse createSaveFromWebServiceResponse() {
        return new SaveFromWebServiceResponse();
    }

    /**
     * Create an instance of {@link Personne }
     * 
     */
    public Personne createPersonne() {
        return new Personne();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveFromWebServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ejbsample.treeptik.fr/", name = "saveFromWebServiceResponse")
    public JAXBElement<SaveFromWebServiceResponse> createSaveFromWebServiceResponse(SaveFromWebServiceResponse value) {
        return new JAXBElement<SaveFromWebServiceResponse>(_SaveFromWebServiceResponse_QNAME, SaveFromWebServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveFromWebService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.ejbsample.treeptik.fr/", name = "saveFromWebService")
    public JAXBElement<SaveFromWebService> createSaveFromWebService(SaveFromWebService value) {
        return new JAXBElement<SaveFromWebService>(_SaveFromWebService_QNAME, SaveFromWebService.class, null, value);
    }

}
