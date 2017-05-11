package TD2;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by gonzalal on 10/05/17.
 */
public interface ServiceInfo extends Remote {
    //permet à un voyageur de s'abonner
    public boolean abonner(Abonne a) throws RemoteException;

    //permet à un voyageur de se désabonner
    public void desabonner(Abonne a) throws RemoteException;
}
