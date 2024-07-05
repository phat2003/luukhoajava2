package com.javacore.chuong4;

public class TestArray {

    public static void main(String args[]) {

        // khai báo và khởi tạo mảng
        int a[] = new int[3];
        a[0] = 10; // gán giá trị
        a[1] = 20;
        a[2] = 50;

        // in mảng ra màn hình: 10 20 50
        for (int i=0; i < a.length; i++) {// vòng lặp for khởi tạo biến i bắt đầu chạy từ 0 cho tới < độ dài của a, i tăng dần
            System.out.print(a[i] + " ");//in ra mảng a[i] + "
                                    //" " ở chỗ này là để lúc in ra mỗi giá trị sẽ cách nhau khoảng cách = khoảng cách của " "
        }
    }
}
