package hitesh.mvc.controller;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hitesh.mvc.modal.LoginInfo;
import hitesh.mvc.modal.User;
import hitesh.mvc.service.SimpleService;
import hitesh.mvc.service.simpleserviceimpl.SimpleServiceImpl;

public class LoginController extends HttpServlet {

	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request , HttpServletResponse response) {
		
		try {
			String Userid = request.getParameter("userid");
			String Password = request.getParameter("password");
			SimpleService service = new SimpleServiceImpl();
			boolean values = service.checkUserCredencial(Userid, Password);
			System.out.println(Userid);
			System.out.println(Password);
			if (values == true) {
				response.setContentType("text/html");
	            response.sendRedirect("success.jsp");
	        } else {
	        	response.setContentType("text/html");
	        	PrintWriter out = response.getWriter();
	        	out.print("INVALID CREDENCIAL....");
	            response.sendRedirect("error.jsp");
	        }
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	

