package com.huawei.classroom.student.h11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Home11 {

	public Home11() {
		// TODO Auto-generated constructor stub
	}

 
	/**
	 * 字符串content是一个超市的历次购物小票的合计，每次购物的明细之间用分号分割，每个商品之间用半角逗号分开
	 * 请找出   哪两个商品被同时购买的频率最高，将这2个商品名称返回，名称之间用逗号分隔
	 * 测试的时候，商品名称可能增加新的商品，例如方便面、面包...
	 * @param content，历次购物的明细，例如：炸鸡,可乐,啤酒;薯片,啤酒,炸鸡;啤酒,雪碧,炸鸡
	 * @return 哪两个商品被同时购买的频率最高，将这2个商品名称返回，名称之间用逗号分隔
	 */
	public String getFrequentItem(String content)  {
		Map map = new HashMap();
		// 按购买次数分割字符串
		String part[] = content.split(";");
		for(int u = 0; u < part.length; u++) {
			String single[] = part[u].split(",");
			int comnum = single.length * (single.length - 1);
			StringBuffer combine[] = new StringBuffer[comnum];
			for(int e = 0; e < comnum; e++) {
				combine[e] = new StringBuffer("");
			}
			int t = 0;
			// 从前往后 构造两件商品的字符串
			for(int w = 0; w < single.length; w++) {
				String c = single[w] + ",";
				for(int y = w + 1; y < single.length; y++) {
					combine[t].append(c);
					combine[t].append(single[y]);
					t++;
				}
			}
			// 从后往前 构造两件商品的字符串
			for(int w = single.length-1; w > -1; w--) {
				String c = single[w] + ",";
				for(int y = w -1; y > -1; y--) {
					combine[t].append(c);
					combine[t].append(single[y]);
					t++;
				}
			}
			
			// 将两件商品作为key 使用map统计同时购买的次数
			for (int i = 0; i < t; i++) {
			int count = 1;
			if (map.containsKey(combine[i].toString())) {
				count =  (Integer) map.get(combine[i].toString()) + 1;
			}
			map.put(combine[i].toString(), count);
			}	
		}
		
		
		
		// 找出购买次数前2的两件商品
		StringBuffer frestr  = new StringBuffer("");
		
			int maxcnt = 0;
			String fres = "";
			Iterator it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = (String)it.next();
				if ((Integer)map.get(key) > maxcnt) {
					maxcnt = (Integer)map.get(key);
					fres = key;
				}
			}
			frestr.append(fres);

			
			map.remove(fres);
		
		
		String s = frestr.toString();	
		return s;
	}

 
}
