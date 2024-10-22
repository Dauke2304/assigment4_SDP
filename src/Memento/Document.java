package Memento;

public class Document {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Create a memento to store the current state of the document
    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    // Restore the document to the state saved in the memento
    public void restore(DocumentVersion version) {
        this.content = version.getContent();
    }
}

