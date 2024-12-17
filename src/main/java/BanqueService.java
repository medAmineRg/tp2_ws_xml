import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.List;

@WebService(serviceName = "BanqueWS", targetNamespace = "http://localhost:8585/banque/")
public class BanqueService {

    //Convertir un montant de l’auro en DH create this method
    @WebMethod(operationName = "conversion")
    public double conversion(double montant){
        return montant * 10.6;
    }

    //Consulter un Compte
    @WebMethod(operationName = "consulterCompte")
    public Compte consulterCompte(int code){
        Compte cp = new Compte();
        cp.setCode(code);
        cp.setSolde(10000);
        return cp;
    }
    // Consulter une Liste de comptes
    @WebMethod(operationName = "listComptes")
    public List<Compte> listComptes(){
        return List.of(
            new Compte(1, 1000),
            new Compte(2, 2000),
            new Compte(3, 3000)
        );
    }
}
