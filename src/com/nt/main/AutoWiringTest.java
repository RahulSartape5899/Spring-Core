package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class AutoWiringTest {

	public static void main(String[] args) {
		System.out.println("AutoWiringTest.main()--> start");
		
		//create IOC container
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AutoWiringTest:: IOC container creation completed");
		
		//get target spring bean class ref
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println("Target spring bean class obj ref is gathered");
		
		//invoke the b.method
		String msg =generator.generateMessage("Rahul");
		System.out.println(msg);
	}
}
