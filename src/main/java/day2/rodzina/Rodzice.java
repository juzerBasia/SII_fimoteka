package day2.rodzina;

public class Rodzice extends Dziadkowie{
    String imieMatki;

    public Rodzice(String imieDziadka, String imieMatki) {
        super(imieDziadka);
        this.imieMatki = imieMatki;
    }
}
