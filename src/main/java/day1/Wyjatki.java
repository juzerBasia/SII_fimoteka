package day1;

public class Wyjatki {
    public static void main(String[] args) {
        int[] tab = {5,6,7,1,2};
        try {

            for (int i=0; ; i++)
                System.out.println(tab[i]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("wyszedles poza tablice");
            System.out.println(e.getMessage());
        }

    }
}
