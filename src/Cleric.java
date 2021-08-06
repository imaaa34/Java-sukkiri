public class Cleric {
	String name;
	final int MAX_HP = 50;
	int hp = 50;
	final int MAX_MP = 10;
	int mp = 10;
	
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
