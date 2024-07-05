package com.javacore.chuong2;

public class QuiTacDatTen {
	
	//khai báo hằng số
	public static final int HOUR_OF_DAY = 24;
			
	/**
	 * method này để in ra dòng chứ "Have a nice day"
	 */
	public static void sayHello() {
		
		//khai báo biến local helloString
		String helloString = "Have a nice day!";
				
		//in nội dung ra màn hình
		System.out.println(helloString);
	}
	
	public static void main(String[] args) {
		System.out.println("Một ngày có " + HOUR_OF_DAY + " giờ");
		
		//gọi method sayHello
		sayHello();
	}

}
