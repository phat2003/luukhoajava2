package com.javacore.chuong3;

public class SplitExample {

    public static void main(String[] args) {
        String s1 = "Hello java";

        String[] words = s1.split("\\s"); // tach chuoi dua tren khoang trang
                                   // \\s là biểu thức tách dựa trên khoảng trắng, chỗ nào có khoảng trắng thì tách. sau khi tách xong thì trả về mảng chứa các từ được gán vào mảng có tên word.
        // su dung vong lap foreach de in cac element cua mang chuoi thu duoc
        for (String w : words) {//dùng vòng lặp for để in nội dung của mảng word ra, do ở dòng trên là dòng khai báo mảng( không phải biến) cho nên ở dòng này khai báo biến w là mảng words
            System.out.println(w);
        }
    }
}

