package com.javacore.chuong2;

public class ContinueExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			//khi i == 5 thì không in i = 5 ra màn hình
			System.out.println(i);
		}

	}

}
