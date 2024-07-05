package com.java.chuong5;

public class MyClass {
	public static void main(String[] args) {
		Counter c1 = new Counter();		
		Counter c2 = new Counter();
		
		//đếm số đối tượng được tạo ra từ class Counter
		System.out.println("Count:" + Counter.COUNT);//ở đây ko gọi đối tượng c1 và c2 là vì để in ra số đối tượng được tạo ra thì phải gọi biến static Counter của class Counter đó thông qua class name là Counter và .COUNT(trường COUNT: để đếm số đối tượng được tạo ra).
		
		
		// call static method
		Counter.sayHi();//gọi method static là sayHi() ở trong class Counter.
		//kết luận: static giúp gọi các thành phần thuộc tính(biến,...), method bên trong class bằng classname(tên class) mà không cần phải thông qua đối tượng.
	}

}
