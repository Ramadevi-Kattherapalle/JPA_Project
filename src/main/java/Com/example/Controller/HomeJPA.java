
package Com.example.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Com.example.Entity.Employee;
import Com.example.Service.Service;
import Com.example.Serviceimplementation.ServiceImp;

@WebServlet("/home")
public class HomeJPA extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
			HttpSession session=req.getSession();
			String name=session.getAttribute("name").toString();
			Service service=new ServiceImp();
			List<Employee> list=service.findAll();
			
			req.setAttribute("message", "Successfully logged");
			req.setAttribute("name", name);
			req.setAttribute("list", list);
			
			req.getRequestDispatcher("home.jsp").forward(req, res);
		    }
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}