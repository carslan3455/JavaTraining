package woche_02.tag2.UebungMikroAufgabe.Aufgabe2;

import de.rhistel.logic.ConsoleReader;

public class CaMiniChatbot {

    //region Konstanten
    public static final String APP_NAME = "Mini Chatbot";
    public static final String TXT_EXIT_PROGRAMM = "\nProgramm wird beendet...";
    public static final String TXT_INVALID_FRAGE = "\nUngültige Fragen... Bitte versuchen Sie es erneut...";
    //endregion Konstanten

    //region Variablen
    public static final String[] antworten = {"Ich bin der MiniChatbot.", "Ich bin so alt wie die Ausführung des Programms selbst.",
                                              "Ich heiße Mark Cäsar.", "Meine Aufgabe ist es eine Konversation mit meinem Gegenüber zu führen."};
    public static final String[] validFragen = {"Wer bist du?", "Wie alt bist du?", "Wie heißt du?", "Was ist deine Aufgabe?"};
    public static final String TXT_BEGRUESSUNG = "\nHerzlich Willkommen \nWas kann ich für Sie tun?";
    public static final String TXT_DIALOG = "\nSie können mir eine Frage stellen?";

    //enderegion Variablen

    //region Methoden
    public static void main(String[] args) {
        runApplication();

    }


    private static void runApplication() {

        printApplicationName();
        fragenFromConsole();

    }

    private static void printApplicationName() {

        System.out.println(APP_NAME);
    }

    private static void fragenFromConsole() {

        String frage;
        String exit = "Tschüss";
        System.out.println(TXT_BEGRUESSUNG);

        do {
            System.out.println(TXT_DIALOG);
            frage = ConsoleReader.in.readString();

            if (checkFrage(frage)) {
            } else if (frage.equalsIgnoreCase(exit)) {
                System.out.println(TXT_EXIT_PROGRAMM);
            } else System.out.println(TXT_INVALID_FRAGE);

        } while (!frage.equalsIgnoreCase(exit));


    }

    private static boolean checkFrage(String frage) {
        boolean value = false;

        for (int i = 0; i < validFragen.length; i++) {

            if (frage.equalsIgnoreCase(validFragen[i])) {
                value = true;
                System.out.println(antworten[i]);
            }
        }
        return value;
    }
    //endregion Methoden

}
