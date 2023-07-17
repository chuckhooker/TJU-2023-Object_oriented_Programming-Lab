package com.huawei.classroom.student.h06;

public class Dog extends Fightob {
	public Dog() {
		health = 50;
		range = 5;
		attackhp = 5;
	}

	@Override
	public void attack(Fightob victim) {
		// TODO Auto-generated method stub
		double sqdistance = (this.x - victim.x)*(this.x - victim.x)+(this.y - victim.y)*(this.y - victim.y);
		if(sqdistance <= range*range) {
		victim.health -= 5;
		}
		
		// 狗能一口要死士兵
		if (victim instanceof Soldier ) {
			if(sqdistance <= range*range) {
				victim.health = 0;
			}
		}
		if (victim instanceof Soldier) {
			if (victim.health <= 0 && victim.attcnt == 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;
				victim.attcnt++;}
		}
	}
	
}