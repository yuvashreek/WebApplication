package com.yuvashree;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
/* @WebServlet("/MyServlet") */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 * 
	 * @throws IOException
	 */
	// controller

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		Integer n1 = Integer.parseInt(req.getParameter("snum1"));
		Integer n2 = Integer.parseInt(req.getParameter("snum2"));
		//Integer answ = n1 + n2;
		DaoClass Dobj = new DaoClass();
		NumberClass nObj = Dobj.add(n1, n2);
		Integer answ = nObj.getAns();
		
		 
		
		
		
		
		/*s
		 * PrintWriter p1 = res.getWriter();
		 * p1.println(Integer.toString(answer));
		 */
		//req.setAttribute("a", Integer.toString(answer));
		req.setAttribute("answer", answ);
		RequestDispatcher s1 = req.getRequestDispatcher("displaypage.jsp");
		s1.forward(req, res);

	}

}