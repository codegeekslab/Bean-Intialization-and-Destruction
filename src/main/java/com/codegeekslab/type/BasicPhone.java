package com.codegeekslab.type;

import com.codegeekslab.device.CellPhone;

public class BasicPhone implements CellPhone {

	public void makeCall(int number) {
		System.out.println("calling via simcard... " + number);
	}

	public void checkNetwork() {
		System.out.println("network found");
	}

	public void checkDuration() {
		System.out.println("you talked for 10 min");
	}
}
