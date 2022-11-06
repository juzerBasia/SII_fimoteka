package day2.owoce;

import java.util.ArrayList;
import java.util.List;

public class Warzywniak {
    public static void main(String[] args) {
        BaseOwoc owoc1 = new Pomarancz(1);
        BaseOwoc owoc2 = new Banan(5);
        BaseOwoc owoc3 = new Jablko(1);

        System.out.println(owoc1.pobierzWage());
        System.out.println(owoc2.pobierzWage());
        System.out.println(owoc1.pobierzCene());

        //kolekcja typu lista obiektow implementujacych interfejs
        List<IOwoce> koszyk = new ArrayList<>();
        koszyk.add(owoc1);
        koszyk.add(owoc2);
        koszyk.add(new Jablko(100));

        for (IOwoce owoc : koszyk) {
            System.out.println(owoc.pobierzCene()*owoc.pobierzWage()+"pln za owoce koloru "+owoc.pobierzKolor());
        }

        //kolekcja typu lista obiektow BaseOwoc i po niej dziedziczacych
        List<BaseOwoc> koszyk2 = new ArrayList<>();
        koszyk2.add(owoc1);
        koszyk2.add(owoc2);
        koszyk2.add(new Jablko(100));


        for (BaseOwoc owoc : koszyk2) {
            System.out.println(owoc.pobierzCene()*owoc.pobierzWage()+"pln za owoce koloru "+owoc.pobierzKolor());
        }

    }
}
