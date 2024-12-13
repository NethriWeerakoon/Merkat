package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class orderfinal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    double subtotalprice = Double.parseDouble(request.getParameter("subTotalPrice"));
    double totalprice = Double.parseDouble(request.getParameter("totalPrice"));
    
    System.out.println("stp"+subtotalprice);
    System.out.println("tp"+totalprice);
//                                subTotalPrice = request.getParameter("subTotalPrice");
//                                totalPrice = request.getParameter("totalPrice");

    if (request.getParameter("orderbutton") != null) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
            Statement statement = con.createStatement();
            String Query = "INSERT INTO orders (subtotalprice,totalprice) VALUES (?,?)";
            PreparedStatement pstmt2 = con.prepareStatement(Query);
            pstmt2.setDouble(1, subtotalprice);
            pstmt2.setDouble(2, totalprice);
            int a = pstmt2.executeUpdate();

            if (a > 0) {
                response.sendRedirect("addtocart.jsp");
            }

            // Refresh the page to reflect the updated data
            response.sendRedirect("Sellerdashboard.jsp");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
