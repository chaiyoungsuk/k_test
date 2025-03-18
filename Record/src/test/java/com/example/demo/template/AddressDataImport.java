package com.example.demo.template;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.AddressService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
//@RequiredArgsConstructor
class AddressDataImport {

	@Autowired
	private AddressService addressService;



//	@Test
	void testA() { 
		String str = "전북특별자치도 순창군 금과면 내동리";
		String[] strArr = str.split(" ");
		
		log.info("//" + strArr.length);
		str = str.replaceAll("\t", "---");
//		str = str.replaceAll("	", "---");
		log.info(str);
		log.info(""  + strArr[2]);
		
	}
	
	@Test
	void test() {
		
		String line = null;
		String[] lineArr = null;
		String[] addrArr = null;
		
		Map<String , Object> map = null;
		Address address = null;
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\\\Users\\\\cys\\\\Downloads\\\\법정동코드 전체자료\\\\법정동코드 전체자료.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "MS949");
			BufferedReader reader = new BufferedReader(inputStreamReader);

			while( (line = reader.readLine()) != null ) { 
				
				log.info("line:" + line);
				log.info("length : " + line.split("\t").length);
				
				lineArr = line.split("\t");
				map = new HashMap<String , Object>();
				
//				code
//				city
//				gunGu
//				townMyeonDong
//				ri
//				expireFlag
				
//				map.put("code", Double.parseDouble(lineArr[0]));
				map.put("code", new String(lineArr[0]));
				map.put("expireFlag", lineArr[2]);
				
				addrArr = lineArr[1].split(" ");

				address = new Address();
				address.setCity(addrArr[0]);
				
				if(addrArr.length > 1) address.setGunGu(addrArr[1]);
				
				if(addrArr.length > 2) address.setTownMyeonDong(addrArr[2]);
				
				if(addrArr.length > 3) address.setRi(addrArr[3]);
				
				map.put("address", address);
				
				log.info("" + map);
				
				addressService.create(map);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
