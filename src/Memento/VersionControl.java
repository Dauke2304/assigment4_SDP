package Memento;

import java.util.ArrayList;
import java.util.List;

public class VersionControl {
    private final List<DocumentVersion> versionHistory = new ArrayList<>();

    // Save a new version
    public void saveVersion(DocumentVersion version) {
        versionHistory.add(version);
    }

    // Get a version by index
    public DocumentVersion getVersion(int index) {
        if (index >= 0 && index < versionHistory.size()) {
            return versionHistory.get(index);
        }
        return null;
    }

    // List all saved versions
    public void listVersions() {
        for (int i = 0; i < versionHistory.size(); i++) {
            System.out.println("Version " + (i + 1) + ": " + versionHistory.get(i).getContent());
        }
    }
}

