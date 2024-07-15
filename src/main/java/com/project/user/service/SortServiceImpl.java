package com.project.user.service;

import java.util.ArrayList;
import java.util.List;

import net.minidev.json.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class SortServiceImpl {
	
	
	public List<Integer> quickSort(JSONObject request ){
		List<Integer> integerList = (List<Integer>)request.get("list");
		quickSortHelper(integerList, 0, integerList.size()-1);
		return integerList;
	}
	
	public static void quickSortHelper(List<Integer> list, int low , int high) {
		if(low < high) {
			
			int pi = quickSortPartitionHelper(list,low,high);
			quickSortHelper(list, low, pi-1);
			quickSortHelper(list, pi+1, high);
		}
	}
	
	public static int quickSortPartitionHelper(List<Integer> list ,int low, int high) {
		
		
		//choose pivot as last element
		int pivot = list.get(high);
		
		int i = low - 1;
		
		for(int j=low;j<=high-1;j++) {
			if(list.get(j)<pivot) {
				i++;
				int temp = list.get(j);
				list.set(j,list.get(i));
				list.set(i,temp);
			}
		}
		int x = list.get(high);
		list.set(high,list.get(i+1));
		list.set(i+1,x);
		return i+1;
	}
	
	static void swap(List<Integer> list, int x , int y) {
		
		int temp = list.get(x);
		list.set(x, list.get(y));
		list.set(y, temp);
		return ;
	}

}
