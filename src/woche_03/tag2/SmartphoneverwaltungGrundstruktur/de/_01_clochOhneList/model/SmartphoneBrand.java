package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de._01_clochOhneList.model;

 /**
 * Enum (Enumeration - Aufzählung), welches die Marken der Smartphones vorgibt.
 * Enums können als Datentyp verwendet werden. Werte für diesen Datentyp werden in der Aufzählung
 * innerhalb des Enums definiert, und sind die einzigen Werte die für diesen Datentyp erlaubt sind.
 * Die Elemente diese Aufzählung sind eigene Objekte, die einen Namen und eine Zahl enthalten.
 * Der Name wird in der Aufzählung manuell bestimmt und der Zahlenwert wird aufsteigen der Reihenfolge
 * vergeben, beginnend bei 0.
 *
 * Enums bestehen standardmäßig aus:
 * <ul>
 *     <li>Der Aufzählung der Werte (Objekte des Enums)</li>
 *     <li>Methode valueOf(String value) - liefert ein Enum-Objekt mithilfe eines passenden String zurück</li>
 *     <li>Methode values() - liefert ein Array mit allen Objekten des Enums zurück</li>
 * </ul>
 *
 * Objekte des Enums enthalten standardmäßig folgende Methoden:
 * <ul>
 *     <li>name() - Liefert den Namen des Objektes zurück</li>
 *     <li>ordinal() - Liefert den Zahlenwert (== Index des Enum-Arrays) zurück </li>
 * </ul>
 *
 * Zusätzlich können Enums wie ganz normale Klassen erweitert werden (Attribute, Konstanten, Methoden, usw.).
 * Enums eignen sich NICHT für die Vorgabe von Werten, welche zur Laufzeit angepasst (erweitert, verkleinert)
 * werden können sollen. Die Eigenschaften von Objekten der Aufzählung können zur Laufzeit beliebig angepasst werden,
  * die Aufzählung selbst jedoch nicht.
  * TODO 2 - Anlegen und Implementieren des Enums SmartphoneBrand
 */
public enum SmartphoneBrand {

    //region Aufzählung
    Apple( new String[] {"IPhone SE", "IPhone 14"} ),
    Samsung( new String[] {"S20", "S21", "A21"} ),
    Xiaomi( new String[] {"10T", "10T Pro", "11T"} );
    //endregion

    //region Konstanten
    //endregion

    //region Attribute
    private String[] models;
    //endregion

    //region Konstruktoren
    SmartphoneBrand(String[] models) {
        this.models = models;
    }
    //endregion

    //region Methoden

     public String[] getModels() {
         return models;
     }

//    @Override
//    public String toString() {
//        return name() + " - " + ordinal() +  "{" +
//                "models=" + Arrays.toString(models) +
//                '}';
//    }

    //endregion
}
