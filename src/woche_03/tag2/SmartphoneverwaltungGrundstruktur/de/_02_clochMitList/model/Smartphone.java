package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model;

import woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.settings.AppTexts;

/**
 * Modellklasse für Smartphones der realen Welt
 * TODO 0 - Datentyp der Eigenschaft brand von String zu SmartphoneBrand ändern
 * TODO 0.1 - Konstruktoren, Getter & Setter anpassen (Datentypen für Rückgabe, Parameter und Initialisierung ändern)
 */
public class Smartphone {

    //region Konstanten
    public static final String DEFAULT_MODEL = "standard_modell";
    public static final int DEFAULT_STORAGE_SIZE = -1;
    public static final double DEFAULT_SCREEN_SIZE = -1.0;
    //endregion

    //region Attribute
    private SmartphoneBrand brand;
    private String model;
    private int storageSize;
    private double screenSize;
    //endregion

    //region Konstruktoren

    public Smartphone() {
        brand = SmartphoneBrand.Apple;
        model = DEFAULT_MODEL;
        storageSize = DEFAULT_STORAGE_SIZE;
        screenSize = DEFAULT_SCREEN_SIZE;
    }

    public Smartphone(SmartphoneBrand brand, String model, int storageSize, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.storageSize = storageSize;
        this.screenSize = screenSize;
    }

    //endregion

    //region Methoden

    public SmartphoneBrand getBrand() {
        return brand;
    }

    public void setBrand(SmartphoneBrand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", storageSize=" + storageSize +
                ", screenSize=" + screenSize +
                '}';
    }
    //endregion
}
