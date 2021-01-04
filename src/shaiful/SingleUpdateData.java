package shaiful;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SingleUpdateData
 */
@WebServlet("/SingleUpdateData")
public class SingleUpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SingleUpdateData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sname=request.getParameter("sname");
		String icno=request.getParameter("icno");
		String birthday=request.getParameter("birthday");
		String pname=request.getParameter("pname");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		
		
		UpdataData newData = new UpdataData();
		int update=newData.updating(sname, icno, birthday, pname, phone, address);
		request.setAttribute("update", update);
		RequestDispatcher view = request.getRequestDispatcher("/index.jsp");      
        view.include(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
