package com.java.chuong5;

public class ValueTypeTest {
	static void addOneTo(int num) {
		num = num + 1;
	}

	public static void main(String[] args) {
		int x = 5;//khởi tạo biến x giá trị = 5
		addOneTo(x);//gọi addOneTo và truyền biến x vào
		System.out.println(x);//in ra x(kết quả vẫn là 5) đây là do truyền kiểu giá trị thì có in ra nó cũng không thay đổi giá trị ở bên ngoài mà chỉ thay đổi giá trị ở bên trong( ở đây là chỉ có giá trị x bên trong method thay đổi chứ x bên ngoài in ra vẫn như vậy)
		                      
		
	}

}
