package day1;

public class KonwersjaTypow {
    public static void main(String[] args) {

        //konwersja string do int
        String text = "12";
        int i = Integer.parseInt(text);
        i*=2;
        System.out.println(i);


        //konwersja z systemu dwojkowego w stringu do inta
        int k = Integer.parseInt("10001", 7);
        System.out.println(k);


        //uwaga przy dzieleniu!
        double a = 3/(double)2;
        double b = 3./2;
        double c = (double) 3/2;


        //sout - konwersja niejawna z typu liczbowego na String
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //long inicjujemy z L na koncu
        long d = 1000L;
        System.out.println(d);



    }

}
