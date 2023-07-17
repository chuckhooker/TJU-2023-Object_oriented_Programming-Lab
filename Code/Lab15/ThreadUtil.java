package com.huawei.classroom.student.h15;

// 启动线程后 睡眠500ms后继续操作
public class ThreadUtil extends Thread{
	private StringBuffer sf;
	public ThreadUtil(StringBuffer s) {
		sf = s;
	}
	public void run() {
		try {
			Thread.sleep(500);
			sf.append("ok");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
