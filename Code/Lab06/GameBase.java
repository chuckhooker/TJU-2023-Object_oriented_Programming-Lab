package com.huawei.classroom.student.h06;

public class GameBase extends Fightob{
	public GameBase() {
		health = 500;
	}
	
	// 初始化位置
	public static GameBase createGameBase(int x, int y) {
		GameBase b = new GameBase();
		b.x = x;
		b.y = y;
		return b;
	}
	
	// 创建建筑物 兵营和兵工厂
	public Fightob building(EnumObjectType out, int x, int y) {
		switch(out) {
		case barrack:
			Barrack b = new Barrack();
			b.x = x;
			b.y = y;
			return b;
		case warFactory:
			WarFactory w = new WarFactory();
			w.x = x;
			w.y = y;
			return w;
		}	
		return null;
		
	}

}
