package woche_01._05_Uebungsaufgabe.Aufgabe_2_Methoden;
/**
 * Übungsauflösung - Taschenrechner
 */
public class ClTaschenrechner {

    public static void main(String[] args) {
    startApplication();
}

    public static void startApplication() {
        printApplicationName();
        startCalculation();
    }

    public static void printApplicationName() {
        System.out.println("=====================");
        System.out.println("= Cl Taschenrechner =");
        System.out.println("=====================");
    }

    private static void startCalculation() {
        double firstOperand = 10.5;
        double secondOperand = 0;
        System.out.println("\nErste Zahl: " + firstOperand + "\tZweite Zahl: " + secondOperand);

        double additionResult = add(firstOperand, secondOperand);
        double subtractionResult = subtract(firstOperand, secondOperand);
        double multiplicationResult = multiply(firstOperand, secondOperand);
        double divisionResult = divide(firstOperand, secondOperand);

        System.out.println(firstOperand + " + " + secondOperand + " = " + additionResult);
        System.out.println(firstOperand + " - " + secondOperand + " = " + subtractionResult);
        System.out.println(firstOperand + " * " + secondOperand + " = " + multiplicationResult);
        System.out.println(firstOperand + " / " + secondOperand + " = " + divisionResult);
    }

    private static double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    private static double subtract(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    private static double multiply(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    private static double divide(double firstOperand, double secondOperand) {
        return firstOperand / secondOperand;
    }


}