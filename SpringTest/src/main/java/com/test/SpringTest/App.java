package com.test.SpringTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ac = new ClassPathXmlApplicationContext("appContext.xml");
        Fruit f = (Fruit)ac.getBean("fruit");
        
        System.out.println(f.disp());
        /*Meat m = (Meat)ac.getBean("meat");
        System.out.println(m.getMeantName());*/
        
        //System.out.println(" another meal is ");
    /*    Meal m1 = (Meal) ac.getBean("meal");
        System.out.println(m1.dispMeal());*/
        
       // ((ClassPathXmlApplicationContext)ac).close();
    }
}
