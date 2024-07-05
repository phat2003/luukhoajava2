package com.javacore.chuong5.modifier.public1;

public class B {

	public static void main(String[] args) {
		A obj = new A(); //tạo đối tường từ bên class A
		obj.display();//display ở bên class A phạm vi truy cập public nên ở bên này gọi được dễ dàng
		//obj.msg(); ở đây dòng này báo lỗi là di bên kia phạm vi truy cập là private thì gọi làm dell j cho mệt
	}

}
