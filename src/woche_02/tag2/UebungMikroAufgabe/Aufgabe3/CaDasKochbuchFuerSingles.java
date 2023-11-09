package woche_02.tag2.UebungMikroAufgabe.Aufgabe3;

import de.rhistel.logic.ConsoleReader;

public class CaDasKochbuchFuerSingles {

    //region Konstanten
    public static final String APP_NAME = "\nDas Kochbuch für Singles";
    public static final String TXT_WAHL_MENUE = "\nWählen Sie eines der folgende Auswahlmöglichkeiten";

    //endregion Konstanten


    //region Variablen
    public static final String[] menue = {"Spiegelei", "Spagetti mit Tomatensoße", "Lieferdienst anrufen"};
    public static final String[] rezepts = new String[menue.length];
    public static String rezeptSpiegelei = "\n1 TL Butter (oder Olivenöl),\n1 Ei,\n1 Prise Salz \nZubereitung\n" +
            " Für das Spiegelei zunächst die Butter in einer beschichteten Pfanne bei mittlerer Stufe erhitzen, sie sollte nicht braun werden.\n" +
            " Das Ei am Rand der Pfanne aufschlagen und vorsichtig hineingleiten lassen. Mit einem Pfannenwender kann man das Eiweiß in die gewünschte Form bringen.\n" +
            " Die Hitze reduzieren und das Spiegelei ein paar Minuten lang stocken lassen. Je nach gewünschter Konsistenz das Ei in der Pfanne wenden und von der anderen Seite braten.\n" +
            " Das Spiegelei zum Schluss salzen und sofort servieren.\n";

    public static String rezeptSpagettiMitTomatensoße ="\n400 g\tSpaghetti\n" +
            "1 Dose\tTomate(n), stückige\n" +
            "3 EL\tOlivenöl\n" +
            "1 kleine\tZwiebel(n), gehackt\n" +
            "1 TL, gehäuft\tGemüsebrühe, gekörnte\n" +
            "1 Msp.\tPaprikapulver\n" +
            "1 Msp.\tCurrypulver\n" +
            "1 TL\tBasilikum\n" +
            "1 TL\tOregano\n" +
            "1 TL\tPetersilie\n" +
            "1 TL\tCayennepfeffer\n" +
            "Salz und Pfeffer\n" +
            "evtl.\tSahne"+"\nZubereitung" +
            "\n Die Nudeln in reichlich Salzwasser bissfest kochen." +
            "\n Das Öl in einem kleinen Topf erhitzen und die Zwiebeln darin anschwitzen." +
            "\n Die Tomaten dazugeben und die Soße etwas köcheln lassen." +
            "\n Dann die gekörnte Brühe unterrühren und mit Paprika, Curry, Basilikum, Oregano, Petersilie, Cayennepfeffer, Salz und Pfeffer abschmecken und " +
            "\n nach Belieben mit etwas Sahne verfeinern. " +
            "\n Noch ein paar Minuten köcheln lassen." +
            "\n Die fertigen Spaghetti abgießen und mit der Tomatensoße servieren.\n";

    public static String liefertInformation = " Sie können Das Kochbuch für Singles GmBH " +
            "\n unter Telefonnummer: 170 4232 43 34 " +
            "\n E-mail : kochbuchsingels@buch.de" +
            "\n erreichen.\n";

    //endregion Variablen


    //region Methoden
    public static void main(String[] args) {


        printApplicationName();
        printMenue();
        initializeArrays();
        printRezept();


    }

    private static void printApplicationName() {

        System.out.println(APP_NAME);

    }

    private static void printMenue() {

        System.out.print(TXT_WAHL_MENUE);
        for (int i = 0; i < menue.length; i++) {

            System.out.printf("\n[ %s ] %s", i, menue[i]);
        }
    }

    private static void initializeArrays(){
        rezepts[0] = rezeptSpiegelei;
        rezepts[1] = rezeptSpagettiMitTomatensoße;
        rezepts[2] = liefertInformation;
    }
    private static void printRezept() {

        int index = -1;

        do {
            System.out.println("\n");
            index = ConsoleReader.in.readPositivInt();

            if (index< menue.length) {
                System.out.printf("\nIhre Wahl : %s", menue[index]);
                System.out.printf("\n"+ rezepts[index]);
            }else System.out.println("\nUngültige Wahl!!!");
        }while (index >= menue.length);
    }

    //endregion Methoden

}
