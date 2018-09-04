package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static util.HibernateUtil.openSession;

import org.hibernate.Query;
import org.hibernate.Session;

import pojo.Customer;
import pojo.LoginDetails;

public class CustomerDao {
	
	public List<LoginDetails> getLoginDetails(String email, String password) {
		List<LoginDetails> loginList = new ArrayList<>();
		Session session = null;
		session = openSession();
		session.beginTransaction();
		String hql = "select c from logindetails c where c.email=:email and c.password=:password";
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		query.setParameter("password", password);
		for (Iterator iterator = query.iterate(); iterator.hasNext();) {
			LoginDetails iterateDetails = (LoginDetails) iterator.next();
			LoginDetails loginData = new LoginDetails(iterateDetails.getEmail(), iterateDetails.getPassword());
			loginList.add(loginData);
		}
		return loginList;
	}
	
	public boolean storeDetails(Customer c) {
		Session session = null;
		try {
			session = openSession();
			session.beginTransaction();
			session.save(c);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
	
	public Customer viewCustomer(int customerId) {
		Customer c = null;
		Session session = null;
		session = openSession();
		session.beginTransaction();
		String hql = "from customer c where c.customerId=:customerId";
		Query query = session.createQuery(hql);
		query.setParameter("customerId", customerId);
		for (Iterator iterator = query.iterate(); iterator.hasNext();) {
			Customer iterateCustomers = (Customer) iterator.next();
			c = new Customer(c.getCustomerId(), c.getCustomerName(), c.getCustomerType());
		}
		return c;
	}
	
	public boolean updateCustomerDetails(String customerName, String customerType) {
		Session session = null;
		try {
			session = openSession();
			session.beginTransaction();
			String hql = "update customer c set c.customerName=:customerName where c.customerType=:customerType";
			Query query = session.createQuery(hql);
			query.setParameter("customerName", customerName);
			query.setParameter("customerType", customerType);
			query.executeUpdate();
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
	
	public boolean deleteCustomer(int customerId) {
		Session session = null;
		try {
			session = openSession();
			session.beginTransaction();
			String hql = "delete from customer where customerId=:customerId";
			Query query = session.createQuery(hql);
			query.setParameter("customerId", customerId);
			query.executeUpdate();
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return false;
	}
}
