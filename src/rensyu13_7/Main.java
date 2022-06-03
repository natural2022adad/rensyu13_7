package rensyu13_7;


	
public class Main {
	
	public static void main(String[] args) {

		Hero h = new Hero(100, 2,"アダチ");
		Wizard w = new Wizard(100, 50 ,"アダちゃん");
		Wand r = new Wand("魔法のつえ");
		w.setWand(r);
		System.out.println(r.getPower());
		System.out.println(h.getHp());
		System.out.println(h.getMp());
		System.out.println(h.getName());
		System.out.println(w.getHp());
		System.out.println(w.getMp());
		System.out.println(w.getName());
		w.heal(h);
		
		
		
	}
}
