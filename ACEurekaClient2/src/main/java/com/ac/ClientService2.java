package com.ac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/client2")
public class ClientService2 {
	
	@GetMapping("/m2")
	public String m2() {
		return "from m2 client two";
	}
}
