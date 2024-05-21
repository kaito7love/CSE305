package document;


// Document.java (Abstract Class)
public abstract class Document {
    protected String name;
    protected String content;
    protected String fileType;
    protected boolean isEncrypted;

    public abstract void save();

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public String getFileType() {
        return fileType;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }
}

// NormalDocument.java (Concrete Class)

// ConfidentialDocument.java (Concrete Class)
