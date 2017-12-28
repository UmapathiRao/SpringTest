package com.test.SpringTest;

import javax.inject.Named;

import org.springframework.stereotype.Component;

import com.test.anno.FilterAnnotations;

@Named
public class Meat {

	String meantName="GOAT";

	public String getMeantName() {
		return meantName;
	}

	public void setMeantName(String meantName) {
		this.meantName = meantName;
	}
	
	
	
}
