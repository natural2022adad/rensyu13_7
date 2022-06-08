package rensyu13_7;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
	
public class Main {
	
	public static void main(String[] args) throws ParseException {
		Display d = new Display();
		
		

		/*Hero h = new Hero(-100, 2,"アダチ");
		
		Wizard w = new Wizard(-150, 50,"アダちゃん");
		Wand r = new Wand("魔法のつえ");
		w.setWand(r);
		System.out.println(h);
		System.out.println(w);
		System.out.println(r);
		System.out.println(h.getHp());
		System.out.println(h.getMp());
		System.out.println(h.getName());
		System.out.println(w.getHp());
		System.out.println(w.getMp());
		System.out.println(w.getName());
		System.out.println(r.getName());
		System.out.println(r.getPower());
		w.heal(h);
		
		Hero h1 = new Hero(100, 2,"アダチ1");
		Hero h2 = new Hero(100, 2,"アダチ2");
		if (h1.equals(h2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
		
		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";
		if (s2.equals(s3)) {
			out.println("s2とs3は等しいです");
			
		} else if(s2.equalsIgnoreCase(s3)){
			d.display("s2とs3はケースを区別しなければ等しいです");
		}
		Display.d("s1の長さは" + s1.length() + "です");
		Ascii_art t = new  Ascii_art();
		
		t.instant();
		
		String s4 = "Java and iJavaScript";
		
		if (s4.contains("Java")) {
			d.display("s4は,Javaを含んでいます");
			t.tyahan();
		}
		if (s4.endsWith("Java")) {
			d.display("s4は,Javaが末尾にありんす");
			t.bokoboko();
		}
		d.display("s4は、最初にJavaが登城する位置は" + s4.indexOf("Java"));
		d.display("s4は、	最後にJavaが登城する位置は" + s4.lastIndexOf("Java"));
		t.syakiin();
		String s5 = "Java programming";
		
		
		d.display("s5は、4文字目以降は" + s5.substring(3));
		d.display("s5は、4-8文字目は" + s5.substring(3, 8));


		t.funka();
		
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append("Java");
		}
		String s6 = sb.toString();
		out.println("sb終了");
		String s7 = "Java";
		for (int i = 0; i < 100000; i++) {
			s7 += "Java";
		}
		out.println("s7終了");
		t.kitaaa();
		
		String s8 = "acb,adachi:haurki";
		String [] words = s8.split("[,:]");
		for (String ww : words) {
			out.print(ww + "と");
		}
		out.println("と");
		t.pasya();
		String s9 = "acb,adachi:haurki";
		String www = s9.replaceAll("[beh]","あ");
		d.display(www);
		t.ebifly();
		out.printf("製造番号%s-%02d", "EBI", 6);
		out.println("");
		t.date();
		t.calen();
		t.simple();
		t.自転車();
		t.saigo();
		Ascii_art t = new  Ascii_art();
		t.rensyu15_1();
		
		String folder = "c:¥javadev¥";
		String file = "read.txt";
		
		
		String aaa = t.folders(folder, file);
		System.out.println(aaa);
		t.ebifly();
		
		Date d2 = new Date();
		System.out.println(d2);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(d2);
		System.out.println(c2);
		int day = c2.get(Calendar.DAY_OF_MONTH);
		c2.set(Calendar.DAY_OF_MONTH, day+100);
		System.out.println(c2);
		Date d3 = c2.getTime();
		System.out.println(d3);
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s = f.format(d3);//フォーマット変更
		System.out.println(s);
		Date d4 = f.parse(s);//フォーマット戻す
		System.out.println(d4);*/
		
		/*Ascii_art t = new  Ascii_art();
		t.integer();
		t.iterator();
		t.set1();
		t.set2();
		Ascii_art.tyahan();
		t.hashmap();*/
	
		Hero2 s1 = new Hero2("斎藤", 3);
		Hero2 s2 = new Hero2("鈴木", 7);
		Hero2 s3 = new Hero2("アダチ",5);
		
		
		ArrayList<String>list1 = new ArrayList<String>();
		list1.add(s1.getName());
		list1.add(s2.getName());
		list1.add(s3.getName());
		System.out.println(list1.get(0));
		for (String n1 : list1) {
			System.out.println(n1);
		}
		Ascii_art.bokoboko();
		
		ArrayList<Integer>listm = new ArrayList<Integer>();
		listm.add(s1.倒したモンスターの数);
		listm.add(s2.倒したモンスターの数);
		listm.add(s3.倒したモンスターの数);
		System.out.println(listm.get(0));
		for (int m1: listm) {
			System.out.println(m1);
		}
		Ascii_art.tyahan();
		
		
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		//map1.put(s1.getName(),s1.倒したモンスターの数);
		//map1.put(s2.getName(),s2.倒したモンスターの数);
		//map1.put(list1.get(0),listm.get(0));
		for (int i=0; i<list1.size(); i++) {
			
			map1.put(list1.get(i),listm.get(i));
		}
		
		System.out.println(map1);
		for (String n2 : map1.keySet()) {
			int value1 = map1.get(n2);
			Display.d(n2 + "が倒したモンスター数" + value1 + "匹");
			Ascii_art.ebifly();
		}
		Hero2.map();
		Ascii_art.funka();
		Ascii_art.bokoboko();
		
		Ascii_art a = new Ascii_art();
		a.setAge(5);
	}
	


		
	
}
