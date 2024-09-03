package com.nt.sbeans;

import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired // field injection
	private LocalTime lt; //HAS-Property(Composition)
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: no-param ");
	}
	
	//b.logic
	public String generateMessage(String user) {
		//get current hour
		int hour = lt.getHour(); //24 hour format
		//generate the wish Message
		if(hour<12) {
			return "Good morning: "+ user;
		}else if(hour<16) {
			return "Good Afternoon: "+ user;
		}else if(hour<20) {
			return "Good Evening: "+user;
		}else {
			return "Good Night: "+user;
		}
	}
}
