package com.project.user.service;

import java.net.http.HttpRequest;
import java.util.List;

import net.minidev.json.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/sortings")
public class SortService {
	
	@Autowired
	SortServiceImpl sortServiceImpl ;
	
	@PostMapping(path="/qucikSort", produces = "application/json")
	public ResponseEntity<List<Integer>> quickSort(@RequestBody JSONObject list){
		
		return new ResponseEntity<List<Integer>>(sortServiceImpl.quickSort(list), HttpStatus.OK);
	}

}
