package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.ui;

import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model.Smartphone;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model.SmartphoneBrand;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.settings.AppCommands;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.settings.AppTexts;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.test.TestData;
import de.rhistel.logic.ConsoleReader;

import java.util.List;

/**
 * Implementiert die Steuerlogik für die Benutzeroberfläche
 * TODO 1 Das Smartphone-Array durch eine Liste austauschen
 * TODO 2 Funktionalität zum Anlegen neuer Smartphones implementieren
 */
public class UiController {

    //region Konstanten
    //endregion

    //region Attribute
    private static List<Smartphone> smartphoneList;
    //endregion

    //region Konstruktor
    private UiController() {

    }
    //endregion

    //region Methoden

    /**
     * Öffentliche Schnittstelle, über die das Programm gestartet werden kann
     */
    public static void startUi() {
        initialize();
        printAppName();
        startMainApplicationLoop();
    }

    /**
     * Initialisiert die Smartphoneliste
     */
    private static void initialize() {
        smartphoneList = TestData.createTestSmartphones();
    }

    /**
     * Gibt den Applikationsnamen auf der Konsole aus
     */
    private static void printAppName() {
        System.out.println(AppTexts.APP_NAME);
    }

    /**
     * Startet die Hauptschleife der Applikation und leitet weitere Logik anhand einer Nutzereingabe ein
     */
    private static void startMainApplicationLoop() {
        boolean exitApp = false;
        do {
            printMenu();

            int userChoice = ConsoleReader.in.readPositivInt();

            switch (userChoice) {
                case AppCommands.CREATE -> create();
                case AppCommands.SHOW -> show();
                case AppCommands.EDIT -> edit();
                case AppCommands.DELETE -> delete();
                case AppCommands.EXIT -> exitApp = true;
                default -> System.out.println(AppTexts.TXT_INVALID_CHOICE);
            }
        } while (!exitApp);
    }

    /**
     * Gibt das Hauptmenü der Applikation aus
     */
    private static void printMenu() {
        System.out.printf(AppTexts.TEMPLATE_MAIN_MENU,
                AppCommands.CREATE, AppCommands.SHOW, AppCommands.EDIT,
                AppCommands.DELETE, AppCommands.EXIT);
    }

    /**
     * Erzeugt ein neues {@link Smartphone} und fügt es in die Liste {@link UiController#smartphoneList} ein
     * TODO 2.3 Methode zum anlegen eines Smartphones implementieren
     */
    private static void create() {
        //Gültige Marke einlesen
        SmartphoneBrand brand = readValidBrandFromConsole();
        //Gültiges Modell einlesen anhand der vorher eingelesenen Marke
        String model = readValidModelOfBrandFromConsole(brand);
        //Speichergröße einlesen
        System.out.println(AppTexts.TXT_INPUT_STORAGE_SIZE);
        int storageSize = ConsoleReader.in.readPositivInt();
        //Bildschirmgröße einlesen
        System.out.println(AppTexts.TXT_INPUT_SCREEN_SIZE);
        double screenSize = ConsoleReader.in.readDouble();

        //Objekt mit eingelesenen Werten erzeugen
        Smartphone smartphone = new Smartphone(brand, model, storageSize, screenSize);

        //Objekt in die Liste einfügen
        smartphoneList.add(smartphone);
    }

