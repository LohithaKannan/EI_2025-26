package VirtualClassroomManager;

import VirtualClassroomManager.commands.CommandParser;
import VirtualClassroomManager.service.ClassroomService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassroomService service = new ClassroomService();
        CommandParser parser = new CommandParser(service);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Virtual Classroom Manager (type 'help' for commands)");

        while (true) {
            System.out.print("> ");
            String line = br.readLine();
            if (line == null || line.trim().equalsIgnoreCase("exit")) break;
            parser.parse(line);
        }

        System.out.println("Goodbye!");
    }
}

