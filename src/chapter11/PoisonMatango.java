package chapter11;

public class PoisonMatango extends Matango {
	private int count = 5;
	public void attack(Hero h) {
		super.attack(h);
		if(this.count > 0) {
			System.out.println("さらに毒の胞子をばら撒いた！");
			int damage = (h.getHp() / 5);
			h.setHp(h.getHp - damage);
			System.out.println(damage + "ポイントのダメージ");
			this.count -= 1;
		}
	}
}
