package com.huawei.classroom.student.h08;

public class Bank {

	private int balance;
	
	public Bank() {
		balance = 0;
	}
	
	public void save(int savemoney) {
		balance += savemoney;
	}
	
	public void get(int getmoney) throws NoMoneyException{
		if (balance >= getmoney) {
			balance -= getmoney;
		}
		else throw new NoMoneyException();
	}
}
