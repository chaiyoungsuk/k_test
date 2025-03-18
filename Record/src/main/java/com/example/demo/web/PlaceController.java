package com.example.demo.web;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PlaceService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequestMapping("place")
@RestController
@RequiredArgsConstructor
@Slf4j
public class PlaceController {

	private final PlaceService placeService;
	
	@PostMapping
	public void create(@RequestBody Map<String , Object> place) throws Exception {
		
		log.info("Place PostMapping param: {}", place);
		
		placeService.createPlace(place);
	}
	
	@GetMapping
	public List<Map<String , Object>> read(@RequestParam Map<String , Object> place) throws Exception {
		
		log.info("Place PostMapping param: {}", place);
		
		return placeService.readAll(place);
	}
}
