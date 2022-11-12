package day2.filmoteka;

import day2.filmoteka.factories.MovieFactory;
import day2.filmoteka.handlers.MenuHandler;

import java.util.Scanner;

public class Filmoteka {
    private static final int QUIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieLibrary filmoteka =  MovieFactory.createMovielistFromObjects();
/*        MovieLibrary filmoteka2 =  MovieFactory.createMovielistFromDataBase();
        MovieLibrary filmoteka3 =  MovieFactory.createMovielistFromFile();*/

        MenuHandler.printMenu();

        int optionFromUser = scanner.nextInt();

        switch (optionFromUser){
            case 1:
                filmoteka.showRandomMovie();
                break;
            case 2:
                System.out.println("Filmy z zakresu 1985-2000");
                filmoteka.showMovieFromDates(1985, 2000);
                break;
            case 3:
                System.out.println("Filmy z Seanem Conery");
                filmoteka.showMoviesByActor(new Actor("Sean", "Conery"));
                break;
            case QUIT:
                System.out.println("\nWychodzenie z aplikacji");
                System.exit(1);//1 spowoduje  ze aplikacja zamknie sie poprawnie
            default:
                System.out.println("incorrect action");
        }

    }
}
