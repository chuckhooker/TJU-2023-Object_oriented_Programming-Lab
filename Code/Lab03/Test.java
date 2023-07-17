package com.huawei.classroom.student.h03;

import java.math.BigInteger;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//isNarcissisticNum 测试用例
		if(!Home03.isNarcissisticNum(3)) {
			System.out.println("isNarcissisticNum 测试用1通过");
		}
		if(Home03.isNarcissisticNum(153)) {
			System.out.println("isNarcissisticNum测试用2通过");
		}
		
		//Perfectnumber 测试用例
		if(Home03.Perfectnumber(6)) {
			System.out.println("Perfectnumber 测试用1通过");
		}
		
		//factorial 测试用例
		if(Home03.factorial(3)==6) {
			System.out.println("factorial 测试用1通过");
		}
		if(Home03.binToDec("10").equals("2") ) {
			System.out.println("binToDec 测试用1通过");
		}
		
		//求解二元一次方程的测试用例 自己想怎么写，方程肯定有两个不同的解，也就是deta>0,解没有顺序要求，那个放在前面都都行
		double [] y = Home03.getRoot(2,5,3);
		if((2*y[0]*y[0] + 5*y[0] + 3 == 0) & (2*y[1]*y[1] + 5*y[1] + 3 == 0)) {
			System.out.println("getRoot 测试用1通过");
		}
		
		//getPascalTriangle测试用例自己想想怎么写
		int [] u = Home03.getPascalTriangle(5);
		if ((u[0] == 1) & (u[1] == 4) & (u[2] == 6) & (u[3] == 4) & (u[4] == 1)) {
			System.out.println("getPascalTriangle 测试用1通过");
		}
		//zipSpace 测试用例
		
		if(Home03.zipSpace("1 2").equals("12") ) {
			System.out.println("zipSpace 测试用1通过");
		}
	}
	 

}
