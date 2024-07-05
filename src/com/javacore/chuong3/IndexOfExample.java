package com.javacore.chuong3;

public class IndexOfExample {

    public static void main(String[] args) {
        String s1 = "Hello java";
        
        // Tìm vị trí của ký tự
        int index1 = s1.indexOf('o');
        System.out.println("index1 = " + index1); // Kết quả: index1: 4
        
        // Tìm vị trí index của chuỗi con
        int index2 = s1.indexOf("java");
        System.out.println("index2 = " + index2); // Kết quả: index2: 6
        //lưu ý: index trong java đếm từ con số 0.
        //kết quả: index1 = 4 : từ h là 0 đến o là 4.
        //index 2 = 6 : từ h là 0 tới java là 6, đếm cả khoảng trắng.
    }
}
