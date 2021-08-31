package chapter12;

public class Computer extends TangibleAsset {
	private String makerName;
	public Computer(String name, int price, String color, String makerName) {
//		this.name = name;
//		this.price = price;
//		this.color = color;
		super(makerName, price, color);
		this.makerName = makerName;
	}
	public String getMakerName() { return this.makerName; }
	
}
