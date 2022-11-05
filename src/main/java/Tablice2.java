import java.util.Scanner;

public class Tablice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj rozmiar");
        int size = input.nextInt();
        int[] tablica = new int[size];

        for (int i=0; i<tablica.length; i++) {
            tablica[i] = i+1;
        }

        for (int k=0; k<tablica.length;k++) {
            System.out.println(tablica[k]);
        }
    }
}
