package com.bridgelabz.practiceSpring12.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentExecution {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("studentDeets.xml");
		StudentDetails std = (StudentDetails)context.getBean("stu");
		
		//Alternate method
//		Resource resource = new ClassPathResource("studentDeets.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		StudentDetails std = factory.getBean("stu", StudentDetails.class);
		std.displayInfo();
	}

}
