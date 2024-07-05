package com.java.chuong5;

public class Dog extends Animal {
	void bark() {
		System.out.println("banking...");
	}
	
	void show() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();//do đã kế thừa class animal nên ở class dog có thể xài đc method eat() của class animal
		d.show();
	}

}
