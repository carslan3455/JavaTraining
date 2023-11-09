package woche_02.Tag2.UebungVendingMachine.de.carslan.main;

import de.rhistel.logic.ConsoleReader;


public class CAVendingMachine {

    // region Konstanten
    public static final String APP_NAME = "= Vending Machine =";
    public static final String TXT_WAHL = "\nGeben Sie bitte Ihren Wahl ein";
    public static final String TXT_GELD = "\nGeben Sie bitte Geld ein";

    // enderegion Konstanten

    // region Variablen
    public static String[] produckt;
    public static final double productPreis = 2.0;

    // enderegion Variablen

    public static void main(String[] args) {

        startApplication();


    }

    // region Methoden
    public static void startApplication() {

        printApplicationName();
        initializeArrays();
        printProduktName(produckt);
        kaufen();

    }

    public static void printApplicationName() {

        System.out.println("\n===================");
        System.out.println(APP_NAME);
        System.out.println("===================");
    }

    public static void initializeArrays() {

        produckt = new String[]{"Cola", "Fanta", "Mezzo Mix", "Sprudel"};

    }

    public static int indexWahl(String[] array) {

        int wahl;

        do {
            printArray(array);
            System.out.println(TXT_WAHL);
            wahl = ConsoleReader.in.readPositivInt();
            if (wahl < array.length)
                System.out.printf("\nIhren Wahl: %s", wahl);
            else System.out.println("\nUngültige Wahl");
        } while (wahl >= array.length);

        return wahl;
    }

    public static void printArray(String[] array) {

        System.out.println("\nAlle produkte kosten " + productPreis + "\n");

        for (int i = 0; i <array.length ; i++) {
            System.out.printf("[ %s ] %s - %s €\n", i, array[i], productPreis );

        }

    }

    public static void printProduktName(String[] array) {

        int index = indexWahl(produckt);

        for (int i = 0; i < array.length; i++) {

            if (index == i) System.out.println("\nIhre Wahl ist " + array[i] + " ");
        }

    }


    public static void kaufen() {

        double geld;

        do {
            System.out.println();
            System.out.println(TXT_GELD);
            geld = ConsoleReader.in.readPositivDouble();
            rechnen(geld);

        } while (geld < productPreis);
    }

    public static void rechnen(double preis) {

        double rückgeld;

        if (preis > productPreis) {
            rückgeld = preis - productPreis;
            System.out.printf("\nNehmen Sie bitte Rückgeld: \t %.2f", rückgeld);
            System.out.println("\nGenießen Sie die Getränk");
        } else {
            System.out.println("\nUnkorrekte Betrag.... Geben Sie Ihre Geld zurück...");
            System.out.printf("Preis fehlt : %.2f", (productPreis - preis));
        }
    }

    //edneregion Methoden
}
