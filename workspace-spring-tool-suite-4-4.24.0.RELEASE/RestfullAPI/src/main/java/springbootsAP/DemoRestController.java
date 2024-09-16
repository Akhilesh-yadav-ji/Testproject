package springbootsAP;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class DemoRestController {
	@GetMapping("/DemoRest")
	public String disp() {
		
		return"this is Rest API demo";
	}
	

}