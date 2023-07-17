package com.huawei.classroom.student.h19.q04;

public class StrUtil {

	public String removeDulpicatedChar(String str) {
		// TODO Auto-generated method stub
		
		char[] ch = str.toCharArray();
		int len = ch.length;
		for(int i = 0; i < len; i++) {
			for(int j = i + 1; j < len; j++) {
				if(ch[j] == ch[i]) {
					for(int k = j; k < len-1; k++) {
						ch[k] = ch[k + 1];
					}
					len--;
				}
			}
		}
		char [] ch1 = new char[len];
		for(int i = 0; i < len; i++) {
			ch1[i] = ch[i];
		}
		String s = String.valueOf(ch1);
		return s;
	}

}
