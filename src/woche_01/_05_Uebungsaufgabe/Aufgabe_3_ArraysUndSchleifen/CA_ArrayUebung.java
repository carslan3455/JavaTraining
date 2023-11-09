package woche_01._05_Uebungsaufgabe.Aufgabe_3_ArraysUndSchleifen;

import java.util.Arrays;

public class CA_ArrayUebung {

    public static void main(String[] args) {

        startApplication();

    }

    public static void startApplication() {

        printApplicationName();

        String[] tags = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        String aktuelTag = "Mdv";

        boolean ergebnis = vergleichFunktoin(tags, aktuelTag);
        System.out.println("\nErgebnis: " + ergebnis);

        int[] zahlen_1 = {11, 32, 43, 54, 65, 76};
        int[] zahlen_2 = {78, 57, 93, 25, 34, 41};

        double[] zahlen_3 = {11.4, 3.2, 4.3, 5.4, 6.5, 7.6};
        double[] zahlen_4 = {7.8, 5.7, 9.3, 2.5, 3.4, 4.1};

        double mittelWert = mittelwertBerechnen(zahlen_3, zahlen_4);
        System.out.println("\nMittelwert: " + mittelWert);


        String[] neuArray = duplicateArray(tags);
        System.out.println("\n Duplicate Array : " + Arrays.toString(neuArray));

        int[] zusammenArray = zusammenzufügen(zahlen_1, zahlen_2);
        System.out.println("\n zusammenfügene Array : " + Arrays.toString(zusammenArray));

        prueftWert(tags, "Mittwoch");

        String[] favoriTags = {"Donnerstag", "Freitag", "Samstag", "Sonntag"};
        gemeinsameElemente(tags, favoriTags);
        System.out.println();

        float[] floatArray = {0.03f, 2.8f, 5.7f, 9.3f, 2.8f, 3.4f, 4.1f, 0.03f};
//        float[] floatArray = {0.03f, 2.8f, 5.7f, 9.3f};

        dupplikateUeberprueft(floatArray);

    }

    public static void printApplicationName() {

        System.out.println("\n===============");
        System.out.println("= Array Übung =");
        System.out.println("===============");
    }


    public static boolean vergleichFunktoin(String[] stringArray, String stringParameter) {

        boolean result = false;

        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i].equals(stringParameter)) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static double mittelwertBerechnen(double[] doubleArray_1, double[] doubleArray_2) {

        double addieren = 0;
        double lengt = doubleArray_1.length + doubleArray_2.length;

        for (double i : doubleArray_1) {
            addieren += i;
        }
        for (double i : doubleArray_2) {
            addieren += i;
        }

        return addieren / lengt;
    }

    public static String[] duplicateArray(String[] stringArray) {

        int index = 0;

        String[] neuArray = new String[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {

            neuArray[index] = stringArray[i];
            index++;
        }
        return neuArray;
    }

    public static int[] zusammenzufügen(int[] intArray_1, int[] intArray_2) {

        int[] zusammenArray = new int[intArray_1.length + intArray_2.length];
        int index = 0;

        for (int parameter : intArray_1) {

            zusammenArray[index] = parameter;
            index++;
        }
        for (int parameter : intArray_2) {

            zusammenArray[index] = parameter;
            index++;
        }


        return zusammenArray;
    }

    public static void prueftWert(String[] stringArray, String stringParameter) {


        for (int i = 0; i < stringArray.length; i++) {

            if (stringArray[i].equals(stringParameter)) {
                System.out.println("\n Der Wert \"" + stringParameter + "\" enhält in Array und Index ist : " + i + "\n");
                break;
            } else {
                if (i == stringArray.length - 1) {
                    System.out.println("\n Der Wert" + stringParameter + " enhält nicht in Array\n");
                }
            }
        }
    }

    public static void gemeinsameElemente(String[] stringArray_1, String[] stringArray_2) {

        for (int i = 0; i < stringArray_1.length; i++) {

            for (int j = 0; j < stringArray_2.length; j++) {

                if (stringArray_1[i].equals(stringArray_2[j])) {
                    System.out.print(" " + stringArray_1[i] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void dupplikateUeberprueft(float[] floatArray) {

        int count = 0;

        for (int i = 0; i < floatArray.length; i++) {

            for (int j = 0; j < floatArray.length; j++) {

                if (i == j) break;
                else if (floatArray[i] == floatArray[j]) {
                    System.out.println(" " + floatArray[i]);
                    count++;
                }
            }
              if (i == floatArray.length - 1 && count==0) {
                System.out.println("\nInnerhalb des Arrays gibt es keine Duplikate...");
            }
        }


    }
}

