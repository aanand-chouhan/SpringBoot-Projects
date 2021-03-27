package com.nisum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringUserRoleSecurityApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringUserRoleSecurityApplication.class, args);
		List<String> namesList = new ArrayList<>(Arrays.asList("om","om","abc"));
		namesList.stream().collect(Collectors.toSet()).forEach(System.out::println);
		//namesList.stream().distinct().forEach(System.out::println);
	}
//	
//	@Bean
//	public PasswordEncoder encoder() {
//	    return new BCryptPasswordEncoder();
//	}

}
