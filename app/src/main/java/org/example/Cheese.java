package org.example;

public class Cheese {
    private String id;
    private String mtT; //milk treatment Type
    private int organic; 
    private int moisture;
    private String milkType; 

    Cheese(String CheeseId, String MtT, int Organic, int Moisture, String MilkType) {
        id = CheeseId;
        mtT = MtT;
        organic = Organic;
        moisture = Moisture;
        milkType = MilkType;
    }

    public String getMtT() {
        return mtT;
    }

    public int getO() {
        return organic;
    }

    public int getM() {
        return moisture;
    }

    public String getMType() {
        return milkType;
    }
}
