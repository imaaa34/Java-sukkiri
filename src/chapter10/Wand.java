package chapter10;

public class Wand {
	private String name;
	private double power;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException("長さが短すぎるか入力されていません。");	
		} else {
			this.name = name;
		}
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(int power) {
		if(power < 0.5 || power > 100) {
			throw new IllegalArgumentException("魔力の値が異常です。");	
		} else {
			this.power = power;
		}
	}
}
