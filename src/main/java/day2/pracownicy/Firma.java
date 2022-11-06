package day2.pracownicy;

public class Firma {
    public static void main(String[] args) {
        Pracownik magazynier = new Pracownik();
        Pracownik dyrektor = new Pracownik("Zofia", "Brzeczyszczykiewicz", 78);


        magazynier.setImie("Adam");
        magazynier.setNazwisko("Kowalski");
        magazynier.setWiek(55);

//        dyrektor.wiek = 78;
//        dyrektor.imie = "Zofia";
//        dyrektor.nazwisko = "Brzeczyszczykiewicz";

        magazynier.pobierzDane();
        dyrektor.pobierzDane();
    }
}
