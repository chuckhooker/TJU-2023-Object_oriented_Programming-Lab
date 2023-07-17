package com.huawei.classroom.student.h04;

public class Apple {
	private String color;
	private int size;
	public Apple() {
		color = "red";
		size = 10;
	}
	public Apple(int size, String color) {
		this.color = color;
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public int getSize() {
		return size;
	}
}
