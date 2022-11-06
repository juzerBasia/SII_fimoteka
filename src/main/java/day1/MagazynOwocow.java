package day1;

import java.util.Scanner;

public class MagazynOwocow {
    public static void main(String[] args) {
        System.out.println("podaj nazwe owocow: ");
        Scanner input = new Scanner(System.in);

        String owoc = input.nextLine();
        switch (owoc) {
            case "jablka":
            case "banany":
            case "pomarancze":
                System.out.println("podaj ilosc owocow:");
                int waga = input.nextInt();
                if (waga == 100 )
                    System.out.println(owoc + " jest w sam raz");
                else if (waga <100)
                    System.out.println("jest jeszcze "+ (100-waga) +"kg miejsca na "+owoc);
                else
                    System.out.println(owoc + "jest za duzo o "+(waga-100)+"kg");
                break;
            default:
                System.out.println(owoc + " nie ma w magazynie");

        }
    }
}
