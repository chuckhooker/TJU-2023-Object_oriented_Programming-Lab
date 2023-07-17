package com.huawei.classroom.student.h06;

public class WarFactory extends Fightob {
	public int wx;
	public int wy;
	
	public WarFactory() {
		health = 100;
	}
	
	
	//创建坦克的实例 并将兵工厂的位置赋给坦克
	public Fightob building(EnumObjectType out) {
		switch(out) {
		
		case mediumTank:
			wx = this.x;
			wy = this.y;
			MediumTank a = new MediumTank();
			a.x = wx;
			a.y = wy;
			return a;
		case heavyTank:
			wx = this.x;
			wy = this.y;
			HeavyTank b = new HeavyTank();
			b.x = wx;
			b.y = wy;
			return b;
		}
		return null;
	}
}
