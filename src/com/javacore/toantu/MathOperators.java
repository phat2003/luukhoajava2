package com.javacore.toantu;

public class MathOperators {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		//tính tổng
		int tong = a + b;
		System.out.println("Tổng của a và b là : " + tong);
		
		//tính hiệu
		int hieu = a - b;
		System.out.println("Hiệu của a và b là : " + hieu);
		
		//tính tích
		int tich = a * b;
		System.out.println("tích của a và b là : " + tich);
		
		//lấy nguyên
		int phanNguyen = a/b;
		System.out.println("Phần nguyên của phép chia của a và b là : " + phanNguyen);
		
		//lấy dư
		int phanDu = a % b;
		System.out.println("Phần dư của phép chia của a và b là : " + phanDu);
		
		//Toán tử một ngôi
		a++;
		System.out.println("Giá trị của a sau khi ++: " + a);
		
		b--;
		System.out.println("Giá trị của b sau khi --: " + b);
		
		
	}

}
