public class Wand {
	private String name;
	private double power;
	
	public String getname() {
		return this.name;
	}
	
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("名前がnullである。処理を中断。");
		}
		if(name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
		}
		this.name = name;
	}
	
	public double getPower() {
		return this.power;
	}
	
	public void setPower(double power) {
		if(power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("魔力がおかしい。処理を中断。");
		}
		this.power = power;
	}
}
