package com.javacore.chuong2;

public class BreakExample {

/**
 * cách sử dụng câu lệnh break
 * @param args
 * 
 */
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			//không in ra giá trị 5 do bị break ngăn cản vì if i = 5 là break không cho in ra và chỉ in các số ko phải 5
			System.out.println(i);
		}

	}

}
