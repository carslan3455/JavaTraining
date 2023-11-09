package woche_02.tag1.de.carslan.main;

import de.rhistel.logic.ConsoleReader;

import java.util.Scanner;

/**
 * <h2>Konsoleneingaben</h2>
 *
 * <h3>Standardmöglichkeiten</h3>
 * <ul>
 *     <li>
 *         {@link System#in}: Standardeingabestrom, liest rohe Bytes von der Konsole:
 *         für unsere Zwecke eher ungeeignet
 *     </li>
 *     <li>
 *         {@link java.util.Scanner}: Um diesen richtig nutzen zu können, muss man über die OOP besitzen.
 *         Diese Möglichkeit hat keine eigene Fehlerbehandlung für Falscheingaben, weshalb das Programm dabei abstürzt.<br>
 *         Der {@link java.util.Scanner} muss bei Generierung den Standard-Eingabestrom übergeben bekommen und
 *         er ist auf den Sprachraum des Betriebssystems angepasst.
 *         Die Nutzung des {@link java.util.Scanner}s bietet sich eher für erfahrenere Entwickler an.
 *     </li>
 * </ul>
 *
 * <h3>ConsoleReader</h3>
 * <ol>
 *     <li>ConsoleReaderLib.jar vom Datenaustausch laden</li>
 *     <li>C:\libraries\ConsoleReaderLib.jar</li>
 *     <li>Menü -> File -> ProjectStructure -> Libraries -> + -> "Java" auswählen -> Pfadangabe -> Apply & Ok</li>
 * </ol>
 *
 * <h3>Tastenkürzel</h3>
 * <ul>
 *     <li> Strg + Alt + Q : Umschalten zwischen Kommentar-Modi (Bearbeiten/Vorschau) </li>
 *     <li> Strg + Alt + M : Auslagern von Code in eigene Methode </li>
 *     <li> Strg + Alt + C : Auslagern von Wert in Klassenkonstante </li>
 *     <li> Strg + D : Duplizieren einer Zeile </li>
 *     <li> Strg + Shift + Pfeiltaste hoch/runter </li>
 * </ul>
 */

public class ClKonsoleneingaben {
    ///region Konstanten
    public static final String TXT_INSERT_INTEGER = "\nGeben Sie eine Ganzzahl ein:";
    public static final String TXT_INSERT_INTEGER_POSITIVE = "\nGeben Sie eine positive Ganzzahl ein:";
    public static final String TXT_INSERT_INTEGER_NEGATIVE = "\nGeben Sie eine positive Ganzzahl ein:";
    public static final String TXT_INSERT_DOUBLE = "\nGeben Sie bitte eine Gleitkommazahl ein:";
    public static final String TXT_INSERT_DOUBLE_POSITIVE = "\nGeben Sie eine positive Gleitkommazahl ein:";
    public static final String TXT_INSERT_DOUBLE_NEGATIVE = "\nGeben Sie eine negative Gleitkommazahl ein:";
    public static final String TXT_OUTPUT = "Eingabe: %s\n";
    public static final String TXT_INSERT_WORD = "\nGeben Sie ein Wort ein:";
    public static final String TXT_INSERT_SENTENCE = "\nGeben Sie einen Satz ein:";
    public static final String TXT_INSERT_BOOLEAN = "\nGeben Sie einen Boolschen-Wert ein:";
    public static final String TXT_INSERT_STRING = "\nGeben Sie einen String ein:";
    public static final String TXT_INSERT_STRING_NADATORY = "\nGeben Sie einen nicht leeren String ein:";
    public static final String TXT_EXIT_PROGRAM = "\nMöchten Sie das Programm wirklich verlassen?";
    //endregion Konstanten

    //region Methoden
    /**
     * Startpunkt der Applikation
     *
     * @param args Startparameter
     */
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printApplicationName();
//        showHowScannerWorks();
        showHowConsoleReaderWorks();
    }

    private static void printApplicationName() {
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("X Cl Konsoleneingaben X");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXX");
    }

    private static void showHowScannerWorks() {
        //Scannerobjekt erzeugen und Eingabestrom zuweisen
        Scanner scanner = new Scanner(System.in);

        System.out.println(TXT_INSERT_INTEGER);
        int intInput = scanner.nextInt();
        System.out.printf(TXT_OUTPUT, intInput);

        System.out.println(TXT_INSERT_WORD);
        String stringInput = scanner.next();
        System.out.printf(TXT_OUTPUT, stringInput);

        stringInput = scanner.nextLine();
        System.out.printf(TXT_OUTPUT, stringInput);

        System.out.println(TXT_INSERT_SENTENCE);
        stringInput = scanner.nextLine();
        System.out.printf(TXT_OUTPUT, stringInput);

        System.out.println(TXT_INSERT_DOUBLE);
        double doubleInput = scanner.nextDouble();
        System.out.printf(TXT_OUTPUT, doubleInput);

        System.out.println(TXT_INSERT_BOOLEAN);
        boolean boolInput = scanner.nextBoolean();
        System.out.printf(TXT_OUTPUT, boolInput);
    }

    private static void showHowConsoleReaderWorks() {
        //Ganzzahlen einlesen
        System.out.println(TXT_INSERT_INTEGER);
        int intInput = ConsoleReader.in.readInt();
        System.out.printf(TXT_OUTPUT, intInput);

        System.out.println(TXT_INSERT_INTEGER_POSITIVE);
        intInput = ConsoleReader.in.readPositivInt();
        System.out.printf(TXT_OUTPUT, intInput);

        System.out.println(TXT_INSERT_INTEGER_NEGATIVE);
        intInput = ConsoleReader.in.readNegativInt();
        System.out.printf(TXT_OUTPUT, intInput);

        //Gleitkommazahlen einlesen
        System.out.println(TXT_INSERT_DOUBLE);
        double doubleInput = ConsoleReader.in.readDouble();
        System.out.printf(TXT_OUTPUT, doubleInput);

        System.out.println(TXT_INSERT_DOUBLE_POSITIVE);
        doubleInput = ConsoleReader.in.readPositivDouble();
        System.out.printf(TXT_OUTPUT, doubleInput);

        System.out.println(TXT_INSERT_DOUBLE_NEGATIVE);
        doubleInput = ConsoleReader.in.readNegativDouble();
        System.out.printf(TXT_OUTPUT, doubleInput);

        //Strings einlesen
        System.out.println(TXT_INSERT_STRING);
        String stringInput = ConsoleReader.in.readString();
        System.out.printf(TXT_OUTPUT, stringInput);

        System.out.println(TXT_INSERT_STRING_NADATORY);
        stringInput = ConsoleReader.in.readMandatoryString();
        System.out.printf(TXT_OUTPUT, stringInput);

        //Boolean einlesen
        boolean exitApp = true;

        //while-Schleife: prüft Bedingung und führt dann aus (oder nicht)
//        while (!exitApp) {
//
//            System.out.println(TXT_EXIT_PROGRAM);
//            boolean boolInput = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();
//            if (boolInput) exitApp = true;
//            System.out.printf(TXT_OUTPUT, boolInput);
//
//        }

        //do-while-Schleife: Führt einmal aus und prüft dann die Bedingung
        do {

            System.out.println(TXT_EXIT_PROGRAM);
            boolean boolInput = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();
            if (boolInput) exitApp = true;
            else exitApp = false;
            System.out.printf(TXT_OUTPUT, boolInput);

        } while (!exitApp);
    }
    //endregion Methoden
}