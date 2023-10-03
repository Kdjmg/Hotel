package Build;

public class Chambre {

    private int number;
    private boolean statut;
    private int numberBed;
    private double price;

    public Chambre(int number, int numberBed, double price) {
        this.number = number;
        this.numberBed = numberBed;
        this.price = price;
        this.statut = true;
    }
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

    @Override
    public String toString() {
        return "Chambre{" +
                "number=" + number +
                ", statut=" + statut +
                ", numberBed=" + numberBed +
                ", price=" + price +
                '}';
    }
}
