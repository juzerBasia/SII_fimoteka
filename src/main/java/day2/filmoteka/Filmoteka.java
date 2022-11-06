package day2.filmoteka;


import java.util.Arrays;

public class Filmoteka {
    public static void main(String[] args) {

        MovieLibrary filmoteka = new MovieLibrary();
        Actor a1 = new Actor("Helen", "Mirien");
        Actor a2 = new Actor("Sean", "Conery");
        Actor a3 = new Actor("Tom", "Cruise");
        Actor a4 = new Actor("Meryl", "Streep");

        Director d1 = new Director("Roman", "Polanski");
        Director d2 = new Director("Steven", "Spielberg");


        filmoteka.addMovie(new Movie(Arrays.asList(a1, a3), "Ogniem i mieczem", 1995, d1, Genere.DRAMAT));
        filmoteka.addMovie(new Movie(Arrays.asList(a2, a3, a4), "Wielki Blekit", 1980, d2, Genere.DRAMAT));
        filmoteka.addMovie(new Movie(Arrays.asList(a1,a4, a2), "Gwiezdne wojny", 1985, d2, Genere.THRILLER));

        filmoteka.showRandomMovie();

        System.out.println("Filmy z zakresu 1985-2000");
        filmoteka.showMovieFromDates(1985, 2000);

        System.out.println("Filmy z Seanem Conery");
        filmoteka.showMoviesByActor(a2);


    }
}
