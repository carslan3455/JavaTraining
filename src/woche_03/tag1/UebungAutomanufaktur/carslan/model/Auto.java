package woche_03.tag1.UebungAutomanufaktur.carslan.model;

/**
 * Modellklasse für Automanufaktur der realen Welt
 * TODO 1 - Anlegen und implimentieren der Modellklasse
 */
public class Auto {


    //region Konstanten
    private static final String DEFAULT_MARKE = "Volkswagen";
    private static final String DEFAULT_KRAFTSTOFF = "Hybrid";
    private static final Integer DEFAULT_ANZAHL_DER_SITZER = 5;
    private static final String DEFAULT_FARBEN = ">Schwarz<";
    //endregion Konstanten

    //region Attribute
    private String marke;   // Volkswagen,BMW,Mercedes,Audi
    private String kraftstoff;  // Benzin,Diesel,Elektro,Hybrid
    private int anzahlDerSitzer;     // 2,4,5,7
    private String farben;    //Blau,Grau, Weiß,Schwarz
    //endregion Attribute

    //region Konstruktoren



    public Auto() {
        this.marke = DEFAULT_MARKE;
        this.kraftstoff = DEFAULT_KRAFTSTOFF;
        this.anzahlDerSitzer = DEFAULT_ANZAHL_DER_SITZER;
        this.farben = DEFAULT_FARBEN;
    }


    public Auto(String marke, String kraftstoff, int anzahlDerSitzer, String farben) {
        this.marke = marke;
        this.kraftstoff = kraftstoff;
        this.anzahlDerSitzer = anzahlDerSitzer;
        this.farben = farben;
    }
    //endregion Konstruktoren


    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getKraftstoff() {
        return kraftstoff;
    }

    public void setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
    }

    public int getAnzahlDerSitzer() {
        return anzahlDerSitzer;
    }

    public void setAnzahlDerSitzer(int anzahlDerSitzer) {
        this.anzahlDerSitzer = anzahlDerSitzer;
    }

    public String getFarben() {
        return farben;
    }

    public void setFarben(String farben) {
        this.farben = farben;
    }

    @Override
    public String toString() {
        return  "\nIhre gewünschte Auto " +
                "\n Marke= " + marke  +
                "\n Kraftstoff= " + kraftstoff +
                "\n Anzahl der Sitzer= " + anzahlDerSitzer +
                "\n Farbe= " + farben ;
    }
}
