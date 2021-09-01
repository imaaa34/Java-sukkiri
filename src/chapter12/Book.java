package chapter12;

public class Book extends TangibleAsset {
	private String isbn;
	public Book(String name, int price, String color, String isbn) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
		super(name, price, color);  //親クラスのコンストラクタ呼び出し
		this.isbn = isbn;
	}
	public String getIbsn() { return this.isbn; }
}
