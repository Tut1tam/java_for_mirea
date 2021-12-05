public class CreateTextDocument implements ICreateDocument {
    public IDocument CreateNew() {
        TextDocument textDocument = new TextDocument();
        return textDocument;
    }
    public IDocument CreateOpen() {
        TextDocument textDocument = new TextDocument();
        return textDocument;
    }
}