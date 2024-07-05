package com.javacore.chuong5.polymorphism;

class Animal {
	public void makeSound() {
		System.out.println("default ...");
	}
}

class Cat extends Animal {
	
	@Override//lệnh này sử dụng để ghi đè method đã kế thừa từ lớp cha(dùng để chỉ định và ghi đè đích danh method đó và sử dụng với cách dùng khác với lớp cha)
	public void makeSound() {
		System.out.println("Meo meo");//ở lớp cha (makesound) dùng để in ra default thì ở lớp con dùng để in ra meo meo
	}
	
}

class Dog extends Animal {
	@Override
	public void makeSound() {
		System.out.println("Go go");
	}
}

public class TestPolymorphism {

	public static void main(String[] args) {
		Animal a = new Dog();
		Animal b = new Cat();
		
		a.makeSound();
		b.makeSound();
	}

}
