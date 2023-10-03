package Build;

import java.util.ArrayList;
import java.util.Random;



public class Reservation {
    private int id;
    private boolean statut;
   private ArrayList<Chambre> listeDeChambres;
   private String client;

   private static int nbReservation;

    public Reservation(int id, boolean statut, ArrayList<Chambre> listeDeChambres, String client) {
        this.id = id;
        this.statut = statut;
        this.listeDeChambres = listeDeChambres;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public ArrayList<Chambre> getListeDeChambres() {
        return listeDeChambres;
    }

    public void setListeDeChambres(ArrayList<Chambre> listeDeChambres) {
        this.listeDeChambres = listeDeChambres;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public static int getNbReservation() {
        return nbReservation;
    }

    public static void setNbReservation(int nbReservation) {
        Reservation.nbReservation = nbReservation;
    }

    @Override
    public String toString() {
        String statutString;
        statutString= statut ? "reservation en cours" :"reservation annuler ou finis ";
        String message = id +")" +statutString + "pour le client :\n"
                +client + "listes des chambres reserver : \n";
        for (Chambre chambre : listeDeChambres) {
            message += chambre + "\n";
        }
        return message;
    }
}
