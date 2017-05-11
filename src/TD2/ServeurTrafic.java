package TD2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by gonzalal on 10/05/17.
 */
public class ServeurTrafic {
    public static void main(String [] args) throws Exception
    {
        ServiceInfoImpl service = new ServiceInfoImpl();
        ServiceInfo stub;
        stub = (ServiceInfo) UnicastRemoteObject.exportObject(service,0);
        Registry registry = LocateRegistry.createRegistry(2000);
        registry.bind("InfoTraficService", stub);
        service.start();
    }
}
