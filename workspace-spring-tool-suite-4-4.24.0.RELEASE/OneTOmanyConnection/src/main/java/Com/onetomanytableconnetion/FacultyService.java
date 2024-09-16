package Com.onetomanytableconnetion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    @Autowired
    private CourseRepository courseRepository;

    public Faculty createFaculty(Long facultyId, String name, Long courseId) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        Faculty faculty = new Faculty(facultyId, name);
        faculty.setCourse(course);
        return facultyRepository.save(faculty);
    }
}
