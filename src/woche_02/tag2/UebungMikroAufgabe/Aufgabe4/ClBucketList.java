package woche_02.tag2.UebungMikroAufgabe.Aufgabe4;

import de.rhistel.logic.ConsoleReader;

public class ClBucketList {
    //region Konstanten
    public static final String APP_HEADER = """
            =================
            = Cl BucketList =
            =================
            """;
    public static final String TXT_INPUT_ENTRY_AMOUNT = "\nWie viele Einträge möchten Sie speichern?";
    public static final int MIN_ENTRY_LENGTH = 3;
    public static final String TXT_INVALID_ENTRY_LENGTH = "\nUngültige Länge. Minimale Länge: ";
    public static final String TXT_BUCKETLIST_OUTPUT = "\nDie Bucketlist:";
    public static final String TEMPLATE_BUCKET_LIST_ENTRY = "o %s\n";
    public static final String TEMPLATE_BUCKET_LIST_ENTRY_ORDERED = "%s. %s\n";
    public static final String TEMPLATE_BUCKET_LIST_INPUT = "%s. Eintrag: ";
    public static final String TXT_INSERT_INDEX_TO_CHECK = "\nWelcher Eintrag soll abgehakt werden?";
    public static final String DONE = " (erledigt)";
    public static final String TXT_INVALID_CHOICE = "\nUngültige Auswahl";
    public static final String TXT_ENTRY_ALREADY_CHECKED = "\nEintrag wurde bereits abgehakt.";
    public static final String TXT_PROGRAM_EXIT = "\nAlles abgehakt. Program wird beendet.";
    //endregion

    //region Methoden
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printApplicationName();
        String[] bucketList = readBucketListFromConsole();
        printBucketList(bucketList);
        checkBucketListEntries(bucketList);
    }

    private static void printApplicationName() {
        System.out.println(APP_HEADER);
    }

    private static String[] readBucketListFromConsole() {

        System.out.println(TXT_INPUT_ENTRY_AMOUNT);

        int entryAmount = ConsoleReader.in.readPositivInt();

        String[] bucketList = new String[entryAmount];

        for (int i = 0; i < bucketList.length; i++) {

            System.out.printf(TEMPLATE_BUCKET_LIST_INPUT, (i + 1));
            String entry = ConsoleReader.in.readMandatoryString();

            if (entry.length() < MIN_ENTRY_LENGTH) {
                System.out.println(TXT_INVALID_ENTRY_LENGTH + MIN_ENTRY_LENGTH);
                i--;
            } else {
                bucketList[i] = entry;
            }
        }

        return bucketList;
    }

    private static void printBucketList(String[] bucketList) {
        System.out.println(TXT_BUCKETLIST_OUTPUT);
        for (String entry : bucketList) {
            System.out.printf(TEMPLATE_BUCKET_LIST_ENTRY, entry);
        }
    }

    private static void checkBucketListEntries(String[] bucketList) {
        int checkedEntryAmount = 0;
        do {

            System.out.println(TXT_INSERT_INDEX_TO_CHECK);
            for (int i = 0; i < bucketList.length; i++) {
                System.out.printf(TEMPLATE_BUCKET_LIST_ENTRY_ORDERED, i, bucketList[i]);
            }

            int indexToCheck = ConsoleReader.in.readPositivInt();

            if (indexToCheck < bucketList.length) {
                if (!bucketList[indexToCheck].endsWith(DONE)) {
                    bucketList[indexToCheck] += DONE;
                    checkedEntryAmount++;
                }
                else System.out.println(TXT_ENTRY_ALREADY_CHECKED);
            } else {
                System.out.println(TXT_INVALID_CHOICE);
            }

        } while (checkedEntryAmount < bucketList.length);
        System.out.println(TXT_PROGRAM_EXIT);
    }
    //endregion
}