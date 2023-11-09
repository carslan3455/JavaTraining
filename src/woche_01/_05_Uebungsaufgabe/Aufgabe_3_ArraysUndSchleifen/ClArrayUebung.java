package woche_01._05_Uebungsaufgabe.Aufgabe_3_ArraysUndSchleifen;

import java.util.Arrays;

/**
 * Übungsauflösung - Arrays (und Schleifen)
 */
public class ClArrayUebung {
    //region Konstanten
    //endregion

    //region Variablen
    public static String[] names;
    public static double[] doubles;
    public static String[] flowers;

    public static int[] firstIntArray;
    public static int[] secondIntArray;
    public static float[] floats;
    //endregion

    //region Methoden
    public static void main(String[] args) {
        startApplication();
    }

    public static void startApplication() {
        printApplicationName();
        initializeArrays();
        testExerciseMethods();
    }

    public static void printApplicationName() {
        System.out.println("================");
        System.out.println("= Übung Arrays =");
        System.out.println("================");
    }

    public static void initializeArrays() {
        names = new String[]{"Jane", "Shrek", "Rita", "Merlin"};
        doubles = new double[]{1.0, 2.0, 3.0, 4.0};
        flowers = new String[]{"Tulpe", "Rose", "Margerite"};
        firstIntArray = new int[]{1, 2, 3, 4, 2, 2, 3, 3};
        secondIntArray = new int[]{3, 2, 5, 2, 2, 3 , 4};
        floats = new float[]{1.1f, 1.2f, 1.1f, 0.123f, 0.123f, 1.1f, 1.2f, -0.07f};
    }

    public static void testExerciseMethods() {
        //Aufgabe 1
        String searchedName = "Jane";
        System.out.println("\nIst \"" + searchedName + "\" in " + getArrayAsString(names) + "? "
                + stringArrayContainsValue(names, searchedName));

        //Aufgabe 2
        System.out.println("\nMittelwert von " + getArrayAsString(doubles) + "? " + calculateAverageOfDoubleArray(doubles));

        //Aufgabe 3
        System.out.println("\nUrsprungsarray: " + Arrays.toString(names) + " - " + names);
        String[] namesCopy = copyStringArray(names);
        System.out.println("Kopie des Arrays: " + Arrays.toString(namesCopy) + " - " + namesCopy);
        //Manipulieren des ursprünglichen Arrays und der Kopie
//        names[0] = "test";
//        namesCopy[1] = "test2";
//        System.out.println(Arrays.toString(names));
//        System.out.println(Arrays.toString(namesCopy));

        //Aufgabe 4
        System.out.println("\nErstes Array: " + Arrays.toString(names));
        System.out.println("Zweites Array: " + Arrays.toString(flowers));
        System.out.println("Zusammengefügtes Array: " + Arrays.toString( mergeStringArrays(names, flowers) ));

        //Aufgabe 5
        String flower = "";
        int indexOfFlower = getArrayIndexOfValue(flowers, flower);
        if (indexOfFlower != -1) {
            System.out.println("\nIndex von \"" + flower + "\" in " + Arrays.toString(flowers) + "? "
                    + indexOfFlower);
            //Z. B. Ersetzen/Löschen über den Index
        } else {
            System.out.println("\nNicht im Array gefunden!");
        }

        //Aufgabe 6
        System.out.println("\nGemeinsame Elemente von ");
        System.out.println(Arrays.toString(firstIntArray));
        System.out.println(Arrays.toString(secondIntArray) + ": ");
        printCommonElementsOfTwoArrays(firstIntArray, secondIntArray);

        //Aufgabe 7
        System.out.println("\nDuplikate in " + Arrays.toString(floats) + ":");
        printDuplicatesOfFloatArray(floats);
    }

    //region Aufgaben

    /**
     * Aufgabe 1
     */
    public static boolean stringArrayContainsValue(String[] array, String value) {
        for (String currentValue : array) {
            if (currentValue.equals(value)) return true;
        }
        return false;
    }

    /**
     * Aufgabe 2
     */
    public static double calculateAverageOfDoubleArray(double[] array) {
        double sum = 0;

        for (double currentValue : array) {
            sum += currentValue;
        }

        return sum / array.length;
    }

