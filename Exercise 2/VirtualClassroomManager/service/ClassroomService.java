package VirtualClassroomManager.service;

import VirtualClassroomManager.model.Assignment;
import VirtualClassroomManager.model.Classroom;
import VirtualClassroomManager.model.Student;

import java.util.*;

public class ClassroomService {
    private final Map<String, Classroom> classrooms = new HashMap<>();
    private final Map<String, Student> students = new HashMap<>();

    public void addClassroom(String name) {
        if (classrooms.containsKey(name)) {
            System.out.println("Classroom already exists.");
            return;
        }
        classrooms.put(name, new Classroom(name));
        System.out.println("Classroom " + name + " has been created.");
    }

    public void addStudent(String studentId, String className) {
        Classroom c = classrooms.get(className);
        if (c == null) {
            System.out.println("Classroom not found.");
            return;
        }
        Student s = students.computeIfAbsent(studentId, Student::new);
        s.enroll(className);
        c.addStudent(studentId);
        System.out.println("Student " + studentId + " has been enrolled in " + className + ".");
    }

    public void scheduleAssignment(String className, String title) {
        Classroom c = classrooms.get(className);
        if (c == null) {
            System.out.println("Classroom not found.");
            return;
        }
        c.addAssignment(new Assignment(title));
        System.out.println("Assignment for " + className + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String className, String title) {
        Classroom c = classrooms.get(className);
        if (c == null) {
            System.out.println("Classroom not found.");
            return;
        }
        Student s = students.get(studentId);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        Optional<Assignment> assignment = c.findAssignment(title);
        if (assignment.isEmpty()) {
            System.out.println("Assignment not found.");
            return;
        }
        assignment.get().submit(studentId);
        System.out.println("Assignment submitted by Student " + studentId + " in " + className + ".");
    }

    public void listClassrooms() { classrooms.keySet().forEach(System.out::println); }

    public void listStudents(String className) {
        Classroom c = classrooms.get(className);
        if (c == null) {
            System.out.println("Classroom not found.");
            return;
        }
        c.getStudents().forEach(System.out::println);
    }

    public void listAssignments(String className) {
    Classroom c = classrooms.get(className);
    if (c == null) {
        System.out.println("Classroom not found.");
        return;
    }
    c.getAssignments().forEach(a -> {
        System.out.println(a.getTitle() + " (Scheduled at: " + a.getScheduledAt() + ")");
    });
}

}
