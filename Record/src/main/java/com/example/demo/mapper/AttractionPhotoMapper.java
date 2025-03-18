package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

public interface AttractionPhotoMapper {

	public List<Map<String , Object>> readAll(Map<String , Object> attractonPhto);
	public Map<String , Object> readAll(String seq);
	public int create(Map<String , Object> attractonPhto);
	public int delete(List<String> seqs);
		
}
