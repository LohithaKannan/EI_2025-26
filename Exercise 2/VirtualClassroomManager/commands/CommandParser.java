package VirtualClassroomManager.commands;

import VirtualClassroomManager.service.ClassroomService;

public class CommandParser {
    private final ClassroomService service;

    public CommandParser(ClassroomService service) { this.service = service; }

    public void parse(String line) {
        String[] parts = line.trim().split(" ");
        if (parts.length == 0) return;
        String cmd = parts[0];

        switch (cmd) {
            case "add_classroom" -> { if (parts.length >= 2) service.addClassroom(parts[1]); }
            case "add_student" -> { if (parts.length >= 3) service.addStudent(parts[1], parts[2]); }
            case "schedule_assignment" -> { if (parts.length >= 3) service.scheduleAssignment(parts[1], parts[2]); }
            case "submit_assignment" -> { if (parts.length >= 4) service.submitAssignment(parts[1], parts[2], parts[3]); }
            case "list_classrooms" -> service.listClassrooms();
            case "list_students" -> { if (parts.length >= 2) service.listStudents(parts[1]); }
            case "list_assignments" -> { if (parts.length >= 2) service.listAssignments(parts[1]); }
            case "help" -> System.out.println(
                    "Commands: add_classroom <name>, add_student <id> <class>, " +
                    "schedule_assignment <class> <title>, submit_assignment <id> <class> <title>, " +
                    "list_classrooms, list_students <class>, list_assignments <class>, exit");
            default -> System.out.println("Unknown command. Type 'help'.");
        }
    }
}

