package com.huawei.classroom.student.h07;

public abstract class GameObject {
	protected int range;
	protected int x;
	protected int strength;

	protected int y;

	protected int health = 0;

	protected int defaultStrength;

	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public GameObject() {}

	public void attack(GameObject obj) {
		int dx = this.x - obj.x;
		int dy = this.y - obj.y;
		double dis = Math.pow(dx * dx + dy * dy, 0.5);
		if (this.range < dis) {
			return;
		}

		obj.health = obj.health - this.strength;
		
		if (obj instanceof Soldier) {
			Soldier s = (Soldier)obj;
			if (s.life == 1 && s.getHealth() <= 0) {
				s.livingSoldierCount--;
				s.deadedSoldierCount++;
				s.life = 0;
			}
		}
	}

//	public void attack(Soldier soldier) {
//		int dx = this.x - soldier.getX();
//		int dy = this.y - soldier.getY();
//		double dis = Math.pow(dx * dx + dy * dy, 0.5);
//		if (this.range < dis) {
//			return;
//		}
//
//		soldier.setHealth(soldier.getHealth() - this.strength);
//		if (soldier.getHealth() <= 0) {
//			soldier.livingSoldierCount--;
//			soldier.deadedSoldierCount++;
//		}
//	}

	public void changeHealth(int strength) {
		int beforeHealth = this.getHealth();
		this.health = this.health - strength;
		if (beforeHealth > 0 && this.health <= 0) {
			this.dead();
		}
	}

	public void dead() {

	}

	public int getHealth() {
		return health;
	}
	public int getRange() {
		return range;
	}
	public int getStrength() {
		return strength;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isDestroyed() {
		return health <= 0;
	}

	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
