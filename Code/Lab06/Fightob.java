package com.huawei.classroom.student.h06;

public class Fightob {
	public int health;
	public int x;
	public int y;
	public int attcnt;  // 防止重复统计死亡的标记
	public int range;  // 攻击范围
	public int attackhp;  // 攻击力
	
	public Fightob() {
		attcnt = 0;
	}
	
	public int getHealth() {  // 返回生命值
		return health;
	}
	 
	public boolean isDestroyed() {  //判断是否死亡
		if (health <= 0) {return true;}
		else {return false;}
	}
	
	public void move(int dx, int dy) {  //移动
		x += dx;
		y += dy;
		
	}
	
	//攻击目标
	public void attack(Fightob victim) {
		// 判断是否在攻击范围内
		double sqdistance = (this.x - victim.x)*(this.x - victim.x)+(this.y - victim.y)*(this.y - victim.y);
		if(sqdistance <= this.range*this.range) {
		victim.health -= this.attackhp;}
		
		// 如果是士兵 统计其死亡与存活情况
		if (victim instanceof Soldier ) {
			if (victim.health <= 0 && victim.attcnt == 0) {
				Soldier.livingcnt--;
				Soldier.deadcnt++;
				victim.attcnt++;}
		}
	}

}
