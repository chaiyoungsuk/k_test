package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.PlaceMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class PlaceService {
	
	private final PlaceMapper mapper;
	
	public int createPlace(Map<String , Object> place) throws Exception { 
		return mapper.create(place);
	}
	
	public List<Map<String , Object>> readAll(Map<String , Object> place) throws Exception { 
		return mapper.readAll(place);
	}

}
