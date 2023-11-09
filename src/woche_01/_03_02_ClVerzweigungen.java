package woche_01;

/**
 * <h2>Verzweigungen</h2>
 * <p>
 * Dieses Programm zeigt, wie Verzweigungen in Java funktionieren und wie man sie nutzt.<br>
 * Es gibt in Java 3 Arten der Verzweigung:
 * </p>
 * <ul>
 *     <li>Einfache Verzweigung (if - else)</li>
 *     <li>Mehrfachverzweigung (if - else if - else)</li>
 *     <li>Fallunterscheidung (switch - case)</li>
 * </ul>
 */
public class _03_02_ClVerzweigungen {
    public static void main(String[] args) {

        //Deklaration und Initialisierung
        //Freigabestufen
        final int clearanceLevelVisitor = 1;
        final int clearanceLevelEmployee = 2;
        final int clearanceLevelTopSecret = 3;

        //Mindestalter
        final int minimumAge = 18;

        //Registrierte Personennamen
        final String firstValidName = "Shrek";
        final String secondValidName = "Max Mustermann";

        //Tatsächlichen Personeninformationen
        String personName = "Shrek";
        int personAge = 18;
        int personClearanceLevel = 2;

        System.out.println("Umbrella Corp.");
        System.out.println("==============");

        System.out.println("\n>> STOP! Ausweis scannen!");


        //Überprüfen des Alters

        if (personAge >= minimumAge) {

            System.out.println("\nAusweis gescannt. Person ist mindestens 18 Jahre alt.");

            //Überprüfen des Namens (equals() überprüft String auf inhaltliche Gleichheit equalsIgnoreCase() auch, ignoriert aber Groß- und Kleinschreibung)
            if (personName.equals(firstValidName) || personName.equals(secondValidName)) {

                System.out.println("Willkommen " + personName + ".");

                //Mehrfachverzweigung (könnte auch komplexere Bedingungen, z. B. Wertebereiche prüfen)
//                if (personClearanceLevel == clearanceLevelVisitor) {
//                    System.out.println("Sie dürfen in der Lobby warten.");
//                } else if (personClearanceLevel == clearanceLevelEmployee) {
//                    System.out.println("Sie dürfen an ihren Arbeitsplatz.");
//                } else if (personClearanceLevel == clearanceLevelTopSecret) {
//                    System.out.println("Reißen Sie die Weltherrschaft an sich.");
//                } else {
//                    System.out.println("Kein Zutritt! Ungültige Freigabestufe!");
//                }

                //Normales Switch-Case (Fallunterscheidung), benötigt meist am Ende jedes Falles ein break;
//                switch (personClearanceLevel) {
//                    case clearanceLevelVisitor:
//                        System.out.println("Sie dürfen in der Lobby warten.");
//                        break;
//                    case clearanceLevelEmployee:
//                        System.out.println("Sie dürfen an ihren Arbeitsplatz.");
//                        break;
//                    case clearanceLevelTopSecret:
//                        System.out.println("Reißen Sie die Weltherrschaft an sich.");
//                        break;
//                    default:
//                        System.out.println("Kein Zutritt! Ungültige Freigabestufe!");
//                }

                //Erweiterte Switch (Benötigt keine break-Anweisung, aber dafür Anweisungsblöcke für mehrere Anweisungen in einem Fall)
                switch (personClearanceLevel) {
                    case clearanceLevelVisitor -> System.out.println("Sie dürfen in der Lobby warten.");
                    case clearanceLevelEmployee -> System.out.println("Sie dürfen an ihren Arbeitsplatz.");
                    case clearanceLevelTopSecret -> System.out.println("Reißen Sie die Weltherrschaft an sich.");
                    default -> {
                        System.out.println("Kein Zutritt! Ungültige Freigabestufe!");
                        System.out.println("Auf Wiedersehen!");
                    }
                }

//                System.out.println("Ende Verzweigung Name");

            } else {
                System.out.println("Kein Zutritt! Name wurde nicht hinterlegt!");
            }

//            System.out.println("Ende Verzweigung Alter");

        } else {
            System.out.println("\nKein Zutritt! Alter ist nicht gültig!");
        }

//        System.out.println("Ende aller Verzweigungen");


        System.out.println("PROGRAMMENDE");

    }

}
