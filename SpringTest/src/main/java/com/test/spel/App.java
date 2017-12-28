package com.test.spel;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Resource rs = new FileSystemResource("appContext.xml");
    //BeanFactory b = new XmlBeanFactory(rs);
		ApplicationContext ac = new ClassPathXmlApplicationContext("appContext.xml");
    Fruits f= (Fruits)ac.getBean("fruits", Fruits.class);
    System.out.println(f.getDetails());
   
    
		
	}

}
