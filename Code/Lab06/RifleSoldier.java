package com.huawei.classroom.student.h06;

public class RifleSoldier extends Soldier  {
	public RifleSoldier() {
		range = 5;
		health = 50;
		attackhp = 5;
	}

	@Override
	public void attack(Fightob victim) {
		double sqdistance = (this.x - victim.x)*(this.x - victim.x)+(this.y - victim.y)*(this.y - victim.y);
		if(sqdistance <= range*range) {
		victim.health -= 5;}
		
		// 枪兵能一击毙命狗
		if (victim instanceof Dog) {
			if(sqdistance <= range*range) {
				victim.health = 0;
			}
		}
		
		if (victim instanceof Soldier ) {
			if (victim.health <= 0 && victim.attcnt == 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;
				victim.attcnt++;}
		}
	}
	

}
