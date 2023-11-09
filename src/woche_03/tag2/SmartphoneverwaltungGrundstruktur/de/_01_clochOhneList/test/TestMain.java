package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.test;

import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.model.Smartphone;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.model.SmartphoneBrand;

import java.util.Arrays;

/**
 * Main Klasse zum Start des Programms für Testzwecke
 * TODO 1.1 - Modellklasse testen
 * TODO 2.1 - Enum SmartphoneBrand testen
 */
public class TestMain {

    //region Methoden
    public static void main(String[] args) {


        //Test des SmartphoneBrand-Enums
        testSmartphoneBrand();

        //Test der TestData-Klasse
//        testTestData();

        //Test der Modellklasse
//        testSmartphone();
    }

    private static void testSmartphoneBrand() {
        System.out.println(SmartphoneBrand.Apple);
//        System.out.println(SmartphoneBrand.values()[1]);

//        //Eigene Eigenschaften der Enum-Objekte
//        System.out.println(SmartphoneBrand.Apple + "-Modelle: " + Arrays.toString(SmartphoneBrand.Apple.models) );
//        System.out.println(SmartphoneBrand.Samsung + "-Modelle: " + Arrays.toString(SmartphoneBrand.Samsung.models) );
//        System.out.println(SmartphoneBrand.Xiaomi + "-Modelle: " + Arrays.toString(SmartphoneBrand.Xiaomi.models) );
//
//        //Wertzuweisung
//        SmartphoneBrand brand = SmartphoneBrand.Xiaomi;
//        System.out.println(brand);
//
//        String userInput = "Samsung";
//        //String umwandeln in Objekt des Enums
//        brand = SmartphoneBrand.valueOf(userInput);
//        System.out.println(brand.name() + " " + brand.ordinal());
//
//        //Alle Elemente des Enums auslesen
//        System.out.println(Arrays.toString(SmartphoneBrand.values()));
    }

    private static void testTestData() {
        Smartphone[] smartphones = TestData.createTestSmartphones();
        System.out.println(Arrays.toString(smartphones));
    }

    private static void testSmartphone() {
        Smartphone smartphone = new Smartphone();
        System.out.println(smartphone);
        smartphone.setBrand("andere_marke");
        smartphone.setModel("anderes_modell");
        System.out.println(smartphone);

        smartphone = new Smartphone("Samsung", "S10", 64, 3.5);
        System.out.println(smartphone.getBrand());
        System.out.println(smartphone.getModel());
        System.out.println(smartphone);
    }
    //endregion
}
