package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.test;

import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.model.Smartphone;

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
    public static Smartphone[] createTestSmartphones() {
        Smartphone[] testSmartphones = new Smartphone[TEST_DATA_AMOUNT];

        for (int i = 0; i < TEST_DATA_AMOUNT; i++) {
            testSmartphones[i] = new Smartphone("Marke " + i, "Modell " + i, i, i * 1.5);
        }

        return testSmartphones;
    }
    //endregion
}
