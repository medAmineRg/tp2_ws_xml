
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://localhost:8585/banque/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversion", targetNamespace = "http://localhost:8585/banque/", className = "proxy.Conversion")
    @ResponseWrapper(localName = "conversionResponse", targetNamespace = "http://localhost:8585/banque/", className = "proxy.ConversionResponse")
    @Action(input = "http://localhost:8585/banque/BanqueService/conversionRequest", output = "http://localhost:8585/banque/BanqueService/conversionResponse")
    public double conversion(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listComptes", targetNamespace = "http://localhost:8585/banque/", className = "proxy.ListComptes")
    @ResponseWrapper(localName = "listComptesResponse", targetNamespace = "http://localhost:8585/banque/", className = "proxy.ListComptesResponse")
    @Action(input = "http://localhost:8585/banque/BanqueService/listComptesRequest", output = "http://localhost:8585/banque/BanqueService/listComptesResponse")
    public List<Compte> listComptes();

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consulterCompte", targetNamespace = "http://localhost:8585/banque/", className = "proxy.ConsulterCompte")
    @ResponseWrapper(localName = "consulterCompteResponse", targetNamespace = "http://localhost:8585/banque/", className = "proxy.ConsulterCompteResponse")
    @Action(input = "http://localhost:8585/banque/BanqueService/consulterCompteRequest", output = "http://localhost:8585/banque/BanqueService/consulterCompteResponse")
    public Compte consulterCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}
