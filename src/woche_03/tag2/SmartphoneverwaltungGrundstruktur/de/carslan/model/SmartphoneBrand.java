package woche_03.tag2.SmartphoneverwaltungGrundstruktur.de.carslan.model;

public enum SmartphoneBrand {

    //region Aufzählen
    Apple(new String[]{"IPhone SE", "IPhone 14"}),
    Samsung(new String[]{"S20", "S21", "A21"}),
    Xiaomi(new String[]{"10T", "10T Pro"}) ;
    //endregion Aufzählen

    //region Attribute
    private String [] models;
    //endregion Attribute

    //region Konstruktoren
    SmartphoneBrand(String[] models) {
        this.models = models;
    }
    //endregion Konstruktoren

    //region Methoden
    public String[] getModels() {
        return models;
    }

//    @Override
//    public String toString() {
//        return "SmartphoneBrand{" +
//                "models=" + Arrays.toString(models) +
//                '}';
//    }
    //endregion Methoden
}
