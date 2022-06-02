package rensyu13_7;

import java.util.Scanner;

public class Wizard  {
	Display d = new Display();
	private int hp = 888;
	private int mp = 888;
	private String name = "魔法少女";
	private Wand wand;
	public void heal (Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println("勇者の名前を変えてみませんか？");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
		h.setName(str);
		System.out.println("勇者" + h.getName() + "に生まれ変われました");
		d.display("勇者" + h.getName() + "のHpを" + recovPoint + "回復した！");
		d.display("勇者" + h.getName() + "のHpは" + h.getHp());
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
		this.hp = hp;
		}
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("mpがいじょうです");	
		}
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		}
		this.name = name;
	}
	public Wand getWand() {
		return wand;
	}
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖ｶﾞnullです");
		}
		this.wand = wand;
	}
}
