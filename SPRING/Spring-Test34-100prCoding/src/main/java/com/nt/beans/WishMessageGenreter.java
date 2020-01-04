package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessageGenreter {

	@Autowired
	private Calendar calendar;
	
	
	public WishMessageGenreter() {
   System.out.println("WishMessageGenreter::Constructor");
    }

	public String genrete(String user) {
		// get hour
	int	hour = calendar.get(Calendar.HOUR_OF_DAY);
		// wish masSAGE
		if (hour < 12)
			return "GOOD-MORNIG::"+user;
		else if (hour < 16)
			return "GOOD Evenig::"+user;
		else if (hour < 20)
			return "GOOD AFTERNON::"+user;
		else
			return "GOOD NIGHT::"+user;
	}

}
