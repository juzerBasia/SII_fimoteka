package day2.rodzina;

public class Dzieci extends Rodzice {
    String imie;

    public Dzieci(String imieDziadka, String imieMatki, String imie) {
        super(imieDziadka, imieMatki);
        this.imie = imie;
    }
}
