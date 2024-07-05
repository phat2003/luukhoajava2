package com.java.chuong5;

public class Counter {
	//Thuộc tính tĩnh
	public static int COUNT = 0;//đếm số lượng đối tượng được tạo ra bởi class này
	
	Counter() {//mỗi khi contructor(đối tượng Counter() ) được khởi tạo thì tăng biến count lên bằng toán tử ++ (tăng lên 1).
		COUNT++;
	}
	
	//Phương thức(method) tĩnh
	public static void sayHi() {
		System.out.println("Hello static method!");
	}
}
