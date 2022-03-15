package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletApp
 */
@WebServlet("/")
public class ServletApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ServletApp() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("page", "home");
		System.out.println("doGet");
		String urlView = "/views/home.jsp";
		request.getRequestDispatcher(urlView).forward(request, response); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("doPost");
		doGet(request, response);
	}

}
