package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.settings;

/**
 * Enthält alle Programmtexte als Konstanten
 * TODO 0.3 - AppTexts anlegen
 */
public class AppTexts {

    //region Konstanten
    public static final String APP_NAME = """
            =======================
            Cl Smartphoneverwaltung
            =======================""";
    public static final String TEMPLATE_MAIN_MENU = """
            
            < %s > Anlegen
            < %s > Anzeigen
            < %s > Bearbeiten
            < %s > Löschen
            -----------------
            < %s > Beenden
            """;
    public static final String TXT_INVALID_CHOICE = "\nUngültige Auswahl";
    public static final String TEMPLATE_SMARTPHONES_HEADER = "\n%-20s %-20s %-20s %-20s %-20s\n\n";
    public static final String TEMPLATE_SMARTPHONES_ENTRY = "%-20s %-20s %-20s %-20s %-20s\n";
    public static final String TXT_INDEX = "Index";
    public static final String TXT_BRAND = "Marke";
    public static final String TXT_MODEL = "Modell";
    public static final String TXT_STORAGE_SIZE = "Speicher";
    public static final String TXT_SCREEN_SIZE = "Bildschirmgröße";
    //endregion

    //region Konstruktoren
    private AppTexts() {
    }
    //endregion
}
