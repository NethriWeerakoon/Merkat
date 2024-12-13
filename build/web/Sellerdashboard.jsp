<%-- 
    Document   : Sellerdashboard
    Created on : Aug 2, 2023, 1:19:02 AM
    Author     : Kavindu
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html data-bs-theme="light" lang="en">
    <head>
        <meta charset="utf-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0, shrink-to-fit=no"
            />
        <title>SellerDashboard</title>
        <link
            rel="stylesheet"
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
            />
        <link
            rel="stylesheet"
            href="https://fonts.googleapis.com/css?family=Acme&amp;display=swap"
            />
        <link
            rel="stylesheet"
            href="https://use.fontawesome.com/releases/v5.12.0/css/all.css"
            />
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"
            />
        <link rel="stylesheet" href="assets/fonts/fontawesome5-overrides.min.css" />
        <link rel="stylesheet" href="styles/sellerdashboard.css" />
    </head>
    <body style="background: var(--bs-dark-bg-subtle)">
        <!-- Start: Navbar Right Links -->
        <nav class="navbar navbar-expand-md bg-body py-3">
            <div class="container">
                <a class="navbar-brand d-flex align-items-center" href="#"
                   ><span
                        ><img src="img/logo.png" style="width: 100px" /></span></a
                ><button
                    data-bs-toggle="collapse"
                    class="navbar-toggler"
                    data-bs-target="#navcol-2"
                    >
                    <span class="visually-hidden">Toggle navigation</span
                    ><span class="navbar-toggler-icon"></span>
                </button>
                <div
                    class="collapse navbar-collapse"
                    id="navcol-2"
                    style="width: 564px"
                    >
                    <ul class="navbar-nav ms-auto">
                        <li class="nav-item">
                            <a
                                class="nav-link active"
                                href="Sellerdashboard.jsp"
                                style="font-weight: bold; padding: 8px"
                                >Home</a
                            >
                        </li>
                        
                        <li class="nav-item">
                            <a class="nav-link" href="editsellerprofile.jsp" style="width: 40px; padding: 0px"
                               ><svg
                                    xmlns="http://www.w3.org/2000/svg"
                                    width="1em"
                                    height="1em"
                                    viewBox="0 0 24 24"
                                    fill="none"
                                    style="
                                    font-size: 30px;
                                    width: 40px;
                                    height: 40px;
                                    padding: 6px; /*color: var(--bs-navbar-color);*/
                                    padding-left: 0px;
                                    padding-top: 6px;
                                    padding-right: 6px;
                                    padding-bottom: 6px;
                                    "
                                    >
                                <path
                                    fill-rule="evenodd"
                                    clip-rule="evenodd"
                                    d="M16 9C16 11.2091 14.2091 13 12 13C9.79086 13 8 11.2091 8 9C8 6.79086 9.79086 5 12 5C14.2091 5 16 6.79086 16 9ZM14 9C14 10.1046 13.1046 11 12 11C10.8954 11 10 10.1046 10 9C10 7.89543 10.8954 7 12 7C13.1046 7 14 7.89543 14 9Z"
                                    fill="currentColor"
                                    ></path>
                                <path
                                    fill-rule="evenodd"
                                    clip-rule="evenodd"
                                    d="M12 1C5.92487 1 1 5.92487 1 12C1 18.0751 5.92487 23 12 23C18.0751 23 23 18.0751 23 12C23 5.92487 18.0751 1 12 1ZM3 12C3 14.0902 3.71255 16.014 4.90798 17.5417C6.55245 15.3889 9.14627 14 12.0645 14C14.9448 14 17.5092 15.3531 19.1565 17.4583C20.313 15.9443 21 14.0524 21 12C21 7.02944 16.9706 3 12 3C7.02944 3 3 7.02944 3 12ZM12 21C9.84977 21 7.87565 20.2459 6.32767 18.9878C7.59352 17.1812 9.69106 16 12.0645 16C14.4084 16 16.4833 17.1521 17.7538 18.9209C16.1939 20.2191 14.1881 21 12 21Z"
                                    fill="currentColor"
                                    ></path></svg
                                ></a>
                        </li>
                        <li class="nav-item" style="height: 40px">
                            <a href="index.jsp">
                                <button
                                class="btn btn-primary"
                                type="button"
                                style="
                                width: 70px;
                                height: 40px;
                                padding-right: 8px;
                                padding-top: 8px;
                                padding-bottom: 8px;
                                padding-left: 8px;
                                background: rgb(91, 97, 105);
                                border-color: rgb(5, 9, 12);
                                color: rgb(255, 255, 255);
                                "
                                >
                                Logout
                            </button>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <!-- End: Navbar Right Links -->
        <div
            style="
            text-align: center;
            height: 45px;
            margin: 0px;
            margin-top: 12px;
            margin-right: 0px;
            padding-top: 0px;
            margin-bottom: 12px;
            padding-bottom: 0px;
            "
            >
            <button
                class="btn btn-primary"
                type="button"
                onclick="document.location = 'additem.jsp'"
                style="background: rgb(15, 95, 120); height: 40px"
                >
                Add items to Sell
            </button>
        </div>
        <div style="width: auto; height: auto">
            <div
                class="table-responsive"
                style="
                width: auto;
                margin-top: 10px;
                margin-bottom: 200px;
                margin-right: 10px;
                margin-left: 10px;
                padding-top: 8px;
                padding-right: 8px;
                padding-bottom: 8px;
                padding-left: 8px;
                height: auto;
                font-size: 16px;
                text-align: left;
                "
                >
                <table class="table">
                    <thead>
                        <tr>
                            <th>Product Id</th>
                            <th>Product Name</th>
                            <th>Price</th>
                            <th>Quantity</th>
                            <th>Edit/Delete</th>
                            <!--              <th></th>-->
                        </tr>
                    </thead>
                    <tbody>

                        <%
