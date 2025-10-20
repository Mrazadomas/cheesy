package org.example;

public class CheeseAnalyzer {
    public static void main(String args[]) {
        CheeseReader reader = new CheeseReader("cheese_data.csv");
        CheeseList list = reader.readCheeses();

        System.out.println(list.numberOfCheeses());

        String output1 = Integer.toString(list.numberOfCheeses());
        String output2 = "Number of pasteurized milk cheeses: " + Integer.toString(list.mttPNumber());
        String output3 = "Number of Raw Milk cheeses: " + Integer.toString(list.mttRNumber());
        String output4 = "Number of cheeses that are more than 41% moisture and organic: " + Integer.toString(list.getOrganicM());
        String output5 = "Most cheeses on this list use " + list.animal() + " milk.";


        CheeseWriter writer = new CheeseWriter("output.txt");
        writer.write_data(output1);
        // writer.write_data(output2);
        // writer.write_data(output3);
        // writer.write_data(output4);
        // writer.write_data(output5);
    }
}
