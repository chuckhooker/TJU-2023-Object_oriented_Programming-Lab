package com.huawei.classroom.student.h05;

public class Fightob {
	public int health;
	public int getHealth() {
		return health;
	}
	public boolean isDestroyed() {
		if (health <= 0) {return true;}
		else {return false;}
	}

}
