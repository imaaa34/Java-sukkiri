import comment.Zenhan;

public class Main {
	public static void main(String[] args) throws Exception {
		Zenhan.doWarusa();
		Zenhan.doTogame();
		comment.Kouhan.callDemae();
		comment.Kouhan.showMondokoro();
		
//		chapter9
		Cleric c = new Cleric("Scott", 40, 8);
		System.out.println(c.name + "が誕生した！");
		System.out.println("HP:" + c.hp);
		System.out.println("MP:" + c.mp);
		
		c.selfAid();
		c.pray(6);
		
//		chapter11
		PoisonMatango pm = new PoisonMatango('A');
		System.out.println("HP:" + pm.hp);
		
		Y[] ary = new Y[2]
		Y[0] = new A;
		Y[1] = new B;
		for(Y y : ary) {
			y.b();
		}
	}
}
