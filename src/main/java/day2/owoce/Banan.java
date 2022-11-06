package day2.owoce;

public class Banan extends BaseOwoc {
    public Banan(int waga) {
        kolor = "zolty";
        this.waga = waga;
        cena = 2;
    }

    @Override
    public String pobierzKolor() {
        return kolor;
    }
}
