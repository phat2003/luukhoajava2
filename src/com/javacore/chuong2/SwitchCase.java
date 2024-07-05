package com.javacore.chuong2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		// Khai báo một biến age ( tuổi)
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input age : ");
		
		age = sc.nextInt();
		
		//kiểm tra giá trị của age.
		switch (age) { //điều kiện là age , chia ra các case(trường hợp) bên dưới có thể xem như là age =?? trong đó ?? là các case bên dưới
		    //trường hợp tuổi = 18
		case 18: //case là trường hợp của age,ở đây có thể hiểu như trường hợp age = 18, các case còn lại cũng vậy.
			System.out.println("You are 18 years old");
			break;// ;lệnh này là bắt buột ở mỗi case để thoát khỏi switch case, nếu ko có câu lệnh break trong khối code đó; thì nó sẽ lại tiếp tục thực thi các câu lệnh tiếp theo ở các case tiếp theo chứ nó ko thoát ra khỏi vòng switch case
		//các trường hợp 20,30,40 tuổi
		case 20://ở case 20,30 do không có break nên nó sẽ thực hiện tiếp các case khác cho tới case nào có break(ở đây là case 40 nên tới case 40 sẽ thực thi câu lệnh trong đó rồi thoát switch case.
		case 30:
		case 40:
			System.out.println("You are " + age);
			break;
		//các trường hợp còn lại
			//nếu các trường hợp trên không đúng ( age không thuộc trường hợp(case) nào ở trên thì sẽ thực hiện câu lệnh default bên dưới
			default: //default của switch case khá giống với else bên if else(cũng có thể xem là vậy), nhưng ở if else thì là else,còn ở switch case thì là default.
				System.out.println("Other age"); //nếu các case ở trên không cái nào đúng thì 
		}
		
		//close
		sc.close();
	}

}
