package chapter5;

public class Email {
	public static void main(String[] args) {
		email("有給休暇の件", "上司", "10日、有給休暇を使わせて頂きます。");
		email("上司", "10日、有給休暇を使わせて頂きます。");
	}
	public static void email(String title, String address, String text) {
		System.out.println("「" + address + "」に、以下のメールを送信しました。");
		System.out.println("件名：「" + title + "」");
		System.out.println("本文：「" + text + "」");
	}
	public static void email(String address, String text) {
		System.out.println("「" + address + "」に以下のメールを送信しました。");
		System.out.println("件名：無題");
		System.out.println("本文：「" + text + "」");
	}
}
