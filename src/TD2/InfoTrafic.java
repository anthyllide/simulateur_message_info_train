package TD2;

import java.io.Serializable;

/**
 * Created by gonzalal on 10/05/17.
 */
public class InfoTrafic implements Serializable {
    private int numero_train;
    private Etat etat;
    private String nature_probleme;

    //constructor
    public InfoTrafic(int numero_train, Etat etat, String nature_probleme) {
        this.numero_train = numero_train;
        this.etat = etat;
        this.nature_probleme = nature_probleme;
    }

    public int getNumero_train() {
        return numero_train;
    }

    public void setNumero_train(int numero_train) {
        this.numero_train = numero_train;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public String getNature_probleme() {
        return nature_probleme;
    }

    public void setNature_probleme(String nature_probleme) {
        this.nature_probleme = nature_probleme;
    }

    @Override
    public String toString() {
        return "InfoTrafic{" +
                "numero_train=" + numero_train +
                ", etat=" + etat +
                ", nature_probleme='" + nature_probleme + '\'' +
                '}';
    }
}
