package com.test.lang;

public class Person implements IPerson {//ở đây do khi tạo class đã add interface IPerson vào nên sẽ có thêm chữ implements IPerson 

	@Override //vì ở trên đã implement interface IPerson,vì vậy ở đây phải @Override cái method show này
	public void show() {
		System.out.println("Hello");//trong method show này thì chúng ta ghi nội dung là in ra hello
	}

	public static void main(String[] args) {
		IPerson p = new Person();//tạo object(đối tượng) Person từ Interface IPerson để in ra nội dung hello( thật ra ở đầu dòng có thể ghi là Person hay IPerson đều được, in ra kết quả đều là hello, này do tôi tự nhận ra)
		p.show();
	}

}
