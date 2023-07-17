package com.huawei.classroom.student.h07;

public class Barrack extends Building {

	public Barrack(int x, int y) {
		this.x = x;
		this.y = y;
		// super( Param.BARRACK_HEALTH,Param.BARRACK_STRENGTH);
		// TODO Auto-generated constructor stub
	}

	public GameObject traing(EnumObjectType type) {
		

		if (type == EnumObjectType.rifleSoldier) {
			GameObject gameObject = new RifleSoldier();
			gameObject.setHealth(50);
			gameObject.setStrength(5);
			gameObject.setRange(5);
			gameObject.setX(this.getX());
			gameObject.setY(this.getY());
			return gameObject;
		} else if (type == EnumObjectType.RPGSoldier) {
			GameObject gameObject = new RPGSoldier();
			gameObject.setHealth(50);
			gameObject.setStrength(10);
			gameObject.setRange(10);
			gameObject.setX(this.getX());
			gameObject.setY(this.getY());
			return gameObject;
		} else if (type == EnumObjectType.dog) {
			GameObject gameObject = new Dog();
			gameObject.setHealth(50);
			gameObject.setStrength(5);
			gameObject.setRange(5);
			gameObject.setX(this.getX());
			gameObject.setY(this.getY());
			return gameObject;
		}
		
		return null;
	}

}
