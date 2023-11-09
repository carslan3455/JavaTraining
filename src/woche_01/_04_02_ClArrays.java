package woche_01;
/**
 * <h2>Arrays und Schleifen</h2>
 */

public class _04_02_ClArrays {

    public static void main(String[] args) {
        //1. Art der Deklaration & Initialisierung von Arrays
        int[] numbers = new int[5];

        System.out.println(numbers);
        System.out.println("Index 0 nach Initialisierung: " + numbers[0]);

        numbers[0] = 1111;

        System.out.println("Index 0 nach manueller Wertezuweisung: " + numbers[0]);

        System.out.println();

        //2. Art der Deklaration & Initialisierung von Arrays
        double[] prices = {1.5, 2.5, 10.7};
        System.out.println(prices);

        System.out.println("Index 0 nach Initialisierung: " + prices[0]);
        prices[0] = -0.1;

        System.out.println("Index 0 nach manueller Wertezuweisung: " + prices[0]);

        System.out.println();

        //Arrays komplexer Datentypen
        String[] names = new String[5];
//        String[] names = {  //Index     Element
//                "name1",    //0         1.
//                "name2",    //1         2.
//                "name3"     //2         3.
//        };
        System.out.println(names);

        System.out.println(names[0]);

        if (names[0] != null) {
            System.out.println(names[0].isEmpty());
        } else {
            System.out.println("Null-Objekt");
        }

        names[0] = "hallo";

        System.out.println(names[0]);
        System.out.println(names[0].isEmpty());

//        System.out.println(names[-1]); //Array Index Out Of Bounds Exception (Programmabbruch)

        //Länge eines Arrays
        System.out.println("Größe des Arrays: " + names.length);


        /*for-Schleife (gut geeignet für Arbeiten mit Arrays)
        Zählschleife , kopfgesteuert
        for (Laufvariable Init/Dekl; Laufbedingung; Manipulation der Laufvariablen) {Anweisungen eines Durchlaufs}
        */

        for (int  i = 0; i < names.length; i++) {

            System.out.println( names[i] );
        }

        //for-each Schleife
        //for (Variable des momentanen Array-Wertes : Zu durchlaufende Datenstruktur)
        for (String currentName : names) {
            System.out.println(currentName);
        }


    }
}
