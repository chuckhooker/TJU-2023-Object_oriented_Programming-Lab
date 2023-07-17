package com.huawei.classroom.student.h07;

public abstract class Soldier extends GameObject {

	public static int livingSoldierCount = 0;
	public static int deadedSoldierCount = 0;
	public int life;
	public Soldier() {
		life = 1;
		livingSoldierCount++;
		// TODO Auto-generated constructor stub
	}

	public static int getLivingSoldierCount() {
		return livingSoldierCount;
	}

	public static int getDeadedSoldierCount() {
		return deadedSoldierCount;
	}

	
}
