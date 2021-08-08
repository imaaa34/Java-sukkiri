import comment.Zenhan;

public class Main {
	public static void main(String[] args) throws Exception {
		Zenhan.doWarusa();
		Zenhan.doTogame();
		comment.Kouhan.callDemae();
		comment.Kouhan.showMondokoro();
		
		
		Cleric c = new Cleric("Scott", 40, 8);
		System.out.println(c.name + "が誕生した！");
		System.out.println("HP:" + c.hp);
		System.out.println("MP:" + c.mp);
		
		c.selfAid();
		c.pray(6);
	}
}
