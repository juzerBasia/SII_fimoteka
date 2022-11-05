import java.util.ArrayList;
import java.util.List;

public class Listy1 {
    public static void main(String[] args) {
        /*Stwórz listę liczb od 0 do 100. Pomnóż liczby parzyste przez 2.
            Wydrukuj listę na konsoli.
        */
        List<Integer> listaLiczb = new ArrayList<>(); //listy operuja tylko na obiektach, dlatego zamiast int uzywam Integer

        for (int i =0; i<=100; i++)
            listaLiczb.add(i);

//        for (int i =2; i<=listaLiczb.size(); i+=2) { //iteruje sie co drugi element listy, zaczynajac od pierwszego parzystego
//            listaLiczb.set(i, listaLiczb.get(i)*2);
//        }

        for (Integer i : listaLiczb) {
            if (i%2 == 0)
                listaLiczb.set(listaLiczb.indexOf(i), i*2);
        }

        for (Integer i : listaLiczb) //petla forech
            System.out.println(i);

    }
}
