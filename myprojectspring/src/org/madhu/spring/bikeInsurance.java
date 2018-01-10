package org.madhu.spring;

public class bikeInsurance implements Insurance {

	@Override
	public String showStatus() {
		
		return "your bike insurance is on hold";
	}

}