    /**
     * Aufgabe 3
     * Methode zum Kopieren eines Arrays
     * @param array Ursprungsarray
     * @return Kopie des Ursprungsarrays
     */
    public static String[] copyStringArray(String[] array) {

//        String[] copy = new String[array.length];
//
//        for (int i = 0; i < copy.length; i++) {
//            copy[i] = array[i];
//        }
//
//        return copy;

        return array.clone();
    }

    /**
     * Aufgabe 4
     * Fügt zwei String-Arrays zusammen
     * @param firstArray 1. Array
     * @param secondArray 2. Array
     * @return Zusammengefügtes Array aus Array 1 und Array 2
     */
    public static String[] mergeStringArrays(String[] firstArray, String[] secondArray) {
        int mergedArrayLength = firstArray.length + secondArray.length;
        String[] mergedArray = new String[mergedArrayLength];

//        for (int i = 0; i < firstArray.length; i++) {
//            mergedArray[i] = firstArray[i];
//        }
//        for (int i = 0; i < secondArray.length; i++) {
//            mergedArray[i + firstArray.length] = secondArray[i];
//        }

//        int i=0;
//        for (;i < firstArray.length; i++) {
//            mergedArray[i] = firstArray[i];
//        }
//        for (int j = 0;j < secondArray.length; j++, i++) {
//            mergedArray[i] = secondArray[j];
//        }

        int i = 0;
        for (String currentValue : firstArray) {
            mergedArray[i++] = currentValue;
        }
        for (String currentValue : secondArray) {
            mergedArray[i++] = currentValue;
        }

        return mergedArray;
    }

    /**
     * Aufgabe 5
     * Liefert Index eines gesuchten Strings von einem String-Array
     * @param array Array
     * @param value Gesuchte Wert
     * @return Index des gesuchten Werte (index == -1 -> Fehler | index != -1 -> Erfolg)
     */
    public static int getArrayIndexOfValue(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) return i;
        }

        return -1;
    }

    /**
     * Aufgabe 6
     * Gibt gemeinsame Elemente zweier int-Arrays auf der Konsole aus
     * @param firstArray 1. Array
     * @param secondArray 2. Array
     */
    public static void printCommonElementsOfTwoArrays(int[] firstArray, int[] secondArray) {

        // 1 2 3 4
        // 3 2 5 2 2 2 2 2 2 2 2 2
//        for (int firstArrayValue : firstArray) {
//            for (int secondArrayValue : secondArray) {
//                if (firstArrayValue == secondArrayValue) {
//                    System.out.println(firstArrayValue);
//                    break;
//                }
//            }
//        }

        String output = "";
        String commonElementString = "";

        for (int firstArrayValue : firstArray) {
            commonElementString = " " + firstArrayValue + ",";

            if (!output.contains(commonElementString)) {
                for (int secondArrayValue : secondArray) {

                    if (firstArrayValue == secondArrayValue) {
                        output += commonElementString;
                        break;
                    }
                }
            }
        }

        System.out.println(output);
    }

    public static void printDuplicatesOfFloatArray(float[] array) {
        // 1, 2, 1, 3, 2

        String output = "";
        String commonElementString = "";

        for (int i = 0; i < array.length; i++) {
            commonElementString = " " + array[i] + ",";

            if (!output.contains(commonElementString)) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] == array[j]) {
                        output += commonElementString;
                        break;
                    }
                }
            }
        }

        System.out.println(output);
    }

    //endregion

    /**
     * Methode zum Ausgeben eines String-Arrays auf der Konsole
     * @param array String-Array
     */
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    /**
     * Gibt String-Array als String zurück
     * @param array
     * @return
     */
    public static String getArrayAsString(String[] array) {
        String arrayString = "[";

        for (int i = 0; i < array.length; i++) {
            arrayString += "\"" + array[i] + "\"";

            if (i < (array.length - 1)) {
                arrayString += ", ";
            } else {
                arrayString += "]";
            }
        }

        return arrayString;
    }

    public static String getArrayAsString(double[] array) {
        String arrayString = "[";

        for (int i = 0; i < array.length; i++) {
            arrayString += array[i];

            if (i < (array.length - 1)) {
                arrayString += ", ";
            } else {
                arrayString += "]";
            }
        }

        return arrayString;
    }

    //endregion
}
