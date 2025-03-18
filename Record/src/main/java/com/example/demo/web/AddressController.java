package com.example.demo.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.AddressService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequestMapping("address")
@RestController
@RequiredArgsConstructor
@Slf4j
public class AddressController {

	private final AddressService addresSservice;

//	@RequestMapping
	@GetMapping
	public List<Map<String , Object>> addressList() { 
		
		log.info("AddressController[List]");
		return addresSservice.list();
	}
}
