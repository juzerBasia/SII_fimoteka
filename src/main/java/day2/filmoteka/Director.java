package day2.filmoteka;

public class Director {
    String imie;
    String nazwisko;

    public Director(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie+" "+nazwisko;
    }
}
