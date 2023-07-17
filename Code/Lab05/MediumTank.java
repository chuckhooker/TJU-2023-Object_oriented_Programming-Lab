package com.huawei.classroom.student.h05;

public class MediumTank extends Tank implements Attacker{
	public MediumTank() {
		health = 100;
	}
	public void attack(Fightob victim) {
		victim.health -= 10;
		if (victim instanceof RifleSoldier || victim instanceof RPGSoldier) {
			if (victim.health <= 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;}
		}
	}

}
