package day2.filmoteka;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class MovieLibrary {
    List<Movie> movies = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void showMovieFromDates(int startDate, int endDate) {
        List<Movie> movies = getMovieFromDates(startDate, endDate);
        for (Movie m : movies)
            System.out.println(m);
    }

    private List<Movie> getMovieFromDates(int startDate, int endDate) {
        List<Movie> tmp = new ArrayList<>();
//        for (Movie m : movies) {
//            if (m.rokPremiery >= startDate && m.rokPremiery <= endDate)
//                tmp.add(m);
//        }
//        return tmp;
        return movies.stream().filter(item -> item.rokPremiery >=startDate && item.rokPremiery<=endDate).collect(Collectors.toList());
    }

    public void showRandomMovie() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, movies.size());
        System.out.println(movies.get(randomNum));
    }

    private List<Movie> getMoviesByActor(Actor actor) {
//        List<Movie> tmp = new ArrayList<>();
//        for (Movie m : movies) {
//            if (m.aktorzy.contains(actor))
//                tmp.add(m);
//        }
//        return tmp;
        return movies.stream().filter(item-> item.aktorzy.contains(actor)).collect(Collectors.toList());
    }
    public void showMoviesByActor(Actor actor) {
        for (Movie m : getMoviesByActor(actor))
            System.out.println(m);
    }



}
