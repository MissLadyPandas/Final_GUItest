// Definition of a public class named User.
public class User {
    // Declaration of private instance variables for user ID, username, hashed password, email, and date created.
    private int userID;
    private String username;
    private String hashedPassword;
    private String email;
    private String dateCreated;

    // Constructor to initialize instance variables when an object of this class is created.
    public User(int userID, String username, String hashedPassword, String email, String dateCreated) {
        // Initializing instance variables with the values provided when creating an object of User.
        this.userID = userID;
        this.username = username;
        this.hashedPassword = hashedPassword;
        this.email = email;
        this.dateCreated = dateCreated;
    }

    // Getters and Setters for accessing and modifying the private instance variables.
    public int getUserID() {
        // Returning the user ID.
        return userID;
    }

    public void setUserID(int userID) {
        // Setting the user ID.
        this.userID = userID;
    }

    public String getUsername() {
        // Returning the username.
        return username;
    }

    public void setUsername(String username) {
        // Setting the username.
        this.username = username;
    }

    public String getHashedPassword() {
        // Returning the hashed password.
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        // Setting the hashed password.
        this.hashedPassword = hashedPassword;
    }

    public String getEmail() {
        // Returning the email.
        return email;
    }

    public void setEmail(String email) {
        // Setting the email.
        this.email = email;
    }

    public String getDateCreated() {
        // Returning the date created.
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        // Setting the date created.
        this.dateCreated = dateCreated;
    }

    // Method for login, currently only printing a message to the console.
    public void login() {
        // Indicating that the login method is called.
        System.out.println("Login method called");
    }

    // Method for register, currently only printing a message to the console.
    public void register() {
        // Indicating that the register method is called.
        System.out.println("Register method called");
    }

    // Method to update the user's profile, modifying username and email, and printing a message to the console.
    public void updateProfile(String newUsername, String newEmail) {
        // Updating the username and email with new values.
        this.username = newUsername;
        this.email = newEmail;
        // Indicating that the profile is updated.
        System.out.println("Profile updated!");
    }
}

