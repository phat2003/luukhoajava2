package com.java.chuong5;

public class BankAccount {
	
	private double balance = 0;//biến số dư tài khoản bank
	
	public void deposit(double x) {//method chuyển tiền
		if (x > 0) {//điều kiện x > 0
			this.balance += x;//thì để balance += x
		}
	}
	
	public double getBalance() {//biến lấy thông tin số dư
		return balance;//trả về balance
	}
}
