package VirtualClassroomManager.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Classroom {
    private final String name;
    private final List<String> students = new ArrayList<>();
    private final List<Assignment> assignments = new ArrayList<>();

    public Classroom(String name) { this.name = name; }

    public String getName() { return name; }

    public List<String> getStudents() { return students; }

    public List<Assignment> getAssignments() { return assignments; }

    public void addStudent(String studentId) {
        if (!students.contains(studentId)) students.add(studentId);
    }

    public void addAssignment(Assignment a) { assignments.add(a); }

    public Optional<Assignment> findAssignment(String title) {
        return assignments.stream().filter(a -> a.getTitle().equals(title)).findFirst();
    }
    
}
