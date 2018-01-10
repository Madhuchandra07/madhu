package org.madhu.spring;

public class carInsurance implements Insurance {

	@Override
	public String showStatus() {
	
		return "your car is ensured";
	}

}
