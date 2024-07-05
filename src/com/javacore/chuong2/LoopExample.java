package com.javacore.chuong2;

public class LoopExample {

	public static void main(String[] args) {
		
		// In nội dung các số ra màn hình sử dụng vòng lặp for
		System.out.println("sử dụng vòng lặp for");
		for (int i = 1;i <= 10;i++) { //dòng này chính là cú pháp của vòng lặp for(có thể xem lại trong discord: bài 20)
			System.out.println(i);
		}
		//giải thích sơ vòng lặp for thì khởi tạo biến gán giá trị 1, điều kiện i <=10, in i ra, sau đó lặp tăng i 1 đơn vị cho tới khi nào i lớn hơn 10(không thoả mãn điều kiện nữa thì ngừng lặp)
		//In nội dung các số ra màn hình sử dụng vòng lặp while
		System.out.println("sử dụng vòng lặp while");
		int i = 1;//khởi tại biến i gán giá trị 1 từ đầu
		while (i <= 10) {//sau đó mới sử dụng vòng lặp while để kiểm tra điều kiện biến i có <= 10 hay không?( thì lần lặp đầu tiên là i = 1 nên i chắc chắn sẽ <= 10 rồi)
			System.out.println(i);//sau đó in nội dung i ra
			i++; //sau đó tăng giá trị biến lên 1 giá trị(tức là lúc này i = 2) sau đó tiếp tục lặp lại điều kiện do i = 2 vẫn <= 10 nên tiếp tục thực hiện câu lệnh while cho tới khi i = 11 lớn hơn 10 thì mới ngừng vòng lặp while
		}
		
		//gán lại giá trị của biến đếm là 1
		i = 1;
		//in nội dung các số ra màn hình sử dụng vòng lặp do - while
		System.out.println("Sử dụng vòng lặp do - while");
		do {
			System.out.println(i);//do- while lần đầu tiên ko cần check điều kiện, cứ in i ra trước sau đó tăng i lên rồi mới thực hiện kiểm tra điều kiện vòng while ở dưới.
			i ++;
		} while(i <=10); //thực hiện kiểm tra điều kiện nếu thoả màn thì lặp tiếp, còn không thì sẽ kết thúc vòng lặp do -while.
		//như vậy vòng do -while sẽ lặp ít nhất 1 lần cho dù điều kiện là sai(false).
		//một trường hợp nữa nếu câu lệnh while là while(true); thì vòng lặp nó chạy vô tận.
	}

}
