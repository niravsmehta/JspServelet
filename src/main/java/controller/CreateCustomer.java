package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Customer;
import service.Service;

/**
 * Servlet implementation class CreateCustomer
 */
public class CreateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

    CustomerService cs = new Service();
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerType = request.getParameter("customerType");
		
		Customer c = new Customer(customerId, customerName, customerType);
		boolean check = s.validateCustRegistration(c);
		if (check == true) {
			System.out.println("Registration successful");
			request.setAttribute("Success", "Registration successful");
			request.getRequestDispatcher("dashboard.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("create.jsp").forward(request, response);
		}
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
