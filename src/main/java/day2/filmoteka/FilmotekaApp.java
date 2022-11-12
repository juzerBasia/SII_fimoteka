package day2.filmoteka;

import day2.filmoteka.factories.MovieFactory;
import day2.filmoteka.handlers.MenuHandler;
import day2.filmoteka.handlers.UserInputHandler;
import day2.filmoteka.models.Actor;
import day2.filmoteka.models.Genere;
import day2.filmoteka.models.Movie;
import day2.filmoteka.models.MovieLibrary;

import java.util.Arrays;

public class FilmotekaApp {
    /*private static final int QUIT = 4;*/

    public static void main(String[] args) {

        MovieLibrary filmoteka =  MovieFactory.createMovielistFromObjects();
/*        MovieLibrary filmoteka2 =  MovieFactory.createMovielistFromDataBase();
        MovieLibrary filmoteka3 =  MovieFactory.createMovielistFromFile();*/

//-------------------------------------------------
        Actor a = new Actor("Abc", "Def");
        Actor b = new Actor("Abc", "Def");
        Movie movie = new Movie(Arrays.asList(a), null, 0, null,null);

        System.out.println(a==b);
        System.out.println(a.getImie()==b.getImie());
        System.out.println(a.equals(b));
        System.out.println(movie.getAktorzy().contains(b));
//-------------------------------------------------

        while(true) {
            MenuHandler.printMenu();

            switch (UserInputHandler.getMenuOptionFromUser()) {
                case DISPLAY_INFORMATION_ABOUT_RANDOM_MOVIE:
                    filmoteka.showRandomMovie();
                    break;
                case DISPLAY_DATE_RANGE:
                    filmoteka.showMovieFromDates(1985, 2000);
                    break;
                case DISPLAY_MOVIES_WITH_ACTOR:
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
}
