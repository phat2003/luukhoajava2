package com.javacore.chuong4;

public class TestArray1 {

    public static void main(String args[]) {

        // gán màng nặc danh cho màng a
        int a[] = { 33, 3, 4, 5};//khai báo 1 mảng nặc danh thì không có từ khoá new.

        // in màng a ra màn hình: 33 3 4 5
        for (int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");

    }
}
