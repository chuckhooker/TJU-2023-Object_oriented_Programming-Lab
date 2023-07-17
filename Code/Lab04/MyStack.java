package com.huawei.classroom.student.h04;

public class MyStack{
	private int size;
	private int top = -1;
	private int s[];
	
	public MyStack(int size) {
		this.size = size;
		s = new int[size];
	}
	
	 
	
	public boolean isFull() {
		if (top == size - 1) {return true;}
		else {return false;}
	}
	
	public boolean isEmpty() {
		if (top == -1) {return true;}
		else {return false;}
	}
	
	public int pop() {
		if (this.isEmpty()) {return -1;}
		else {
			return s[top--];
		}
	}
	
	public void push(int m) {
		if (this.isFull()) {return;}
		else {
			top++;
			s[top] = m;
		}
	}
	
}