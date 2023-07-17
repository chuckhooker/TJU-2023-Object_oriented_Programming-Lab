package com.huawei.classroom.student.h08;

public class Dog {
	private int appetite;
	public Dog(){
		appetite = 0;
	}
	public void feed() throws Exception{
		if (appetite < 3) {
			appetite ++;
		}
		else throw new Exception("I can not eat more!");
	}

}
