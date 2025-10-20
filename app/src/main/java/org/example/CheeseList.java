package org.example;
import java.util.ArrayList;

public class CheeseList {
    private ArrayList<Cheese> cheeses = new ArrayList<>();
    
    public void addCheeses(Cheese cheese) {
        cheeses.add(cheese);
    }

    public int numberOfCheeses() {
        return cheeses.size();
    }

    public void printc() {
        System.out.println(cheeses.get(2));
    }

    public int mttPNumber() { // for pasteurized
        int count = 0;
        for (Cheese cheese: cheeses) {
            if ((cheese.getMtT()).equals("Pasteurized")) {
                count++;
            }
        }
        return count;
    }

    public int mttRNumber() { // for raw
        int count = 0;
        for (Cheese cheese: cheeses) {
            if ((cheese.getMtT()).equals("Raw Milk")) {
                count++;
            }
        }
        return count;
    }

    public int getOrganicM() {
        int count  = 0;
        for (Cheese cheese : cheeses) {
            if ((cheese.getM() > 41) && (cheese.getO() == 1)) {
                count++;
            }
        }
        return count;
    }

    public String animal() {
        int ccount = 0; //cow
        int gcount = 0; //goat
        int ecount = 0; //ewe, everything else barely appears so not really important to put in there
        for (Cheese cheese : cheeses) {
            if ((cheese.getMType()).equals("Cow")) {
                ccount++;
            } else if ((cheese.getMType()).equals("Goat")) {
                gcount++;
            } else if ((cheese.getMType()).equals("ewe")) {
                ecount++;
            }
        }
        if ((ccount > gcount) && (ccount > ecount)) {
            return "Cow";
        } else if ((gcount > ccount) && (gcount > ecount)) {
            return "Goat";
        }
        return "Ewe";
    }
}
