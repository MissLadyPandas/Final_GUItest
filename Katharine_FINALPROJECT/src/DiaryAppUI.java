import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiaryAppUI {
    private JFrame frame;
    private JPanel panel;
    private JButton btnLogin, btnRegister, btnUpdateProfile, btnReadFile, btnWriteFile, btnCreateEntry, btnEditEntry, btnDeleteEntry, btnSearchEntries;
    private JTextArea txtOutput;

    public DiaryAppUI() {
        // Initialize frame, panel and text area
        frame = new JFrame("DiaryApp UI");
        panel = new JPanel();
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtOutput);

        // Initialize user and functionalities
        User user1 = new User(1, "johnDoe", "hashedpassword123", "john@example.com", "2023-09-22");
        TextFileHandler textFileHandler = new TextFileHandler("testFile.txt", ",");
        DiaryEntry diaryEntry = new DiaryEntry(1, user1.getUserID(), "Sample Title", "Sample Content", "2023-09-22", "2023-09-22", "tag1, tag2");

        // Initialize buttons with action listeners
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user1.login();
                txtOutput.append("=== USER FUNCTIONS ===\nLogin method called\n");
            }
        });

        btnRegister = new JButton("Register");
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user1.register();
                txtOutput.append("Register method called\n");
            }
        });

        btnUpdateProfile = new JButton("Update Profile");
        btnUpdateProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user1.updateProfile("katharineUpdated", "katharineUpdated@example.com");
                txtOutput.append("Updated Username: " + user1.getUsername() + "\nUpdated Email: " + user1.getEmail() + "\n");
            }
        });

        btnReadFile = new JButton("Read File");
        btnReadFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFileHandler.readFile();
                txtOutput.append("Read File method called\n");
            }
        });

        btnWriteFile = new JButton("Write File");
        btnWriteFile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFileHandler.writeFile();
                txtOutput.append("Write File method called\n");
            }
        });

        btnCreateEntry = new JButton("Create Entry");
        btnCreateEntry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diaryEntry.createEntry();
                txtOutput.append("Create Entry method called\n");
            }
        });

        btnEditEntry = new JButton("Edit Entry");
        btnEditEntry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diaryEntry.editEntry();
                txtOutput.append("Edit Entry method called\n");
            }
        });

        btnDeleteEntry = new JButton("Delete Entry");
        btnDeleteEntry.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diaryEntry.deleteEntry();
                txtOutput.append("Delete Entry method called\n");
            }
        });

        btnSearchEntries = new JButton("Search Entries");
        btnSearchEntries.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diaryEntry.searchEntries();
                txtOutput.append("Search Entries method called\n");
            }
        });

        // Set layout and add components to panel
        panel.setLayout(new GridLayout(10, 1));
        panel.add(btnLogin);
        panel.add(btnRegister);
        panel.add(btnUpdateProfile);
        panel.add(btnReadFile);
        panel.add(btnWriteFile);
        panel.add(btnCreateEntry);
        panel.add(btnEditEntry);
        panel.add(btnDeleteEntry);
        panel.add(btnSearchEntries);

        // Add panel and text area to frame
        frame.add(panel, BorderLayout.WEST);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DiaryAppUI();
            }
        });
    }
}
