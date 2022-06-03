package rensyu13_7;

import java.util.Random;

public class Wand {
	//フィールド
	private String name; //杖の名前 
	private int min_val = 5;
	private int max_val = 1000;
    Random ran = new Random();
    private int rand = ran.nextInt(max_val) + min_val;

    private double power =  rand/10; //杖の魔力
    //コンストラクタ
    public Wand(String name) {
    	if (name == null ||name.length() <= 3) {
			throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		}
    	
    }
    

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。3文字いじょうで");
		}
		
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("魔力がいじょうです");
		}
		this.power = power;
	}


}
