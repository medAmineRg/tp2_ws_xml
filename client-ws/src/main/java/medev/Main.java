package medev;

import proxy.BanqueService;
import proxy.BanqueWS;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWS().getBanqueServicePort();
        System.out.println(proxy.conversion(1000));
        System.out.println("-------------------");
        Compte cp = proxy.consulterCompte(4);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
