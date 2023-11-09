package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.test;

import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model.Brand;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model.Smartphone;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model.SmartphoneBrand;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.settings.AppTexts;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.ui.UiController;
import de.rhistel.logic.ConsoleReader;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Main Klasse zum Start des Programms für Testzwecke
 */
public class TestMain {

    //region Methoden
    public static void main(String[] args) {

        //Test der eigenen "Enum-Abbildung" Brand
//        testBrand();

        //Test des SmartphoneBrand-Enums
//        testSmartphoneBrand();

        //Test der TestData-Klasse
//        testTestData();

        //Test der Modellklasse
//        testSmartphone();
    }

    private static void testBrand() {

        System.out.println(Arrays.toString(Brand.values()));

        Brand brand = Brand.Xiaomi;
        System.out.println(brand.name());
        System.out.println(brand.ordinal());

        System.out.println("\nBitte Marke eingeben:");
        String brandName = ConsoleReader.in.readString();

        try {
            brand = Brand.valueOf(brandName);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(brand.name());
        System.out.println(brand.ordinal());

        System.out.println(brand);
    }

    private static void testSmartphoneBrand() {
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
//        List<Smartphone> smartphones = TestData.createTestSmartphones();
//        System.out.println(smartphones);
    }

    private static void testSmartphone() {
//        Smartphone smartphone = new Smartphone();
////        System.out.println(smartphone);
////        smartphone.setBrand("andere_marke");
////        smartphone.setModel("anderes_modell");
////        System.out.println(smartphone);
//
//        smartphone = new Smartphone(SmartphoneBrand.Samsung, "S10", 64, 3.5);
//        System.out.println(smartphone.getBrand());
//        System.out.println(smartphone.getModel());
//        System.out.println(smartphone);
    }
    //endregion
}
