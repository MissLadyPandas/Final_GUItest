// Importing necessary classes for file reading and writing.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Definition of the public class named TextFileHandler, which extends FileHandler.
public class TextFileHandler extends FileHandler {

    // Constructor with filePath and delimiter parameters.
    public TextFileHandler(String filePath, String delimiter) {
        // Calling the constructor of the superclass (FileHandler) to initialize filePath and delimiter.
        super(filePath, delimiter);
    }

    // Overriding the readFile method from the FileHandler class.
    @Override
    public void readFile() {
        // Printing to the console to indicate that the readFile method in TextFileHandler is called.
        System.out.println("ReadFile method in TextFileHandler called");
        
        // Using try-with-resources to create a BufferedReader object for reading from a file. 
        // This will auto-close the BufferedReader when done.
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Reading each line from the file until there are no more lines left to read.
            while ((line = br.readLine()) != null) {
                // Printing each line read from the file to the console.
                System.out.println(line);
            }
        } catch (IOException e) {
            // Printing the stack trace for any IOException that occurs during file reading.
            e.printStackTrace();
        }
    }

    // Overriding the writeFile method from the FileHandler class.
    @Override
    public void writeFile() {
        // Printing to the console to indicate that the writeFile method in TextFileHandler is called.
        System.out.println("WriteFile method in TextFileHandler called");
        
        // Using try-with-resources to create a BufferedWriter object for writing to a file. 
        // The true parameter allows data to be appended to the file. This will auto-close the BufferedWriter when done.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            // Writing sample data to the file.
            bw.write("Sample Data" + delimiter + "More Sample Data");
            // Adding a new line after writing the data.
            bw.newLine();
        } catch (IOException e) {
            // Printing the stack trace for any IOException that occurs during file writing.
            e.printStackTrace();
        }
    }
}
