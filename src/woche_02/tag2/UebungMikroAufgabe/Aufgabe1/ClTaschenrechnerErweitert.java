package woche_02.tag2.UebungMikroAufgabe.Aufgabe1;

import de.rhistel.logic.ConsoleReader;

import java.util.Arrays;

public class ClTaschenrechnerErweitert {
    //region Konstanten
    public static final String APPLICATION_HEADER = """
            =====================
            = Cl Taschenrechner =
            =====================
            """;
    public static final String MENU_TEMPLATE = "( %s ) %s\n";
    public static final String EXIT = "Beenden";
    public static final String SEPERATOR = "=====================";
    public static final String TXT_CHOOSE_OPERATION = "\nWählen Sie eine Rechenoperation:";
    public static final String INVALID_CHOICE = "Ungültige Auswahl";
    public static final String TXT_INVALID_OPERAND_AMOUNT = "Ungültige Anzahl!";
    //endregion Konstanten

    public static final String OPERAND_ADD = "+";
    public static final String OPERAND_SUBTRACT = "-";
    public static final String OPERAND_MULTIPLY = "*";
    public static final String OPERAND_DIVIDE = "/";
    public static final String TXT_OPERAND_AMOUNT = "\nWie viele Zahlen sollen verrechnet werden?";
    public static final String TXT_INPUT_OPERAND_STRING = "\nGeben Sie die Operanden durch ein Komma voneinander getrennt an:";
    public static final String TXT_RESULT = "\nErgebnis: ";
    public static final String TXT_EXIT_QUESTION = "\nMöchten Sie aufhören?";
    public static final String TXT_GOODBYE = "Auf Wiedersehen.";
    //region Attribute
    public static String[] operators = {OPERAND_ADD, OPERAND_SUBTRACT, OPERAND_MULTIPLY, OPERAND_DIVIDE};
    //endregion Attribute

    //region Methoden
    public static void main(String[] args) {
        startApplication();
    }

    public static void startApplication() {
        printApplicationName();
        startCalculation();
    }

    public static void printApplicationName() {
        System.out.println(APPLICATION_HEADER);
    }

    private static void startCalculation() {
        boolean exitApp = false;
        do {

            printMainMenu();
            String operator = getValidOperatorFromConsole();

            double[] operands = getOperandsFromConsole();
//        double[] operands =  getOperandsFromConsoleWithSingleString();
//            System.out.println(Arrays.toString(operands));

            double result = Double.NaN;
            switch (operator) {
                case OPERAND_ADD -> result = add(operands);
                case OPERAND_SUBTRACT -> result = subtract(operands);
                case OPERAND_MULTIPLY -> result = multiply(operands);
                case OPERAND_DIVIDE -> result = divide(operands);
            }

            System.out.println(TXT_RESULT + result);

            System.out.println(TXT_EXIT_QUESTION);
            exitApp = ConsoleReader.in.readMandatoryAnswerToBinaryQuestion();

        } while (!exitApp);
        System.out.println(TXT_GOODBYE);
    }

    private static void printMainMenu() {
        System.out.println(TXT_CHOOSE_OPERATION);
        for (int i = 0; i < operators.length; i++) {
            System.out.printf(MENU_TEMPLATE, i, operators[i]);
        }
//        System.out.println(SEPERATOR);
//        System.out.printf(MENU_TEMPLATE, operators.length, EXIT);
    }

    private static String getValidOperatorFromConsole() {

        int operatorIndex = -1;
        do {

            operatorIndex = ConsoleReader.in.readPositivInt();
            if (operatorIndex > operators.length) System.out.println(INVALID_CHOICE);
//            else if (operatorIndex == operators.length) System.exit(0);


        } while (operatorIndex >= operators.length);

        return operators[operatorIndex];
    }

    public static double[] getOperandsFromConsole() {
        boolean validInput = false;
        double[] operands = null;

        do {
            System.out.println(TXT_OPERAND_AMOUNT);
            int operandAmount = ConsoleReader.in.readPositivInt();

            if (operandAmount > 1) {
                operands = new double[operandAmount];

                for (int i = 0; i < operands.length; i++) {
                    System.out.print((i + 1) + ". Operand:");
                    operands[i] = ConsoleReader.in.readDouble();
                }

                validInput = true;
            } else {
                System.out.println(TXT_INVALID_OPERAND_AMOUNT);
            }

        } while (!validInput);


        return operands;
    }

    private static void getOperandsFromConsoleWithSingleString() {
        System.out.println(TXT_INPUT_OPERAND_STRING);
        String operandString = ConsoleReader.in.readMandatoryString();

        System.out.println(operandString);
        String[] operandStrings = operandString.split(",");
        System.out.println(Arrays.toString(operandStrings));

        double[] operands = new double[operandStrings.length];
        for (int i = 0; i < operands.length; i++) {
            operands[i] = Double.parseDouble(operandStrings[i]);
        }

        System.out.println(Arrays.toString(operands));
    }

    private static double add(double[] operands) {

        double result = 0;

        for (double operand : operands) {
            result += operand;
        }

        return result;
    }

    private static double subtract(double[] operands) {
        double result = operands[0];

        for (int i = 1; i < operands.length; i++) {
            result -= operands[i];
        }

        return result;
    }

    private static double multiply(double[] operands) {
        double result = 1;

        for (double operand : operands) {
            result *= operand;
        }

        return result;
    }

    private static double divide(double[] operands) {
        double result = operands[0];

        for (int i = 1; i < operands.length; i++) {
            result /= operands[i];
        }

        return result;
    }
    //endregion Methoden

}