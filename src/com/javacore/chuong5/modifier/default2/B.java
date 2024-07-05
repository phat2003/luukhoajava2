package com.javacore.chuong5.modifier.default2;

public class B {
	public static void main(String[] args) {
		A obj = new A();//compile time error ,ở đây bên class A khác package và class A khác package không khai báo gì cả nên java nhận diện class là mặc định là default nên không được phép truy cập class A khác package.
		// obj.msg(); //compile time error
	}
}
