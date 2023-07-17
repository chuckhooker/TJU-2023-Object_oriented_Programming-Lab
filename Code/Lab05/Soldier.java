package com.huawei.classroom.student.h05;

public class Soldier extends Fightob{
	public void attack(Fightob victim) {
		victim.health -= 10;
	}
	public static int livingcnt = 0;
	public static int deadcnt = 0;
	public static int getLivingSoldierCount() {
		return livingcnt;
	}
	public static int getDeadedSoldierCount() {
		return deadcnt;
	}
}
