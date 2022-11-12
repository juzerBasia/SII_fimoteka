package day2.filmoteka;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class MovieLibrary {
    private List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void showMovieFromDates(int startDate, int endDate) {
        List<Movie> movies = getMovieFromDates(startDate, endDate);
        for (Movie m : movies)
            System.out.println(m);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    private List<Movie> getMovieFromDates(int startDate, int endDate) {
        List<Movie> tmp = new ArrayList<>();
//        for (Movie m : movies) {
//            if (m.rokPremiery >= startDate && m.rokPremiery <= endDate)
//                tmp.add(m);
//        }
//        return tmp;
        return movies.stream().filter(item -> item.getRokPremiery() >=startDate && item.getRokPremiery()<=endDate).collect(Collectors.toList());
    }

    public void showRandomMovie() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, movies.size());
        System.out.println(movies.get(randomNum));
    }

    private List<Movie> getMoviesByActor(Actor actor) {
        List<Movie> currentActorsList = new ArrayList<>();
        for (Movie m : movies) {
            var listaAktorow = m.getAktorzy();
            for (Actor actor1 : listaAktorow) {
                if (actor1.getImie() == actor.getImie() && actor1.getNazwisko() == actor.getNazwisko()) {
                    currentActorsList.add(m);
                }
            }
        }
        return currentActorsList;
       // return movies.stream().filter(item-> item.getAktorzy().contains(actor)).collect(Collectors.toList());

    }
    public void showMoviesByActor(Actor actor) {
        for (Movie m : getMoviesByActor(actor))

            System.out.println(m);
    }



}
