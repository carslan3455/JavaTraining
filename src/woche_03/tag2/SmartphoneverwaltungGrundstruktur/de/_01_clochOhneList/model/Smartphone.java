package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.model;

/**
 * Modellklasse für Smartphones der realen Welt
 * TODO 1 - Anlegen und implementieren der Modellklasse
 */
public class Smartphone {

    //region Konstanten
    public static final String DEFAULT_BRAND = "standard_marke";
    public static final String DEFAULT_MODEL = "standard_modell";
    public static final int DEFAULT_STORAGE_SIZE = -1;
    public static final double DEFAULT_SCREEN_SIZE = -1.0;
    //endregion

    //region Attribute
    private String brand;
    private String model;
    private int storageSize;
    private double screenSize;
    //endregion

    //region Konstruktoren

    public Smartphone() {
        brand = DEFAULT_BRAND;
        model = DEFAULT_MODEL;
        storageSize = DEFAULT_STORAGE_SIZE;
        screenSize = DEFAULT_SCREEN_SIZE;
    }

    public Smartphone(String brand, String model, int storageSize, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.storageSize = storageSize;
        this.screenSize = screenSize;
    }

    //endregion

    //region Methoden

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
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
