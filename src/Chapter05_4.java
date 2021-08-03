public class Chapter05_4 {
	public static double calTriangleArea(double bottom, double height) {
		double result = (bottom * height) / 2;
		return result;
	}
	
	public static double calCircleArea(double radius) {
		double result2 = radius * radius * 3.14;
		return result2;
	}
	
	public static void main(String[] args) {
		double triangleArea = calTriangleArea(10.0, 5.0);
		double circleArea = calCircleArea(5.0);
		System.out.println("三角形の面積は" + triangleArea + "平方cmです。");
		System.out.println("円の面積は" + circleArea + "平方cmです。");
	}
}