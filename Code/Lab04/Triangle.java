package com.huawei.classroom.student.h04;

public class Triangle{
	private int a;
	private int b;
	private int c;
	public void setA(int a) {
		this.a = a;
	}
	public void setB(int b) {
		this.b = b;
	}
	public void setC(int c) {
		this.c = c;
	}
	public double getArea() {
		double p = (a + b + c) * 0.5;
		return Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
	}
	
}