public class Chapter05_2 {
	public static void email(String title, String address, String text) {
		System.out.println("「" + address +"」に、以下のメールを送信しました。");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}
	public static void main(String[] args) {
		email("人事異動のご挨拶", "チーム", "この度、〇〇課に異動になりました。");
	}
}
