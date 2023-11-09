package woche_02.tag5.de.cloch.main;

import woche_02.tag5.de.cloch.model.House;

public class ClEinfuehrungOop extends House {

    public static void main(String[] args) {
        House firstHouse = new House(10,6,6,"gelb");
        System.out.println("\nErstes Haus:");
        System.out.println(firstHouse);

        House secondHouse = new House();
        System.out.println("\nZweites Haus:");
        System.out.println(secondHouse);

        firstHouse.setWidth(12.345);
        firstHouse.setLength(10);
        firstHouse.setWindowCount(8);
        firstHouse.setFassadeColor("gelb");

        System.out.println("\nErstes Haus:");
        System.out.println(firstHouse);

        System.out.println("\nZweites Haus:");
        System.out.println(secondHouse);

    }
}
