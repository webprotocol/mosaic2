package com.example.form;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CityFormTests {
	
	@Autowired
	Validator validator;
	
	@Test
	public void test00_confirmValidator() {
		System.out.println("validator=" + validator);
	}
	
	@Test
	public void test01_getName() {
		CityForm cityForm = new CityForm();
//		cityForm.setName("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		BindingResult errors = new BeanPropertyBindingResult(cityForm, "cityForm");
		
		validator.validate(cityForm, errors);
		
		if (errors.hasErrors()) {
			System.out.println("errors=" + errors);
			return;
		}
		System.out.println("cityForm는 유효합니다");
	}
	
	@Test
	public void test02_getCountryCode() {
		CityForm cityForm = new CityForm();
		cityForm.setName("java");
		cityForm.setCountryCode("KOREA");
		cityForm.setDistrict("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		BindingResult errors = new BeanPropertyBindingResult(cityForm, "cityForm");
		
		validator.validate(cityForm, errors);
		
		if (errors.hasErrors()) {
			System.out.println("errors=" + errors);
			return;
		}
		
		System.out.println("cityForm는 유효합니다");
		
	}

}










