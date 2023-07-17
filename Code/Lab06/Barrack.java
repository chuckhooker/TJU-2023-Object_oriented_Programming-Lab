package com.huawei.classroom.student.h06;

public class Barrack  extends Fightob{
	public Barrack() {
		health = 100;
	}
	public int bx;
	public int by;
	
	//创建兵的实例 并将兵营的位置赋给兵 
	public Fightob traing(EnumObjectType out) {
		switch(out) {
		case rifleSoldier:
			bx = this.x;
			by = this.y;
			RifleSoldier a = new RifleSoldier();
			a.x = bx;
			a.y = by;
			return a;
		case RPGSoldier:
			bx = this.x;
			by = this.y;
			RPGSoldier b = new RPGSoldier();
			b.x = bx;
			b.y = by;
			return b;
		case dog:
			bx = this.x;
			by = this.y;
			Dog c = new Dog();
			c.x = bx;
			c.y = by;
			return c;
		}
		return null;
	}
}