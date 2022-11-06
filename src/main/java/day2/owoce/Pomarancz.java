package day2.owoce;

public class Pomarancz extends BaseOwoc {
    public Pomarancz(int waga) {
        kolor = "pomaranczowy";
        this.waga = waga;
        cena = 3;
    }

    @Override
    public String pobierzKolor() {
        return kolor;
    }
}
