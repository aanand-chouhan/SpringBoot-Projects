package com.ac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/client1")
public class ClientService1 {
	
	@GetMapping("/m1")
	public String m1() {
		return "from m1 client one";
	}
}
