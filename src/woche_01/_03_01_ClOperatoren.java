package woche_01;

/**
 * <h2>Operatoren in Java</h2>
 *
 * <h3>Arithmetischen Operatoren</h3>
 * <ul>
 *     <li> + : Addition/Konkatenation </li>
 *     <li> - : Subtraktion </li>
 *     <li> * : Multiplikation </li>
 *     <li> / : Division </li>
 *     <li> % : Modulo (Berechnet den Rest einer Division) </li>
 *     <li> + : positives Vorzeichen </li>
 *     <li> - : negatives Vorzeichen </li>
 *     <li> ++ : Inkrement (erhöht eine Variable um 1) </li>
 *     <li> -- : Dekrement (verringert eine Variable um 1) </li>
 * </ul>
 *
 * <h3>Zuweisungsoperatoren</h3>
 * <ul>
 *      <li> = : einfache Zuweisung </li>
 *      <li> += : Addition und Neuzuweisung </li>
 *      <li> -= : Subtraktion und Neuzuweisung </li>
 *      <li> *= : Multiplikation und Neuzuweisung </li>
 *      <li> /= : Division und Neuzuweisung </li>
 *      <li> %= : Modulo und Neuzuweisung </li>
 * </ul>
 *
 * <h3>Vergleichsoperatoren</h3>
 *      <li> < : kleiner als </li>
 *      <li> > : größer als </li>
 *      <li> <= : kleiner gleich </li>
 *      <li> >= : größer gleich </li>
 *      <li> == : gleich </li>
 *      <li> != : ungleich </li>
 * <ul>
 *
 * </ul>
 *
 * <h3>Logische Operatoren</h3>
 * <ul>
 *      <li> && : logisches UND (alle Bedingungen müssen gegeben sein) </li>
 *      <li> || : logisches ODER (mindestens eine der verknüpften Bedingungen muss eintreten) </li>
 *      <li> ! : logische Negation (Ergebnis des Ausdrucks wird umgekehrt) </li>
 *      <li> ^ : logisches EXKLUSIVES ODER (NUR EINE EINZIGE der verknüpften Bedingungen darf eintreten) </li>
 * </ul>
 *
 * <p>
 *     Außerdem gibt es in Java noch Operatoren zur Manipulation von Bits, welche hier für den Kurs
 *     nicht benötigt werden. Um mehr darüber zu erfahren verweise ich auf das Buch zum Kurs (Java ist auch eine Insel)
 *     oder auf eine Suchmaschine eurer Wahl.  :)
 * </p>
 */

public class _03_01_ClOperatoren {

    public static void main(String[] args) {

        System.out.println("Operatoren in Java");
        System.out.println("==================");

        //Arithmetische Operatoren
        int firstNumber = 5;
        double secondNumber = 3.5;
        double result = 0;

//        double secondNumber = Math.PI; //PI
//        result = Math.sqrt(secondNumber); //Quadratwurzel

        System.out.println("\nArithmetische Operatoren");
        //Addition
        result = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + result);
//        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        //Modulo
        result = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + result);

        //Inkrementieren
        System.out.println("\nInkrement");

        result = firstNumber; //result = 5      firstNumber = 5
        System.out.println("Ergebnis: " + result + " firstNumber: " + firstNumber);

        result = ++firstNumber;
        System.out.println("Ergebnis: " + result + " firstNumber: " + firstNumber);

        result = firstNumber++;
        System.out.println("Ergebnis: " + result + " firstNumber: " + firstNumber);

        //Vergleichsoperatoren
        System.out.println("\nVergleichsoperatoren");
        boolean compareResult = firstNumber < secondNumber;
        System.out.println(firstNumber + " < " + secondNumber + ": " + compareResult);
        compareResult = firstNumber > secondNumber;
        System.out.println(firstNumber + " > " + secondNumber + ": " + compareResult);

        //Logischen Operatoren
        boolean isLightOn = false;
        boolean isAgeValid = true; // alter >= 18

        System.out.println("\nLogische Operatoren");
        System.out.println(isAgeValid + " && " + isLightOn + ": " + (isAgeValid && isLightOn));
        System.out.println(isAgeValid + " || " + isLightOn + ": " + (isAgeValid || isLightOn));
        System.out.println(isAgeValid + " ^ " + isLightOn + ": " + (isAgeValid ^ isLightOn));

        secondNumber += 1; // secondNumber++ | secondNumber = secondNumber + 1;
        System.out.println(secondNumber);

    }
}
