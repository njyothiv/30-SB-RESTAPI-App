package in.ashokit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return "Welcome to REST API Development";
	}
	
	@GetMapping("wish")
	public ResponseEntity<String> getWishMsg() {
		String body = "Good Morning .. !!";
		return new ResponseEntity<>(body, HttpStatus.OK);
	}

}
