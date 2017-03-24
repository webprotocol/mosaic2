package com.example.city;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.city.service.CityModifyService;
import com.example.city.service.CityRegisterService;
import com.example.city.service.CitySearchService;
import com.example.city.service.CityUnregisterService;
import com.example.domain.City;
import com.example.form.CityForm;

import oracle.jdbc.proxy.annotation.Post;

@Controller
@RequestMapping("/city")
public class CityUnregisterController {

	static Log log = LogFactory.getLog(CityUnregisterController.class);
	
	@Autowired
	CitySearchService citySearchService;

	@Autowired
	CityUnregisterService cityUnregisterService;

	@GetMapping("/unregister/{id}")
	public String unregisterForm(@PathVariable int id, Model model) {
		log.info("unregisterForm(" + id + ")");
		City city = citySearchService.getCityById(id);
		model.addAttribute("city", city);
		
		return "city/unregisterForm";
	}
	
	@PostMapping("/unregister/{id}")
	public String modify(@PathVariable int id, Integer pageNo) {
		log.info("modify(" + id + ")");

		cityUnregisterService.unregister(id);
		
		return "redirect:/city/unregisterSuccess/" + id + "?pageNo=" + pageNo;
	}
	
	@GetMapping("/unregisterSuccess/{id}")
	public String modifySucess(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		return "city/unregisterSuccess";
	}

	
	
}




