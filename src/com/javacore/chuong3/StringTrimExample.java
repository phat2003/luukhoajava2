package com.javacore.chuong3;

public class StringTrimExample {

    public static void main(String[] args) {

        String s1 = " hello string ";

        // In nội dung trước khi xóa khoảng trắng

        System.out.println(s1 + "java");//Kết quả: " hello string java"

        // In nội dung sau khi xóa khoảng trắng

        System.out.println(s1.trim() + "java");// Kết quả: "hello stringjava"
        //kết quả cho ra của hàm trim là :hello stringjava do hàm trim đã xóa khoảng trắng ở đầu và cuối chuỗi của biến s1 (không xóa khoảng ở giữa của chuỗi).
    }

}
