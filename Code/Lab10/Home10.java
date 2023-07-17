package com.huawei.classroom.student.h10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
public class Home10 {
	public Home10() {
	} 
	/**
	 * 将一个字符串中字符按出现频率的高到低排序返回，如果两个字符出现的频率一样，则将最先出现的字符排在前面
	 * 例如：orderChar(“abcdefg”)返回 “abcdefg” 
	 * orderChar(“abcdefgg”)返回 “gabcdef”
	 * orderChar(“abcdefgge”)返回 “egabcdf”
	 * orderChar(“天津大学软件学院”)返回 “学天津大软件院”
	 * @param content
	 * @return
	 */
	public String orderChar(String content) {
		Map<Character, int[]> map  = new HashMap<Character, int[]>();
		char[] arr = content.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int count[] = { 1, i };
			if (map.containsKey(arr[i])) {
				count[0] =  map.get(arr[i])[0] + 1;
			}
			map.put(arr[i], count);
		}
		int maxcnt = 0;
		char ch = ' ';
		String s = "";
		
		int len = map.keySet().size();
		
		for(int i = 0; i < len; i++) {
			maxcnt = 0;
			Iterator <Character> it = map.keySet().iterator();
			while(it.hasNext()) {
				char key = (char)it.next();
				if (map.get(key)[0] > maxcnt) {
					maxcnt = map.get(key)[0];
					ch = key;
				}
				if (map.get(key)[0] == maxcnt) {
					if (map.get(key)[1] < map.get(ch)[1]) {
						ch = key;
					}
				}
			}
			map.remove(ch);
			s = s + ch;
		}
		
		
		return s;
	}
	
}
