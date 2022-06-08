package rensyu13_7;

public class Display {
	public static void d(String str) {
	    char[] charArray = str.toCharArray();
	    try {
		    for (char ch: charArray) {
		        System.out.print(ch);
				Thread.sleep(150);
		    }
		    System.out.println("");
		} catch (InterruptedException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
