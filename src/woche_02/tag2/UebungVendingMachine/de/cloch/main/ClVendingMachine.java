package woche_02.Tag2.UebungVendingMachine.de.cloch.main;

import de.rhistel.logic.ConsoleReader;

/**
 * Übungsauflösung - VendingMachine
 */

public class ClVendingMachine {

    //region Konstanten
    public static final String APP_NAME = "Cl VendingMachine";
    public static final String TXT_GET_YOUR_DRINK = "\nEntnehmen Sie ihr Getränk: %s";
    public static final String TXT_GET_YOUR_DRINK_AND_CHANGE = "\nEntnehmen Sie ihr Getränk: %s und ihr Rückgeld: %.2f\n";
    public static final String TXT_NOT_ENOUGH_MONEY = "\nEs fehlen %.2f €. Entnehmen Sie ihr Geld: %.2f €\n";
    public static final String TXT_CHOOSE_A_DRINK = "\nWählen Sie eines der folgenden Getränke:";
    public static final String TEMPLATE_DRINK_SELECTION_ENTRY = "[ %s ] %s - %s €\n";
    public static final String TEMPLATE_DRINK_SELECTION_ENTRY_LAST = "=====================\n[ %s ] %s\n";
    public static final String TXT_INSERT_MONEY = "\nWerfen Sie bitte %s € ein:\n";
    public static final String TXT_INVALID_CHOICE = "Ungültige Auswahl!";
    public static final String TXT_EXIT_PROGRAMM = "\nProgramm wird beendet...";
    public static final String EXIT = "Beenden";
    //endregion Konstanten

    //region Variablen
    public static String[] products = new String[]{"Cola", "Fanta", "Wasser", "Sprudel"};
    public static double productPrice = 2.0;
    //endregion Variablen

    //region Methoden
    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {
        printApplicationName();
        handlePurchase();
    }

    private static void printApplicationName() {
        System.out.println(APP_NAME);
    }

    public static void handlePurchase() {

        boolean exitApp = false;

        do {

            printDrinks();

            int chosenIndex = readValidDrinkIndexFromConsole();

            double moneyGiven = readMoneyFromConsole();

            if (moneyGiven == productPrice) {
                System.out.printf(TXT_GET_YOUR_DRINK, products[chosenIndex]);
            } else if (moneyGiven > productPrice) {
                System.out.printf(TXT_GET_YOUR_DRINK_AND_CHANGE,
                        products[chosenIndex], moneyGiven - productPrice);
            } else {
                System.out.printf(TXT_NOT_ENOUGH_MONEY,
                        productPrice - moneyGiven, moneyGiven);
            }

        } while (!exitApp);
    }

    private static void printDrinks() {
        //Ausgabe der Getränke
        System.out.println(TXT_CHOOSE_A_DRINK);

        for (int i = 0; i < products.length; i++) {
            System.out.printf(TEMPLATE_DRINK_SELECTION_ENTRY, i, products[i], productPrice);
        }
        System.out.printf(TEMPLATE_DRINK_SELECTION_ENTRY_LAST, products.length, EXIT);
    }

    private static int readValidDrinkIndexFromConsole() {
        //Auswahl eines Getränkes über Konsoleneingabe
        int chosenIndex = -1;

        do {

            chosenIndex = ConsoleReader.in.readPositivInt();

            if (chosenIndex > products.length) System.out.println(TXT_INVALID_CHOICE);
            else if (chosenIndex == products.length){
                System.out.println(TXT_EXIT_PROGRAMM);
                System.exit(0);
            }

        } while (chosenIndex >= products.length);

        return chosenIndex;
    }

    private static double readMoneyFromConsole() {
        //Geldeinwurf
        System.out.printf(TXT_INSERT_MONEY, productPrice);
        return ConsoleReader.in.readPositivDouble();
    }
    //endregion Methoden
}