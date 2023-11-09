package woche_01;

/**
 * <h2>Methoden und Funktionen</h2>
 *
 * <ul>
 *    <li>Dienen zum Auslagern/Zentralisieren und Wiederverwenden von Code</li>
 *    <li>Machen das Programm wartbarer</li>
 *    <li>Müssen aufgerufen werden, dass der zugehörige Code ausgeführt wird</li>
 *    <li>Können Werte entgegennehmen und/oder zurückgeben</li>
 * </ul>
 *
 * <h3>Tastenkürzel</h3>
 * <ul>
 *     <li> Strg + Alt + M : Auslagern des markierten Codes in eine eigene Methode </li>
 * </ul>
 */

public class _04_01_ClMethodenUndFunktionen {

    static int zahl;

    /**
     * Startpunkt des Programms
     * @param args Startparameter
     */

    public static void main(String[] args) {

//        Main.runApplication();
        runApplication();


    }

    public static void runApplication() {
        printApplicationName();

        System.out.println("\n# So funktionieren Methoden #");
        showHowMethodsWork();
        showHowMethodsWithParametersWork(2, "");

        double result = showHowFunctionsWork();
        System.out.println("\n\tErgebnis: " + result);

        result = showHowFunctionsWithParametersWork(result, 0.5);
        System.out.println("\n\tErgebnis: " + result);
    }

    public static void printApplicationName() {
        System.out.println("==========================");
        System.out.println("Cl Methoden und Funktionen");
        System.out.println("==========================");
    }

    public static void showHowMethodsWork() {
        System.out.println("\nOHNE Parameter & OHNE Rückgabe");
        System.out.println("o-> \tMain.showHowMethodsWork wurde von Main.runApplication aufgerufen.");
        System.out.println("o-> \tEine Methode macht nur das, was zwischen den { } steht (Methodenkörper).");
        System.out.println("o-> \tSie könnte irgendwelche Dinge berechnen, z.B. 1+1 = " + (1 + 1));
        System.out.println("o-> \tSie könnte irgendwelche Daten beschaffen und verändern etc.");
        System.out.println("o-> \tSie zentralisiert bestimmte Aufgaben des Programms und ist auf Mehrfachverwendung ausgelegt.");
    }

    public static void showHowMethodsWithParametersWork(int intParameter, String stringParameter) {
        System.out.println("\nMIT Parametern & OHNE Rückgabe");
        System.out.println("o-> \tMain.showHowMethodsWithParametersWork wurde von Main.runApplication aufgerufen.");
        System.out.println("o-> \tBeim Aufruf müssen die definierten Parameter in der richtigen Reihenfolge übergeben werden.");
        System.out.println("o-> \tshowHowMethodsWithParametersWork(2, \"ein text\")");

        //Prüfen ob der String, der von stringParameter referenziert wird, nicht leer ist
        if (!stringParameter.isEmpty()) {

            int result = 2 * intParameter + intParameter;
            System.out.println("\n\t" + stringParameter + " - Ergebnis: " + result);
        }
    }

    public static double showHowFunctionsWork() {

        System.out.println("\nOHNE Parameter & MIT Rückgabe");
        System.out.println("o-> \tMain.showHowFunctionsWork wurde von Main.runApplication aufgerufen.");
        System.out.println("o-> \tSie könnte irgendwelche Dinge berechnen, z.B. 1+1 = " + (1 + 1));
        System.out.println("o-> \tSie könnte irgendwelche Daten beschaffen und verändern etc.");
        System.out.println("o-> \tSie zentralisiert bestimmte Aufgaben des Programms und ist auf Mehrfachverwendung ausgelegt.");
        System.out.println("o-> \tSie hat IMMER einen Rückgabetyp und -wert!!!");
        System.out.println("o-> \tSie gibt IMMER etwas zurück (return)!!!");

        final double firstNumber = 10.0;
        final double secondNumber = 0.5;

        return firstNumber + secondNumber;
    }

    public static double showHowFunctionsWithParametersWork(double firstNumber, double secondNumber) {

        System.out.println("\nMIT Parametern & MIT Rückgabe");
        System.out.println("o-> \tMain.showHowFunctionsWithParametersWork wurde von Main.runApplication aufgerufen.");
        System.out.println("o-> \tshowHowFunctionsWithParametersWork(10.5, 0.5);");

        return firstNumber + secondNumber;
    }

}
