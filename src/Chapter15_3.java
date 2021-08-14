public class Chapter15_3 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("四");
		} catch(NumberFormatException e) {
			e.getMessage();
			e.printStackTrace();
		}
	}
}
