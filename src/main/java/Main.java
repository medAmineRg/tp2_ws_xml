import jakarta.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        //Déployer le Web service avec un simple Serveur JaxWS
        String url = "http://localhost:8585/";
        BanqueService banqueService = new BanqueService();
        Endpoint.publish(url, banqueService);
        System.out.println("Web service déployé sur : " + url);
    }
}
