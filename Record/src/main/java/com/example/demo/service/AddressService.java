package com.example.demo.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.AddressMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class AddressService {

//	@Autowired
	private final AddressMapper mapper;
	
	
	public List<Map<String , Object>> list() { 
		return mapper.addressList();
	}
	
	public int create(Map<String , Object> map) {
		
		log.info("AddressMapper create " + map.toString());
		return mapper.createAddress(map);
	}
}
