package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.AuthenticationService;
// TODO: gửi GET request đến localhost.../login
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (AuthenticationService.isUserCredentialValid(username, password)) {
			// TODO: set sesion, redirect qua trang search
			response.getWriter().write("Fail Redirect");
		} else  {
			// TODO: thong bao sai mat khau
			
			System.out.println("username" +username+ "password" +password);
			response.getWriter().write("Fail Password");
			
		}
	}

}
