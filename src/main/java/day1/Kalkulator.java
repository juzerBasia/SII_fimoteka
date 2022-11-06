package day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        System.out.println(add(getNumberFromUser(),getNumberFromUser()));
        System.out.println(substract(getNumberFromUser(), getNumberFromUser()));
        System.out.println(multiply(getNumberFromUser(),getNumberFromUser()));
        System.out.println(divide(getNumberFromUser(),getNonZeroNumberFromUser()));
    }

    private static int getNonZeroNumberFromUser() {
        int i = getNumberFromUser();
        while (i==0) {
            System.out.println("nie dziel przez 0 - podaj inna liczbe");
            i = getNumberFromUser();
        }
        return i;
    }

    public static int add (int a, int b) {
        return a+b;
    }
    public static int substract(int a, int b) {
        return a-b;
    }
    public static int multiply(int a, int b) {
        return a*b;
    }
    public static int divide(int a, int b) {
        return a/b;
    }
    public static int getNumberFromUser() {
        System.out.println("Podaj liczbę: ");
        Scanner input = new Scanner(System.in);
        Integer i = null;

        while (i == null) {
            try {
                i = input.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("to nie jest liczba");
                input.nextLine();
            }
        }
        return i;
    }

}
