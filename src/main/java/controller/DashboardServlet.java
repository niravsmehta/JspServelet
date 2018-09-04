package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DashboardServlet
 */
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String choice = request.getParameter("customerchoice");
		if (choice.equals("create")) {
			RequestDispatcher rd = request.getRequestDispatcher("create.jsp");
			rd.forward(request, response);
		} 
		else if (choice.equals("read")) {
			RequestDispatcher rd = request.getRequestDispatcher("read.jsp");
			rd.forward(request, response);
		} 
		else if (choice.equals("update")) {
			RequestDispatcher rd = request.getRequestDispatcher("update.jsp");
			rd.forward(request, response);
		} 
		else if (choice.equals("delete")) {
			RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
			rd.forward(request, response);
		} 
		else {
			RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
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
