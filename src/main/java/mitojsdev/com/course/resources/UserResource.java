package mitojsdev.com.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mitojsdev.com.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource  {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1,"maria","maria@gmail", "123444", "1234");
		
		return ResponseEntity.ok().body(u);
	}
}
