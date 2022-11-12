package day2.filmoteka.factories;

import day2.filmoteka.models.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;

public class MovieFactory {
    public static MovieLibrary createMovielistFromObjects() {
        MovieLibrary filmoteka = new MovieLibrary();

        Actor helenMirien = new Actor("Helen", "Mirien");
        Actor seanConery = new Actor("Sean", "Conery");
        Actor tomCruise = new Actor("Tom", "Cruise");
        Actor merylStreep = new Actor("Meryl", "Streep");

        Director dirRomanPolanski = new Director("Roman", "Polanski");
        Director dirStevenSpielberg = new Director("Steven", "Spielberg");

        filmoteka.addMovie(new Movie(Arrays.asList(helenMirien, tomCruise), "Ogniem i mieczem", 1995, dirRomanPolanski, Genere.DRAMAT));
        filmoteka.addMovie(new Movie(Arrays.asList(seanConery, tomCruise, merylStreep), "Wielki Blekit", 1980, dirStevenSpielberg, Genere.DRAMAT));
        filmoteka.addMovie(new Movie(Arrays.asList(helenMirien, merylStreep, seanConery), "Gwiezdne wojny", 1985, dirStevenSpielberg, Genere.THRILLER));

        return filmoteka;
    }

    public static MovieLibrary createMovielistFromFile(){
        return null;
    }

/*    private Movie movieFrom(final Path json) {
        try {
            return Movie.Parser.parseJson(FileUtils.readFileToString(json.toFile(), StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/

    public static MovieLibrary createMovielistFromDataBase(){
        return null;
    }


}
