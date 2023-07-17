package com.huawei.classroom.student.h09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 把你作业的代码写到这个类里面
 * 不可以修改类的名字、包名、和固有的几个方法名以及方法的可见性
 * 可以增加其他方法、属性、类
 * 可以引用jdk的类
 * 不要引用jdk1.8以外第三方的包
 * 
 * @author cjy
 *
 */
public class Home09 {
	public Home09() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 计算出一段文字中不重复的字符的个数，例如“天津市天津大学 ”不重复字符为5
	 * 提示：使用java.util.HashSet 
	 * 难度系数1星
	 * @param s
	 * @return
	 */
	public int getDistinctCharCount(String s) {
		Set set = new HashSet();
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		return set.size();
	}
	/**
	 * 返回一段文字中，出现频率最高的字符（不考虑并列第一的情况） 例如：getFrequentChar("好好学习") 返回'好'
	 * 例如：getFrequentChar("我是天津大学软件学院学生") 返回'学'
	 * 提示：使用一个长度为65535的数组，或者使用HashMap   
	 * 难度系数2星
	 * @param s
	 * @return
	 */
	public char getFrequentChar(String s) {
		Map map = new HashMap();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (map.containsKey(arr[i])) {
				count =  (Integer) map.get(arr[i]) + 1;
			}
			map.put(arr[i], count);
		}
		int maxcnt = 0;
		char frechar = ' ';
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			char key = (char)it.next();
			if ((Integer)map.get(key) > maxcnt) {
				maxcnt = (Integer)map.get(key);
				frechar = key;
			}
		}
		return frechar;
	}
	

	
	/**
	 * 返回一段文字中，出现频率最高的词（每个词由2个字符构成，任意两个相邻的字符称为一个词，例如“天津大学，你好”由“天津”“津大”“大学”“学，”“，你”“你好” 6个词构成)
	 * 不会出现频率最高并列的情况
	 * 提示：使用HashMap 
	 * 难度系数2星
	 * @param content
	 * @return
	 */
	public String getFrequentWord(String content){
		char[] arr = content.toCharArray();
		String[] str = new String[arr.length-1];
		for(int i = 0; i < arr.length-1; i++) {
			str[i] = "" + arr[i] + arr[i+1]; 
		}
		Map map = new HashMap();
		for (int i = 0; i < str.length; i++) {
			int count = 1;
			if (map.containsKey(str[i])) {
				count =  (Integer) map.get(str[i]) + 1;
			}
			map.put(str[i], count);
		}
		int maxcnt = 0;
		String frestr = "";
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			if ((Integer)map.get(key) > maxcnt) {
				maxcnt = (Integer)map.get(key);
				frestr = key;
			}
		}
		return frestr;
	}
	 
	 
	
	/**
	 * 把一个StringBufer中所有的空格去掉
	 * 提示：不能新建StringBuffer对象，必须在原来的基础上删掉原来字符串
	 * 难度系数1星
	 * @param buf
	 */
	public void zipStringBufer(StringBuffer buf) {
		 String str = buf.toString();
		 char[] arr = str.toCharArray();
		 for(int i = arr.length-1; i >= 0; i--) {
			 if(arr[i] == ' ') {
				 buf.deleteCharAt(i);
			 }
		 }
	}

 
}

