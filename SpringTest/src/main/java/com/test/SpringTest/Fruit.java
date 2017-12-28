package com.test.SpringTest;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.test.anno.CustomAnnotations;

@Named("fruit")
public class Fruit {
	
	String fruitName="test";
	

	public String getFruitName() {
		return fruitName;
	}

	
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	 
	public String disp(){
		return "this is a fruit : " +fruitName;
	}

}
