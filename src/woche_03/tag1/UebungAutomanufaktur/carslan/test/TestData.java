package woche_03.tag1.UebungAutomanufaktur.carslan.test;

public class TestData {
    public static String[] marke = {"Volkswagen", "BMW", "Mercedes", "Audi"};
    public static String[] kraftstoff = {"Benzin", "Diesel", "Elektro", "Hybrid"};
    public static Integer[] anzahlDerSitzer = {2, 4, 5, 7};
    public static String[] farben = {"Blau", "Grau", "Weiß", "Schwarz"};


    public static String[] createMarke() {
        return marke;
    }

    public static String[] createKraftstoff() {
        return kraftstoff;
    }

    public static Integer[] createAnzahlDerSitzer() {
        return anzahlDerSitzer;
    }

    public static String[] createFarben() {
        return farben;
    }
}
