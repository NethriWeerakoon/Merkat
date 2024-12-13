package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import classes.DBConnector;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
    String number = request.getParameter("number");
    String address = request.getParameter("address");
    String email = request.getParameter("email");
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
        
            String checkQuery = "SELECT COUNT(*) FROM seller WHERE username=?";
            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setString(1, username);
            ResultSet sellerResult = checkStmt.executeQuery();

            if (sellerResult.next() && sellerResult.getInt(1) > 0) {
                out.println("Username already exists for sellers. Choose a different username.");
                con.close();
                return;
            }

            checkQuery = "SELECT COUNT(*) FROM buyer WHERE username=?";
            checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setString(1, username);
            ResultSet buyerResult = checkStmt.executeQuery();

            if (buyerResult.next() && buyerResult.getInt(1) > 0) {
                out.println("Username already exists for buyers. Choose a different username.");
                con.close();
                return;
            }
        
        
        

        if (request.getParameter("button1") != null) {
            if (!fname.isEmpty() && !lname.isEmpty() && !number.isEmpty() && !address.isEmpty() &&
                !email.isEmpty() && !username.isEmpty() && !password.isEmpty()) {

                String query = "INSERT INTO seller (fname,lname,number,address,email,username,password) VALUES(?,?,?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);

                pstmt.setString(1, fname);
                pstmt.setString(2, lname);
                pstmt.setString(3, number);
                pstmt.setString(4, address);
                pstmt.setString(5, email);
                pstmt.setString(6, username);
                pstmt.setString(7, password);
                pstmt.executeUpdate();

                out.println("Data saved successfully!");
            } else {
                out.println("All the Field are required");
            }
        } else if (request.getParameter("button2") != null) {
            if (!fname.isEmpty() && !lname.isEmpty() && !number.isEmpty() && !address.isEmpty() &&
                !email.isEmpty() && !username.isEmpty() && !password.isEmpty()) {

                String query = "INSERT INTO buyer (fname,lname,number,address,email,username,password) VALUES(?,?,?,?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(query);

                pstmt.setString(1, fname);
                pstmt.setString(2, lname);
                pstmt.setString(3, number);
                pstmt.setString(4, address);
                pstmt.setString(5, email);
                pstmt.setString(6, username);
                pstmt.setString(7, password);
                pstmt.executeUpdate();

                out.println("Data saved successfully!");
            } else {
                out.println("All the Field are required");
            }
        }

        con.close();
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }

      out.write("\n");
      out.write("\n");
      out.write("\n");


    
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
//
//    String enteredUsername = request.getParameter("username");
//    String sellerquery = "SELECT COUNT(*) FROM seller WHERE username = ?";
//    String customerquery = "SELECT COUNT(*) FROM buyer WHERE username = ?";
//
//    // Check in the seller table
//    PreparedStatement sellerStatement = con.prepareStatement(sellerquery);
//    sellerStatement.setString(1, enteredUsername);
//    ResultSet sellerResultSet = sellerStatement.executeQuery();
//    sellerResultSet.next();
//    int sellerCount = sellerResultSet.getInt(1);
//
//// Check in the customer table
//    PreparedStatement customerStatement = con.prepareStatement(customerquery);
//    customerStatement.setString(1, enteredUsername);
//    ResultSet customerResultSet = customerStatement.executeQuery();
//    customerResultSet.next();
//    int customerCount = customerResultSet.getInt(1);
    

      out.write("\n");
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
      out.write("        <title>register</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Abyssinica+SIL&amp;display=swap\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/register.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("                                class=\"nav-link\"\n");
      out.write("                                href=\"index.jsp\"\n");
      out.write("                                style=\"font-weight: bold; padding: 8px\"\n");
      out.write("                                >Home</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("<!--                        <li class=\"nav-item\">\n");
      out.write("                            <a\n");
      out.write("                                class=\"nav-link nav-item\"\n");
      out.write("                                href=\"#\"\n");
      out.write("                                style=\"\n");
      out.write("                                font-weight: bold; /color: var(--bs-navbar-color);/\n");
      out.write("                                padding-left: 8px;\n");
      out.write("                                \"\n");
      out.write("                                >About Us</a\n");
      out.write("                            >\n");
      out.write("                        </li>-->\n");
      out.write("<!--                        <li class=\"nav-item\">\n");
      out.write("                            <div\n");
      out.write("                                class=\"nav-item dropdown\"\n");
      out.write("                                style=\"height: 40px; padding: 7px; padding-left: 0px\"\n");
      out.write("                                >\n");
      out.write("                                <a\n");
      out.write("                                    class=\"dropdown-toggle\"\n");
      out.write("                                    aria-expanded=\"false\"\n");
      out.write("                                    data-bs-toggle=\"dropdown\"\n");
      out.write("                                    href=\"#\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    height: 40px;\n");
      out.write("                                    width: 109.45px;\n");
      out.write("                                    color: var(--bs-navbar-color);\n");
      out.write("                                    font-weight: bold;\n");
      out.write("                                    padding: 8px;\n");
      out.write("                                    padding-left: 8px;\n");
      out.write("                                    margin-left: 0px;\n");
      out.write("                                    \"\n");
      out.write("                                    >Categories&nbsp;</a\n");
      out.write("                                >\n");
      out.write("                                <div class=\"dropdown-menu\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"#\">Electronics&nbsp;</a\n");
      out.write("                                    ><a class=\"dropdown-item\" href=\"#\">Sports &amp; Outdoor</a\n");
      out.write("                                    ><a class=\"dropdown-item\" href=\"#\">Babies &amp; Toys</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </li>-->\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"buyerlogin.jsp\" style=\"padding: 0px\"\n");
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
      out.write("                            <a class=\"nav-link\" href=\"buyerlogin.jsp\" style=\"padding: 0px\"\n");
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
      out.write("                        <li class=\"nav-item\"></li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a\n");
      out.write("                                class=\"nav-link active\"\n");
      out.write("                                href=\"Register.jsp\"\n");
      out.write("                                style=\"\n");
      out.write("                                color: var(--bs-navbar-color);\n");
      out.write("                                font-weight: bold;\n");
      out.write("                                width: 70px;\n");
      out.write("                                text-decoration: underline;\n");
      out.write("                                padding: 8px;\n");
      out.write("                                margin: 0px;\n");
      out.write("                                margin-right: 0px;\n");
      out.write("                                margin-left: 0px;\n");
      out.write("                                padding-right: 8px;\n");
      out.write("                                padding-left: 8px;\n");
      out.write("                                \"\n");
      out.write("                                >Register</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <p\n");
      out.write("                                style=\"\n");
      out.write("                                height: 40px;\n");
      out.write("                                width: 30px;\n");
      out.write("                                padding: 8px;\n");
      out.write("                                margin-bottom: 0px;\n");
      out.write("                                padding-left: 8px;\n");
      out.write("                                \"\n");
      out.write("                                >\n");
      out.write("                                or\n");
      out.write("                            </p>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a href=\"index.jsp\">\n");
      out.write("                            <button\n");
      out.write("                                class=\"btn btn-primary\"\n");
      out.write("                                type=\"button\"\n");
      out.write("                                style=\"\n");
      out.write("                                width: 70px;\n");
      out.write("                                height: 40px;\n");
      out.write("                                padding: 8px;\n");
      out.write("                                padding-right: 8px;\n");
      out.write("                                padding-top: 8px;\n");
      out.write("                                padding-bottom: 8px;\n");
      out.write("                                padding-left: 8px;\n");
      out.write("                                background: rgb(91, 97, 105);\n");
      out.write("                                color: rgb(255, 255, 255);\n");
      out.write("                                border-color: rgb(5, 9, 12);\n");
      out.write("                                \"\n");
      out.write("                                >\n");
      out.write("                                Login\n");
      out.write("                            </button>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- End: Navbar Right Links -->\n");
      out.write("        <form\n");
      out.write("            class=\"rg-form\"\n");
      out.write("            style=\"\n");
      out.write("            text-align: center;\n");
      out.write("            width: 350px;\n");
      out.write("            margin-bottom: 12px;\n");
      out.write("            margin-top: 12px;\n");
      out.write("            \"\n");
      out.write("            >\n");
      out.write("            <h2\n");
      out.write("                style=\"\n");
      out.write("                text-align: center;\n");
      out.write("                color: rgb(15, 95, 120);\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-family: 'Abyssinica SIL', serif;\n");
      out.write("                font-size: 30px;\n");
      out.write("                margin-bottom: 12px;\n");
      out.write("                \"\n");
      out.write("                >\n");
      out.write("                Registration form\n");
      out.write("            </h2>\n");
      out.write("            <div class=\"rf-input-container\" style=\"text-align: center; width: 350px\">\n");
      out.write("                <i\n");
      out.write("                    class=\"fa fa-user fa fa-user rf-icon\"\n");
      out.write("                    style=\"\n");
      out.write("                    --bs-body-bg: var(--bs-secondary-bg);\n");
      out.write("                    color: rgb(15, 95, 120);\n");
      out.write("                    background: var(--bs-body-bg);\n");
      out.write("                    border-top-color: var(--bs-gray-300);\n");
      out.write("                    text-align: center;\n");
      out.write("                    \"\n");
      out.write("                    ></i\n");
      out.write("                ><input\n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"text\"\n");
      out.write("                    placeholder=\"Firstname\"\n");
      out.write("                    name=\"fname\"\n");
      out.write("                    style=\"width: 300px; text-align: left\"\n");
      out.write("                    />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rf-input-container\" style=\"text-align: center; width: 350px\">\n");
      out.write("                <i\n");
      out.write("                    class=\"fa fa-user fa fa-user rf-icon\"\n");
      out.write("                    style=\"\n");
      out.write("                    --bs-body-bg: var(--bs-secondary-bg);\n");
      out.write("                    color: rgb(15, 95, 120);\n");
      out.write("                    background: var(--bs-body-bg);\n");
      out.write("                    border-top-color: var(--bs-gray-300);\n");
      out.write("                    text-align: center;\n");
      out.write("                    \"\n");
      out.write("                    ></i\n");
      out.write("                ><input\n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"text\"\n");
      out.write("                    placeholder=\"Lastname\"\n");
      out.write("                    name=\"lname\"\n");
      out.write("                    style=\"width: 300px; text-align: left\"\n");
      out.write("                    />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rf-input-container\" style=\"width: 350px\">\n");
      out.write("                <svg\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                    width=\"1em\"\n");
      out.write("                    height=\"1em\"\n");
      out.write("                    fill=\"currentColor\"\n");
      out.write("                    viewBox=\"0 0 16 16\"\n");
      out.write("                    class=\"bi bi-telephone-fill fa fa-envelope rf-icon\"\n");
      out.write("                    style=\"\n");
      out.write("                    color: rgb(15, 95, 120);\n");
      out.write("                    background: var(--bs-gray-300);\n");
      out.write("                    border-top-color: var(--bs-gray-300);\n");
      out.write("                    height: 46px;\n");
      out.write("                    padding: 14px;\n");
      out.write("                    \"\n");
      out.write("                    >\n");
      out.write("                <path\n");
      out.write("                    fill-rule=\"evenodd\"\n");
      out.write("                    d=\"M1.885.511a1.745 1.745 0 0 1 2.61.163L6.29 2.98c.329.423.445.974.315 1.494l-.547 2.19a.678.678 0 0 0 .178.643l2.457 2.457a.678.678 0 0 0 .644.178l2.189-.547a1.745 1.745 0 0 1 1.494.315l2.306 1.794c.829.645.905 1.87.163 2.611l-1.034 1.034c-.74.74-1.846 1.065-2.877.702a18.634 18.634 0 0 1-7.01-4.42 18.634 18.634 0 0 1-4.42-7.009c-.362-1.03-.037-2.137.703-2.877L1.885.511z\"\n");
      out.write("                    ></path></svg\n");
      out.write("                ><input\n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"text\"\n");
      out.write("                    placeholder=\"Mobile number\"\n");
      out.write("                    name=\"number\"\n");
      out.write("                    style=\"width: 300px\"\n");
      out.write("                    />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rf-input-container\" style=\"width: 350px\">\n");
      out.write("                <i\n");
      out.write("                    class=\"fa fa-envelope fa fa-envelope rf-icon\"\n");
      out.write("                    style=\"\n");
      out.write("                    color: rgb(15, 95, 120);\n");
      out.write("                    background: var(--bs-gray-300);\n");
      out.write("                    border-top-color: var(--bs-gray-300);\n");
      out.write("                    \"\n");
      out.write("                    ></i\n");
      out.write("                ><input\n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"text\"\n");
      out.write("                    placeholder=\"email\"\n");
      out.write("                    name=\"email\"\n");
      out.write("                    style=\"width: 300px\"\n");
      out.write("                    />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rf-input-container\" style=\"width: 350px\">\n");
      out.write("                <svg\n");
      out.write("                    xmlns=\"http://www.w3.org/2000/svg\"\n");
      out.write("                    width=\"1em\"\n");
      out.write("                    height=\"1em\"\n");
      out.write("                    viewBox=\"0 0 24 24\"\n");
      out.write("                    fill=\"none\"\n");
      out.write("                    class=\"fa fa-envelope rf-icon\"\n");
      out.write("                    style=\"\n");
      out.write("                    color: rgb(15, 95, 120);\n");
      out.write("                    background: var(--bs-gray-300);\n");
      out.write("                    border-top-color: var(--bs-gray-300);\n");
      out.write("                    height: 46px;\n");
      out.write("                    padding: 14px;\n");
      out.write("                    \"\n");
      out.write("                    >\n");
      out.write("                <path\n");
      out.write("                    fill-rule=\"evenodd\"\n");
      out.write("                    clip-rule=\"evenodd\"\n");
      out.write("                    d=\"M21 8.77217L14.0208 1.79299C12.8492 0.621414 10.9497 0.621413 9.77817 1.79299L3 8.57116V23.0858H10V17.0858C10 15.9812 10.8954 15.0858 12 15.0858C13.1046 15.0858 14 15.9812 14 17.0858V23.0858H21V8.77217ZM11.1924 3.2072L5 9.39959V21.0858H8V17.0858C8 14.8767 9.79086 13.0858 12 13.0858C14.2091 13.0858 16 14.8767 16 17.0858V21.0858H19V9.6006L12.6066 3.2072C12.2161 2.81668 11.5829 2.81668 11.1924 3.2072Z\"\n");
      out.write("                    fill=\"currentColor\"\n");
      out.write("                    ></path></svg\n");
      out.write("                ><input\n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"text\"\n");
      out.write("                    placeholder=\"Address\"\n");
      out.write("                    name=\"address\"\n");
      out.write("                    style=\"width: 300px\"\n");
      out.write("                    />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rf-input-container\" style=\"text-align: center; width: 350px\">\n");
      out.write("                <i\n");
      out.write("                    class=\"fa fa-user fa fa-user rf-icon\"\n");
      out.write("                    style=\"\n");
      out.write("                    --bs-body-bg: var(--bs-secondary-bg);\n");
      out.write("                    color: rgb(15, 95, 120);\n");
      out.write("                    background: var(--bs-body-bg);\n");
      out.write("                    border-top-color: var(--bs-gray-300);\n");
      out.write("                    text-align: center;\n");
      out.write("                    \"\n");
      out.write("                    ></i\n");
      out.write("                ><input\n");
      out.write("                    \n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"text\"\n");
      out.write("                    placeholder=\"Username\"\n");
      out.write("                    name=\"username\"\n");
      out.write("                    style=\"width: 300px; text-align: left\"\n");
      out.write("                    />\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"rf-input-container\" style=\"width: 350px\">\n");
      out.write("                <i\n");
      out.write("                    class=\"fa fa-key fa fa-key rf-icon\"\n");
      out.write("                    style=\"color: rgb(15, 95, 120); background: var(--bs-gray-300)\"\n");
      out.write("                    ></i\n");
      out.write("                ><input\n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"password\"\n");
      out.write("                    placeholder=\"Password\"\n");
      out.write("                    name=\"password\"\n");
      out.write("                    style=\"width: 300px\"\n");
      out.write("                    />\n");
      out.write("            </div>\n");
      out.write("<!--            <div class=\"rf-input-container\" style=\"width: 350px\">\n");
      out.write("                <i\n");
      out.write("                    class=\"fa fa-key fa fa-key rf-icon\"\n");
      out.write("                    style=\"color: rgb(15, 95, 120); background: var(--bs-gray-300)\"\n");
      out.write("                    ></i\n");
      out.write("                ><input\n");
      out.write("                    class=\"form-control rf-input-field\"\n");
      out.write("                    type=\"password\"\n");
      out.write("                    placeholder=\"Re-enter Password\"\n");
      out.write("                    name=\"repassword\"\n");
      out.write("                    style=\"width: 300px\"\n");
      out.write("                    />\n");
      out.write("            </div>-->\n");
      out.write("            <div>\n");
      out.write("                <button\n");
      out.write("                    class=\"btn btn-primary\"\n");
      out.write("                    type=\"Register\"\n");
      out.write("                    name=\"button1\"\n");
      out.write("                    style=\"\n");
      out.write("                    text-align: center;\n");
      out.write("                    background: rgb(15, 95, 120);\n");
      out.write("                    border-top-color: var(--bs-btn-disabled-color);\n");
      out.write("                    margin: 6px;\n");
      out.write("                    \"\n");
      out.write("                    >\n");
      out.write("                    Register as a seller</button\n");
      out.write("                ><button\n");
      out.write("                    class=\"btn btn-primary\"\n");
      out.write("                    type=\"Register\"\n");
      out.write("                    name=\"button2\"\n");
      out.write("                    style=\"\n");
      out.write("                    text-align: center;\n");
      out.write("                    background: rgb(15, 95, 120);\n");
      out.write("                    border-top-color: var(--bs-btn-disabled-color);\n");
      out.write("                    margin: 6px;\n");
      out.write("                    \"\n");
      out.write("                    >\n");
      out.write("                    Register as a buyer\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
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
