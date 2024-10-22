import Memento.*;
public class Main {
    public static void main(String[] args) {
        // Create a document and version control system
        Document document = new Document();
        VersionControl versionControl = new VersionControl();

        // Edit the document and save versions
        document.setContent("Version 1: Initial content");
        versionControl.saveVersion(document.save());  // Save version 1

        document.setContent("Version 2: Added introduction");
        versionControl.saveVersion(document.save());  // Save version 2

        document.setContent("Version 3: Added conclusion");
        versionControl.saveVersion(document.save());  // Save version 3

        // List all saved versions
        System.out.println("Saved Versions:");
        versionControl.listVersions();

        // Restore a specific version
        System.out.println("\nRestoring to Version 1:");
        document.restore(versionControl.getVersion(0));
        System.out.println("Current Content: " + document.getContent());

        // Restore another version
        System.out.println("\nRestoring to Version 3:");
        document.restore(versionControl.getVersion(2));
        System.out.println("Current Content: " + document.getContent());
    }
}
