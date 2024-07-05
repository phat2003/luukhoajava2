package com.javacore.chuong5.modifier.public1;

public class A {
	//cả 2 method bên dưới chỉ đơn giản là in nội dung ra màn hình console thôi, nó không trả lại dữ liệu nên nó được khai báo với từ void(nghĩa là không trả lại dữ liệu. 
	private void msg() {
		System.out.println("Hello");
	}
	
	public void display() {
		System.out.println("display method");
		this.msg();
	}

}
