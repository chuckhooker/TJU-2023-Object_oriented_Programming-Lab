package com.huawei.classroom.student.h06;

public class Soldier extends Fightob {
	
	public int attcnt;
	public static int livingcnt = 0;
	public static int deadcnt = 0;
 
	// 初始化士兵 未死亡标记和存活士兵+1
	public Soldier() {
		attcnt = 0;
		Soldier.livingcnt ++;  
	}
	public static int getLivingSoldierCount() {
		return livingcnt;
	}
	public static int getDeadedSoldierCount() {
		return deadcnt;
	}

}
