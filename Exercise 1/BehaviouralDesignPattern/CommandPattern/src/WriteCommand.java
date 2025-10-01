package src;

public class WriteCommand implements Command {
    private String text;
    private TextEditor textEditor;

    public WriteCommand(TextEditor textEditor, String text) {
        this.textEditor = textEditor;
        this.text = text;
    }

    @Override
    public void execute() {
        textEditor.write(text);
    }

    @Override
    public void undo() {
        textEditor.undoWrite(text.length());
    }
}

