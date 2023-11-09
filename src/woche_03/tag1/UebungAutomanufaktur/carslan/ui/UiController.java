package woche_03.tag1.UebungAutomanufaktur.carslan.ui;

import de.rhistel.logic.ConsoleReader;
import woche_03.tag1.UebungAutomanufaktur.carslan.model.Auto;
import woche_03.tag1.UebungAutomanufaktur.carslan.settings.AppCommands;
import woche_03.tag1.UebungAutomanufaktur.carslan.test.TestData;

import static woche_03.tag1.UebungAutomanufaktur.carslan.settings.AppTexts.*;
import static woche_03.tag1.UebungAutomanufaktur.carslan.settings.AppCommands.*;

/**
 *Implementiert die Steuerlogik für die Benutzeroberfleäche
 * TODO 3 UiController anlegen und implementieren (soweit wie hier)
 */
public class UiController {

    //region Konstanten

    //endregion Konstanten

    //region Variablen

    public static String[] marke ;
    public static String[] kraftstoff;
    public static Integer[] anzahlDerSitzer;
    public static String[] farben;

    public static int markeIndex;
    public static int kraftstoffIndex;
    public static int anzahlIndex;
    public static int farbenIndex;
    public static Auto lieblingsAuto;

    //endregion Variablen

    //region Konstrukter

    private UiController() {
    }
    //endregion Konstrukter

    public static void runApp() {

        printAppName();
        initialize();
        startMainApplication();


    }

    private static void printAppName() {

        System.out.println(APP_HEADER);
    }
    private static void initialize() {

        marke = TestData.createMarke();
        kraftstoff = TestData.createKraftstoff();
        anzahlDerSitzer = TestData.createAnzahlDerSitzer();
        farben = TestData.createFarben();

    }
    private static void startMainApplication() {
        boolean exitApp = false;
        do {
            printMenu();

            int benutzerWahl  = ConsoleReader.in.readPositivInt();

            switch (benutzerWahl) {
                case AUTOMASSENFERTIGUNG -> creat();
                case HILFE -> hilfe();
                case EXIT -> exitApp = true;
                default -> System.out.println(TXT_UNGUELTIGE_WAHL);
            }
        }while (!exitApp);

    }

    private static void printMenu() {
        System.out.printf(TXT_HAUPT_MENU,
                AppCommands.AUTOMASSENFERTIGUNG, AppCommands.HILFE , AppCommands.EXIT);
    }

    private static void creat() {

        System.out.println(TXT_MARKE_WAHL);
        printArrays(marke);
        markeIndex = getIndexFromConsole(marke);
        printArrays(kraftstoff);
        kraftstoffIndex = getIndexFromConsole(kraftstoff);
        printArrays(anzahlDerSitzer);
        anzahlIndex = getIndexFromConsole(anzahlDerSitzer);
        printArrays(farben);
        farbenIndex = getIndexFromConsole(farben);

        lieblingsAuto = new Auto (marke[markeIndex], kraftstoff[kraftstoffIndex], anzahlDerSitzer[anzahlIndex], farben[farbenIndex]);
        System.out.println(lieblingsAuto.toString());

    }

    private static void hilfe() {
        System.out.println("\n=== Hilfe ===");
    }

    private static void printArrays(Object[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("\n[ %s ] %s", i, array[i]);
        }
        System.out.println();
    }


    private static int getIndexFromConsole(Object[] array) {

        int index = -1;
        do {
            index = ConsoleReader.in.readPositivInt();
            if (index >= array.length) System.out.println(TXT_UNGUELTIGE_WAHL);

        } while (index >= array.length);

        return index;
    }

}
