package com.markmuwonge.Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		Student student1 = context.getBean("student1", Student.class);
		
		student1.displayStudentInfo();
		
		
	}

}
