package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de.carslan.model;

public class Brand {

    //region Konstanten
    public static final Brand Apple = new Brand("Apple", 0, new String[]{"a", "b", "c"} );
    public static final Brand Samsung = new Brand("Samsung", 1, new String[]{"a", "b", "c"} );
    public static final Brand Xiaomi = new Brand("Xiaomi", 2, new String[]{"a", "b", "c"} );
    //endregion

    //region Attribute
    private String name;
    private int ordinal;
    private String[] models;
    //endregion

    //region Konstruktoren
    private Brand(String name, int ordinal, String[] models) {
        this.models = models;
    }
    //endregion

    //region Methoden
    public static Brand[] values() {
        return new Brand[] {Apple, Samsung, Xiaomi};
    }

    public static Brand valueOf(String value) throws Exception {
        if (value.equals("Apple")) return Apple;
        else if (value.equals("Samsung")) return Samsung;
        else if (value.equals("Xiaomi")) return Xiaomi;
        else throw new Exception();
    }

    public String name() {
        return this.name;
    }

    public int ordinal() {
        return this.ordinal;
    }

    @Override
    public String toString() {
        return name;
    }

    //endregion
}
