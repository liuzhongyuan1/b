package Com.jq;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Zuoye
 */
public class Zuoye extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Zuoye() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.setCharacterEncoding("utf-8");
		
	    //getServletConfig()方法返回一个ServletConfig对象,该对象中包含servlet启动配置信息
		ServletConfig config=this.getServletConfig();//拿到init方法中的ServletConfig对象
		//String str=config.getInitParameter("food4");
		  Enumeration<String> str1=config.getInitParameterNames();
		   while(str1.hasMoreElements()){
			   String name=str1.nextElement();
			   String values=config.getInitParameter(name);
			   PrintWriter out =response .getWriter();//打印流
			    out.println("我想吃："+values);
			    out.println("刘忠园aaaaaaaaaaaaaaaaaa");
		   }
			   
	   
	} 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
