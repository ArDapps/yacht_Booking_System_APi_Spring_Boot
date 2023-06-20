package com.mrbebo.yachtbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YachtBookingApplication {

	public static void main(String[] args)
	{

		SpringApplication.run(YachtBookingApplication.class, args);
		System.out.println("welcome Yacht app /n ==> To Test Api With Swager http://localhost:8080/swagger-ui/index.html");
	}

}
