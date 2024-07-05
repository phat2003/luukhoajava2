package com.javacore.chuong3;

public class StringExample {

	public static void main(String[] args) {
		
		//tạo đối tượng String literal
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = s1;
		
		//so sánh các đối tượng với nhau
		System.out.println(s1==s2);//true, ở đây so sánh s1 có bằng s2 hay không?, bằng nhau ở đây là bằng nhau về mặt tham chiếu( có trỏ đến cùng 1 đối tượng hay không?)
		System.out.println(s1==s3);//true , này tương tự dòng trên.
		//hai dòng trên trả về true, s1 và s2 cùng trỏ đến 1 đối tượng string, dòng kế s1 và s3 cũng vậy.
		//tạo đối tượng String bằng từ khoá new
		String s4 = new String("Hello"); // tạo s4 và s5 bằng new string cùng từ khoá hello và so sánh xem có s4 và s5 có bằng nhau hay không?
		String s5 = new String("Hello");
		//so sánh đối tượng s4 và s5
		System.out.println(s4==s5);//false , do s4 và s5 trỏ đến các đối tượng string khác nhau.
		
	}

}
