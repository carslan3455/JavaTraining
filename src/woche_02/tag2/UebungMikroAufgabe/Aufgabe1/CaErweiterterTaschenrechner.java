package woche_02.tag2.UebungMikroAufgabe.Aufgabe1;

import de.rhistel.logic.ConsoleReader;

public class CaErweiterterTaschenrechner {

    //region Konstanten
    public static final String APP_NAME = "Erweiterter Taschenrechner";
    public static final String TXT_WAHL_GRUNDRECHENARTEN = "\nWählen Sie eines der folgenden Rechenart:";
    public static final String TXT_SELECTION_ENTRY = "[%s] %s\n";
    public static final String TXT_SELECTION_ENTRY_LAST = "=====================\n[%s] %s\n";
    public static final String TXT_INVALID_WAHL = "Ungültige Auswahl!";
    public static final String TXT_EXIT_PROGRAMM = "\nProgramm wird beendet...";
    public static final String EXIT = "Beenden";
    public static final String TXT_ERSTE_ZAHL = "\nGeben Sie der erste Zahl ein: ";
    public static final String TXT_ZWEITE_ZAHL = "\nGeben Sie der zweite Zahl ein: ";
    public static final String TXT_ERGEBNIS = "\nErgebnis : ";
    public static final String ADDITION = " + ";
    public static final String SUBTRAKTION = " - ";
    public static final String MULTIPLIKATION = " * ";
    public static final String DIVISION = " / ";
    public static final String GLEICH = " = ";
    public static final String TXT_ZAHL_FORM_CONSOLE = "\nGeben Sie eine Zahl ein:";

    //endregion Konstanten

    //region Variablen
    public static String[] rechenarten = {"Addition", "Subtraktion", "Multiplikation", "Division"};
    public static int[] zahlen;

    //enderegion Variablen

    public static void main(String[] args) {

        runApplication();

    }

    private static void runApplication() {

        printApplicationName();
        startRechen();
    }

    private static void printApplicationName() {

        System.out.println(APP_NAME);
    }

    private static void startRechen() {

        boolean exitApp = false;

        int wahl;

        do {
            printRechenarten(rechenarten);
            wahl = validIndexFromConsole();
//            initileisArray(wahl);

        } while (!exitApp);

    }

        private static void rechnen(int wahl) {

        System.out.println(TXT_ERSTE_ZAHL);
        zahlen[0] = ConsoleReader.in.readInt();
        System.out.println(TXT_ZWEITE_ZAHL);
        zahlen[1] = ConsoleReader.in.readInt();

        switch (wahl){
            case 0: System.out.println(TXT_ERGEBNIS + zahlen[0] + ADDITION + zahlen[1] + GLEICH + (zahlen[0]+zahlen[1])); break;
            case 1: System.out.println(TXT_ERGEBNIS + zahlen[0] + SUBTRAKTION + zahlen[1] + GLEICH + (zahlen[0]-zahlen[1])); break;
            case 2: System.out.println(TXT_ERGEBNIS + zahlen[0] + MULTIPLIKATION + zahlen[1] + GLEICH + (zahlen[0]*zahlen[1])); break;
            case 3: System.out.println(TXT_ERGEBNIS + zahlen[0] + DIVISION + zahlen[1] + GLEICH + (zahlen[0]/zahlen[1])); break;

        }

    }
//    private static void initializeArray(int wahl) {
//
//        int index = 0;
//
//        System.out.println(TXT_ZAHL_FORM_CONSOLE);
//        zahlen[index] = ConsoleReader.in.readInt();
//        index++;
//        System.out.println(TXT_ZAHL_FORM_CONSOLE);
//        zahlen[index] = ConsoleReader.in.readInt();
//        index++;
//
//        do {
//
//            System.out.println("\nMöchten Sie weiterhin Zahlen eingeben?");
//            boolean weiterhin = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();
//            if (weiterhin) {
//                System.out.println(TXT_ZAHL_FORM_CONSOLE);
//                zahlen[index] = ConsoleReader.in.readInt();
//                index++;
//            }
//        } while (true);
//
//
//    }

    private static void printRechenarten(String[] array) {

        System.out.println(TXT_WAHL_GRUNDRECHENARTEN);

        for (int i = 0; i < array.length; i++) {
            System.out.printf(TXT_SELECTION_ENTRY, i, array[i]);
        }
        System.out.printf(TXT_SELECTION_ENTRY_LAST, array.length, EXIT);

    }

    private static int validIndexFromConsole() {

        int indexWahl = -1;

        do {
            indexWahl = ConsoleReader.in.readPositivInt();

            if (indexWahl > rechenarten.length) {
                System.out.println(TXT_INVALID_WAHL);
                System.out.println();
            } else if (indexWahl == rechenarten.length) {
                System.out.println(TXT_EXIT_PROGRAMM);
                System.exit(0);
            }

        } while (indexWahl >= rechenarten.length);

        return indexWahl;
    }
}