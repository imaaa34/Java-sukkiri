public class Cleric {
	String name;
	int hp;
	int mp;
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;
	
	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAX_HP);
	}
	public Cleric(String name) {
		this(name, Cleric.MAX_HP);
	}
	
	public void selfAid() {
		System.out.println(this.name + "がセルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = MAX_HP;
		System.out.println("HPが最大まで回復した！");
	}

	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		int num = new java.util.Random().nextInt(3);
		this.mp += (sec + num);
		if (this.mp > MAX_MP) {
			this.mp = MAX_MP;
		}
		System.out.println("MPが" + this.mp + "回復した！");
		return this.mp;
	}
}