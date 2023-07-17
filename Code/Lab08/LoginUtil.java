package com.huawei.classroom.student.h08;

public class LoginUtil {

	public void login(String users, String password)throws InvalidUserException {
		if(users.equals("a") && password.equals("a")) {
			
		}
		else throw new InvalidUserException();
	}
}
