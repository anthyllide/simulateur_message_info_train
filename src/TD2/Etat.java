package TD2;

import java.io.Serializable;

/**
 * Created by gonzalal on 10/05/17.
 */
public enum Etat implements Serializable {
    //Objets directement construits
    RETARD("en retard"),
    PERTURBATION("perturbation"),
    RETOUR_A_LA_NORMALE("retour à la normale");

    private String etat;

    //constructor
    Etat(String etat) {
        this.etat = etat;
    }

    //retourne l'état
    public String getEtat() {
        return etat;
    }

    //toString
    @Override
    public String toString() {
        return this.etat;
    }
}
