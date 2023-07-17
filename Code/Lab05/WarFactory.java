package com.huawei.classroom.student.h05;

public class WarFactory extends Fightob {
	public WarFactory() {
		health = 100;
	}
	
	public Fightob building(EnumObjectType out) {
		switch(out) {
		case mediumTank:
			return new MediumTank();
		case heavyTank:
			return new HeavyTank();
		}
		return null;
	}
}
