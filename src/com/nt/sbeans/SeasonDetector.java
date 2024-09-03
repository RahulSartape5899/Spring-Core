package com.nt.sbeans;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("sd")
@Component
public class SeasonDetector {

	@Autowired //Field injection
	private LocalDate ld; //HAS-property (Composition)
	
	public SeasonDetector() {
		System.out.println("SeasonDetector: no-param");
	}
	//b.logic
	public String messageGenerator(String user) {
		//get current hour
		int month =ld.getMonthValue();
		
		if(month>1 && month <6) {
			return "Hey! "+user+" this is Summer";
		}else if (month>5 && month<10) {
			return "Hey! "+user+" this is Rainy Season";
		}else {
			return "Hey! "+user+" this is Winter";
		}
	}
}
