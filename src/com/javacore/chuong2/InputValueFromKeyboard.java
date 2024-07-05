package com.javacore.chuong2;

import java.util.Scanner; //khi dùng scanner nhớ improt cái package này.

/**
 * Input & Output
 * @author phama
 *
 */
public class InputValueFromKeyboard {

	public static void main(String[] args) {
		
		// Khởi tạo đối tượng nhập dữ liệu từ bàn phím
		Scanner sc = new Scanner(System.in);
		
		// Khai báo biến nhận thông tin từ bàn phím
		String name;
		int age;
		
		System.out.print("Your name: ");
		name = sc.nextLine();// dòng này để nhập dữ liệu cho cái biến( gắn sc(scanner cho biến gì thì sẽ nhập giá trị cho biến đó, ở đây là name).
		
		System.out.print("Your age: ");
		age = sc.nextInt(); //ở đây là nhập giá trị cho biến age.
		
		//In thông tin đã nhập ra màn hình
		System.out.println("Thông tin bạn vừa nhập là : ");
		System.out.println("Name: "+ name); //in ra name
		System.out.println("Age : "+ age); //in ra age
		
		//close (đóng scanner lại, lệnh này là bắt buộc khi dùng scanner vì nếu ko close thì lệnh scanner ở trên sẽ báo lỗi)
		sc.close();

	}

}
