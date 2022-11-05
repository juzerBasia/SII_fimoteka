import java.util.Scanner;

public class InstrukcjaSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie = input.nextLine();

        switch (imie) {
            case "Patrycja":
            case "Gabrysia" :
            case "Janek" :
            case "Mateusz":
            case "Julek":
            case "Natalia":
            case "Basia":
            case "Krystian":
                System.out.println("Czesc " + imie);
                break;
            default:
                System.out.println("Nie znam Cie :(");
        }
    }
}
