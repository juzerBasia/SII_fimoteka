package day1;

import java.util.Scanner;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj a:");
        int a = input.nextInt();
        System.out.println("podaj b:");
        int b = input.nextInt();

        if  (a==b)
            System.out.println("a jest b");
        else if (a<b)
            System.out.println("a  < b");
        else
            System.out.println(" a > b");
    }
}
