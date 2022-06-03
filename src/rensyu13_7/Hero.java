package rensyu13_7;

public class Hero {
	//フィールド
	private int hp;
	private int mp;
	private String name;
	//コンストラクタ
	public Hero(int hp, int mp,String name) {
		/*if (name == null ||name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		}
		
		if (mp < 0) {
			throw new IllegalArgumentException("mpがいじょうです");	
		}
		if (hp < 0) {
			System.out.println(this.hp);
			this.hp = 0;
		}*/
		System.out.println(this.hp);
		System.out.println(this.mp);
		System.out.println(this.name);
	}
	
	//メソッド
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
