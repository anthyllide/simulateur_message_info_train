package TD2;

import java.rmi.RemoteException;

/**
 * Created by gonzalal on 10/05/17.
 */
public class Voyageur implements Abonne {

    private String nom_voyageur;

    @Override
    public String getNom_voyageur() {
        return nom_voyageur;
    }

    @Override
    public void setNom_voyageur(String nom_voyageur) {
        this.nom_voyageur = nom_voyageur;
    }

    @Override
    public void informer(InfoTrafic info) throws RemoteException {
        System.out.println(info);
    }
}
