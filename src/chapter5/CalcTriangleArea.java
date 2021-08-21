package chapter5;

public class CalcTriangleArea {
	public static void main(String[] args) {
		System.out.println("面積は" + calcTriangleArea(10.0, 5.0) + "cm2");
	}
	public static double calcTriangleArea(double bottom, double height) {
			double result = (bottom * height) / 2;
			return result;
	}
}
