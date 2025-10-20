package org.example;

import java.io.FileOutputStream;

public class CheeseWriter {
    private String filename;
    public CheeseWriter(String output_filename) {
        filename = output_filename;
    }

    public void write_data(String string) {
        try {
            FileOutputStream output = new FileOutputStream(filename);
            byte[] strToBytes = string.getBytes();
            output.write(strToBytes);
            output.close();
        } catch (Exception e) {
            System.err.println("error ocurred" + e.getMessage());
        }
    }
}
