package Build;

public class Chambre {

    private int number;
    private boolean statut;
    private int numberBed;
    private double price;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isStatut() {
        return statut;
    }

    public void setStatut(boolean statut) {
        this.statut = statut;
    }

    public int getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
