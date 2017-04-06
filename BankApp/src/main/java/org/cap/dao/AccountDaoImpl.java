package org.cap.dao;

import org.cap.dto.Account;
import org.cap.dto.Customer;

public class AccountDaoImpl implements AccountDao{

	@Override
	public boolean createAccount(Account account) {
		System.out.println("Branch2");
		return false;
	}

	@Override
	public Account findAccountById(int accountNo) {
		return null;
	}

}
