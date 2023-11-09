package woche_01._05_Uebungsaufgabe.Aufgabe_2_Methoden;

public class CA_Taschenrechner {

    public static void main(String[] args) {

        startApplication();

    }

    public static void startApplication() {

        printApplicationName();

        double doubleZahl_1 = 5.6;
        double doubleZahl_2 = 1.4;
        String rechenArt = "-";

        startCalculation(doubleZahl_1, doubleZahl_2, rechenArt);


    }

    public static void printApplicationName() {

        System.out.println("\n=================");
        System.out.println("= Tashenrechner =");
        System.out.println("=================");
    }

    public static double startCalculation(double doubleParameter_1, double doubleParameter_2, String rechenarten) {

        double result = 0;

        switch (rechenarten) {

            case ("+"): {
                result = doubleParameter_1 + doubleParameter_2;
                System.out.println("\n\n" + doubleParameter_1 + " " + rechenarten + " " + doubleParameter_2 + " = " + result);
                break;
            }
            case ("-"): {
                result = doubleParameter_1 - doubleParameter_2;
                System.out.println("\n" + doubleParameter_1 + " " + rechenarten + " " + doubleParameter_2 + " = " + result);
                break;
            }
            case ("*"): {
                result = doubleParameter_1 * doubleParameter_2;
                System.out.println("\n" + doubleParameter_1 + " " + rechenarten + " " + doubleParameter_2 + " = " + result);
                break;
            }
            case ("/"): {
                result = doubleParameter_1 / doubleParameter_2;
                System.out.println("\n" + doubleParameter_1 + " " + rechenarten + " " + doubleParameter_2 + " = " + result);
                break;
            }
            default:
                System.out.println("\n!!! Ungültige Rechnenart  !!!");
        }

        return result;

    }


}