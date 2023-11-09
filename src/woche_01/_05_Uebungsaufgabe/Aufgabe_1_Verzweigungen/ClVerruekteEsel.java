package woche_01._05_Uebungsaufgabe.Aufgabe_1_Verzweigungen;
/**
 * Übungsauflösung - Club zum verrückten Esel
 */
public class ClVerruekteEsel {
//region Konstanten

    //Konstanten zur Überprüfung
    public final static String PASSWORD = "LilaBlume";
    public final static int CODE = 7721;  //String wäre besser (0001)
    public final static double LOW_BUDGET_MINIMUM = 100;
    public final static double LOW_BUDGET_MAXIMUM = 200;
    public final static double MEDIUM_BUDGET_MINIMUM = 500;
    public final static double MEDIUM_BUDGET_MAXIMUM = 1000;
    public final static double HIGH_BUDGET_MINIMUM = 1000;
    public final static String CREDIT_CARD_NAME = "Shrek";

    //endregion Konstanten

    //region Methoden
    public static void main(String[] args) {
        //Personeninformationen
        String personPasswordInput = "LilaBlume";
        int personCodeInput = 7721;
        double personBudget = 1001;
        String personName = "Shrek";

        System.out.println("Wie lautet das Passwort? " + personPasswordInput);

        //Überprüfungen
        if (PASSWORD.equals(personPasswordInput)) {
            System.out.println("Richtiges Passwort.");
            System.out.println("\nWie lautet der Code? " + personCodeInput);

            if (personCodeInput == CODE) {
                System.out.println("Richtiger Code.");
                System.out.println("\nWelches Budget haben Sie? " + personBudget);

                if (personBudget >= LOW_BUDGET_MINIMUM && personBudget <= LOW_BUDGET_MAXIMUM) {
                    System.out.println("Sie dürfen in Clubraum 1.");

                } else if (personBudget >= MEDIUM_BUDGET_MINIMUM && personBudget < MEDIUM_BUDGET_MAXIMUM) {
                    System.out.println("Sie haben die Wahl aus Clubraum 2 und 3.");

                } else if (personBudget > HIGH_BUDGET_MINIMUM) {
                    System.out.println("Sie dürfen in den VIP-Raum.");
                    System.out.println("\nKreditkarte hinterlegen. " + personName);

                    if (!CREDIT_CARD_NAME.equals(personName)) {
                        System.out.println("Falscher Name, Polizei gerufen!");
                    }
                } else {
                    System.out.println("Falsches Budget!");
                }
            } else {
                System.out.println("Falscher Code!");
            }
        } else {
            System.out.println("Falsches Passwort!");
        }
    }
    //endregion
}