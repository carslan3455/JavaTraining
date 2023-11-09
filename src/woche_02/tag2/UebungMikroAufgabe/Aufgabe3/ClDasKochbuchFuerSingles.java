package woche_02.tag2.UebungMikroAufgabe.Aufgabe3;

import de.rhistel.logic.ConsoleReader;

public class ClDasKochbuchFuerSingles {
    //region Konstanten
    public static final String APP_HEADER = """
            ===========================
            = Cl Kochbuch Für Singles =
            ===========================
            """;
    public static final int INDEX_RECIPE_NAME = 0;
    public static final String TXT_INVALID_CHOICE = "Ungültige Auswahl!";
    public static final String TEMPLATE_MENU = "[ %s ] %s\n";
    public static final int INDEX_RECIPE_INSTRUCTIONS = 1;
    public static final String TXT_INSTRUCTIONS = "\nAnweisungen für %s:\n";
    //endregion

    //region Attribute
    public static String[][] recipes = {
            {"Spiegelei", "Anweisung für Spiegelei"},
            {"Spaghetti", "Anweisung für Spaghetti"},
            {"Lieferdienst", "Anweisung für Lieferdienst"}
    };

    //endregion

    //region Methoden
    public static void main(String[] args) {
        startApp();
    }

    private static void startApp() {
        printAppName();
        startRecipeSelection();
    }

    private static void printAppName() {
        System.out.println(APP_HEADER);
    }

    private static void startRecipeSelection() {
        //Ausgabe der Rezeptnamen
        printRecipeNames();
        //Index einlesen
        int recipeIndex = getValidRecipeIndex();
        //Anweisungen ausgeben
        printInstructionsForRecipe(recipeIndex);
    }

    private static void printRecipeNames() {
        for (int i = 0; i < recipes.length; i++) {
            System.out.printf(TEMPLATE_MENU, i, recipes[i][INDEX_RECIPE_NAME]);
        }
    }

    private static void printInstructionsForRecipe(int recipeIndex) {
        //Rezeptschritte ausgeben
        System.out.printf(TXT_INSTRUCTIONS, recipes[recipeIndex][INDEX_RECIPE_NAME]);
        System.out.println(recipes[recipeIndex][INDEX_RECIPE_INSTRUCTIONS]);
    }

    private static int getValidRecipeIndex() {

        int recipeIndex = -INDEX_RECIPE_INSTRUCTIONS;
        do {
            recipeIndex = ConsoleReader.in.readPositivInt();
            if (recipeIndex >= recipes.length) System.out.println(TXT_INVALID_CHOICE);
        } while (recipeIndex >= recipes.length);

        return recipeIndex;
    }
    //endregion)
}


