package chapter9;

public class Cleric {
	String name;
	int hp = 50;
	static final int MAXHP = 50;
	int mp = 10;
	static final int MAXMP = 10;
	void selfAid() {
		this.mp -= 5;
		this.hp = Cleric.MAXHP;
	}
	int pray(int p) {
		int r = new java.util.Random().nextInt(3);
		int total = p + r;
		this.mp += total;
		if(mp > MAXMP) {
			this.mp = Cleric.MAXMP;
			total = Cleric.MAXMP - this.mp;
		}
//		最小値を求めるメソッド
//		int actual = Math.min(this.MAXHP - this.mp, total);
		return total;
	}
	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAXMP);
//		this(hp);
//		this(Cleric.MAXHP);
	}
	public Cleric(String name) {
		this(name, Cleric.MAXHP);
//		this(Cleric.MAXHP);
	}
}
