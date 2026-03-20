package com.logic.comp;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/logic/comp/config.xml");
    	
//    	694452085 = Singleton 
    	Student s1 = (Student)  context.getBean("ob");
    	System.out.println(s1.hashCode());
    	
    	Student s2 = (Student)  context.getBean("ob");
    	System.out.println(s2.hashCode());
    	
    	
    }
}
