package com.java.chuong5;



public class CheckClassType {

    public static void main(String[] args) {
        Object[] objArray = new Object[4];//tạo mảng tối đa 4 phần tử

        objArray[0] = "hello";//4 dòng này là các phần tử của mảng
        objArray[1] = 1000L;
        objArray[2] = 20;
        objArray[3] = 'c';

        for (int i = 0; i < objArray.length; i++) {//điều kiện i = 0, nếu i nhỏ objArray.length(length để đếm objArray), i tăng nếu nhỏ hơn objArray.
            if (objArray[i] instanceof Integer) {//nếu i tăng tới số mấy(tương đương phần tử thứ mấy của mảng) check instanceof nếu phần tử của mảng objArray đó là kiểu dữ liệu Integer thì in ra dòng dưới.
                System.out.println("Kiểu integer: " + objArray[i]);
            } else if (objArray[i] instanceof Long) {
                System.out.println("Kiểu long: " + objArray[i]);
            } else if (objArray[i] instanceof Character) {
                System.out.println("Kiểu char: " + objArray[i]);
            } else if (objArray[i] instanceof String) {
                System.out.println("Kiểu String: " + objArray[i]);
            } else {
                System.out.println("Kiểu khác: " + objArray[i]);
            }
        }
    }
}
