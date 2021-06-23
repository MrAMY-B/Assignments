import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class InitContextParam extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res){
		
	try{
		res.setContentType("text/html");
		String ctxGroupName=getServletContext().getInitParameter("Group");
		String initCoderName =getServletConfig().getInitParameter("Coder");
		PrintWriter out=res.getWriter();
		out.print("<h1 style='text-align:center;'> Group Name : "+ctxGroupName+"</h1>");
		out.print("<h1 style='text-align:center;'> Coder Name : "+initCoderName+"</h1>");
	
	}catch(Exception e){ e.printStackTrace(); }
	
	}
}