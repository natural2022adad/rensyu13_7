package rensyu13_7;

public class Hero {
	private int hp = 100;
	private int mp = 30;
	private String name = "プログラマーアダチ";
	
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
		if (name.length() <= 3) {
			throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
