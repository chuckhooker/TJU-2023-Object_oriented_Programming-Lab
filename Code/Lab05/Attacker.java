package com.huawei.classroom.student.h05;

public interface Attacker {
	public default void attack(Fightob victim) {
		if (victim instanceof RifleSoldier || victim instanceof RPGSoldier) {
			if (victim.health <= 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;}
		}
	}
}
