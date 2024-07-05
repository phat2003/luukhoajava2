package com.javacore.chuong3;

public class StringBufferExam {

    public static void main(String[] args) {

        // Khởi tạo một đối tượng StringBuffer
        StringBuffer sb = new StringBuffer("Hello ");

        // add thêm vào chuỗi ban đầu.
        sb.append("Java"); // đến đây chuỗi ban đầu đã bị thay đổi
        //.append ở dòng này là để nối thêm chuỗi ký tự khác vào biến mà bạn muốn add thêm.
        //nếu là đối với đối tượng string thì sẽ có 1 đối tượng string mới được tạo ra, nhưng đối với stringbuffer thì không do nó sẽ thay đổi đối tượng ban đầu để add thên từ java(hoàn toàn không có đối tượng mới nào được tạo ra).
        // in Hello Java
        System.out.println(sb);
    }
}

