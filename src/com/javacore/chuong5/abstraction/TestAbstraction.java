package com.javacore.chuong5.abstraction;

abstract class Animal {
    abstract void makeSound();//method abstract này ko thể truy cập trực tiếp mà chỉ có thể thông qua lớp được kế thừa từ lớp này để truy cập.
    }
class Cat extends Animal {
	@Override
	public void makeSound() {//class cat truy cập đc method makesound của lớp animal là do đã kế thừa từ lớp animal nên có thể truy cập method abstract của lớp abstract
		System.out.println("Meo meo");
	}
}

public class TestAbstraction {

	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.makeSound();

	}

}
