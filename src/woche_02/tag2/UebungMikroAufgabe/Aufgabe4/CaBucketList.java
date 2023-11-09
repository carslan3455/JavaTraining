package woche_02.tag2.UebungMikroAufgabe.Aufgabe4;

import de.rhistel.logic.ConsoleReader;

public class CaBucketList {
    //region Konstanten
    public static final String APP_NAME = "\nBucket List\n";
    public static final String TXT_UNBEKANTE_AUFGABE = "\nUnbekannte Aufgabe...";
    public static final String TXT_UNBEKANTE_INDEX = "\nVersuchen Sie bitte noch mal...";
    public static final String TXT_INPUT_AUFGABE = "\nGeben Sie bitte %s.Aufgabe ein\n";
    public static final String TXT_BUCKET_LIST_INDEX = "\nGeben Sie bitte Anzahl an Bucket List ein...";
    public static final String TXT_INVALID_WAHL = "Ungültige Auswahl!";
    public static final String TXT_EXIT_PROGRAMM = "\nProgramm wird beendet...";
    public static final String TXT_ERWEITERUNG = "\nKönnen Sie Ihre Aufgabe beendet...";
    public static final String TXT_WUNSCH = "\nViel Erfolg zur Ihre Aufgabe...";
    public static final String TXT_BEENDETE_AUFGABE = "\nWählen Sie beendete Aufgabe aus...";
    //endregion Konstanten

    //region Variablen
    public static String[] buckets;


    //endregion Variablen

    //region Methoden
    public static void main(String[] args) {


        printApplicationName();
        startBucketList();

    }

    private static void printApplicationName() {

        System.out.println(APP_NAME);

    }

    private static void startBucketList() {

        System.out.println(TXT_BUCKET_LIST_INDEX);
        int bucketLenght = ConsoleReader.in.readPositivInt();
        buckets = new String[bucketLenght];
        int index = 0;


        while (index < bucketLenght) {

            System.out.printf(TXT_INPUT_AUFGABE, (index + 1));
            String aufgabe = ConsoleReader.in.readString();
            if (aufgabe.length() >= 3) {
                buckets[index] = aufgabe;
                index++;
            } else System.out.println(TXT_UNBEKANTE_AUFGABE + TXT_UNBEKANTE_INDEX);

        }
        printBucketList();

        erweitern();
    }

    private static void printBucketList() {

        for (int i = 0; i < buckets.length; i++) {
            System.out.printf("\n[ %s ] %s", i, buckets[i]);
        }
        System.out.println();
    }

    private static void erweitern() {
        System.out.println(TXT_ERWEITERUNG);
        boolean done = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();

        if (done == true) {
            beendeteAufgabe();
        } else {
            System.out.println(TXT_WUNSCH);
            System.out.println(TXT_EXIT_PROGRAMM);
        }
    }

    private static void beendeteAufgabe() {

        printBucketList();

        int wahl = -1;
        String beendeteAufgabe = " - Erledigt";

        do {
            System.out.println(TXT_BEENDETE_AUFGABE);
            wahl = ConsoleReader.in.readPositivInt();
            if (wahl < buckets.length) {
                if (!buckets[wahl].contains(beendeteAufgabe)) {
                    buckets[wahl] += beendeteAufgabe;
                }
            } else if (wahl > buckets.length) {
                System.out.println(TXT_INVALID_WAHL + TXT_UNBEKANTE_INDEX);
            }

        } while (wahl == buckets.length);

        printBucketList();
        erweitern();

    }


}
