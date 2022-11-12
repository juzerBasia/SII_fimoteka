package day2.filmoteka.factories;

import day2.filmoteka.*;

import java.util.Arrays;
import java.util.List;

public class MovieFactory {
    public static MovieLibrary createMovielistFromObjects() {
        MovieLibrary filmoteka = new MovieLibrary();

        Actor helenMirien = new Actor("Helen", "Mirien");
        Actor seanConnery = new Actor("Sean", "Conery");
        Actor tomCruise = new Actor("Tom", "Cruise");
        Actor merylStreep = new Actor("Meryl", "Streep");

        Director dirRomanPolanski = new Director("Roman", "Polanski");
        Director dirStevenSpielberg = new Director("Steven", "Spielberg");

        filmoteka.addMovie(new Movie(Arrays.asList(helenMirien, tomCruise), "Ogniem i mieczem", 1995, dirRomanPolanski, Genere.DRAMAT));
        filmoteka.addMovie(new Movie(Arrays.asList(seanConnery, tomCruise, merylStreep), "Wielki Blekit", 1980, dirStevenSpielberg, Genere.DRAMAT));
        filmoteka.addMovie(new Movie(Arrays.asList(helenMirien, merylStreep, seanConnery), "Gwiezdne wojny", 1985, dirStevenSpielberg, Genere.THRILLER));

        return filmoteka;
    }

    public static MovieLibrary createMovielistFromFile(){
        return null;
    }

    public static MovieLibrary createMovielistFromDataBase(){
        return null;
    }


}
