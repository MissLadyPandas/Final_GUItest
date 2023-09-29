// Importing the Date class from the java.util package. It's used to get the current date and time.
import java.util.Date;

// Definition of the public class named DiaryEntry.
public class DiaryEntry {
    
    // Declaring private variables to store information about a diary entry.
    private int entryID; // Unique identifier for each diary entry
    private int userID; // Identifier for the user who created the diary entry
    private String title; // Title of the diary entry
    private String content; // Content of the diary entry
    private String dateCreated; // The date the diary entry was created
    private String lastModified; // The date the diary entry was last modified
    private String tags; // Tags associated with the diary entry
    
    // Constructor method for the DiaryEntry class. It's called when an object of this class is created.
    // It initializes the class variables with the values passed as parameters.
    public DiaryEntry(int entryID, int userID, String title, String content, String dateCreated, String lastModified, String tags) {
        this.entryID = entryID;
        this.userID = userID;
        this.title = title;
        this.content = content;
        this.dateCreated = dateCreated;
        this.lastModified = lastModified;
        this.tags = tags;
    }

    // Getter methods to retrieve the values of the private member variables.
    public int getEntryID() { return entryID; } // Returns the entryID
    public int getUserID() { return userID; } // Returns the userID
    public String getTitle() { return title; } // Returns the title
    public String getContent() { return content; } // Returns the content
    public String getDateCreated() { return dateCreated; } // Returns the dateCreated
    public String getLastModified() { return lastModified; } // Returns the lastModified
    public String getTags() { return tags; } // Returns the tags

    // Setter methods to change the values of title, content, and tags, and update the last modified date.
    public void setTitle(String title) { 
        this.title = title; // Updating the title
        this.lastModified = new Date().toString(); // Updating the lastModified date to the current date and time.
    }
    public void setContent(String content) { 
        this.content = content; // Updating the content
        this.lastModified = new Date().toString(); // Updating the lastModified date to the current date and time.
    }
    public void setTags(String tags) { 
        this.tags = tags; // Updating the tags
        this.lastModified = new Date().toString(); // Updating the lastModified date to the current date and time.
    }

    // Method to create a new diary entry. Currently, it only prints a message to the console.
    public void createEntry() {
        System.out.println("Creating a new diary entry");
    }

    // Method to edit an existing diary entry. Currently, it only prints a message to the console.
    public void editEntry() {
        System.out.println("Editing an existing diary entry");
    }

    // Method to delete a diary entry. Currently, it only prints a message to the console.
    public void deleteEntry() {
        System.out.println("Deleting a diary entry");
    }

    // Method to search diary entries. Currently, it only prints a message to the console.
    public void searchEntries() {
        System.out.println("Searching diary entries");
    }
}

