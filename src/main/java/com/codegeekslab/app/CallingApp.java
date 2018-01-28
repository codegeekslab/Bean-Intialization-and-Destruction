package com.codegeekslab.app;

import com.codegeekslab.device.CellPhone;

public class CallingApp {

	private CellPhone phone;

	// for setter injection
	public CellPhone getPhone() {
		return phone;
	}

	public void setPhone(CellPhone phone) {
		this.phone = phone;
	}

	public void dialNumber(int number) {
		phone.makeCall(number);
	}

}
