package TD2;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gonzalal on 10/05/17.
 */
public class ServiceInfoImpl extends Thread implements ServiceInfo {

    private List<Abonne> listAbonnes;

    //tableau des états
    private static final Etat[] etats = Etat.values();
    private static final String [] raisons = {"Panne du train précédent", "Panne de passage à niveau",
    "grève surprise", "Accident de personnes", "Obstacle sur la voie"};

    //constructor
    public ServiceInfoImpl() {
        listAbonnes = new ArrayList<>();
    }

    @Override
    public boolean abonner(Abonne a) throws RemoteException {
        Boolean valueFinal = false;

        synchronized (listAbonnes){

            listAbonnes.add(a);
            System.out.println("Le voyageur "+ a.getNom_voyageur() + " s'est abonné.");
        }

        return valueFinal;
    }

    @Override
    public void desabonner(Abonne a) throws RemoteException {

        synchronized (listAbonnes){
            listAbonnes.remove(a);
            System.out.println("Le voyageur "+ a.getNom_voyageur() + " s'est désabonné.");
        }
    }

    @Override
    public void run() {
        Boolean fin = false;

        while(!fin){
            try {
                System.out.print("début run");
                Random r = new Random();

                sleep(r.nextInt(7000) + 3000);
                int Random_numero_train = r.nextInt(100);
                Etat Random_etat = etats[r.nextInt(etats.length)];
                String Random_raison = raisons[r.nextInt(raisons.length)];

                InfoTrafic info = new InfoTrafic(Random_numero_train, Random_etat, Random_raison);


                     for (int i = 0; i < listAbonnes.size(); i++) {
                         try {
                             listAbonnes.get(i).informer(info);
                             System.out.print("voyageur :" + listAbonnes.get(i).getNom_voyageur());
                         } catch (RemoteException e) {
                             e.printStackTrace();
                         }

                     }

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

