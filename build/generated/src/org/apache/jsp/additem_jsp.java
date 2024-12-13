package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class additem_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    
    String product_id = request.getParameter("product_id");
    String pname = request.getParameter("pname");
    String price = request.getParameter("price");
    String quantity = request.getParameter("quantity");
    String description = request.getParameter("description");
    
    System.out.println("product_id=>" +product_id);
    
    if (product_id != null && !product_id.isEmpty()) {
        String query = "SELECT pname, price, quantity, description FROM product WHERE product_id = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");

            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, product_id);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                product_id = resultSet.getString("product_id");
                pname = resultSet.getString("pname");
                price = resultSet.getString("price");
                quantity = resultSet.getString("quantity");
                description = resultSet.getString("description");
            }

            resultSet.close();
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    String product_id = "";
//    String pname = "";
//    String price = "";
//    String quantity = "";
//    String description = "";
//
//    Class.forName("com.mysql.jdbc.Driver");
//    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
//
//    if (product_id != null) {
//        String query = "SELECT product_id, pname, price, quantity, description FROM product WHERE product_id = ?";
//        PreparedStatement preparedStatement = con.prepareStatement(query);
//        preparedStatement.setString(1, product_id.toString());
//        
//        
//
//        ResultSet resultSet = preparedStatement.executeQuery();
//
//        if (resultSet.next()) {
//            // Successful login
//            //int buyer_id = resultSet.getInt("buyer_id");
//            product_id = resultSet.getString("product_id");
//            pname = resultSet.getString("pname");
//            price = resultSet.getString("price");
//            quantity = resultSet.getString("quantity");
//            description = resultSet.getString("description");
//
//        }
//
//        preparedStatement.close();
//    }


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
      out.write("        <title>manage product</title>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Akaya+Kanadaka&amp;display=swap\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Alata&amp;display=swap\"\n");
      out.write("            />\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Amethysta&amp;display=swap\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"styles/additem.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background: rgb(255, 255, 255)\">\n");
      out.write("        <!-- Start: Navbar Right Links -->\n");
      out.write("        <nav class=\"navbar navbar-expand-md bg-body py-3\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a class=\"navbar-brand d-flex align-items-center\" href=\"#\"\n");
      out.write("                   ><span\n");
      out.write("                        ><img src=\"img/logo.png\" style=\"width: 100px\" /></span></a\n");
      out.write("                ><button\n");
      out.write("                    data-bs-toggle=\"collapse\"\n");
      out.write("                    class=\"navbar-toggler\"\n");
      out.write("                    data-bs-target=\"#navcol-1\"\n");
      out.write("                    >\n");
      out.write("                    <span class=\"visually-hidden\">Toggle navigation</span\n");
      out.write("                    ><span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div\n");
      out.write("                    class=\"collapse navbar-collapse\"\n");
      out.write("                    id=\"navcol-1\"\n");
      out.write("                    style=\"width: 564px\"\n");
      out.write("                    >\n");
      out.write("                    <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a\n");
      out.write("                                class=\"nav-link\"\n");
      out.write("                                href=\"#\"\n");
      out.write("                                style=\"font-weight: bold; padding: 8px\"\n");
      out.write("                                >Home</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a\n");
      out.write("                                class=\"nav-link nav-item\"\n");
      out.write("                                href=\"#\"\n");
      out.write("                                style=\"\n");
      out.write("                                font-weight: bold; /*color: var(--bs-navbar-color);*/\n");
      out.write("                                padding-left: 8px;\n");
      out.write("                                \"\n");
      out.write("                                >About Us</a\n");
      out.write("                            >\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\" style=\"width: 40px; padding: 0px\"\n");
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
      out.write("                                    padding: 6px; /*color: var(--bs-navbar-color);*/\n");
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
      out.write("                            <button\n");
      out.write("                                class=\"btn btn-primary\"\n");
      out.write("                                type=\"button\"\n");
      out.write("                                style=\"\n");
      out.write("                                width: 70px;\n");
      out.write("                                height: 40px;\n");
      out.write("                                padding-right: 8px;\n");
      out.write("                                padding-top: 8px;\n");
      out.write("                                padding-bottom: 8px;\n");
      out.write("                                padding-left: 8px;\n");
      out.write("                                background: rgb(91, 97, 105);\n");
      out.write("                                border-color: rgb(5, 9, 12);\n");
      out.write("                                color: rgb(255, 255, 255);\n");
      out.write("                                \"\n");
      out.write("                                >\n");
      out.write("                                Logout\n");
      out.write("                            </button>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- End: Navbar Right Links -->\n");
      out.write("        <div\n");
      out.write("            style=\"\n");
      out.write("            background: rgb(149, 125, 64);\n");
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
      out.write("                font-family: 'Akaya Kanadaka', serif;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                font-size: 42px;\n");
      out.write("                \"\n");
      out.write("                >\n");
      out.write("                Add your own products here...\n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("        <div\n");
      out.write("            style=\"\n");
      out.write("            height: 440px;\n");
      out.write("            background: url('img/5567.jpg') center / cover no-repeat;\n");
      out.write("            \"\n");
      out.write("            ></div>\n");
      out.write("        <div\n");
      out.write("            style=\"\n");
      out.write("            margin-top: 12px;\n");
      out.write("            margin-bottom: 12px;\n");
      out.write("            text-align: center;\n");
      out.write("            background: #ffffff;\n");
      out.write("            \"\n");
      out.write("            >\n");
      out.write("            <h1 style=\"font-family: Alata, sans-serif; color: rgb(91, 88, 69)\">\n");
      out.write("                Fill out your product details\n");
      out.write("            </h1>\n");
      out.write("        </div>\n");
      out.write("        <div\n");
      out.write("            style=\"\n");
      out.write("            background: #a8b8bc;\n");
      out.write("            margin-right: 6px;\n");
      out.write("            margin-left: 6px;\n");
      out.write("            margin-bottom: 6px;\n");
      out.write("            height: auto;\n");
      out.write("            margin-top: 6px;\n");
      out.write("            \"\n");
      out.write("            >\n");
      out.write("            <!-- Start: Pretty Registration Form -->\n");
      out.write("            <div\n");
      out.write("                class=\"row register-form\"\n");
      out.write("                style=\"margin-right: 0px; margin-left: 0px; height: auto\"\n");
      out.write("                >\n");
      out.write("                <div\n");
      out.write("                    class=\"col-md-8 offset-md-2\"\n");
      out.write("                    style=\"padding-top: 12px; padding-bottom: 12px; height: auto\"\n");
      out.write("                    >\n");
      out.write("                    <form\n");
      out.write("                        action=\"additem\" method=\"POST\" enctype=\"multipart/form-data\"\n");
      out.write("                        class=\"custom-form\"\n");
      out.write("                        style=\"\n");
      out.write("                        padding: 12px;\n");
      out.write("                        margin: 40px;\n");
      out.write("                        margin-top: 40px;\n");
      out.write("                        margin-right: 40px;\n");
      out.write("                        margin-bottom: 40px;\n");
      out.write("                        margin-left: 40px;\n");
      out.write("                        padding-top: 60px;\n");
      out.write("                        padding-bottom: 60px;\n");
      out.write("                        height: auto;\n");
      out.write("                        \"\n");
      out.write("                        >\n");
      out.write("                        <div\n");
      out.write("                            class=\"row form-group\"\n");
      out.write("                            style=\"margin-right: 0px; margin-left: 0px\"\n");
      out.write("                            >\n");
      out.write("                            <div\n");
      out.write("                                class=\"col-sm-4 label-column\"\n");
      out.write("                                style=\"padding-right: 12px; height: 42px\"\n");
      out.write("                                >\n");
      out.write("                                <label\n");
      out.write("                                    class=\"col-form-label\"\n");
      out.write("                                    for=\"name-input-field\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    width: 117.562px;\n");
      out.write("                                    \"\n");
      out.write("                                    >Product Category</label\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                            <div\n");
      out.write("                                class=\"col-sm-6 input-column\"\n");
      out.write("                                style=\"padding-right: 0px; padding-left: 12px\"\n");
      out.write("                                >\n");
      out.write("                                <div class=\"dropdown\" style=\"width: 400px\">\n");
      out.write("\n");
      out.write("                                    <select style=\"width: 220px; height: 35px\" id=\"category\" name=\"category\">\n");
      out.write("                                        <option value=\"Babies\">Babies</option>\n");
      out.write("                                        <option value=\"Electronics\">Electronics</option>\n");
      out.write("                                        <option value=\"Sports\">Sports &amp; Outdoor</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div\n");
      out.write("                            class=\"row form-group\"\n");
      out.write("                            style=\"margin-right: 0px; margin-left: 0px\"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"col-sm-4 label-column\" style=\"height: 42px\">\n");
      out.write("                                <label\n");
      out.write("                                    class=\"col-form-label\"\n");
      out.write("                                    for=\"name-input-field\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    text-align: justify;\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    \"\n");
      out.write("                                    >Product name</label\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 input-column\">\n");
      out.write("                                <input class=\"form-control\" type=\"text\" value=\"");
      out.print( pname);
      out.write("\" name=\"pname\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div\n");
      out.write("                            class=\"row form-group\"\n");
      out.write("                            style=\"margin-right: 0px; margin-left: 0px\"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"col-sm-4 label-column\">\n");
      out.write("                                <label\n");
      out.write("                                    class=\"col-form-label\"\n");
      out.write("                                    for=\"price\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    text-align: justify;\n");
      out.write("                                    \"\n");
      out.write("                                    >Price</label\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 input-column\">\n");
      out.write("                                <input class=\"form-control\" type=\"number\" value=\"");
      out.print( price);
      out.write("\" name=\"price\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div\n");
      out.write("                            class=\"row form-group\"\n");
      out.write("                            style=\"margin-right: 0px; margin-left: 0px\"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"col-sm-4 label-column\">\n");
      out.write("                                <label\n");
      out.write("                                    class=\"col-form-label\"\n");
      out.write("                                    for=\"email-input-field\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    text-align: justify;\n");
      out.write("                                    \"\n");
      out.write("                                    >Quantity</label\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 input-column\">\n");
      out.write("                                <input class=\"form-control\" type=\"number\" value=\"");
      out.print( quantity);
      out.write("\" name=\"quantity\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div\n");
      out.write("                            class=\"row form-group\"\n");
      out.write("                            style=\"margin-right: 0px; margin-left: 0px; height: auto\"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"col-sm-4 label-column\">\n");
      out.write("                                <label\n");
      out.write("                                    class=\"col-form-label\"\n");
      out.write("                                    for=\"pawssword-input-field\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    text-align: justify;\n");
      out.write("                                    \"\n");
      out.write("                                    >Description</label\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 input-column\">\n");
      out.write("                                <textarea class=\"form-control\" name=\"description\" value=\"");
      out.print( description);
      out.write("\" style=\"height: auto\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div\n");
      out.write("                            class=\"row form-group\"\n");
      out.write("                            style=\"margin-right: 0px; margin-left: 0px\"\n");
      out.write("                            >\n");
      out.write("                            <div class=\"col-sm-4 label-column\">\n");
      out.write("                                <label\n");
      out.write("                                    class=\"col-form-label\"\n");
      out.write("                                    for=\"repeat-pawssword-input-field\"\n");
      out.write("                                    style=\"\n");
      out.write("                                    padding-top: 6px;\n");
      out.write("                                    padding-bottom: 6px;\n");
      out.write("                                    text-align: justify;\n");
      out.write("                                    \"\n");
      out.write("                                    >Product Image</label\n");
      out.write("                                >\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6 input-column\">\n");
      out.write("                                <input class=\"form-control\" type=\"file\" name=\"image\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div style=\"height: 42px\">\n");
      out.write("                            <button\n");
      out.write("                                class=\"btn btn-primary\"\n");
      out.write("                                type=\"submit\"\n");
      out.write("                                name=\"add\"\n");
      out.write("                                style=\"\n");
      out.write("                                text-align: center;\n");
      out.write("                                background: rgb(15, 95, 120);\n");
      out.write("                                border-top-color: var(--bs-btn-disabled-color);\n");
      out.write("                                width: 140px;\n");
      out.write("                                \"\n");
      out.write("                                >\n");
      out.write("                                Add product</button\n");
      out.write("                            ><button\n");
      out.write("                                class=\"btn btn-primary\"\n");
      out.write("                                type=\"submit\"\n");
      out.write("                                name=\"update\"\n");
      out.write("                                style=\"\n");
      out.write("\n");
      out.write("                                text-align: center;\n");
      out.write("                                background: rgb(15, 95, 120);\n");
      out.write("                                border-top-color: var(--bs-btn-disabled-color);\n");
      out.write("                                width: 140px;\n");
      out.write("                                margin-right: 0px;\n");
      out.write("                                margin-left: 12px;\n");
      out.write("                                \"\n");
      out.write("                                >\n");
      out.write("                                Update product\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- End: Pretty Registration Form -->\n");
      out.write("        </div>\n");
      out.write("        <div style=\"background: #ffffff\">\n");
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
      out.write("</html>\n");
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
