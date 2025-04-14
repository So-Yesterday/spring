package org.springframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.yf.User2;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello world!");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		User user = (User) context.getBean("user");
		User2 user2 = (User2) context.getBean("user2");
		user2.getUser();


		System.out.println(user);
	}
}