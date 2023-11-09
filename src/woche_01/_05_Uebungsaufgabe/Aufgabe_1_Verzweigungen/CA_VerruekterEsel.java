package woche_01._05_Uebungsaufgabe.Aufgabe_1_Verzweigungen;

public class CA_VerruekterEsel {

    //region Konstanten  TODO
    public final String kod = "kdsds";
    public final String sds = "kdsds";
    public final String ds = "kdsds";
    public final String sc = "kdsds";

    //enderegion

    // region MainMetod
    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("= CLUB zum VERRÜKTEN ESEL  =");
        System.out.println("============================");

        final String password_1 = "LilaBlume";
        final int code = 7721;
        final String krediKarteName = "Wolke";

        String kundenName = "Wolke";
        int kredit = 1001;
        String kundenPassword= "LilaBlume";
        int kundenCode = 7721;

        if (kundenPassword.equals(password_1)){
            System.out.println("\nHerzlich Willkommen " + kundenName + "... Erste Schritt ist vorbei...");

            System.out.println("\nSagen Sie bitte kombination Nummer...");

            if (kundenCode==code){
                System.out.println("\nSie dürfen eintreten...");
                if (100<= kredit && kredit <=200 ){

                    System.out.println("\nSie dürfen in den Clubraum 1 feiern.");
                }else if (500<= kredit && kredit < 1000){
                    System.out.println("\nSie dürfen in den Clubraum 2 oder 3.");

                }else if (1000 < kredit){
                    System.out.println("\nSie dürfen in den VIP-Raum.");

                    if(krediKarteName.equals(kundenName)){
                        System.out.println("\nIhre Angaben wurden überprüft, genießen Sie den Club");

                    }else {
                        System.out.println( "\n!!! Der Name ist nicht korrekt. Wir müssen die Polizei anrufen !!!");
                        System.out.println("\n!!! Sie müssen das Haus verlassen...");
                    }
                }

            }else {
                System.out.println("\nKein Zutritt! Zahlenkombination ist nicht gültig!");
            }
        }else {
            System.out.println("\nKein Zutritt! Password wurde nicht akzeptiert!");
        }

    }
    // endregion
}
