package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import VO.ResultVO;
import VO.UserVO;
import javafiles.Data_Delete;

/**
 * Servlet implementation class Delete_Servlet
 */
@WebServlet("/Delete_Servlet")
public class Delete_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ResultVO rvo=new ResultVO();
    UserVO uvo=new UserVO();
    Data_Delete dd=new Data_Delete();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_Servlet() {
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
		try {
		String email=request.getParameter("email");
		uvo.setEmail(email);
		rvo=dd.datadelete(uvo);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
