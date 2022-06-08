package rensyu13_7;



public class Hero {
	//フィールド
	private int hp;
	private int mp;
	private String name;
	//コンストラクタ
	public Hero(int hp, int mp,String name) {
		if (hp < 0) {
			
			System.out.println("ifの中の" + hp);
			//this.setHp(hp);はできない？？
			this.hp = hp;
			hp = 0;
			System.out.println("ifの中の" + hp);
			
		}
		this.setHp(hp);
		if (mp < 0) {
			throw new IllegalArgumentException("mpがいじょうです");	
		}
		this.setMp(mp);
		if (name == null ||name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		}
		this.setName(name);
		System.out.println("の" + this.hp);
	}
	
	//メソッド
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public int getMp() {return mp;}
	public void setMp(int mp) {this.mp = mp;}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public String toString() {
		return "Name:" + this.name + "HP:" +this.hp + "MP:" + this.mp;	
	}
	
	public boolean equals (Object o) {
		if (this == o)return true;
		if (o instanceof Hero) {
			Hero h = (Hero)o;
				if(this.name.equals(h.name))
					return true;
	
		}
		return false;
	}
}
