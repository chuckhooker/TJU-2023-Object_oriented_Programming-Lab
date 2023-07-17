package com.huawei.classroom.student.h05;

public class Dog extends Fightob{
	public Dog() {
		health = 50;
	}
	public void attack(Fightob victim) {
		// TODO Auto-generated method stub
		victim.health -= 5;
		if (victim instanceof RifleSoldier || victim instanceof RPGSoldier) {victim.health = 0;}
		if (victim instanceof RifleSoldier || victim instanceof RPGSoldier) {
			if (victim.health <= 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;}
		}
	}
}