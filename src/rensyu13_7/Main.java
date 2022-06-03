package rensyu13_7;


	
public class Main {
	
	public static void main(String[] args) {

		Hero h = new Hero(100, 2,"アダチ");
		
		Wizard w = new Wizard(150, 50,"アダちゃん");
		Wand r = new Wand("魔法のつえ");
		w.setWand(r);
		System.out.println(h);
		System.out.println(w);
		System.out.println(r);
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
		
	}
}
