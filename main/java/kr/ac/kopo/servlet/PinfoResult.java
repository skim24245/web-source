package kr.ac.kopo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
/*import javax.servlet.annotation.WebServlet;*/
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*@WebServlet("/pinfoResult")*/
public class PinfoResult extends HttpServlet {

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() : 최초 한번만 실행되는 메소드입니다");
	}

	@Override
		public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");	
			String name =request.getParameter("name");
			String id = request.getParameter("id");
			String pwd = request.getParameter("pwd");
			String gender =request.getParameter("gender");
			String job=request.getParameter("job");
			String notice = request.getParameter("notice");
			String ad =request.getParameter("ad");
			String delievery =request.getParameter("delievery");
			
	
			
			
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("   <head>");
			out.println("       <title>개인 정보 출력</title>");
			out.println("    </head>");
			out.println("    <body>");
			out.println("		<h2>개인 정보 출력</h2>");	
			out.println("   이름 :" + name + "<br>");
			out.println("  	아이디:  " +id+ "<br>");
			out.println("  	암호 :  " + pwd+ "<br>");
			out.println("  	성별 :  " + gender+ "<br>");
			
			
			out.println("  	공지메일 :  ");
			if(notice !=null ) {
				out.println("받음");
			}else {
				out.println("받지않음");
				}
			out.println("<br>");
			
			
			out.println("  	광고메일 :  ");
			if(ad !=null ) {
				out.println("받음");
			}else {
				out.println("받지않음");
			}
			out.println("<br>");
			
			
			out.println("  	배송 확인 메일 :  ");
			if(delievery !=null ) {
				out.println("받음");
			}else {
				out.println("받지않음");
			}
			out.println("<br>");
			
		
			out.println("  	직업 :  " + job + "<br>");
			out.println("     </body>");
			out.println("</html>");
	}
			
		@Override public void destroy() {
				  System.out.println("\t\t\t\t\tdestory()..."); 
				 
			
		}
}
