package ListDemoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {
@GetMapping("/student")
public String disp() {
	return "this is frist Api creates";
}
@GetMapping("/students")
public studentBean getsingleStudents() {
	
	studentBean Student =new  studentBean();
	Student.setName("Akhilesh")	;
	Student.setBranch("CSE");
	Student.setAddress("Braki Nainijore");
	
	return Student;
	}
	@GetMapping("/allinfo")
	public list<studentBean>

}

