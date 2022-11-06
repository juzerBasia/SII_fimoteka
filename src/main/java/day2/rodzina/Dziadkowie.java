package day2.rodzina;

public class Dziadkowie {
    String imieDziadka;
    public static String nazwiskoRodowe;

    public Dziadkowie(String imieDziadka) {
        this.imieDziadka = imieDziadka;
    }

    public static void powiedzText(String text) {
//        System.out.println(text);
        //System.out.println(imieDziadka); tak nie mozna, bo imieDziadka jest polem klasy niestatycznym
        System.out.println(nazwiskoRodowe);
    }
}
