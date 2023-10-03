package Build;

import java.util.Scanner;

public class Ihm{
    private static Hotel hotel;

    private static Scanner scanner = new Scanner(System.in);
    public static void start(){
        System.out.println("Quelle est le nom de l' Hotel");
        String nomHotel = scanner.nextLine();
        hotel = new Hotel(nomHotel);
        System.out.println(hotel.getNom());
        for (Chambre chambre: hotel.getListeDeChambres()){
            System.out.println(chambre);
    }
}
}
