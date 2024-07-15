package com.project.user.model;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
public class Response {

	
	private int statusCode ;
	
	private String response;
	
	private List<Integer> list;
}
