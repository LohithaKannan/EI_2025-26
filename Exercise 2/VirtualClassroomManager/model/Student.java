package VirtualClassroomManager.model;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private final String id;
    private final Set<String> enrolledClasses = new HashSet<>();

    public Student(String id) { this.id = id; }

    public String getId() { return id; }

    public void enroll(String className) { enrolledClasses.add(className); }

    public Set<String> getEnrolledClasses() { return enrolledClasses; }
}
