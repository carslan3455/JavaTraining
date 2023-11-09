package woche_03.tag1.UebungAutomanufaktur.cloch.settings;

/**
 * Stellt alle Ausgabetexte der Applikation als Konstanten bereit
 */
public class AppTexts {

    //region Konstanten
    public static final String APP_NAME = """
            = Cl Automanufaktur =
            """;
    public static final String TEMPLATE_MAIN_MENU = """
            [ %s ] Automaßanfertigung
            [ %s ] Hilfe
            -------------------------
            [ %s ] Beenden
                        
            """;
    public static final String TXT_HELP = "\nBei Punkt 1 > Automaßanfertigung, müssen sie beliebige Eigenschaften " +
            "eingeben. Mit diesen gewünschten Eigenschaften wird ihr Auto gebaut.\n" +
            "Bei Punkt 2 > Hilfe anzeigen, wird dieser ganze Text ausgegeben.\n" +
            "Bei Punkt 0 > Programm beenden, wird das Programm verlassen.\n";
    public static final String TXT_INPUT_CAR_INFORMATION = "\nGeben Sie bitte die Informationen zum gewünschten Auto ein:";
    public static final String TXT_INPUT_BRAND = "Marke: ";
    public static final String TXT_INPUT_MODEL = "Modell: ";
    public static final String TXT_INPUT_HORSE_POWER = "PS: ";
    public static final String TXT_INPUT_PRICE = "Preis: ";
    public static final String TXT_INPUT_COLOR = "Farbe: ";
    public static final String TXT_CAR_OUTPUT = """
            Ihr gewünschtes Auto:
            Marke: %s
            Modell: %s
            PS: %s
            Preis: %.2f €
            Farbe: %s
            """;
    //endregion

    //region Attribute
    //endregion

    //region Konstruktoren
    //endregion

    //region Methoden
    //endregion
}
