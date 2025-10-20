package org.example;

public class CheeseParser {

    private int getMoisture(String[] props) {
        return Integer.parseInt(props[2]);
    }

    private String getTreatmentType(String[] props) {
        String r = "Raw Milk";
        String p = "Pasteurized";
        String t = "Thermised";
        for (int i = 0; i < props.length; i++) {
            if (props[i].equals(r)) {
                return r;
            } else if (props[i].equals(p)) {
                return p;
            } else if (props[i].equals(t)) {
                return t;
            }
            
        }
        return "";
    }

    private int organic(String[] props) {
        for (int x = 0; x < props.length; x++) {
            if (props[x].equals("0")) {
                return 0;
            } else if (props[x].equals("1")) {
                return 1;
            }
    
            
        }
        return 2;
    }

    private String getMilkType(String[] props) {
        String c = "cow";
        String e = "Ewe";
        String g = "Goat";

        for (int i = 0; i< props.length; i++) {
            if (props[i].equals(c)) {
                return c;
            } else if (props[i].equals(e)) {
                return e;
            } else if (props[i].equals(g)) {
                return g;
            }
        }
        return "";
    }

    public Cheese parse(String s) {
        String[] props = s.split(",");

        String id = "";
        String mtT = getTreatmentType(props);//milk treatment Type
        int organic = organic(props); 
        int moisture = getMoisture(props);
        String milkType = getMilkType(props); 

        

        Cheese cheese = new Cheese(id, mtT, organic, moisture, milkType);
        return cheese;
    }
}
