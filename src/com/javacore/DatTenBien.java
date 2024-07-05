package com.javacore;

public class DatTenBien {
	
	//đây là biến static
	public static float PI = 3.14f;
	
	//đây là biến instance
	int n;
	
	public DatTenBien(int n) {
		this.n= n;
	}
	
	public static void main(String[] args) {
		
		String firstname = "Test";
		
		System.out.println("Static : " + DatTenBien.PI );
		System.out.println("Local :" + firstname);
		
		DatTenBien object = new DatTenBien(5);
		
		
		System.out.println("instance :" + object.n);

	}

}
