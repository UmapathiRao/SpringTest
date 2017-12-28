package com.test.SpringTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.*;
import javax.inject.Named;
 

@Named("meal")
public class Meal {

	
	Fruit fruit;
	
	Meat meat;
	
	String s="";
	
	 
	public Fruit getFruit() {
		return fruit;
	}
	
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public Meat getMeat() {
		return meat;
	}
	
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	
	public String dispMeal()
	{
		if(fruit.getFruitName()!=null)
			s=s+fruit.getFruitName() +" & ";
 
		if(meat.getMeantName() != null)
			s=s+meat.getMeantName();
		
		return "today's Meal contain -  "+s;
	}
	
	@PostConstruct
	public void init()
	{
		 System.out.println("in init method !!");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("in destroy method !!");
	}
	
}
