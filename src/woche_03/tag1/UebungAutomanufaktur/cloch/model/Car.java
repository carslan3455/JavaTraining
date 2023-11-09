package woche_03.tag1.UebungAutomanufaktur.cloch.model;

import woche_03.tag1.UebungAutomanufaktur.cloch.ui.UiController;

/**
 * Modellklasse für Autos der realen Welt
 */
public class Car {

    //region Konstanten
    public static final String DEFAULT_STRING_VALUE = ">no value set<";
    public static final int DEFAULT_INT_VALUE = -1;
    public static final double DEFAULT_DOUBLE_VALUE = -1d;
    //endregion

    //region Attribute
    private String brand;
    private String model;
    private int horsePower;
    private double price;
    private String color;
    //endregion

    //region Konstruktoren

    public Car() {
        brand = DEFAULT_STRING_VALUE;
        model = DEFAULT_STRING_VALUE;
        horsePower = DEFAULT_INT_VALUE;
        price = DEFAULT_DOUBLE_VALUE;
        color = DEFAULT_STRING_VALUE;
    }

    public Car(String brand, String model, int horsePower, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
        this.color = color;
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

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    //endregion
}
