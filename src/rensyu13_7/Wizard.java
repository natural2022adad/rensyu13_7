package rensyu13_7;

import java.util.Scanner;

public class Wizard  {
	Display d = new Display();
	//フィールド
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	//コンストラクタ
	public Wizard(int hp, int mp,String name) {
		if (hp < 0) this.hp = 0;
		this.setHp(hp);
		
		if (mp < 0) throw new IllegalArgumentException("mpがいじょうです");	
		this.setMp(mp);
		
		if (name == null ||name.length() < 3)throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		this.setName(name);
	}
	//メソッド
	public void heal (Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println("勇者の名前を変えてみませんか？");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (str == null || str.length() < 3)throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		h.setName(str);
		System.out.println("勇者" + h.getName() + "に生まれ変われました");
		d.display("勇者" + h.getName() + "のHpを" + recovPoint + "回復した！");
		d.display("勇者" + h.getName() + "のHpは" + h.getHp());
	}
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public int getMp() {return mp;}
	public void setMp(int mp) {this.mp = mp;}
	
	public String getName() {return name;}
	public void setName(String name) {
		if (name == null || name.length() < 3)throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		this.name = name;
	}
	
	public Wand getWand() {return wand;}
	public void setWand(Wand wand) {
		if (wand == null)throw new IllegalArgumentException("杖ｶﾞnullです");
		this.wand = wand;
	}
	public String toString() {
		return "Name:" + this.name + " HP:" +this.hp + " MP:" +  this.mp + "Wand:" + this.wand;
	}
}
