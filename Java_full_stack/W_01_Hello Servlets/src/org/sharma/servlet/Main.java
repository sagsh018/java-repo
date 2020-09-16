package org.sharma.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Main() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Notice this doGet() method is used to serve the request of GET type, whenever you try to hit the given URL
		 * Now here this servlet is going to run on our JRE which is tomcat9 server here, but suppose if we add in small print statement
		 * it will just print the output of that print statement only on the console, but not on the web page, when someone will hit the
		 * URL for this servlet on Tomcat
		 */
		
		System.out.println("Sample code");
		/*
		 * But suppose instead of printing the output of above statement on console, we want to print it on web page, for that we will have
		 * to take help from the HTTPServletResponse class object, response. since we are using doGet() method over here, so we are just 
		 * trying to get some response from the servlet running on tomcat web server
		 * see below the usage of response object and its method
		 */
		response.getWriter().println("<h1>Sample Code</h1>");
		
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
		 * So here with the help of an object of HttpServletResponse "response we hava called the method getWriter() of that class, which returns
		 * the object of class PrintWriter and with that object we are calling another method of PrintWriter class which is nothing but the
		 * println() method, which basically return the text to the client. and that text is received by our browser. 
		 */
	}

}
