package chapter15;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
//		try {
//		String s = null;
//		System.out.println(s.length());
//		} catch(Exception e) {
//			System.out.println("NullPointerException例外をcatchしました。");
//			System.out.println("ーースタックトレース（ここから）ーー");
//			e.printStackTrace();
//			System.out.println("ーースタックトレース（ここまで）ーー");
//		}
		
//		try {
//			int i = Integer.parseInt("三");
//		} catch(NumberFormatException e) {
//			System.out.println("NumberFormatException例外をcatchしました。");
//			System.out.println("ーースタックトレース（ここから）ーー");
//			e.printStackTrace();
//			System.out.println("ーースタックトレース（ここまで）ーー");
//		}
		System.out.println("プログラム起動");
		throw new IOException();
	}
}
