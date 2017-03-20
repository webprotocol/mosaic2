package com.example.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.domain.City;
import com.example.domain.Country;
import com.example.domain.LongTest;
import com.example.exception.NotFoundRuntimeException;
import com.example.util.Pagination;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LongTestMapperTests {
	
	@Autowired
	LongTestMapper mapper;
	
	@Test
	public void test00_confirmMapper() {
		System.out.println("cityMapper=" + mapper);
	}
	
	@Test
	public void test01_selectAll() {
		List<LongTest> list = mapper.selectAll();
		
		for (LongTest c : list)
			System.out.println(c);
	}
	
}









