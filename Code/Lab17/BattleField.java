package com.huawei.classroom.student.h17;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BattleField {
	private static Param param=null;
	private static List<Player> allPlayer=new ArrayList<Player>();
	private static List<GameObject> allGameObjectList = new ArrayList<GameObject>();

	// 初始化方法，读取指定配置文件，并将其解析为 Param 对象
	public static void init(String config) throws FileNotFoundException, IOException {
		param=new Param(config);
	}
	public static Param getParam() {
		return param;
	} 

	public static List<Player> getAllPlayer() {
		return allPlayer;
	}
	public static List<GameObject> getAllGameObject(){
		return allGameObjectList;
	}
	public static void addGameObject(GameObject gameObject) {
		allGameObjectList.add(gameObject);
	}
	
	// 创建一个名为 name 的新 Player 对象，并将其添加到 allPlayer 静态变量中，然后返回该对象
	public static Player createPlayer(String name) {
		Player player=new Player(name);
		allPlayer.add(player);
		return player; 
	}

	// 创建一个 GameObjectVo 对象，表示一个玩家的基地，然后将其传递给 GameBase 构造函数，返回构造出的 GameBase 对象
	public static GameBase createGameBase(Player player,int x,int y) {
		GameObjectVo gameObjectVo=new  GameObjectVo(player,EnumObjectType.base,x,y);
		return new GameBase(gameObjectVo);
	}
}
