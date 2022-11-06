package day2.pracownicy;

public class Pracownik {
    String imie;
    String nazwisko;
    int wiek;

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public Pracownik() {
    }

    public String getImie() {
        return imie;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void pobierzDane() {
        System.out.println(imie + " " + nazwisko + " ma " + wiek + " lat");
    }
}
