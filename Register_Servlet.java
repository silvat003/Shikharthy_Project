package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.ResultVO;
import VO.UserVO;
import javafiles.Data_Insert;

/**
 * Servlet implementation class Register_Servlet
 */
@WebServlet("/Register_Servlet")
public class Register_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResultVO rvo=new ResultVO();
    UserVO uvo=new UserVO();
    Data_Insert di=new Data_Insert();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register_Servlet() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		uvo.setFname(fname);
		uvo.setLname(lname);
		uvo.setEmail(email);
		uvo.setPassword(password);
		rvo=di.dataInsert(uvo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
