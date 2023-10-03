package Build;

import java.util.ArrayList;
import java.util.Random;



public class Reservation {
    private int id;
    private boolean statut;
   private ArrayList<Chambre> listeDeChambres;
   private String client;

    Random r = new Random();
    int n = r.nextInt(11);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public ArrayList<Chambre> getListeDeChambres() {
        return listeDeChambres;
    }

    public void setListChambre(ArrayList<Chambre> listeDeChambres) {
        this.listeDeChambres = listeDeChambres;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
