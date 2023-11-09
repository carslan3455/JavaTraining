package woche_02.tag2.UebungMikroAufgabe.Aufgabe2;

import de.rhistel.logic.ConsoleReader;

public class ClMiniChatbot {
    //region Konstanten
    public static final String APP_HEADER = """
            XXXXXXXXXXXXXXXXXXX
            x Cl Mini Chatbot X
            XXXXXXXXXXXXXXXXXXX
            """;
    public static final String MC_CHAT_ANSWER = "MC >> %s\n";
    public static final String TXT_WELCOME = "Herzlich Willkommen! Dies sind die Fragen die du stellen kannst:";
    public static final String TXT_QUESTION_INVALID = "Diese Frage kenne ich nicht.";
    public static final String YOUR_QUESTION = "\nDu ";
    public static final String GOODBYE = "Tschüss";
    public static final String TXT_GOODBYE = "Bis dann!";
    public static final int INVALID_QUESTION_INDEX = -1;
    //endregion

    //region Attribute
    public static String[] questions = {
            "Wer bist du",
            "Wie alt bist du",
            "Wie heißt du",
            "Was ist deine Aufgabe"
    };

    public static String[] answers = {
            "Ich bin der Mini-Chatbot.",
            "Ich bin so alt wie die Ausführung des Programms.",
            "Ich heiße Mark Cäsar.",
            "Meine Aufgabe ist es eine Konversation mit dir zu führen."
    };
    //endregion

    //region Methoden
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        printApplicationName();
        handleUserChatInteraction();
    }

    private static void printApplicationName() {
        System.out.println(APP_HEADER);
    }

    private static void handleUserChatInteraction() {
        //Ausgabe der Fragen
        System.out.printf(MC_CHAT_ANSWER, TXT_WELCOME);
        printQuestions();
        String userQuestion = null;

        do {
            //Frage eingeben
            System.out.print(YOUR_QUESTION);
            userQuestion = ConsoleReader.in.readMandatoryString();

            if (!userQuestion.equalsIgnoreCase(GOODBYE)) {
                int questionIndex = getQuestionIndex(userQuestion);

                //Antwort geben
                if (questionIndex != INVALID_QUESTION_INDEX) {
                    System.out.printf(MC_CHAT_ANSWER, answers[questionIndex]);
                } else {
                    System.out.printf(MC_CHAT_ANSWER, TXT_QUESTION_INVALID);
                }
            } else {
                System.out.printf(MC_CHAT_ANSWER, TXT_GOODBYE);
            }
        } while (!userQuestion.equalsIgnoreCase(GOODBYE));
    }

    private static int getQuestionIndex(String userQuestion) {
        for (int i = 0; i < questions.length; i++) {
            if (questions[i].equalsIgnoreCase(userQuestion)) {
                return i;
            }
        }
        return INVALID_QUESTION_INDEX;
    }

    private static void printQuestions() {
        for (String question : questions) {
            System.out.println(question);
        }
    }
    //endregion
}