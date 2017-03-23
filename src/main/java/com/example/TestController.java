package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.domain.Emp;

@Controller
public class TestController {
	
	@GetMapping("/test")
	public void test(Emp emp) {
		System.out.println("hiredate=" + emp.getHiredate());
	}

}
