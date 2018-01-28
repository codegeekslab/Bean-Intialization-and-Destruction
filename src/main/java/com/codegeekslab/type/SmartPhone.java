package com.codegeekslab.type;

import com.codegeekslab.device.CellPhone;

public class SmartPhone implements CellPhone {

	public void makeCall(int number) {
		System.out.println("calling via whatsapp..." + number);
	}

	public void checkNetwork() {
		System.out.println("network found");
	}

	public void checkDuration() {
		System.out.println("you have talked for 10 min");
	}
}
