package VirtualClassroomManager.model;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Assignment {
    private final String title;
    private final Instant scheduledAt;        
    private final Map<String, Instant> submissions = new HashMap<>();

    public Assignment(String title) {
        this.title = title;
        this.scheduledAt = Instant.now();     
    }

    public String getTitle() { return title; }

    public Instant getScheduledAt() { return scheduledAt; }   

    public void submit(String studentId) { submissions.put(studentId, Instant.now()); }

    public boolean isSubmittedBy(String studentId) { return submissions.containsKey(studentId); }

    public Instant getSubmissionTime(String studentId) { return submissions.get(studentId); }
}

