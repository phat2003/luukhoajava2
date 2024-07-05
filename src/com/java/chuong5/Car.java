package com.java.chuong5;

public class Car {
	//*1
	private String name;//khai báo thuộc tính cho class car( ở đây là thuộc tính name)
	//*3
	//tạo 1 contructor với tham số name để khởi tạo đối tượng car(dòng này cứ xem như là dùng để truyền thuộc tính name cho đối tượng tên là car)
	//contructor thì tên của nó phải giống với tên của class.
	public Car(String name) {
		this.name = name;
	}
	
	//*2
	//muốn in thông tin của thuộc tính name ra thì phải tạo 1 cái method trong class và dùng nó để in name ra.
	//hàm in ra thuộc tính bên trong class như bên dưới đây.
	//hàm in thuộc thính bên trong class dùng void(không trả về dữ liệu) và đặt public để có thể truy cập nó.
	//và khai báo nào có từ void thì đó chính là 1 method
	public void show() {//tạo method này bên trong class car để in thông tin của trường name ra, có chữ void là không trả về dữ liệu
		System.out.println(name);
	}

	public static void main(String[] args) {
		//*4
		//bên dưới là cách tạo ra đối tượng của class Car bằng cách sử dụng toán tử new.
		 
		//kiểu của đối tượng toyota và ford là class Card.
		Car toyota = new Car("Toyota");
		//Car ở đầu này là class Car,còn car ở new là Contructor Car đã tạo ở trên và truyền vào đó là thuộc tính name cũng chính là chữ toyota và ford nằm trong ngoặc.
		Car ford = new Car("Ford");
		
		toyota.show();
		ford.show();
		
	}

}
