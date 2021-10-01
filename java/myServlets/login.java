package myServlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String password = request.getParameter("pwd");
		String names [] = {"omar","sara","petter","sonam","tom"};
		String pwds [] = {"omar123","sara123","petter123","sonam123","tom123"};
		
		boolean res = false;
         for(int i=0;  i<names.length; i++) {
        	 if(user.equals(names[i]) && password.equals(pwds[i]) ) {
        		 res=true;
        		 HttpSession session = request.getSession();
        		 session.setAttribute("name", user);
                 response.sendRedirect("dashboard");	
        	 }
		}
         if(res==false)
        	 response.sendRedirect("Error");
         
         
         
		
		
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
