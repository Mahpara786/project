package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import exavalu.com.utilities.ConnectionProviderToDB;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class Policy_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("    \n");
      out.write("\n");
      out.write("<link href=\"css/policyTable_css.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"table-responsive\" id=\"sailorTableArea\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/Policy_css.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha2/css/bootstrap.min.css\" integrity=\"sha384-DhY6onE6f3zzKbjUPRc2hOzGAdEf4/Dz+WJwBvEYL/lkkIsI3ihufq9hk9K4lVoK\" crossorigin=\"anonymous\">        \n");
      out.write("    <table id=\"sailorTable\" class=\"table table-striped table-bordered\" width=\"100%\">\n");
      out.write(" \n");
      out.write("        <nav class=\"navbar navbar-expand text-white bg-secondary\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class =\"logo\">\n");
      out.write("                    <h3>Policies </h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        \n");
      out.write("        <thead class=\"table table-success table-striped\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Serial No.</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Launch Date</th>\n");
      out.write("                <th>Expiry Date</th>\n");
      out.write("                <th>Coverage Amount</th>\n");
      out.write("                <th>Minimum Age</th>\n");
      out.write("                <th>Maximum Age</th>\n");
      out.write("            </tr>\n");
      out.write("        </thead>\n");
      out.write("        \n");
      out.write("        ");

            try {
                Connection connection = ConnectionProviderToDB.getConnectionObject().getConnection("C:\\Users\\HP\\Documents\\NetBeansProjects\\ExavaluInsuranceApplicationV2\\ExavaluInsuranceApplicationV2\\src\\java\\exavalu\\cofig\\db_params.properties");
                Statement statement = connection.createStatement();
                String sql = "select * from policy";
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("<!--            <td><button onclick=\"myfunction()\">i</button>-->\n");
      out.write("<!--             <button onclick=\"myfunction()\" id=\"myBtn\">i</button>\n");
      out.write("             <span id =\" dots\">...</span>\n");
      out.write("             <span id=\"more\">best Policy.</span>-->\n");
      out.write("             \n");
      out.write("<td><button class =\"editbtn\">&#128712</button>");
      out.print(resultSet.getString("policy_id"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("policy_name"));
      out.write("</td>\n");
      out.write("<td>");
      out.print(resultSet.getString("Launchdate"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("Expdate"));
      out.write("</td>\n");
      out.write("            \n");
      out.write("            <td>");
      out.print(resultSet.getString("coverage"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("minAgeOffering"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(resultSet.getString("maxAgeOffering"));
      out.write("</td>\n");
      out.write("           \n");
      out.write("        <tr class=\"more-info\">\n");
      out.write("            <td colspan=\"4\">");
      out.print(resultSet.getString("details"));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("            \n");
      out.write("        </tr>\n");
      out.write("        ");

                }
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </table>\n");
      out.write("    </div>\n");
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
