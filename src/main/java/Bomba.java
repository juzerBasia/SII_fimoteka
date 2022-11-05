import java.util.Scanner;

public class Bomba {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe sekund");
        int sec = input.nextInt();

        System.out.println("z uzyciem for");
        for (int i = sec; i>=0; i--) {
            System.out.println("Bomba wybuchnie za "+i+"s");
        }
        System.out.println("buuummm");

        System.out.println("z uzyciem while");
        int k = sec;
        while (k>=0) {
            System.out.println("Bomba wybuchnie za "+k+"s");
            k--;
        }
        System.out.println("buuummm");

        System.out.println("z uzyciem do while");
        int n = sec;
        do {
            System.out.println("Bomba wybuchnie za "+n+"s");
            n--;
        }
        while (n>=0);
        System.out.println("buuummm");
    }
}
