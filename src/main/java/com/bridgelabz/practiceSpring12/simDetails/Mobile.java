package com.bridgelabz.practiceSpring12.simDetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.core.io.Resource;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanswe.xml");
		System.out.println("Loading....");
		
		//Method 1
//		Airtel air = (Airtel) context.getBean("airtel");
//		air.brand();
//		air.id();
		
		//Method 2
		Vodafone voda = context.getBean("vodafone", Vodafone.class);
		voda.brand();
		voda.id();
		
		//Using BeanFactory
//		Resource resource = new FileSystemResource("beanswe.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		Vodafone voda1 = (Vodafone) factory.getBean("vodafone");
//		voda1.brand();
//		voda1.id();
	}

}
