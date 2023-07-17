package com.huawei.classroom.student.h05;

public class RifleSoldier extends Soldier implements Attacker{
	public RifleSoldier() {
		health = 50;
	}
	public void attack(Fightob victim) {
		victim.health -= 5;
		if (victim instanceof Dog) {victim.health = 0;}
		if (victim instanceof RifleSoldier || victim instanceof RPGSoldier) {
			if (victim.health <= 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;}
		}
	}

}
