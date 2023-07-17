package com.huawei.classroom.student.h07;

public class RPGSoldier extends Soldier {
	public RPGSoldier(  ) {		 
		//super( Param.SOLDIER_HEALTH,Param.SOLDIER_RPG_STRENGTH );
		// TODO Auto-generated constructor stub
	}
	
	public void attack(GameObject obj) {
		int dx = this.getX() - obj.getX();
		int dy = this.getY() - obj.getY();
		double dis = Math.pow(dx * dx + dy * dy, 0.5);
		if (this.getRange() < dis) {
			return;
		}
		obj.setHealth(obj.getHealth() - this.getStrength());
		
		if (obj instanceof Soldier) {
			Soldier s = (Soldier)obj;
			if (s.life == 1 && s.getHealth() <= 0) {
				s.livingSoldierCount--;
				s.deadedSoldierCount++;
				s.life = 0;
			}
		}
		
	}
}
