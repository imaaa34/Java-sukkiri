package chapter8;

public class Cleric {
	String name;
	int hp = 50;
	final int MAXHP = 50;
	int mp = 10;
	final int MAXMP = 10;
	void selfAid() {
		this.mp -= 5;
		this.hp = this.MAXHP;
	}
	int pray(int p) {
		int r = new java.util.Random().nextInt(3);
		int total = p + r;
		this.mp += total;
		if(mp > MAXMP) {
			this.mp = this.MAXMP;
			total = this.MAXMP - this.mp;
		}
//		最小値を求めるメソッド
//		int actual = Math.min(this.MAXHP - this.mp, total);
		return total;
	}
}
