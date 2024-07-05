package com.javacore.chuong4;
import java.util.Scanner;
public class ArraySort {

    public static void main(String[] args) {
        int n, temp, max = 100;//n là số lượng phần tử, temp là biến sử dụng để sắp xếp 2 phần tử mảng với nhau, max là số lượng phần tử tối đa(ở đây là số lượng phần tử ko được vượt quá 100.
        
        //nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Khai báo và cấp phát bộ nhớ cho mảng A
        int A[] = new int[max];
        
        //Step 1 : nhập số phần tử của mảng
        // kiểm tra nếu n <= 2  hoặc n > max - 1
        // thì phải nhập lại
        //ở đây sử dụng do while là vì nó sẽ thực hiện ít nhất 1 lần dù sai, và phải nhập sai điều kiện để nó thoát vòng lặp, nếu nhập vào vẫn đúng với điều kiện thì tiếp lục lặp lại và bắt người dùng nhập tới khi đúng mới thôi.
        do {
            System.out.println("Nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n <= 2 || n > max - 1);
        
        //Step 2 : Nhập giá trị cho các phần tử mảng
        System.out.println("Nhập giá trị cho các phần tử của mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = scanner.nextInt();
        }
        
        //Step 3 : in ra màn hình mảng số ban đầu
        System.out.println("\nMảng đã được sắp xếp:");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + "\t");
        }
        
        ////Step 3 : sắp xếp các phần tử trong mảng
        // vòng lặp for sẽ duyệt i và j
        //i chạy từ 0 đến n - 2, j chạy từ i + 1 đến n -1
        //nếu phần tử tại chỉ số j nhỏ hơn phần tử tại i
        //thì sẽ hoán đổi vị trí 2 phần tử này cho nhau
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (A[j] < A[i]) {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        
        //Step 5 : in ra màn hình mảng số sau khi sắp xếp
        System.out.println("\nMảng sau khi sắp xếp: ");
        for (int i = 0; i < n; i++) {
        	System.out.print(A[i] + "\t");
        }
        
        //close
        scanner.close();
    }
}
