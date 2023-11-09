package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.test;

import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model.Smartphone;
import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model.SmartphoneBrand;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Stellt Methoden zur Verfügung, um Testdaten zu generieren und zurückzuliefern
 */
public class TestData {
    //region Konstanten
    public static final int TEST_DATA_AMOUNT = 5;
    //endregion

    //region Attribute
    //endregion

    //region Konstruktoren
    //endregion

    //region Methoden

    /**
     * Generiert Test-Smartphones
     * @return Test-Smartphones
     * TODO 1.1 Liste anstelle eines Arrays erzeugen und zurück geben
     */
    public static List<Smartphone> createTestSmartphones() {
        List<Smartphone> testSmartphones = new ArrayList<>();

        //Zufallszahl generieren
        Random random = new Random();
        int randomIndex = 0;

        for (int i = 0; i < TEST_DATA_AMOUNT; i++) {
             randomIndex = random.nextInt(SmartphoneBrand.values().length);

            testSmartphones.add(new Smartphone(SmartphoneBrand.values()[randomIndex], "Modell " + i, i, i * 1.5));
        }

        return testSmartphones;
    }
    //endregion
}
