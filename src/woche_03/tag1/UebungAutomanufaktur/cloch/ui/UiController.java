package woche_03.tag1.UebungAutomanufaktur.cloch.ui;

import woche_03.tag1.UebungAutomanufaktur.cloch.model.Car;
import woche_03.tag1.UebungAutomanufaktur.cloch.settings.AppCommands;
import woche_03.tag1.UebungAutomanufaktur.cloch.settings.AppTexts;
import de.rhistel.logic.ConsoleReader;

/**
 * Implementiert die Steuerlogik für die Benutzeroberfläche
 */
public class UiController {

    //region Konstanten
    //endregion

    //region Attribute
    //endregion

    //region Konstruktoren
    //endregion

    //region Methoden
    public static void startApplication() {
        printAppName();
        startMainLoop();
    }

    private static void printAppName() {
        System.out.println(AppTexts.APP_NAME);
    }

    private static void startMainLoop() {

        boolean exitApp = false;
        do {

            printMainMenu();

            int userChoice = ConsoleReader.in.readPositivInt();
            switch (userChoice) {
                case AppCommands.OPTION_CONFIGURE_CAR -> configureCar();
                case AppCommands.OPTION_HELP -> printHelpInstructions();
                case AppCommands.OPTION_EXIT -> exitApp = true;
            }

        } while (!exitApp);
    }

    private static void configureCar() {
        //Informationen des autos einlesen
        System.out.println(AppTexts.TXT_INPUT_CAR_INFORMATION);

        System.out.print(AppTexts.TXT_INPUT_BRAND);
        String brand = ConsoleReader.in.readMandatoryString();
        System.out.print(AppTexts.TXT_INPUT_MODEL);
        String model = ConsoleReader.in.readMandatoryString();
        System.out.print(AppTexts.TXT_INPUT_HORSE_POWER);
        int horsePower = ConsoleReader.in.readPositivInt();
        System.out.print(AppTexts.TXT_INPUT_PRICE);
        double price = ConsoleReader.in.readPositivDouble();
        System.out.print(AppTexts.TXT_INPUT_COLOR);
        String color = ConsoleReader.in.readMandatoryString();

        //Auto-Objekt mit eingegebenen Informationen erzeugen
        Car newCar = new Car(brand, model, horsePower, price, color);

        //Ausgabe des Autos (kurz und knapp)
//        System.out.println("\nIhr gewünschtes Auto:");
//        System.out.println(newCar);

        //Ausgabe des autos (aufbereitet)
        System.out.printf(AppTexts.TXT_CAR_OUTPUT,
                newCar.getBrand(), newCar.getModel(), newCar.getHorsePower(), newCar.getPrice(), newCar.getColor());
    }

    private static void printMainMenu() {
        System.out.printf(AppTexts.TEMPLATE_MAIN_MENU, AppCommands.OPTION_CONFIGURE_CAR, AppCommands.OPTION_HELP, AppCommands.OPTION_EXIT);
    }

    private static void printHelpInstructions() {
        System.out.println(AppTexts.TXT_HELP);
    }
    //endregion
}
