package com.java.chuong5;

/*
 * lớp cha
 * 
 */
class Vehicle {//lớp cha
	int speed = 50;
	void showMe() {
		System.out.println("Show me...");
	}
	
}


public class Bike extends Vehicle {//lớp con kế thừa lớp cha
	
	int speed = 100;
	void display() {
		System.out.println(speed);//in speed của lớp con Bike
		
	}
	
	void display1() {
		System.out.println(super.speed);//in speed của lớp cha Vehicle ( thêm super để trỏ đến speed ở lớp cha)
		super.showMe();//ở đây thì gọi method của lớp cha bằng super.
	}
	
	public static void main(String[] args) {
		Bike b = new Bike();
		b.display();
		b.display1();

	}

}
