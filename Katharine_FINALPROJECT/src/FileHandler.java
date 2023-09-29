// Definition of the public abstract class named FileHandler.
// Abstract class means that this class can't be instantiated on its own and is intended to be subclassed.
public abstract class FileHandler {
    
    // Declaring protected variables, so they can be accessed within the same package or by subclasses.
    protected String filePath; // Path of the file to read from or write to
    protected String delimiter; // Delimiter used for separating data elements in the file

    // Constructor method for the FileHandler class. 
    // It's called when an object of a subclass is created and initializes the filePath and delimiter.
    public FileHandler(String filePath, String delimiter) {
        this.filePath = filePath; // Initializing filePath with the value passed as a parameter
        this.delimiter = delimiter; // Initializing delimiter with the value passed as a parameter
    }

    // Getter and Setter methods to retrieve and change the values of the protected member variables.
    public String getFilePath() { 
        return filePath; // Returns the filePath
    }
    public void setFilePath(String filePath) { 
        this.filePath = filePath; // Updates the filePath with the value passed as a parameter
    }
    public String getDelimiter() { 
        return delimiter; // Returns the delimiter
    }
    public void setDelimiter(String delimiter) { 
        this.delimiter = delimiter; // Updates the delimiter with the value passed as a parameter
    }

    // Abstract methods declaration. The implementation of these methods is provided by the subclasses.
    // Any subclass must provide an implementation for these methods.
    public abstract void readFile(); // To be implemented by subclass to read a file
    public abstract void writeFile(); // To be implemented by subclass to write to a file
}
