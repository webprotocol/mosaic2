package com.example.city;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.city.service.CityRegisterService;
import com.example.city.service.CitySearchService;
import com.example.form.CityForm;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/city")
public class CityRegisterController {

	static Log log = LogFactory.getLog(CityRegisterController.class);
	
	@Autowired
	CitySearchService citySearchService;

	@Autowired
	CityRegisterService cityRegisterService;

	@GetMapping("/register")
	public String registerForm(CityForm cityForm) {
		log.info("registerForm()");
		
		return "city/registerForm";
	}
	
	@PostMapping("/register")
	public String register(@Valid CityForm cityForm, BindingResult errors) {
		log.info("register(" + cityForm + ")");
		System.out.println(cityForm);
		
		if (errors.hasErrors()) {
			System.out.println(errors);
			return "city/registerForm";
		}
		
		
		return "redirect:/city/registerSuccess";
	}
	
	@GetMapping("/registerSuccess")
	public String registerSucess() {
		
		return "city/registerSuccess";
	}

	
	
}




