package com.javacore.chuong2;

import java.util.Scanner;

/**
 * if - else if - else
 * @author phama
 *
 */
public class IfElse {

	public static void main(String[] args) {
		
		int a ;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input a: ");
		
		a = sc.nextInt();
		
		if (a > 0) {
			System.out.println("a > 0");// nếu trường hợp này đúng thì thực thi câu lệnh này.
		} else if (a < 0) {
			System.out.println("a < 0");//// nếu trường hợp này đúng thì thực thi câu lệnh này.
		} else {
			System.out.println("a = 0");// nếu hai trường hợp if ở trên đều không đúng thì sẽ thực thi câu lệnh else này.
		}
		
		//close
		sc.close();
	}

}
