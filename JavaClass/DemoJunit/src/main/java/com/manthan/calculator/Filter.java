package com.manthan.calculator;

import java.util.ArrayList;
import java.util.List;

public class Filter {

	private DBUtilImp dbutil;
	
	
	
	public Filter(DBUtilImp dbutil) {
		this.dbutil = dbutil;
	}



	public List<String> myfilter(){
	
		List<String> newList=new ArrayList<String>();
		List<String>  oldList=dbutil.getname();
		for(String s: oldList) {
			if(s.startsWith("A")) {
				newList.add(s);
			}
		}
		return newList;
		
	}
	
}
