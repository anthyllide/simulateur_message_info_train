package TD2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by gonzalal on 10/05/17.
 */
public interface Abonne extends Remote {

    public void informer(InfoTrafic info) throws RemoteException;
    public String getNom_voyageur() throws RemoteException;
    public void setNom_voyageur(String nom_voyageur) throws RemoteException;
}
