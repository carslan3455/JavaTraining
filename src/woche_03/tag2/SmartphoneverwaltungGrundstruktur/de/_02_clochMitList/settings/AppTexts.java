package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._02_clochMitList.settings;

/**
 * Enthält alle Programmtexte als Konstanten
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
    public static final String TXT_INVALID_CHOICE = "\nUngültige Auswahl!";
    public static final String TEMPLATE_SMARTPHONES_HEADER = "\n%-20s %-20s %-20s %-20s %-20s\n\n";
    public static final String TEMPLATE_SMARTPHONES_ENTRY = "%-20s %-20s %-20s %-20s %-20s\n";
    public static final String TXT_INDEX = "Index";
    public static final String TXT_BRAND = "Marke";
    public static final String TXT_MODEL = "Modell";
    public static final String TXT_STORAGE_SIZE = "Speicher";
    public static final String TXT_SCREEN_SIZE = "Bildschirmgröße";
    public static final String TXT_CHOOSE_BRAND = "\nWählen Sie eine Marke:\n";
    public static final String TEMPLATE_USER_CHOICE_ENTRY = "( %s ) %s\n";
    public static final String TXT_CHOOSE_MODEL = "\nWählen Sie ein Modell aus:\n";
    public static final String TXT_INPUT_STORAGE_SIZE = "\nSpeichergröße:";
    public static final String TXT_INPUT_SCREEN_SIZE = "\nBildschirmgröße:";
    //endregion

    //region Konstruktoren
    private AppTexts() {
    }
    //endregion
}
