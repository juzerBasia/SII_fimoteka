package day2.filmoteka.models;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private List<Actor> aktorzy = new ArrayList<>();
    private String tytul;
    private int rokPremiery;
    private Director director;
    private Genere genere;

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

    public List<Actor> getAktorzy() {
        return aktorzy;
    }

    public void setAktorzy(List<Actor> aktorzy) {
        this.aktorzy = aktorzy;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getRokPremiery() {
        return rokPremiery;
    }

    public void setRokPremiery(int rokPremiery) {
        this.rokPremiery = rokPremiery;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "--->"+tytul + "("+rokPremiery+" "+director+")";
    }
}
