package com.huawei.classroom.student.h05;

public class Barrack  extends Fightob{
	public Barrack() {
		health = 100;
	}
	
	public Fightob traing(EnumObjectType out) {
		switch(out) {
		case rifleSoldier:
			Soldier.livingcnt ++;
			return new RifleSoldier();
		case RPGSoldier:
			Soldier.livingcnt ++;
			return new RPGSoldier();
		case dog:
			return new Dog();
		}
		return null;
	}
}