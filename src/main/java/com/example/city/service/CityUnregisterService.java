package com.example.city.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.example.domain.City;
import com.example.domain.Country;
import com.example.mapper.CityMapper;
import com.example.mapper.CountryMapper;

@Service
public class CityUnregisterService {
	
	@Autowired
	CityMapper cityMapper;
	
	public void unregister(int id) {

		cityMapper.deleteById(id);
		
	}

}
