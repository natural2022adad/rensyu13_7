package rensyu13_7;


	
public class Main {
	
	public static void main(String[] args) {

		Hero h = new Hero();
		Wizard w = new Wizard();
		Wand r = new Wand();
		w.setWand(r);
		System.out.println(r.getPower());
		w.heal(h);
		
		
	}
}
