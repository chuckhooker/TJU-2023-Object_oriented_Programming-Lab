package com.huawei.classroom.student.h07;

public class Dog extends GameObject {

	public Dog() {

		// super( Param.DOG_HEALTH,Param.DOG_STRENGTH);
		// TODO Auto-generated constructor stub
	}

	
	public void attack(GameObject soldier) {
		int dx = this.getX() - soldier.getX();
		int dy = this.getY() - soldier.getY();
		double dis = Math.pow(dx * dx + dy * dy, 0.5);
		if (this.getRange() < dis) {
			return;
		}
		if (soldier instanceof Soldier) {
			soldier.setHealth(0);
		} else {
			soldier.setHealth(soldier.getHealth() - this.getStrength());
		}
		
		if (soldier instanceof Soldier) {
			Soldier s = (Soldier)soldier;
			if (s.life == 1 && s.getHealth() <= 0) {
				s.livingSoldierCount--;
				s.deadedSoldierCount++;
				s.life = 0;
			}
		}
	}

}
