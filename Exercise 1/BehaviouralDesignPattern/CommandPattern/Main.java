import java.util.Scanner;
import src.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor textEditor = new TextEditor();
        TextEditorInvoker invoker = new TextEditorInvoker();

        while (true) {
            System.out.println("Enter command (write <text>, undo, or exit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.startsWith("write ")) {
                String textToWrite = input.substring(6);
                Command writeCommand = new WriteCommand(textEditor, textToWrite);
                invoker.executeCommand(writeCommand);
            } else if (input.equalsIgnoreCase("undo")) {
                invoker.undoCommand();
            } else {
                System.out.println("Invalid command. Please try again.");
            }
        }

        scanner.close();
    }
}
