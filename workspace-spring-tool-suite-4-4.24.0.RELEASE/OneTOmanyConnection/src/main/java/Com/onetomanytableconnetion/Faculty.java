package Com.onetomanytableconnetion;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Faculty {

    @Id
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Constructors, getters, and setters
    public Faculty() {}

    public Faculty(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }
}

