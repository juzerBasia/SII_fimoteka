import java.util.Scanner;

public class Tablice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] tablica = new String[5];
        for (int i =0; i < tablica.length; i++){
            System.out.println("Podaj imie");
            tablica[i] = input.nextLine();
            System.out.println("Czesc "+tablica[i]);
        }
    }
}
