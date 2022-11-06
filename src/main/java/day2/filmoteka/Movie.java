package day2.filmoteka;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    List<Actor> aktorzy = new ArrayList<>();
    String tytul;
    int rokPremiery;
    Director director;
    Genere genere;

    public Movie(List<Actor> aktorzy, String tytul, int rokPremiery, Director director, Genere genere) {
        this.aktorzy = aktorzy;
        this.tytul = tytul;
        this.rokPremiery = rokPremiery;
        this.director = director;
        this.genere = genere;
    }

    public Movie(String tytul, int rokPremiery, Director director, Genere genere) {
        this.tytul = tytul;
        this.rokPremiery = rokPremiery;
        this.director = director;
        this.genere = genere;
    }

    public void addActor(Actor actor) {
        aktorzy.add(actor);
    }

    @Override
    public String toString() {
        return tytul + "("+rokPremiery+" "+director+")";
    }
}
