package TD2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

/**
 * Created by gonzalal on 10/05/17.
 */
public class ClientTrafic {
    public static void main(String [] args) throws Exception {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 2000);
        ServiceInfo service;
        service = (ServiceInfo) registry.lookup("InfoTraficService");

        Scanner sc = new Scanner(System.in);
        String nom;
        System.out.print("Veuillez saisir votre nom SVP : ");
        nom = sc.nextLine();

        Voyageur v1 = new Voyageur();
        v1.setNom_voyageur(nom);
        Abonne stub;
        stub = (Abonne) UnicastRemoteObject.exportObject(v1,0);

        service.abonner(v1);


    }
}
