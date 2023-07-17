package com.huawei.classroom.student.h05;

public class RPGSoldier  extends Soldier{
	public RPGSoldier() {
		health = 50;
	}
	public void attack(Fightob victim) {
		// TODO Auto-generated method stub
		victim.health -= 10;
		if (victim instanceof RifleSoldier || victim instanceof RPGSoldier) {
			if (victim.health <= 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;}
		}
	}
}

