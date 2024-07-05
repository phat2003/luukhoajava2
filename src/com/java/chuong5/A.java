package com.java.chuong5;

/*public class A implements IPrinTable, IPrinTable2 {
 * ở trên là cách 1 còn dưới là cách 2*/ 
public class A implements IPrinTable3 {

	public static void main(String[] args) {
		A a = new A();
		a.print();
		a.show();
		a.display();
	}

	@Override
	public void print() {
		System.out.println("Hello");
		
	}

	@Override
	public void show() {
		System.out.println("Show Hello");
		System.out.println(PI);// ở bất cứ method trừu tượng nào của interface cũng có thể truy xuất đến field(trường) được khai báo trong interface đó(ở đây là khai báo số PI.
		
	}
	
	@Override
	public void display() {
		
		System.out.println("display method");
		
	}

}
