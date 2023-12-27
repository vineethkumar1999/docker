// src/Main.java

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "data.txt";

        // Write data to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, Docker!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            System.out.println("Data from file: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
