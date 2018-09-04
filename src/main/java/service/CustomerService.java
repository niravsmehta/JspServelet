package service;

import java.util.ArrayList;
import java.util.List;

import dao.Dao;
import pojo.Customer;
import pojo.LoginDetails;

public class CustomerService {

	CustomerDao d = new Dao();
	public boolean checkLoginDetails(String email, String password) {

		List<LoginDetails> loginList = new ArrayList<>();
		loginList = d.getLoginDetails(email, password);
		for (LoginDetails ld : loginList) {

			if(ld.getEmail().equals(email) && ld.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean validateCustRegistration(Customer c) {

		boolean validate = d.storeDetails(c);
		if (validate == true) {
			return true;
		} 
		return false;
	}

	public Customer view(int customerId) {
		Customer c = d.viewCustomer(customerId);
		return c;
	}

	public boolean checkUpdateDetails(String customerName, String customerType) {
		boolean check = d.updateCustomerDetails(customerName, customerType);
		if (check == true) {
			return true;
		}
		return false;
	}

	public boolean checkCustomerToDelete(int customerId) {
		boolean check = d.deleteCustomer(customerId);
		if (check == true) {
			return true;
		} 
		return false;
	}

}
