package Com.onetomanytableconnetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faculties")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @PostMapping
    public Faculty createFaculty(@RequestParam Long facultyId,
                                 @RequestParam String name,
                                 @RequestParam Long courseId) {
        return facultyService.createFaculty(facultyId, name, courseId);
    }
}
