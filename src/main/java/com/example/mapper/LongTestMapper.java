package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.domain.City;
import com.example.domain.LongTest;
import com.example.util.Pagination;

@Mapper
public interface LongTestMapper {

//	@Select("select * from longtest")
	List<LongTest> selectAll();
	
}
