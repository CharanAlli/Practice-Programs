import java.io.*;
import javax.servlet.*;
public class FirstServlet implements Servlet
{
       static 
           {
              System.out.println("Servlet loading");
            }
       public FirstServlet()
           {
             System.out.println("Servlet Instantiation");
           }
      public void init(ServletConfig config) throws ServletException
           {
              System.out.println("init method");
            }
        public void service(ServletRequest req,ServletResponse resp)throws ServletException,IOException
{
                 PrintWriter out=resp.getWriter();
                 out.println("<html><body><h1> Welcome to Mysite </h1></body></html>");
                 System.out.println("Service method");
               }
        public void destroy()
              {
                 System.out.println("Destroy method");
               }
         public ServletConfig getServletConfig()
              {
                   return null;
               }
         public String getServletInfo()
              {
                    return null; 
               }
}
