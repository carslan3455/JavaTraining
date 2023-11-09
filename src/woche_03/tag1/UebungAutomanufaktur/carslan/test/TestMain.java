package woche_03.tag1.UebungAutomanufaktur.carslan.test;

import woche_03.tag1.UebungAutomanufaktur.carslan.model.Auto;

/**
 * Main Klasse zum Start des Programms für Testzwecke
 * TODO 1.1 - Modelklassse testen
 *
 */
public class TestMain {

    public static void main(String[] args) {

        testAutoCreat();


    }

    private static void testAutoCreat() {

        Auto lieblingsAuto = new Auto();
        lieblingsAuto.setFarben("Blau");
        System.out.println(lieblingsAuto);
    }
}
