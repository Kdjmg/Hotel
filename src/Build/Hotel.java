package Build;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Client> listeDeClient;
    private ArrayList<Chambre> listeDeChambres;
    private ArrayList<Reservation> listeDeReservation;

    private String nom;

    public ArrayList<Client> getListeDeClient() {
        return listeDeClient;
    }

    public Hotel(String nom) {
        this.nom = nom;
        this.listeDeClient = new ArrayList<>();
        this.listeDeChambres = genListChambres();
        this.listeDeReservation = new ArrayList<>();
    }
    private ArrayList<Chambre> genListChambres(){
        ArrayList<Chambre> genListChambres = new ArrayList<>();
        int min =10;
        int max=50;
        int numChambre = 1;
        int randomNumber =(int) (Math.random()*(max-min)+1) +min;
        for (int i= 1 ; i<randomNumber;i++){
            int randomNbLits = (int) (Math.random() * ((4 - 1) + 1) + 1);
            double randomTarif = Math.random() * (50.0 - 30.0) + 30.0;
            double randomTarifArrondi = Math.round(randomTarif * 10.0) / 10.0;
            Chambre chambre = new Chambre(numChambre++,randomNbLits,randomTarifArrondi);
            genListChambres.add(chambre);
        }
        return genListChambres;
    }

    public void setListeDeClient(ArrayList<Client> listeDeClient) {
        this.listeDeClient = listeDeClient;
    }

    public ArrayList<Chambre> getListeDeChambres() {
        return listeDeChambres;
    }

    public void setListeDeChambres(ArrayList<Chambre> listeDeChambres) {
        this.listeDeChambres = listeDeChambres;
    }

    public ArrayList<Reservation> getListeDeReservation() {
        return listeDeReservation;
    }

    public void setListeDeReservation(ArrayList<Reservation> listeDeReservation) {
        this.listeDeReservation = listeDeReservation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
