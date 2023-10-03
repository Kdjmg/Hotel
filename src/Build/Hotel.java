package Build;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Client> listeDeClient;
    private ArrayList<Chambre> listeDeChambres;
    private ArrayList<Reservation> listeDeReservation;

    public ArrayList<Client> getListeDeClient() {
        return listeDeClient;
    }

    public void setListeDeClient(ArrayList<Client> listeDeClient) {
        this.listeDeClient = listeDeClient;
    }

    public ArrayList<Chambre> getListeDeChambres() {
        return listeDeChambres;
    }

    public void setListeDeChambre(ArrayList<Chambre> listeDeChambres) {
        this.listeDeChambres = listeDeChambres;
    }

    public ArrayList<Reservation> getListeDeReservation() {
        return listeDeReservation;
    }

    public void setListeDeReservation(ArrayList<Reservation> listeDeReservation) {
        this.listeDeReservation = listeDeReservation;
    }
}
