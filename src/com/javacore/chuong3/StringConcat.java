package com.javacore.chuong3;

public class StringConcat {

    public static void main(String[] args) {
    	
        // Tạo một đối tượng String
        String string1 = "Hello";
        String string2 = "Java";

        // Nối chuỗi
        String string3 = string1.concat(string2);
        System.out.println(string3); // Kết quả: HelloJava
        System.out.println(string1 + string2);//cách 2: cách này cũng có thể dùng để nối chuỗi.
    }
}
