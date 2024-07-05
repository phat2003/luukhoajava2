package com.javacore.chuong5.modifier.protected2;

import com.javacore.chuong5.modifier.protected1.A;
public class B1 {//ở đây không kế thừa class A

	public static void main(String[] args) {
		A obj = new A();//tạo 1 đối tượng thuộc class A(khác package
		a.msg();//ở đây báo lỗi là do chúng ta không được phép gọi hàm protected được định nghĩa trong class A ở class B1 này(do B1 không được extends từ A)
	}

}
