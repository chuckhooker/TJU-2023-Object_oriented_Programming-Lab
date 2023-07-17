package com.huawei.classroom.student.h08;

public class AgeCheck implements AgeCheckInterface{
	public void checkAge(int age) {
		if (age > 200 || age < 0) {
			throw new RuntimeException();
		}
	}

}
