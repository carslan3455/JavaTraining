package woche_02.tag5.de.cloch.model;

/**
 * <h2>Modellklasse</h2>
 * <p>
 *     Diese Klassen werden auch Datenhaltungsklassen oder POJO-Klassen genannt (Plain Old Java Object).
 *     Eine Modellklasse enthält normalerweise keinerlei Businesslogik.
 *     Sie dient als Bauplan für Objekte, in welchen zur Laufzeit bestimmte Informationen
 *     gespeichert werden können. Jedes Objekt Beschreibt ein Haus der realen Welt.
 * </p>
 *
 * <h3>Schlüsselwort: static</h3>
 * <p>
 *     Deklariert Klassenbestandteile. Diese gehören eindeutig zur Klasse und nicht zu Instanzen dieser Klasse.
 *     D. h. statische Eigenschaften sind für alle Objekte gleich. Bestandteile die nicht mit static deklariert,
 *     werden Objekten der Klasse zugeordnet. Klassenvariablen können über Instanzen der Klasse ausgelesen und
 *     abgeändert werden. Objektvariablen können nicht über die Klasse ausgelesen und verändert werden.
 * </p>
 *
 * <h3>Sichtbarkeits- / Zugriffsmodifikatoren</h3>
 * <ul>
 *     <li> public - Zugriff über Punktoperator von überall im Projekt </li>
 *     <li> Kein Modifikator (package local) - Zugriff über Punktoperator innerhalb des selben Pakets </li>
 *     <li> protected - Zugriff über Punktoperator innerhalb des selben Paketes und aus Unterklassen (Paket egal) </li>
 *     <li> private - Zugriff über Punktoperator von der gleichen Klasse aus </li>
 * </ul>
 *
 * <h3>Konstruktoren</h3>
 * <p>
 *     Spezielle Methoden, die bei der Objekterzeugung aufgerufen werden. Sie initialisieren die Werte eines Objektes
 *     auf definierte Art und Weise. Pro Klasse kann es mehrere Konstruktoren geben,
 *     welche sich durch ihre Parameterliste unterscheiden müssen (Überladung).
 * </p>
 *
 * <h3>Getter & Setter</h3>
 * <p>
 *     Getter & Setter sind die Schnittstellen um Attribute von Objekten
 *     einzusehen und/oder zu verändern. Sie können vom Entwickler
 *     selbst beliebig definiert werden. Nach dem Prinzip der Datenkapselung
 *     sollten Eigenschaften am besten als privat gekennzeichnet werden und
 *     der Zugriff sollte nur über die definierten Schnittstellen (Getter & Setter)
 *     erfolgen
 * </p>
 *
 * <h3>toString</h3>
 * <p>
 *      Diese Methode ist dazu da, eine String-Repräsentation des Objektes
 *      zu erzeugen und zurück zu liefern.
 *      Sie w
 * </p>
 *
 * <h3>Tastenkürzel</h3>
 * <ul>
 *     <li> Alt + Einfg : Generate-Menü öffnen zun generieren von Code </li>
 * </ul>
 */
public class House {

    //region Konstanten
    private static final double DEFAULT_DOUBLE_VALUE = -1;
    private static final int DEFAULT_INTEGER_VALUE = -1;
    private static final String DEFAULT_STRING_VALUE = ">no value set<";
    //endregion

    //region Attribute
    private double width;
    private double length;
    private int windowCount;
    private String fassadeColor;
    //endregion

    //region Konstruktoren

    /**
     * Standardkonstruktor
     */
    public House() {
        width = DEFAULT_DOUBLE_VALUE;
        length = DEFAULT_DOUBLE_VALUE;
        windowCount = DEFAULT_INTEGER_VALUE;
        fassadeColor = DEFAULT_STRING_VALUE;
    }

    /**
     * 1. Überladener Konstruktor
     * @param width Breite
     * @param length Länge
     */
    public House(double width, double length) {
        this();
        this.width = width;
        this.length = length;
    }

    /**
     * 2. Überladener Konstruktor
     * @param width Breite
     * @param length Länge
     * @param windowCount Anzahl an Fenstern
     * @param fassadeColor Fassadenfarbe
     */
    public House(double width, double length, int windowCount, String fassadeColor) {
        this(width, length);
        this.windowCount = windowCount;
        this.fassadeColor = fassadeColor;
    }

    //endregion

    //region Methoden

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

    public String getFassadeColor() {
        return fassadeColor;
    }

    public void setFassadeColor(String fassadeColor) {
        this.fassadeColor = fassadeColor;
    }

    @Override
    public String toString() {
        return "House{" +
                "width=" + width +
                ", length=" + length +
                ", windowCount=" + windowCount +
                ", fassadeColor='" + fassadeColor + '\'' +
                "} " + super.toString();
    }
    //endregion
}