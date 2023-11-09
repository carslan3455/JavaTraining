package woche_01.Übung;

import java.util.Locale;

public class Ca_VariablenUebung {
    public static void main(String[] args) {

        String firmanName_1 = "HEIMSERVICE";
        String firmanName_2 = "Ahiloo";

        String inhaber = "Jaswinder Multani";
        String adresse_1 = "Bürgermeister-Regitz-Straße 44";
        String adresse_2 = "66539 Neunkirchen / Wellesweilers";

        String ustId = "DE81500273465";

        System.out.println(firmanName_1 + "\t\t\t\t\t\t\t"+firmanName_2 );
        System.out.println(firmanName_2.toUpperCase(Locale.ROOT) +  "\t\t\t\t\t\t\t\tInhaber: \n\t\t\t\t\t\t\t\t\t" + inhaber );

        System.out.println( "\t\t\t\t\t\t\t\t\tAdresse: \n\t\t\t\t\t\t\t\t\t" + adresse_1 + "\n\t\t\t\t\t\t\t\t\t" +adresse_2);
        System.out.println("\t\t\t\t\t\t\t\t\tUst.Id: " + ustId);

        String kundenName = "Herr Shrek Vom-Tümpel";
        String kundenAnsicht_1 = "Schlammtümpelstraße 90001";
        String kundenAnsicht_2 = "12345 Weit Weit Weg";


        String rechnungNummer = "69";  // oder int rechnungNummer = 69;
        String rechnungsDatum = "20.September 2020";
        int bestellNummer = 1171;
        String bestellDatum = "20.September 2020";
        String zahlungsart = "PayPal";

        System.out.println("\n\nRECHNUNG\n\n" + kundenName + "\t\t\t\tRechnungsnummer: " + rechnungNummer);
        System.out.println(kundenAnsicht_1 + "\t\t\tRechnungsdatum:  " + rechnungsDatum);
        System.out.println(kundenAnsicht_2 + "\t\t\t\t\tBestellennummer: " + bestellNummer);
        System.out.println("\t\t\t\t\t\t\t\t\tBestelldatum:  \t " + bestellDatum);
        System.out.println("\t\t\t\t\t\t\t\t\tZahlungsart:  \t " + zahlungsart);


        String langLine = "-----------------------------------------------------------------------";
        String kurzLine = "----------------------------------";
        String produkt_1 = "Schnitzel Haus";
        String artNummer_1 = "255";
        String produkt1_Extra = "Extra (1,50€): Hähnchenfleisch anstelle von Shwienfleisch";
        int anzahl = 1;
        double produktPreis_1 = 13;


        String produkt_2 = "Pizza Ahiloo 40 cm";
        String produkt2_Extra_1 = "Extra (2,00€): Champignons";
        String produkt2_Extra_2 = "Extra (2,00€): Paprika";

        double produktPreis_2 = 14;
        String artNummer_2 = "57-3" ;

        double zwischensumme = (anzahl*produktPreis_1)+(anzahl*produktPreis_2);
        String lieferung = "Kostenlos Lieferung";
        double mwSt = 1.29;

        //        System.out.printf("%s %s50 %s50","Produckt","Anzahl","Preis");
        System.out.println("\n\nProdukt\t\t\t\t\t\t\t\t\t" + "Anzahl\t\t\t" + "Preis");
        System.out.println(langLine);

        System.out.print(produkt_1 + "\t\t\t\t\t\t\t" + anzahl + "\t\t\t\t");
        System.out.printf("%.2f €" , produktPreis_1);
        System.out.println("\n" + produkt1_Extra+ "\nArt-Nr.:" + artNummer_1);

        System.out.println(langLine);
        System.out.print(produkt_2 + "\t\t\t\t\t\t" + anzahl + "\t\t\t\t");
        System.out.printf("%.2f €" , produktPreis_2);
        System.out.println("\n" + produkt2_Extra_1 + "\n" + produkt2_Extra_2 + "\nArt-Nr.:"  + artNummer_2);
        System.out.println(langLine);

        System.out.println("\t\t\t\t\t\t\t\t\t"+kurzLine);
        System.out.print("\t\t\t\t\t\t\t\t\tZwischensumme \t");
        System.out.printf("%.2f €\t", zwischensumme);
        System.out.println("\n\t\t\t\t\t\t\t\t\t"+kurzLine);
        System.out.println("\t\t\t\t\t\t\t\t\tLieferung\t\t" + lieferung);
        System.out.println("\t\t\t\t\t\t\t\t\t"+kurzLine);
        System.out.print("\t\t\t\t\t\t\t\t\tGesamt\t\t\t");
        System.out.printf("%.2f €\t", zwischensumme);
        System.out.println("\n\t\t\t\t\t\t\t\t\t"+kurzLine);
        System.out.print("\t\t\t\t\t\t\t\t\tinkl.5% MwSt\t");
        System.out.printf("%.2f €\t", mwSt);
        System.out.println("\n\t\t\t\t\t\t\t\t\t"+kurzLine);





    }
}
