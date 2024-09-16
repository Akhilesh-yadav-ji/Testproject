package com.example.demo1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="sing;eton")

public class student {
	private String roll;
	private String name;
	private int mobno;
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public void disp() {
		System.out.printf( "roll=" + roll + ", name=" + name + ", mobno=" + mobno );
		
	}
	

}
