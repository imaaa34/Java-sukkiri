package chapter5;

public class CalcCircleArea {
	public static void main(String[] args) {
		System.out.println("面積は" + calcCircleArea(5.0) + "cm2");
	}
	public static double calcCircleArea(double radius) {
		double result = radius * radius * 3.14;
		return result;
	}
}
