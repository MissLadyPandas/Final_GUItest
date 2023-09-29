public class DiaryApp {
    public static void main(String[] args) {
        // Initializing User functionalities
        User user1 = new User(1, "johnDoe", "hashedpassword123", "john@example.com", "2023-09-22");
        
        System.out.println("=== USER FUNCTIONS ===");
        user1.login();  // Testing login method
        user1.register();  // Testing register method
        user1.updateProfile("katharineUpdated", "katharineUpdated@example.com");  // Testing update profile method
        
        System.out.println("Updated Username: " + user1.getUsername());
        System.out.println("Updated Email: " + user1.getEmail());

        // Testing File Handling functionalities
        System.out.println("\n=== FILE HANDLING ===");
        TextFileHandler textFileHandler = new TextFileHandler("testFile.txt", ",");
        textFileHandler.readFile(); // Reading from file
        textFileHandler.writeFile(); // Writing to file

        // Testing Diary Entry functionalities
        System.out.println("\n=== DIARY ENTRY ===");
        DiaryEntry diaryEntry = new DiaryEntry(1, user1.getUserID(), "Sample Title", "Sample Content", "2023-09-22", "2023-09-22", "tag1, tag2");
        diaryEntry.createEntry();  // Creating a new diary entry
        diaryEntry.editEntry();  // Editing the diary entry
        diaryEntry.deleteEntry();  // Deleting the diary entry
        diaryEntry.searchEntries();  // Searching for a diary entry
        
        System.out.println("Entry Title: " + diaryEntry.getTitle());
        System.out.println("Entry Content: " + diaryEntry.getContent());
        System.out.println("Entry Tags: " + diaryEntry.getTags());
    }
}
