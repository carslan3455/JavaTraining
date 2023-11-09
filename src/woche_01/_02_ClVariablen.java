package woche_01;
/**
 * <h2>Variablen</h2>
 * <p>
 *     Dieses Programm zeigt die Funktionsweise und die Nutzung von Variablen in Java
 * </p>
 *
 * <h3><br>Datentypen für Variablen</h3>
 * <p>
 *
 * </p>
 * <h4>Primitive Datentypen</h4>
 * <ul>
 *     <li>boolean = 1 Byte = true oder false</li>
 *     <li>byte = Ganzzahl mit 8bit = Wertebereich: -128 bis 127</li>
 *     <li>short = Ganzzahl mit 16bit = Wertebereich: -32.768 bis 32.767</li>
 *     <li>int = Ganzzahl mit 32bit = Wertebereich: -2.147.483.648 bis 2.147.483.647</li>
 *     <li>long = Ganzzahl mit 64bit = Wertebereich: –9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807</li>
 *     <li>float = Gleitkommazahl 32bit = Wertebereich: 1,40239846E-45f bis 3,40282347E+38f</li>
 *     <li>double = Gleitkommazahl 64bit = Wertebereich: 4,94065645841246544E-324 ... bis 1,79769131486231570E+308</li>
 *     <li>char = Einzelnes Zeichen</li>
 * </ul>
 *
 * <h4>Komplexe Datentypen</h4>
 * <ul>
 *     <li>String = Zeichenkette (Array von Zeichen)</li>
 *     <li>Jede Klasse mit mehreren Variablen</li>
 * </ul>
 *
 * <h3>Deklarierung / Initialisierung</h3>
 * <p>
 *     Die Deklarierung einer Variablen besteht aus dem Definieren eines Datentyps und eines Namens.<br>
 *     Die Werteweisung zu einer Variablen nennt man Initialisierung.
 *     <code>String applicationName = "ClVariablen";</code><br>
 *     <code>int index = 0;</code>
 * </p>
 *
 * <h3>Namensgebung:</h3>
 * <ul>
 *     <li>Variablennamen beginnen mit einem Kleinbuchstaben</li>
 *     <li>Variablennamen enthalten keine Sonderzeichen oder Umlaute</li>
 *     <li>Keine Variablennamen mit nur einem Buchstaben (es gibt einige Ausnahmen)</li>
 *     <li>Sprechende Namen vergeben</li>
 *     <li>
 *         Bei Variablennamen mit mehreren Wörtern werden diese zusammen <br>
 *         und der erste Buchstabe eines Folgewortes groß geschrieben (keine Unterstriche!)
 *     </li>
 * </ul>
 *
 * <h2>Tastenkürzel:</h2>
 * <ul>
 *     <li>Shift + F6 : Umbenennen der Variablen an allen Nutzungsstellen via Refactor</li>
 * </ul>
 */
public class _02_ClVariablen {

    public static void main(String[] args) {
        //Deklarierung und Initialisierung von Strings
        String applicationName = "Cl Variablen";
        String seperator = "============";

        System.out.println(seperator);
        System.out.println(applicationName);
        System.out.println(seperator);

        //Zustandsbeschreibung durch wahr oder falsch
        boolean isLightOn = true;
        boolean isAgeValid = false;

        System.out.println("\nboolean:");
        System.out.println("Licht an? " + isLightOn);
        System.out.println("Alter gültig? " + isAgeValid);

        //Ganzzahlen
        byte populationOfMoon = 0;
        short populationOfVillage = 2500;
        int populationOfEurope = 746_400_000;
        long populationOfWorld = 8_000_000_000L;

        System.out.println("\nGanzzahlen:");
        System.out.println("byte - Bevölkerungszahl des Mondes: " + populationOfMoon);
        System.out.println("short - Bevölkerungszahl eines Dorfes: " + populationOfVillage);
        System.out.println("int - Bevölkerungszahl von Europa: " + populationOfEurope);
        System.out.println("long - Bevölkerungszahl der Welt: " + populationOfWorld);

        //Umwandeln zwischen Ganzzahltypen
//        int byteAsInt = populationOfMoon;
//        System.out.println("byte-Zahl als int: " + byteAsInt);
//        byte intAsByte = (byte)populationOfEurope;
//        System.out.println("int-Zahl als byte mit Cast: " + intAsByte);

        float smallFloatingPointNumber = 1.2f;
        double bigFloatingPointNumber = 123.456;

        double result = smallFloatingPointNumber + bigFloatingPointNumber;

        System.out.println("\nGleitkommazahlen:");
        System.out.println("float - Kleine Kommazahl: " + smallFloatingPointNumber);
        System.out.println("double - Große Kommazahl: " + bigFloatingPointNumber);

        //Umwandeln zwischen Ganzzahlen und Gleitkommazahlen
//        bigFloatingPointNumber = smallFloatingPointNumber;
//        smallFloatingPointNumber = (float)bigFloatingPointNumber;
//        populationOfMoon = (byte) smallFloatingPointNumber;
//        System.out.println(populationOfMoon);

        //Einzelne Zeichen (Characters)
        char topCategoryLetter = 'A';
        char secondCategoryLetter = 'B';
        char unicodeBulletPoint = '\u1D11';

        System.out.println("\nEinzelne Zeichen:");
        System.out.println(unicodeBulletPoint + " Güteklasse " + topCategoryLetter);
        System.out.println(unicodeBulletPoint + " Güteklasse " + secondCategoryLetter);
    }
}
