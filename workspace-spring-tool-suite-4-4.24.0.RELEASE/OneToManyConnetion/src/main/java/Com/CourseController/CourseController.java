package Com.CourseController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Com.ServiceMethod.CourseService;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Com.onetomanytableconnetion.Course createCourse(@RequestBody Com.onetomanytableconnetion.Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping("/{id}")
    public Com.onetomanytableconnetion.Course getCourse(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }
}
