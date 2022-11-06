package day2.fabryka;

public class SamochodFactory {

    public static ISamochod getSamochod(int wiekKierowcy) {
        if (wiekKierowcy < 18)
            return null;
        else if (wiekKierowcy < 35)
            return new BMW();
        else if (wiekKierowcy < 65)
            return new Audi();
        else return new Mercedes();
    }
}
