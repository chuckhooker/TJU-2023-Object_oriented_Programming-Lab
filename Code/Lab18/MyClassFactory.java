package com.huawei.classroom.student.h18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;


public class MyClassFactory {
	private Param param=null; 

	public MyClassFactory(String configFile) throws FileNotFoundException, IOException {
		// 构造函数，根据指定配置文件名创建 Param 对象
		param=new Param(configFile);
	}

	public <T> T createInstance( Class<T> clazz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException{
		// 根据指定类名创建实例，并将实例属性值设置为配置文件中的值
		String className=clazz.getName();
		T t = clazz.newInstance();
		Map<String,Object> props=param.getParamMap(className) ;
		Iterator<String> it=props.keySet().iterator();
		while(it.hasNext()) {
			String key=it.next();
			Object value=props.get(key); 
			String methName="set"+key.substring(0,1).toUpperCase()+key.substring(1,key.length());
			dynamicInvokeMethod(t,methName,value);
		}
		return t;
	}

	public Object dynamicInvokeMethod (Object obj, String methodName, Object... values)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException,
			SecurityException, ClassNotFoundException {
		// 动态调用指定方法，并传入参数
		Class[] classes = new Class[values.length];
		for (int i = 0; i < values.length; i++) {
			classes[i] = values[i].getClass();
		}
		Method method = obj.getClass().getMethod(methodName, classes);
		return method.invoke(obj, values);
	}
}
