package com.huawei.classroom.student.h05;

public class HeavyTank extends Tank implements Attacker{
	public HeavyTank() {
		health = 200;
	}
	public void attack(Fightob victim) {
		victim.health -= 20;
		if (victim instanceof RifleSoldier || victim instanceof RPGSoldier) {
			if (victim.health <= 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;}
		}
	}

}
