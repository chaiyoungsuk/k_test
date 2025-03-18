package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlaceMapper {
	
	public Map<String , Object> readOne() throws Exception;
	public List<Map<String , Object>> readAll(Map<String , Object> place) throws Exception;
	
	public int create(Map<String , Object> place) throws Exception;
	public int update(Map<String , Object> place) throws Exception;
	public int delete(Map<String , Object> place) throws Exception;

}
