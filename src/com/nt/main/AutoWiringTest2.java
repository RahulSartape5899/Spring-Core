package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig2;
import com.nt.sbeans.SeasonDetector;

public class AutoWiringTest2 {

	public static void main(String[] args) {
		System.out.println("AutoWiringTest2.main()-->Start");

		//ioc container creation
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig2.class);
		System.out.println("AutoWiringTest:: IOC container creation completed");
		
		//get target spring bean class ref
		SeasonDetector detector = ctx.getBean("SeasonDetector",SeasonDetector.class);	
		
		//b.method invoke
		String msg=detector.messageGenerator("Rahul");
		System.out.println(msg);
	}
}
