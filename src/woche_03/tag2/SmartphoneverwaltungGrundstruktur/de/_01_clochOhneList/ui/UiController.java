package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.ui;

import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.model.Smartphone;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.settings.AppCommands;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.settings.AppTexts;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.test.TestData;
import de.rhistel.logic.ConsoleReader;

/**
 * Implementiert die Steuerlogik für die Benutzeroberfläche
 * TODO 3 - UiController anlegen und implementieren (soweit wie hier)
 */
public class UiController {

    //region Konstanten
    //endregion

    //region Attribute
    private static Smartphone[] smartphones;
    //endregion

    //region Konstruktore
    private UiController() {

    }
    //endregion

    //region Methoden
    public static void startUi() {
        initialize();
        printAppName();
        startMainApplicationLoop();
    }

    private static void initialize() {
        smartphones = TestData.createTestSmartphones();
    }

    private static void printAppName() {
        System.out.println(AppTexts.APP_NAME);
    }

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

    private static void printMenu() {
        System.out.printf(AppTexts.TEMPLATE_MAIN_MENU,
                AppCommands.CREATE, AppCommands.SHOW, AppCommands.EDIT,
                AppCommands.DELETE, AppCommands.EXIT);
    }

    private static void create() {
        System.out.println("\nTODO: Anlegen");
    }

    private static void show() {
        System.out.printf(AppTexts.TEMPLATE_SMARTPHONES_HEADER,
                AppTexts.TXT_INDEX, AppTexts.TXT_BRAND, AppTexts.TXT_MODEL, AppTexts.TXT_STORAGE_SIZE,
                AppTexts.TXT_SCREEN_SIZE);

        for (int i = 0; i < smartphones.length; i++) {
            System.out.printf(AppTexts.TEMPLATE_SMARTPHONES_ENTRY,
                    i + 1, smartphones[i].getBrand(), smartphones[i].getModel(),
                    smartphones[i].getStorageSize(), smartphones[i].getScreenSize());
        }
    }

    private static void edit() {
        System.out.println("\nTODO: Bearbeiten");

    }

    private static void delete() {
        System.out.println("\nTODO: Löschen");
    }

    //endregion
}
