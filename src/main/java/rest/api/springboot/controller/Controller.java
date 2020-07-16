package rest.api.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@RequestMapping("/api/v1/")
	public String Sample(){
		return "Hello World";
	}
}