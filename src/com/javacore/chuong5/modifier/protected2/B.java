package com.javacore.chuong5.modifier.protected2;

//ở đây là import cái package chứa class A vào đây để có thể sử dụng class A(khác package) với phạm vi truy cập protected
import com.javacore.chuong5.modifier.protected1.A;

public class B extends A {//cho class B kế thừa(extends) từ class A (class B này ở package khác với class A)
	public static void main(String[] args) {
		B obj = new B();//khởi tạo đối tượng obj từ class B
		obj.msg();//gọi method msg() được định nghĩa ở class A với phạm vi truy cập protected ở class con B.
	}

}
