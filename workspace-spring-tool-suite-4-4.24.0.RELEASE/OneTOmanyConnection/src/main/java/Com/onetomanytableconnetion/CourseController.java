package Com.onetomanytableconnetion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course createCourse(@RequestParam Long courseId,
                               @RequestParam String title) {
        return courseService.createCourse(courseId, title);
    }
}
