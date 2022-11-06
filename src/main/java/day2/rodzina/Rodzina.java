package day2.rodzina;

public class Rodzina {
    public static void main(String[] args) {
        Dzieci dziecko1 = new Dzieci("Karol", "Magdalena", "Adas");
        dziecko1.powiedzText("jestem dzieckiem");
        System.out.println(dziecko1.imie+dziecko1.imieMatki+dziecko1.imieDziadka);

        Dziadkowie.powiedzText("helloWorld");

        Dziadkowie.nazwiskoRodowe = "Malinowski";

        Dziadkowie d1 = new Dziadkowie("Basia");
        d1.powiedzText("helloWorld");

        Dziadkowie d2 = new Dziadkowie("Andrzej");
        d2.powiedzText("helloWorld");
        d2.nazwiskoRodowe = "Nowak";
        System.out.println(Dziadkowie.nazwiskoRodowe);
    }
}
