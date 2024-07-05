package com.javacore.chuong3;

public class CharAtExample {

	public static void main(String[] args) {
		String name = "Hello java";
		
		//tìm ký tự tại index = 3
		char ch = name.charAt(3);//khai báo biến ch gán giá trị là biến name ghi thêm .charAt(3) để tìm vị trí của ký tự và in ra ( ở đây số 3 là vị trí thứ 3)
	  //char ch = name.charAt(300); //giả sử câu lệnh này đặt là vị trí thứ 300 thì khi in ra sẽ báo lỗi index không tồn tại
		System.out.println(ch);
		//kết quả : l

	}

}
