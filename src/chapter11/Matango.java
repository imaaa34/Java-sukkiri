package chapter11;

public class Matango {
	int hp = 50;
	private char suffix;
	public Matango(char suffix) {  //コンストラクタ
		this.suffix = suffix;
	}
	public void attack(Hero h) {  //メソッド
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.setHp(h.getHp - 10);
	}
}