    /**
     * Liest eine Marke anhand eines Indexes über die Konsole ein und validiert diesen Index
     * @return Eine Marke aus {@link SmartphoneBrand}
     * TODO 2.1 Methode zum Einlesen einer gültigen Marke über die Konsole implementieren
     */
    private static SmartphoneBrand readValidBrandFromConsole() {
        SmartphoneBrand brand = null;

        //Eingabe der Marke verlangen, bis Auswahl gültig ist
        boolean isValid = false;
        do {

            // nummerierte Ausgabe des Modell-Arrays
            System.out.print(AppTexts.TXT_CHOOSE_BRAND);
            for (int i = 0; i < SmartphoneBrand.values().length; i++) {
                System.out.printf(AppTexts.TEMPLATE_USER_CHOICE_ENTRY, i, SmartphoneBrand.values()[i]);
            }

            //Einlesen des Index
            int brandIndex = ConsoleReader.in.readPositivInt();

            //Eingabe auf Gültigkeit prüfen
            if (brandIndex < SmartphoneBrand.values().length) {
                brand = SmartphoneBrand.values()[brandIndex];
                isValid = true;
            } else {
                System.out.println(AppTexts.TXT_INVALID_CHOICE);
            }

        } while (!isValid);

        return brand;

        //Kürzere Schreibweise (von manchen als unschön betrachtet, wegen der Endlosschleife)
//        do {
//
//            System.out.print(AppTexts.TXT_CHOOSE_BRAND);
//            for (int i = 0; i < SmartphoneBrand.values().length; i++) {
//                System.out.printf(AppTexts.TEMPLATE_USER_CHOICE_ENTRY, i, SmartphoneBrand.values()[i]);
//            }
//
//            int brandIndex = ConsoleReader.in.readPositivInt();
//
//            //Eingabe auf Gültigkeit prüfen
//            if (brandIndex < SmartphoneBrand.values().length) return SmartphoneBrand.values()[brandIndex];
//
//            System.out.println(AppTexts.TXT_INVALID_CHOICE);
//
//        } while (true);
    }

    /**
     * Liest ein gültiges Modell anhand einer übergebenen Marke über die Konsole ein
     * @param brand Marke, mithilfe welcher die Modelleingabe validiert werden soll
     * @return Gültiges Modell der übergebenen Marke
     * TODO 2.2 Methode zum einlesen eines gültigen Modells in Abhängigkeit einer Marke implementieren
     */
    private static String readValidModelOfBrandFromConsole(SmartphoneBrand brand) {
        String model = null;

        //Eingabe eines Modells verlangen, bis Auswahl gültig ist
        boolean isValid = false;
        do {

            // nummerierte Ausgabe des Modell-Arrays
            System.out.println(AppTexts.TXT_CHOOSE_MODEL);
            for (int i = 0; i < brand.getModels().length; i++) {
                System.out.printf(AppTexts.TEMPLATE_USER_CHOICE_ENTRY, i, brand.getModels()[i]);
            }

            //Einlesen des Index
            int modelIndex = ConsoleReader.in.readPositivInt();

            //Eingabe auf Gültigkeit prüfen
            if (modelIndex < brand.getModels().length) {
                model = brand.getModels()[modelIndex];
                isValid = true;
            } else {
                System.out.println(AppTexts.TXT_INVALID_CHOICE);
            }

        } while (!isValid);

        return model;
    }

    /**
     * Methode zur nummerierten und aufbereiteten Ausgabe der Liste {@link UiController#smartphoneList}
     * TODO 1.2 Ausgabe der Smartphones an die Liste anpassen
     */
    private static void show() {
        System.out.printf(AppTexts.TEMPLATE_SMARTPHONES_HEADER,
                AppTexts.TXT_INDEX, AppTexts.TXT_BRAND, AppTexts.TXT_MODEL, AppTexts.TXT_STORAGE_SIZE,
                AppTexts.TXT_SCREEN_SIZE);

        for (int i = 0; i < smartphoneList.size(); i++) {

            Smartphone phone = smartphoneList.get(i);

            System.out.printf(AppTexts.TEMPLATE_SMARTPHONES_ENTRY,
                    i + 1, phone.getBrand(), phone.getModel(), phone.getStorageSize(), phone.getScreenSize());
        }
    }

    /**
     * Bearbeitet ein Objekt der Liste {@link UiController#smartphoneList}
     * TODO 4 Funktionalität zum bearbeiten implementieren
     */
    private static void edit() {
        System.out.println("\nTODO: Bearbeiten");

    }

    /**
     * Löscht ein Objekt aus der Liste {@link UiController#smartphoneList}
     * TODO 3 Funktionalität zum Löschen implementieren
     */
    private static void delete() {
        System.out.println("\nTODO: Löschen");
    }

    //endregion
}
