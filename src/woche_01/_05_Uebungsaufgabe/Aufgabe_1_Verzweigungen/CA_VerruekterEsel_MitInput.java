package woche_01._05_Uebungsaufgabe.Aufgabe_1_Verzweigungen;

import javax.swing.*;

public class CA_VerruekterEsel_MitInput {

    public static void main(String[] args) {

        System.out.println("============================");
        System.out.println("= CLUB zum VERRÜKTEN ESEL  =");
        System.out.println("============================");

        final String passwort_1 = "LilaBlume";
        final String passwort_2 = "7721";

        String kundenValidName;
        String krediKarteName;
        int kredit ;
        String validPassword_2 ;

       String passwordBesucher = JOptionPane.showInputDialog("Bitte nennen Sie das Password");

       if (passwort_1.equals(passwordBesucher)){
           JOptionPane.showMessageDialog(null, "Bitte tretten Sie in den Sicherheitskorridor ein.");
           validPassword_2 = JOptionPane.showInputDialog(null, "Bitte nennen Sie den Code laut und deutlich");
           if (passwort_2.equals(validPassword_2)){
               JOptionPane.showMessageDialog(null, "Bitte tretten Sie in den Sicherheitskorridor ein.");

           }
       }

    }
}
