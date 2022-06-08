package rensyu13_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Hero2 {
	
	private String name;
	int 倒したモンスターの数;
	
	public Hero2(String name) {
		this.name = name;
		}
	
	public Hero2(String name, int 倒したモンスターの数) {
		this.name = name;
		this.倒したモンスターの数 = 倒したモンスターの数;
		list2.add(this.name);
		listm2.add(this.倒したモンスターの数);
		System.out.println("コンストラクタ内" + list2.get(list2.size()-1));
		}
	
	static ArrayList<String>list2 = new ArrayList<String>();
	static ArrayList<Integer>listm2 = new ArrayList<Integer>();
	
   public static void map() {
	   Map<String, Integer> map2 = new HashMap<String, Integer>();
		for (int i=0; i<list2.size(); i++) {
			 
			map2.put(list2.get(i),listm2.get(i));
		}
		
		System.out.println(map2);
		for (String n3 : map2.keySet()) {
			int value2 = map2.get(n3);
			Display.d(n3 + "が倒したモンスター数" + value2 + "匹");
			Ascii_art.kitaaa();
		}
	   
	   
   }
	/*Map<String, Integer> map1 = new HashMap<String, Integer>();
	for (int i=0; i<list1.size(); i++) {
		
		map1.put(list1.get(i),listm.get(i));
	}
	
	System.out.println(map1);
	for (String n2 : map1.keySet()) {
		int value1 = map1.get(n2);
		Display.d(n2 + "が倒したモンスター数" + value1 + "匹");
		Ascii_art.ebifly();
	}*/
	public String getName() {return this.name;}

}

