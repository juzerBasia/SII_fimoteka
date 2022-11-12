package day2.filmoteka.handlers;

import day2.filmoteka.models.MenuOptions;

import java.util.Scanner;

public class UserInputHandler {
    static Scanner scanner = new Scanner(System.in);


    public static MenuOptions getMenuOptionFromUser() {
        return MenuOptions.values()[getSelectedOptionFromUser() - 1];
    }

    private static int getSelectedOptionFromUser() {
        int result = getIntegerFromUser();
        scanner.nextLine();//??????????????????????????????

        if (result > 0 && result < MenuOptions.values().length + 1) {
            return result;
        } else {
            System.out.println("You selected non exiting option: " + result);
            System.out.println("Please try again");
            return getSelectedOptionFromUser();
        }
    }

    private static int getIntegerFromUser() {
        while (!scanner.hasNext()) {
            scanner.nextLine();
            System.out.println("incorrect number, try again");
        }
        return scanner.nextInt();
    }
}
