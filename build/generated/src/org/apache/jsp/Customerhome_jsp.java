package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Customerhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

////                            
//    String product_id = "";
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
//    // Execute the query
//    String query = "SELECT * FROM product";
//    PreparedStatement pstmt = con.prepareStatement(query);
//    ResultSet resultSet = pstmt.executeQuery();
//
      out.write('\n');

//// Get the session
//    HttpSession session = request.getSession(false);
//
//    // Invalidate the session if it exists
//    if (session != null) {
//        session.invalidate();
//    }
//
//    // Redirect the user to the login page
//    response.sendRedirect("login.jsp");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html data-bs-theme=\"light\" lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\"\n");
      out.write("            />\n");
      out.write("        <title>home-customer login</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Ephesis&amp;display=swap\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/customerhome.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Start: Navbar Right Links -->\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand d-flex align-items-center\" href=\"#\"\n");
      out.write("                   ><span\n");
      out.write("                        ><img src=\"img/logo.png\" style=\"width: 100px\" /></span></a\n");
      out.write("                ><button\n");
      out.write("                    data-bs-toggle=\"collapse\"\n");
      out.write("                    class=\"navbar-toggler\"\n");
      out.write("                    data-bs-target=\"#navcol-2\"\n");
      out.write("                    >\n");
      out.write("                    <span class=\"visually-hidden\">Toggle navigation</span\n");
      out.write("                    ><span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div\n");
      out.write("                    class=\"collapse navbar-collapse\"\n");
      out.write("                    id=\"navcol-2\"\n");
      out.write("                    style=\"width: 564px\"\n");
      out.write("                    >\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a\n");
      out.write("                                class=\"nav-link active\"\n");
      out.write("                                href=\"Customerhome.jsp\"\n");
      out.write("                                style=\"font-weight: bold; padding: 8px\"\n");
      out.write("                                >Home</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"addtocart.jsp\" class=\"nav-link\" style=\"padding: 0px\"\n");
      out.write("                               ><svg\n");
      out.write("                                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                    width=\"1em\"\n");
      out.write("                                    height=\"1em\"\n");
      out.write("                                    viewBox=\"0 0 24 24\"\n");
      out.write("                                    fill=\"none\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    font-size: 24px;\n");
      out.write("                                    height: 40px;\n");
      out.write("                                    width: 40px;\n");
      out.write("                                    padding: 6px;\n");
      out.write("                                    color: var(--bs-red);\n");
      out.write("                                    padding-left: 0px;\n");
      out.write("                                    margin-left: 0px;\n");
      out.write("                                    \"\n");
      out.write("                                    >\n");
      out.write("                                <path\n");
      out.write("                                    fill-rule=\"evenodd\"\n");
      out.write("                                    clip-rule=\"evenodd\"\n");
      out.write("                                    d=\"M5.79166 2H1V4H4.2184L6.9872 16.6776H7V17H20V16.7519L22.1932 7.09095L22.5308 6H6.6552L6.08485 3.38852L5.79166 2ZM19.9869 8H7.092L8.62081 15H18.3978L19.9869 8Z\"\n");
      out.write("                                    fill=\"currentColor\"\n");
      out.write("                                    ></path>\n");
      out.write("                                <path\n");
      out.write("                                    d=\"M10 22C11.1046 22 12 21.1046 12 20C12 18.8954 11.1046 18 10 18C8.89543 18 8 18.8954 8 20C8 21.1046 8.89543 22 10 22Z\"\n");
      out.write("                                    fill=\"currentColor\"\n");
      out.write("                                    ></path>\n");
      out.write("                                <path\n");
      out.write("                                    d=\"M19 20C19 21.1046 18.1046 22 17 22C15.8954 22 15 21.1046 15 20C15 18.8954 15.8954 18 17 18C18.1046 18 19 18.8954 19 20Z\"\n");
      out.write("                                    fill=\"currentColor\"\n");
      out.write("                                    ></path></svg\n");
      out.write("                                ></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li\n");
      out.write("                            class=\"nav-item\"\n");
      out.write("                            style=\"\n");
      out.write("                            padding: 0px;\n");
      out.write("                            padding-right: 0px;\n");
      out.write("                            width: 40px;\n");
      out.write("                            margin-right: 6px;\n");
      out.write("                            \"\n");
      out.write("                            >\n");
      out.write("                            <a class=\"nav-link\" href=\"Wishlist.jsp\" style=\"padding: 0px\"\n");
      out.write("                               ><svg\n");
      out.write("                                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                    width=\"1em\"\n");
      out.write("                                    height=\"1em\"\n");
      out.write("                                    viewBox=\"0 0 24 24\"\n");
      out.write("                                    fill=\"none\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    width: 40px;\n");
      out.write("                                    height: 40px;\n");
      out.write("                                    padding: 6px;\n");
      out.write("                                    color: var(--bs-pink);\n");
      out.write("                                    margin-right: 0px;\n");
      out.write("                                    padding-left: 0px;\n");
      out.write("                                    padding-right: 6px;\n");
      out.write("                                    margin-left: 0px;\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    \"\n");
      out.write("                                    >\n");
      out.write("                                <path\n");
      out.write("                                    fill-rule=\"evenodd\"\n");
      out.write("                                    clip-rule=\"evenodd\"\n");
      out.write("                                    d=\"M12.0122 5.57169L10.9252 4.48469C8.77734 2.33681 5.29493 2.33681 3.14705 4.48469C0.999162 6.63258 0.999162 10.115 3.14705 12.2629L11.9859 21.1017L11.9877 21.0999L12.014 21.1262L20.8528 12.2874C23.0007 10.1395 23.0007 6.65711 20.8528 4.50923C18.705 2.36134 15.2226 2.36134 13.0747 4.50923L12.0122 5.57169ZM11.9877 18.2715L16.9239 13.3352L18.3747 11.9342L18.3762 11.9356L19.4386 10.8732C20.8055 9.50635 20.8055 7.29028 19.4386 5.92344C18.0718 4.55661 15.8557 4.55661 14.4889 5.92344L12.0133 8.39904L12.006 8.3918L12.005 8.39287L9.51101 5.89891C8.14417 4.53207 5.92809 4.53207 4.56126 5.89891C3.19442 7.26574 3.19442 9.48182 4.56126 10.8487L7.10068 13.3881L7.10248 13.3863L11.9877 18.2715Z\"\n");
      out.write("                                    fill=\"currentColor\"\n");
      out.write("                                    ></path></svg\n");
      out.write("                                ></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"editcustomerprofile.jsp\" style=\"width: 40px; padding: 0px\"\n");
      out.write("                               ><svg\n");
      out.write("                                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                    width=\"1em\"\n");
      out.write("                                    height=\"1em\"\n");
      out.write("                                    viewBox=\"0 0 24 24\"\n");
      out.write("                                    fill=\"none\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    font-size: 30px;\n");
      out.write("                                    width: 40px;\n");
      out.write("                                    height: 40px;\n");
      out.write("                                    padding: 6px;\n");
      out.write("                                    padding-left: 0px;\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-right: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    \"\n");
      out.write("                                    >\n");
      out.write("                                <path\n");
      out.write("                                    fill-rule=\"evenodd\"\n");
      out.write("                                    clip-rule=\"evenodd\"\n");
      out.write("                                    d=\"M16 9C16 11.2091 14.2091 13 12 13C9.79086 13 8 11.2091 8 9C8 6.79086 9.79086 5 12 5C14.2091 5 16 6.79086 16 9ZM14 9C14 10.1046 13.1046 11 12 11C10.8954 11 10 10.1046 10 9C10 7.89543 10.8954 7 12 7C13.1046 7 14 7.89543 14 9Z\"\n");
      out.write("                                    fill=\"currentColor\"\n");
      out.write("                                    ></path>\n");
      out.write("                                <path\n");
      out.write("                                    fill-rule=\"evenodd\"\n");
      out.write("                                    clip-rule=\"evenodd\"\n");
      out.write("                                    d=\"M12 1C5.92487 1 1 5.92487 1 12C1 18.0751 5.92487 23 12 23C18.0751 23 23 18.0751 23 12C23 5.92487 18.0751 1 12 1ZM3 12C3 14.0902 3.71255 16.014 4.90798 17.5417C6.55245 15.3889 9.14627 14 12.0645 14C14.9448 14 17.5092 15.3531 19.1565 17.4583C20.313 15.9443 21 14.0524 21 12C21 7.02944 16.9706 3 12 3C7.02944 3 3 7.02944 3 12ZM12 21C9.84977 21 7.87565 20.2459 6.32767 18.9878C7.59352 17.1812 9.69106 16 12.0645 16C14.4084 16 16.4833 17.1521 17.7538 18.9209C16.1939 20.2191 14.1881 21 12 21Z\"\n");
      out.write("                                    fill=\"currentColor\"\n");
      out.write("                                    ></path></svg\n");
      out.write("                                ></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\" style=\"height: 40px\">\n");
      out.write("                            <a href=\"buyerlogin.jsp\">\n");
      out.write("                                <button\n");
      out.write("                                    class=\"btn btn-primary\"\n");
      out.write("                                    type=\"button\"\n");
      out.write("\n");
      out.write("                                    style=\"\n");
      out.write("                                    width: 70px;\n");
      out.write("                                    height: 40px;\n");
      out.write("                                    padding-right: 8px;\n");
      out.write("                                    padding-top: 8px;\n");
      out.write("                                    padding-bottom: 8px;\n");
      out.write("                                    padding-left: 8px;\n");
      out.write("                                    background: rgb(91, 97, 105);\n");
      out.write("                                    border-color: rgb(5, 9, 12);\n");
      out.write("                                    color: rgb(255, 255, 255);\n");
      out.write("                                    \"\n");
      out.write("                                    >\n");
      out.write("                                    Logout\n");
      out.write("\n");
      out.write("                                </button>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- End: Navbar Right Links -->\n");
      out.write("        <div\n");
      out.write("            style=\"\n");
      out.write("            background: var(--bs-dark-bg-subtle);\n");
      out.write("            margin-top: 6px;\n");
      out.write("            margin-bottom: 6px;\n");
      out.write("            padding-top: 0px;\n");
      out.write("            \"\n");
      out.write("            >\n");
      out.write("            <h1\n");
      out.write("                style=\"\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                margin-bottom: 0px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-family: Ephesis, serif;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                \"\n");
      out.write("                >\n");
      out.write("                Welcome to the realm of possibilities.\n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("        <div\n");
      out.write("            style=\"\n");
      out.write("            background: url('img/pxfuel%20(1).jpg') center / cover no-repeat;\n");
      out.write("            height: 440px;\n");
      out.write("            \"\n");
      out.write("            ></div>\n");
      out.write("        <div\n");
      out.write("            style=\"\n");
      out.write("            margin-bottom: 8px;\n");
      out.write("            padding-bottom: 6px;\n");
      out.write("            padding-top: 18px;\n");
      out.write("            margin-top: 50px;\n");
      out.write("            \"\n");
      out.write("            >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Start: Masonry gallery cards responsive -->\n");
      out.write("            <div style=\"background: var(--bs-body-color)\">\n");
      out.write("                <!-- Start: cards -->\n");
      out.write("                <div\n");
      out.write("                    class=\"row\"\n");
      out.write("                    data-masonry='{\"percentPosition\": true }'\n");
      out.write("                    style=\"\n");
      out.write("                    margin-right: 0px;\n");
      out.write("                    margin-left: 0px;\n");
      out.write("                    margin-top: 0px;\n");
      out.write("                    padding-top: 10px;\n");
      out.write("                    padding-bottom: 10px;\n");
      out.write("                    background: #ced4da;\n");
      out.write("                    \"\n");
      out.write("                    >\n");
      out.write("                    ");

                        String product_id = "";
                        
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
                        // Create a SQL statement
                        Statement statement = con.createStatement();
                        // Execute the query
                        String query = "SELECT * FROM product";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        ResultSet resultSet = statement.executeQuery(query);

                        while (resultSet.next()) {
                            String product_id1 = resultSet.getString("product_id");

                            String pname = resultSet.getString("pname");
                            double price = resultSet.getDouble("price");
                            


                    
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- Start: card-1 -->\n");
      out.write("                    <div class=\"col-sm-6 col-lg-4 mb-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- Start: card -->\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <picture type=\"\" srcset=\"\"\n");
      out.write("                                     ><img\n");
      out.write("                                    src=\"img/items/");
      out.print( resultSet.getString("image"));
      out.write("\"\n");
      out.write("                                    class=\"card-img-top p-3\"\n");
      out.write("                                    alt=\"\"\n");
      out.write("                                    style=\"border-radius: 24px; object-fit: cover\"\n");
      out.write("                                    />\n");
      out.write("                            </picture>\n");
      out.write("\n");
      out.write("                            <!-- Start: texto -->\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <a class=\"style1\" href=\"#\"\n");
      out.write("                                   ><h5 class=\"card-title\" style=\"font-family: Amethysta, serif; text-align: center\">\n");
      out.write("                                        ");

                                            String productName = resultSet.getString("pname");
                                            out.print(productName);
                                        
      out.write("\n");
      out.write("                                    </h5></a\n");
      out.write("                                >\n");
      out.write("                                <p\n");
      out.write("                                    class=\"card-text text-muted\"\n");
      out.write("                                    style=\"font-family: Amethysta, serif; text-align: center\"\n");
      out.write("                                    >\n");
      out.write("                                    <span style=\"color: rgb(92, 14, 94)\">Rs.");
 out.print(resultSet.getString("price"));  
      out.write("</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- End: texto -->\n");
      out.write("                            <div>\n");
      out.write("                                <div\n");
      out.write("                                    style=\"\n");
      out.write("                                    text-align: center;\n");
      out.write("                                    padding-right: 16px;\n");
      out.write("                                    padding-bottom: 10px;\n");
      out.write("                                    padding-left: 16px;\n");
      out.write("                                    \"\n");
      out.write("                                    >\n");
      out.write("\n");
      out.write("                                    ");

                                        
                                        out.println("<a href='order.jsp?pid=" + product_id1 + "' class='btn btn-primary' type='button' name='order' style=' padding-top: 10px; background: rgb(15, 95, 120); height: 45px; width: 100px; border-style: none; onclicked'>Buy Now</button></a>");
                                        
                                    
      out.write("\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("<!--                                        color: var(--bs-tertiary-bg);-->\n");
      out.write("                                        \n");
      out.write("                                        \n");
      out.write("                                   \n");
      out.write("                                </div>\n");
      out.write("                                <div\n");
      out.write("                                    style=\"\n");
      out.write("                                    text-align: center;\n");
      out.write("                                    margin-top: 0px;\n");
      out.write("                                    margin-right: 16px;\n");
      out.write("                                    margin-bottom: 16px;\n");
      out.write("                                    margin-left: 16px;\n");
      out.write("                                    height: 40px;\n");
      out.write("                                    \"\n");
      out.write("                                    >\n");
      out.write("                                    <div\n");
      out.write("                                        class=\"btn-group\"\n");
      out.write("                                        role=\"group\"\n");
      out.write("                                        style=\"width: 160px; height: 45px\"\n");
      out.write("                                        >\n");
      out.write("\n");
      out.write("                                        ");

//                                            out.println("<input type='hidden' name='addwishlist' value='" + product_id1 + "'>");
                                            out.println("<a href='cart.jsp?pid=" + product_id1 + "'><button class='btn btn-primary' type='submit' name='addcart' style='margin-left: 6px; height: 45px; width: 60px; background: rgb(21, 116, 146); margin-right: 6px; border-radius: 6px 0px 0px 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; border-bottom-left-radius: 6px; border-width: 0px; border-style: none; onclicked'>");
                                            out.println("<svg xmlns='http://www.w3.org/2000/svg' width='1em' height='1em' viewBox='0 0 24 24' fill='none' style='color: rgb(255, 255, 255); width: auto; height: 25px; font-size: 23px; margin: -1px;'>");
                                            out.println("<path fill-rule='evenodd' clip-rule='evenodd' d='M5.79166 2H1V4H4.2184L6.9872 16.6776H7V17H20V16.7519L22.1932 7.09095L22.5308 6H6.6552L6.08485 3.38852L5.79166 2ZM19.9869 8H7.092L8.62081 15H18.3978L19.9869 8Z M10 22C11.1046 22 12 21.1046 12 20C12 18.8954 11.1046 18 10 18C8.89543 18 8 18.8954 8 20C8 21.1046 8.89543 22 10 22Z M19 20C19 21.1046 18.1046 22 17 22C15.8954 22 15 21.1046 15 20C15 18.8954 15.8954 18 17 18C18.1046 18 19 18.8954 19 20Z' fill='currentColor'></path>");
                                            out.println("</svg>");
                                            out.println("</button></a>");

//                                            out.println("<input type='hidden' name='addwishlist' value='" + product_id1 + "'>");
                                            out.println("<a href='wish.jsp?pid=" + product_id1 + "'><button class='btn btn-primary' type='submit' name='addwishlist' style='margin-left: 6px; margin-top: 0px; height: 45px; width: 60px; background: rgb(21, 116, 146); color: var(--bs-red); font-size: 30px; margin-right: 6px; border-top-left-radius: 6px; border-bottom-left-radius: 6px; border-style: none; onclicked'>");
                                            out.println("<svg xmlns='http://www.w3.org/2000/svg' width='1em' height='1em' viewBox='0 0 24 24' fill='none' style='color: rgb(255, 255, 255); width: auto; height: auto; margin: 0px; padding: 0px; margin-bottom: 12px; margin-top: -6px;'>");
                                            out.println("<path fill-rule='evenodd' clip-rule='evenodd' d='M12.0122 5.57169L10.9252 4.48469C8.77734 2.33681 5.29493 2.33681 3.14705 4.48469C0.999162 6.63258 0.999162 10.115 3.14705 12.2629L11.9859 21.1017L11.9877 21.0999L12.014 21.1262L20.8528 12.2874C23.0007 10.1395 23.0007 6.65711 20.8528 4.50923C18.705 2.36134 15.2226 2.36134 13.0747 4.50923L12.0122 5.57169ZM11.9877 18.2715L16.9239 13.3352L18.3747 11.9342L18.3762 11.9356L19.4386 10.8732C20.8055 9.50635 20.8055 7.29028 19.4386 5.92344C18.0718 4.55661 15.8557 4.55661 14.4889 5.92344L12.0133 8.39904L12.006 8.3918L12.005 8.39287L9.51101 5.89891C8.14417 4.53207 5.92809 4.53207 4.56126 5.89891C3.19442 7.26574 3.19442 9.48182 4.56126 10.8487L7.10068 13.3881L7.10248 13.3863L11.9877 18.2715Z' fill='currentColor'></path>");
                                            out.println("</svg>");
                                            out.println("</button></a>");


                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- End: card -->\n");
      out.write("                    </div>\n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- End: cards -->\n");
      out.write("                <script\n");
      out.write("                    async=\"\"\n");
      out.write("                    src=\"https://cdnjs.cloudflare.com/ajax/libs/masonry/4.2.2/masonry.pkgd.min.js\"\n");
      out.write("                    integrity=\"sha384-GNFwBvfVxBkLMJpYMOABq3c+d3KnQxudP/mGPkzpZSTYykLBNsZEnG2D9G/X/+7D\"\n");
      out.write("                    crossorigin=\"anonymous\"\n");
      out.write("                ></script>\n");
      out.write("            </div>\n");
      out.write("            <!-- End: Masonry gallery cards responsive -->\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <!-- Start: Footer Basic -->\n");
      out.write("            <footer class=\"text-center\">\n");
      out.write("                <div class=\"container text-muted py-4 py-lg-5\">\n");
      out.write("                    <ul class=\"list-inline\">\n");
      out.write("                        <li class=\"list-inline-item me-4\">\n");
      out.write("                            <a class=\"link-secondary\" href=\"#\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-inline-item me-4\">\n");
      out.write("                            <a class=\"link-secondary\" href=\"#\">About Us</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-inline-item\">\n");
      out.write("                            <a class=\"link-secondary\" href=\"#\">Contact Us</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"list-inline\">\n");
      out.write("                        <li class=\"list-inline-item me-4\">\n");
      out.write("                            <svg\n");
      out.write("                                xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                width=\"1em\"\n");
      out.write("                                height=\"1em\"\n");
      out.write("                                fill=\"currentColor\"\n");
      out.write("                                viewBox=\"0 0 16 16\"\n");
      out.write("                                class=\"bi bi-facebook\"\n");
      out.write("                                >\n");
      out.write("                            <path\n");
      out.write("                                d=\"M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z\"\n");
      out.write("                                ></path>\n");
      out.write("                            </svg>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-inline-item me-4\">\n");
      out.write("                            <svg\n");
      out.write("                                xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                width=\"1em\"\n");
      out.write("                                height=\"1em\"\n");
      out.write("                                fill=\"currentColor\"\n");
      out.write("                                viewBox=\"0 0 16 16\"\n");
      out.write("                                class=\"bi bi-twitter\"\n");
      out.write("                                >\n");
      out.write("                            <path\n");
      out.write("                                d=\"M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z\"\n");
      out.write("                                ></path>\n");
      out.write("                            </svg>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"list-inline-item\">\n");
      out.write("                            <svg\n");
      out.write("                                xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                                width=\"1em\"\n");
      out.write("                                height=\"1em\"\n");
      out.write("                                fill=\"currentColor\"\n");
      out.write("                                viewBox=\"0 0 16 16\"\n");
      out.write("                                class=\"bi bi-instagram\"\n");
      out.write("                                >\n");
      out.write("                            <path\n");
      out.write("                                d=\"M8 0C5.829 0 5.556.01 4.703.048 3.85.088 3.269.222 2.76.42a3.917 3.917 0 0 0-1.417.923A3.927 3.927 0 0 0 .42 2.76C.222 3.268.087 3.85.048 4.7.01 5.555 0 5.827 0 8.001c0 2.172.01 2.444.048 3.297.04.852.174 1.433.372 1.942.205.526.478.972.923 1.417.444.445.89.719 1.416.923.51.198 1.09.333 1.942.372C5.555 15.99 5.827 16 8 16s2.444-.01 3.298-.048c.851-.04 1.434-.174 1.943-.372a3.916 3.916 0 0 0 1.416-.923c.445-.445.718-.891.923-1.417.197-.509.332-1.09.372-1.942C15.99 10.445 16 10.173 16 8s-.01-2.445-.048-3.299c-.04-.851-.175-1.433-.372-1.941a3.926 3.926 0 0 0-.923-1.417A3.911 3.911 0 0 0 13.24.42c-.51-.198-1.092-.333-1.943-.372C10.443.01 10.172 0 7.998 0h.003zm-.717 1.442h.718c2.136 0 2.389.007 3.232.046.78.035 1.204.166 1.486.275.373.145.64.319.92.599.28.28.453.546.598.92.11.281.24.705.275 1.485.039.843.047 1.096.047 3.231s-.008 2.389-.047 3.232c-.035.78-.166 1.203-.275 1.485a2.47 2.47 0 0 1-.599.919c-.28.28-.546.453-.92.598-.28.11-.704.24-1.485.276-.843.038-1.096.047-3.232.047s-2.39-.009-3.233-.047c-.78-.036-1.203-.166-1.485-.276a2.478 2.478 0 0 1-.92-.598 2.48 2.48 0 0 1-.6-.92c-.109-.281-.24-.705-.275-1.485-.038-.843-.046-1.096-.046-3.233 0-2.136.008-2.388.046-3.231.036-.78.166-1.204.276-1.486.145-.373.319-.64.599-.92.28-.28.546-.453.92-.598.282-.11.705-.24 1.485-.276.738-.034 1.024-.044 2.515-.045v.002zm4.988 1.328a.96.96 0 1 0 0 1.92.96.96 0 0 0 0-1.92zm-4.27 1.122a4.109 4.109 0 1 0 0 8.217 4.109 4.109 0 0 0 0-8.217zm0 1.441a2.667 2.667 0 1 1 0 5.334 2.667 2.667 0 0 1 0-5.334z\"\n");
      out.write("                                ></path>\n");
      out.write("                            </svg>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p class=\"mb-0\">Copyright © 2023 Mercat</p>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- End: Footer Basic -->\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
