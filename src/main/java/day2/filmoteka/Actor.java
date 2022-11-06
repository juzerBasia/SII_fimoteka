package day2.filmoteka;

public class Actor {
    String imie;
    String nazwisko;

    public Actor(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return imie+" "+nazwisko;
    }
}
