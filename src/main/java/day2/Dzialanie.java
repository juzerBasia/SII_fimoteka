package day2;

public class Dzialanie {
    public static int mnozenie(int a, int b) {
        return a*b;
    }

    public static int mnozenie(int a, int b, int c) {
        return a*b*c;
    }

    public static int mnozenie(int a, int b, int c, int d) {
        return a*b*c*d;
    }

    public static void main(String[] args) {
        System.out.println(mnozenie(2,3));
        System.out.println(mnozenie(3,4,5));
        System.out.println(mnozenie(5,6,7,8));
    }
}