//                            

                            try {
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
                                // Create a SQL statement
                                Statement statement = con.createStatement();
                                // Execute the query
                                String query = "SELECT product_id, pname, price, quantity FROM product";
                                ResultSet resultSet = statement.executeQuery(query);

                                // Loop through the results and generate table rows
                                while (resultSet.next()) {
                                    int product_id = resultSet.getInt("product_id");
                                    String pname = resultSet.getString("pname");
                                    double price = resultSet.getDouble("price");
                                    int quantity = resultSet.getInt("quantity");

                                    out.println("<tr>");
                                    out.println("<td>" + product_id + "</td>");
                                    out.println("<td>" + pname + "</td>");
                                    out.println("<td>" + price + "</td>");
                                    out.println("<td>" + quantity + "</td>");
                                    out.println("<td>");
                                    out.println("<form method='post' action=''>");

                                    out.println("<input type='hidden' name='product_id' value='" + product_id + "'>");
//                                    out.println("<input type='submit' class='btn btn-primary' style=' background-color: rgb(54, 118, 158); padding-top: 4px; padding-bottom: 4px; border:none; padding-right: 12px; color: white; border-radius: 6px 0px 0px 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; width: auto;' name='edit' value='Edit'>");
//                                            out.println("<a href='additem.jsp?' class='btn btn-primary' style='background-color: rgb(54, 118, 158); padding: 4px 12px; border: none; color: white; border-radius: 6px 0px 0px 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; text-decoration: none;'>Edit</a>");
                                            out.println("<a href='updateproduct.jsp?product_id=" + product_id + "' class='btn btn-primary' style='background-color: rgb(54, 118, 158); padding: 4px 12px; border: none; color: white; border-radius: 6px 0px 0px 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; text-decoration: none;'>Edit</a>");

                                            out.println("<input type='hidden' name='product_id' value='" + product_id + "'>");
                                            out.println("<input type='submit' class='btn btn-primary' style=' background-color: rgb(54, 118, 158); padding-top: 4px; padding-bottom: 4px; border:none; padding-right: 12px; color: white; border-radius: 6px 0px 0px 6px; border-top-right-radius: 6px; border-bottom-right-radius: 6px; width: auto;' name='delete' value='Delete'>");
                                            out.println("</form>");
                                            out.println("</td>");
                                            out.println("</tr>");
                                        }

                                resultSet.close();
                                statement.close();
                                con.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                            // Handle delete request
                            if (request.getParameter("delete") != null) {
                                try {
                                    int product_id = Integer.parseInt(request.getParameter("product_id"));

                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merkat", "root", "");
                                    Statement statement = con.createStatement();
                                    String Query = "DELETE FROM product WHERE product_id=" + product_id;
                                    statement.executeUpdate(Query);

                                    // Refresh the page to reflect the updated data
                                    response.sendRedirect("Sellerdashboard.jsp");
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                        %>

                    </tbody>
                </table>
            </div>
        </div>
        <div>
            <!-- Start: Footer Basic -->
            <footer class="text-center">
                <div class="container text-muted py-4 py-lg-5">
                    <ul class="list-inline">
                        <li class="list-inline-item me-4">
                            <a class="link-secondary" href="#">Home</a>
                        </li>
                        <li class="list-inline-item me-4">
                            <a class="link-secondary" href="#">About Us</a>
                        </li>
                        <li class="list-inline-item">
                            <a class="link-secondary" href="#">Contact Us</a>
                        </li>
                    </ul>
                    <ul class="list-inline">
                        <li class="list-inline-item me-4">
                            <svg
                                xmlns="http://www.w3.org/2000/svg"
                                width="1em"
                                height="1em"
                                fill="currentColor"
                                viewBox="0 0 16 16"
                                class="bi bi-facebook"
                                >
                            <path
                                d="M16 8.049c0-4.446-3.582-8.05-8-8.05C3.58 0-.002 3.603-.002 8.05c0 4.017 2.926 7.347 6.75 7.951v-5.625h-2.03V8.05H6.75V6.275c0-2.017 1.195-3.131 3.022-3.131.876 0 1.791.157 1.791.157v1.98h-1.009c-.993 0-1.303.621-1.303 1.258v1.51h2.218l-.354 2.326H9.25V16c3.824-.604 6.75-3.934 6.75-7.951z"
                                ></path>
                            </svg>
                        </li>
                        <li class="list-inline-item me-4">
                            <svg
                                xmlns="http://www.w3.org/2000/svg"
                                width="1em"
                                height="1em"
                                fill="currentColor"
                                viewBox="0 0 16 16"
                                class="bi bi-twitter"
                                >
                            <path
                                d="M5.026 15c6.038 0 9.341-5.003 9.341-9.334 0-.14 0-.282-.006-.422A6.685 6.685 0 0 0 16 3.542a6.658 6.658 0 0 1-1.889.518 3.301 3.301 0 0 0 1.447-1.817 6.533 6.533 0 0 1-2.087.793A3.286 3.286 0 0 0 7.875 6.03a9.325 9.325 0 0 1-6.767-3.429 3.289 3.289 0 0 0 1.018 4.382A3.323 3.323 0 0 1 .64 6.575v.045a3.288 3.288 0 0 0 2.632 3.218 3.203 3.203 0 0 1-.865.115 3.23 3.23 0 0 1-.614-.057 3.283 3.283 0 0 0 3.067 2.277A6.588 6.588 0 0 1 .78 13.58a6.32 6.32 0 0 1-.78-.045A9.344 9.344 0 0 0 5.026 15z"
                                ></path>
                            </svg>
                        </li>
                        <li class="list-inline-item">
                            <svg
                                xmlns="http://www.w3.org/2000/svg"
                                width="1em"
                                height="1em"
                                fill="currentColor"
                                viewBox="0 0 16 16"
                                class="bi bi-instagram"
                                >
                            <path
                                d="M8 0C5.829 0 5.556.01 4.703.048 3.85.088 3.269.222 2.76.42a3.917 3.917 0 0 0-1.417.923A3.927 3.927 0 0 0 .42 2.76C.222 3.268.087 3.85.048 4.7.01 5.555 0 5.827 0 8.001c0 2.172.01 2.444.048 3.297.04.852.174 1.433.372 1.942.205.526.478.972.923 1.417.444.445.89.719 1.416.923.51.198 1.09.333 1.942.372C5.555 15.99 5.827 16 8 16s2.444-.01 3.298-.048c.851-.04 1.434-.174 1.943-.372a3.916 3.916 0 0 0 1.416-.923c.445-.445.718-.891.923-1.417.197-.509.332-1.09.372-1.942C15.99 10.445 16 10.173 16 8s-.01-2.445-.048-3.299c-.04-.851-.175-1.433-.372-1.941a3.926 3.926 0 0 0-.923-1.417A3.911 3.911 0 0 0 13.24.42c-.51-.198-1.092-.333-1.943-.372C10.443.01 10.172 0 7.998 0h.003zm-.717 1.442h.718c2.136 0 2.389.007 3.232.046.78.035 1.204.166 1.486.275.373.145.64.319.92.599.28.28.453.546.598.92.11.281.24.705.275 1.485.039.843.047 1.096.047 3.231s-.008 2.389-.047 3.232c-.035.78-.166 1.203-.275 1.485a2.47 2.47 0 0 1-.599.919c-.28.28-.546.453-.92.598-.28.11-.704.24-1.485.276-.843.038-1.096.047-3.232.047s-2.39-.009-3.233-.047c-.78-.036-1.203-.166-1.485-.276a2.478 2.478 0 0 1-.92-.598 2.48 2.48 0 0 1-.6-.92c-.109-.281-.24-.705-.275-1.485-.038-.843-.046-1.096-.046-3.233 0-2.136.008-2.388.046-3.231.036-.78.166-1.204.276-1.486.145-.373.319-.64.599-.92.28-.28.546-.453.92-.598.282-.11.705-.24 1.485-.276.738-.034 1.024-.044 2.515-.045v.002zm4.988 1.328a.96.96 0 1 0 0 1.92.96.96 0 0 0 0-1.92zm-4.27 1.122a4.109 4.109 0 1 0 0 8.217 4.109 4.109 0 0 0 0-8.217zm0 1.441a2.667 2.667 0 1 1 0 5.334 2.667 2.667 0 0 1 0-5.334z"
                                ></path>
                            </svg>
                        </li>
                    </ul>
                    <p class="mb-0">Copyright © 2023 Mercat</p>
                </div>
            </footer>
            <!-- End: Footer Basic -->
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>


