package com.java.chuong5;

public class TestBankAccount {

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		//chuyển tiền
		account.deposit(-10);
		
		//hiển thị balance(số dư tk bank)
		System.out.println(account.getBalance());
	}

}
