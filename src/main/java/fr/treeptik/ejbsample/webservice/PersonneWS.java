
package fr.treeptik.ejbsample.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonneWS", targetNamespace = "http://webservice.ejbsample.treeptik.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonneWS {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "saveFromWebService", targetNamespace = "http://webservice.ejbsample.treeptik.fr/", className = "fr.treeptik.ejbsample.webservice.SaveFromWebService")
    @ResponseWrapper(localName = "saveFromWebServiceResponse", targetNamespace = "http://webservice.ejbsample.treeptik.fr/", className = "fr.treeptik.ejbsample.webservice.SaveFromWebServiceResponse")
    public void saveFromWebService(
        @WebParam(name = "arg0", targetNamespace = "")
        Personne arg0);

}
