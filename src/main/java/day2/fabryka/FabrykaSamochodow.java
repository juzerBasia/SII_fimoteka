package day2.fabryka;

import java.util.Scanner;

public class FabrykaSamochodow {
    public static void main(String[] args) {
        System.out.println("Podaj wiek");
        Scanner input = new Scanner(System.in);
        int wiek = input.nextInt();

        ISamochod auto = SamochodFactory.getSamochod(wiek);
        if (auto!=null)
            System.out.println("Mozesz jechac z maksymalna predkoscia "+auto.maxPredkosc());
        else
            System.out.println("Jestes za młody na fure");
    }
}
