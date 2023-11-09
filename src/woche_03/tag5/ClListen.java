package woche_03.tag5;

import java.util.*;

/**
 * <h2>Listen in Java</h2>
 * <p>
 * In Java existieren folgende Listenarten:
 * <ul>
 *     <li>
 *         Arraylist : Speichert Elemente im Hintergrund mithilfe eines "dynamischen" Arrays. Bei Datenmanipulation
 *         wird das Array automatisch angepasst, z. B. beim
 *         <ul>
 *             <li>Einfügen wenn voll: neues, größeres Array -> Objekte übertragen</li>
 *             <li>Löschen: Element wird entfernt -> Objekte werden zusammengeschoben um Lücke zu schließen</li>
 *         </ul>
 *     </li>
 *     <li>
 *         LinkedList : Speichert die Elemente im Hintergrund "verkettet", d. h. sie liegen nicht zusammenhängend
 *         im Speicher, sondern verstreut. Das Listenobjekt referenziert dabei das erste und das letzte Element
 *         der Liste. Alle Elemente referenzieren jeweils das vorherige und das nächste Element.
 *     </li>
 *     <li>
 *         Vector : dynamisches Array im Hintergrund, synchronisiert (threadsicher)
 *     </li>
 *     <li>
 *         Stack : basiert auf dem Vector, implementiert LIFO Prinzip (last in, first out - z. B. Tellerstapel)
 *     </li>
 * </ul>
 */
public class ClListen {

    private static final int DATA_AMOUNT = 1_000_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < DATA_AMOUNT; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Arraylist - Einfügen - Ende: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < DATA_AMOUNT; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Linkedlist - Einfügen - Ende: " + (endTime - startTime));


//        showListMethods();
    }

    private static void showListMethods() {
        //Listenvariable verallgemeinern, um zur Laufzeit verschiedene Listenarten zuweisen zu können
        List<String> list = new LinkedList<>();
        list = new ArrayList<>(list);


        //Deklarieren und Initialisieren einer ArrayList Liste
        LinkedList<String> linkedList = new LinkedList<>();

        //Deklarieren und Initialisieren einer ArrayList Liste
        ArrayList<String> arrayList = new ArrayList<>(2500);

        String text = "abc";

        //Einfügen
        arrayList.add(text);
        arrayList.add("hallo");
        arrayList.add("ciao");
        arrayList.add("neueselement");
        arrayList.add("blablubb");

        //Einfügen an bestimmten Index
        arrayList.add(0, "fgsghdh");

        //Ausgabe des Listenobjektes
        System.out.println(arrayList);

        arrayList.add(text);

        //Prüfen ob Element vorkommt
        System.out.println(arrayList.contains("§slrguhsekjhfghkjeafgn"));

        //Element auslesen
        System.out.println(arrayList.get(3));

        //Array im Hintergrund manuell vergrößern
        arrayList.ensureCapacity(5000);
        System.out.println(arrayList);

        //Array manuell verkleinern
//        arrayList.trimToSize();

        //Index des ersten Vorkommens eines Elementes auslesen
        System.out.println(arrayList.indexOf(text));

        //Index des letzten Vorkommens eines Elementes auslesen
        System.out.println(arrayList.lastIndexOf(text));

        //Überprüfen ob Elemente in der Liste liegen
        System.out.println(arrayList.isEmpty());

        //Löschen von Elementen aus der Liste
        //über Index
        arrayList.remove(0);
        //über Objektreferenz (erstes Vorkommen)
        arrayList.remove(text);

        System.out.println(arrayList);

        //Ersetzen eines Elementes
        arrayList.set(0, text);

        System.out.println(arrayList);
    }
}