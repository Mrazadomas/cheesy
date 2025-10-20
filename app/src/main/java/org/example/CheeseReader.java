package org.example;
import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseReader {
    private String filename;
    private CheeseParser parser = new CheeseParser();
    private CheeseRowCleaner cleaner = new CheeseRowCleaner();
    
    public CheeseReader(String inputFilename) {
        filename = inputFilename;
    }

    public CheeseList readCheeses() {
        CheeseList list = new CheeseList();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                Cheese cheese = parser.parse(line);
                list.addCheeses(cheese);
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("error ocurred" + e.getMessage());
        }
        return list;
    }

    private Cheese desCheese(String line) {
        String cleanedLine = cleaner.clean(line);
        Cheese cheese = parser.parse(cleanedLine);
        return cheese;
    }
}
// I do not know what went wrong in here, reader stopped reading properly
// and is throwing exceptions. Worked before all the parsing implementation.
