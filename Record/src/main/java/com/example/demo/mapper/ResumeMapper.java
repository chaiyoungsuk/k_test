package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ResumeMapper {

	public Map<String , Object> readOne() throws Exception;
	public List<Map<String , Object>> readAll() throws Exception;
	
	public int create(Map<String , Object> resume) throws Exception;
	public int update(Map<String , Object> resume) throws Exception; 
}

