package chapter4;

public class chapter04_4 {
	public static void main(String[] args) {
		int[] numbers = {3, 4, 9};
		System.out.println("1桁の数字を入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int i: numbers) {
			if(input == i) {
				System.out.println("アタリ！");
			}
		}
	}
}
