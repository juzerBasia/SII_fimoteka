package day2.filmoteka.handlers;

public class MenuHandler {
    public static void printMenu() {
        System.out.println("Welcome in Filmoteka\n");
        System.out.println("Available actions (choose one option):");
        System.out.println(""" 
                1. display all about random movie
                2. display films between 1985-2000
                3. display films with Sean Connery
                4. quit
                """);//formatowanie wygodne do JSON https://www.javappa.com/kurs-java/java8/nowosci-w-kodzie-java-15
    }
}
