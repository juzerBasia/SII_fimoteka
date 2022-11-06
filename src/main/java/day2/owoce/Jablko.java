package day2.owoce;

public class Jablko extends BaseOwoc {
    public Jablko(int waga) {
        kolor = "czerwony";
        this.waga = waga;

        cena = 1;
    }

    @Override
    public String pobierzKolor() {
        return kolor;
    }
}
