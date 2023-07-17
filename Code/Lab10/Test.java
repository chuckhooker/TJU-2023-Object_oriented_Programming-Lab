package com.huawei.classroom.student.h10;

/**
 * 
 * 
 * 
 * 
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Home10 home10 = new Home10();
		System.out.println(home10.orderChar("ajbcdaaaaefgg"));
		if (home10.orderChar("abcdefgg").equals("gabcdef")) {
			System.out.println("OK");
		}

	 
	}
}
