public class Chapter04_2 {
	public static void main(String[] args) {
		int[] moneylist = {121902, 8302, 55100};
		for (int i = 0; i < moneylist.length; i++) {
			System.out.println(moneylist[i]);
		}
		for (int value : moneylist) {
			System.out.println(value);
		}
	}
}
