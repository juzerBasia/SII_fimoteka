package day2.owoce;

public abstract class BaseOwoc implements IOwoce{
    int cena;
    String kolor;
    int waga;

    @Override
    public int pobierzCene() {
        return cena;
    }

    @Override
    public int pobierzWage() {
        return waga;
    }

    public abstract String pobierzKolor();
}
