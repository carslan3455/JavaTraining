package woche_01;

import java.util.Arrays;

/**
 * <h2>Ausgaben und Escapesequenzen</h2>
 *
 * <p>
 * Dieses Programm behandelt folgende Themengebiete:
 * </p>
 *
 * <ul>
 *     <li>Ausgabebefehle</li>
 *     <li>Escapesequenzen / Whitespace-Characters</li>
 *     <li>Kommentare</li>
 * </ul>
 *
 * <h3>Ausgabebefehle</h3>
 * <p>
 *     Ausgabebefehle werden in Java genutzt um bestimmte Informationen auf der Konsole auszugeben. Folgende gibt es:
 * </p>
 * <ul>
 *     <li>System.out.print(); - Gibt an der momentanen Cursorstelle Text auf der Konsole aus</li>
 *     <li>System.out.println(); - Gibt an der momentanen Cursorstelle Text auf der Konsole aus aber mit einen abschließenden Zeilenumbruch</li>
 *     <li>System.out.printf(); - Gibt an der momentanen Cursorstelle einen formatierten Text auf der Konsole us</li>
 * </ul>
 *
 * <h3>Escapesequenzen</h3>
 * <p>
 *     Escapesequenzen werden genutzt um dem Compiler mitzuteilen, dass er seine Standardvorgehensweise für das nächste Zeichen
 *     aussetzen soll.
 * </p>
 *
 * <h3><br>Tastenkürzel</h3>
 * <ul>
 *     <li>Strg + Shift + F10 : Programm ausführen und eine Ausführkonfiguration erzeugen</li>
 *     <li>Shift + F10 : Programm ausführen über die ausgewählte Ausführkonfiguration (oben rechts neben dem Ausführ-Knopf)</li>
 *     <li>Strg + Q : Öffnen der Schnelldokumentation</li>
 *     <li>Strg + Leertaste : Öffnen der Autovervollständigung</li>
 *     <li>Strg + Alt + L : Automatisches formatieren der geöffneten Datei</li>
 *     <li>Strg + Z : Änderung rückgängig machen</li>
 *     <li>Strg + Shift + Z : Letzte rückgängig gemachte Änderung wiederherstellen</li>
 *     <li>Strg + Y : Löschen der ausgewählten Zeile(n)</li>
 *     <li>Strg + D : Duplizieren der ausgewählten Zeile(n)</li>
 * </ul>
 */

public class _01_ClAusgabenUndEscapesequenzen {

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(args));

        System.out.println("Hello world!");

        //

        /**
         *
         *
         */

        /*

         */

        //Ausgabe mit abschlißenden Zeilenumbruch
        System.out.println("Ausgabe mit System.out.println(\"Hello world!\"); bewirkt die Ausgabe des in der Klamer stehende" +
                "Wertes auf der Konsole.");

        // Formatierte Ausgabe mit Platzhaltern
        System.out.printf("Der Warenkorb beträgt %.2f %s", 10.0, "€"); // . dan sonra 2 rakam daha yaziyor

        // Auflistung der am meisten genutzten Escapesequenzen

        System.out.println("\\n -> erzeugt einen Zeilenbruch");
        System.out.printf("%n -> erzeugt einen Zeilenbruch");
        System.out.println("\\t -> erzeugt      einen Tabulator \ttest");  // Tabulator
        System.out.println("\\t -> erzeugt einen Tabulator \t\ttest");  // Tabulator
        System.out.println("\\\\ -> erzeugt einen Backslash");
        System.out.println("\\\" -> erzeugt ein Anführungszeichen ");
        System.out.println("\\\' -> erzeugt ein Hochkomme");    // sadece char icin ' kullanilabilir
        System.out.println("\\u00a9-> erzeugt ein Unicode-Zeichen (hier das Ausrufezeichen \u00a9 ) ");
        System.out.println("Test\b");
        System.out.println("\r");
        System.out.println("\f");

//    Main.main(args);
    }
}
