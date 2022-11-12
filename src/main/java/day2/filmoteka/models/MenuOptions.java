package day2.filmoteka.models;

public enum MenuOptions {

    DISPLAY_INFORMATION_ABOUT_RANDOM_MOVIE(1),
    DISPLAY_DATE_RANGE(2),
    DISPLAY_MOVIES_WITH_ACTOR(3),
    QUIT(4);

    int action;

    MenuOptions(int action) {
        this.action = action;
    }
}
