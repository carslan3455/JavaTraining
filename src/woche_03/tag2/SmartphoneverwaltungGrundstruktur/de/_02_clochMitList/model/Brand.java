package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.model;

/**
 * Eigene Abbildung eines Enums. Hier im Projekt
 * wird diese Klasse jedoch nicht genutzt und dient nur
 * der Veranschaulichung der Funktionsweise von Enums.
 */
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
        this.name = name;
        this.ordinal = ordinal;
        this.models = models;
    }
    //endregion

    //region Methoden
    public static Brand[] values() {
        return new Brand[] {Apple, Samsung, Xiaomi};
    }

    public static Brand valueOf(String value) throws Exception {
        for (Brand brand : values()) {
            if (brand.name.equals(value)) return brand;
        }
        throw new Exception();
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
