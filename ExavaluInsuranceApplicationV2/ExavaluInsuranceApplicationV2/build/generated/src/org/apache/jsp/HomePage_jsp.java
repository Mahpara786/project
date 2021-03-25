package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import exavalu.com.beans.User;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Exavalu Insurance Application</title>\n");
      out.write("        <meta name=\"robots\" content=\"noindex, nofollow\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/homepage_css.css\">\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            window.history.forward();\n");
      out.write("            function noBack()\n");
      out.write("            {\n");
      out.write("                window.onbeforeunload = function () {\n");
      out.write("                    return \"Your work will be lost.\";\n");
      out.write("                };\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body onLoad=\"noBack();\" onpageshow=\"if (event.persisted) noBack();\" onUnload=\"\">\n");
      out.write("        <div class=\"bg-image\" style=\"background-image: url('images/Various-background-styles.jpg'); height: 100vh\">\n");
      out.write("        ");

            User user = (User) request.getSession().getAttribute("user");
//            if(user==null)
//            {
//                RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
//                rd.forward(request, response);
//            }

      out.write(" \n");
      out.write("<header> \n");
      out.write("   <div id = \"intro\" class=\"view hm-black-strong\">\n");
      out.write("        <div class=\"full-big-img\">\n");
      out.write("<!--            <a href=\"#\" title=\"Background\"><img alt=\"Background\" src=\"images/insurance-industry.png\" style=\"position: fixed; left: 0; top: 0\" width=\"100%\" height=\"auto\"></a>-->\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head><title>Ajax Test\n");
      out.write("    </title>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    function showImage(){\n");
      out.write("        document.getElementById('loadingImage').style.visibility='visible';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    function hideImage(){\n");
      out.write("        document.getElementById('loadingImage').style.visibility='hidden';\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <input type=\"button\" value=\"click\" onclick=\"showImage();\"/>\n");
      out.write("    <img id=\"loadingImage\" src=\"images/template.jpg\" style=\"visibility:hidden\"/>\n");
      out.write("    <input type=\"button\" value=\"click\" onclick=\"hideImage();\"/>\n");
      out.write("    <img id=\"loadingImage\" src=\"images/template.jpg\" style=\"visibility:hidden\"/>\n");
      out.write("     \n");
      out.write("</body>\n");
      out.write("    \n");
      out.write("    </button>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<header id=\"header\">\n");
      out.write("\n");
      out.write("            <div class=\"logo\">\n");
      out.write("                <a href=\"www.exavalu.com/\" rel=\"home\" title=\"Exavalu Home Page\" title=\"Homepage\"><img alt=\"Exavalu\" src=\"images/logo.png\"><strong>Exavalu<span> Insurance</span></strong></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navigate\">\n");
      out.write("                <ul>\n");
      out.write("               <li><a href=\"#\" >Welcome: ");
      out.print(user.getUserName());
      out.write("</a></li>\n");
      out.write("<!--                    <li><a href=\"#\" >Welcome: <c:out value = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${login_credentials.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></li>-->\n");
      out.write("                    <li><a href=\"Policy.jsp\" title=\"Policies\"><img alt=\"Policies\" src=\"images/policy.png\" height=\"50\" width=\"50\"></a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\" title=\"Customers\"><img alt=\"Customers\" src=\"images/customers.jpg\" height=\"50\" width=\"50\"></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"Logout\" title=\"Log Out\" target=\"_top\"><img alt=\"Policies\" src=\"images/logout.jpg\" height=\"50\" width=\"50\"></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div> \n");
      out.write("                  \n");
      out.write("                   <form name=\"myForm\" id=\"myForm\" onsubmit=\"return validateForm()\">\n");
      out.write("    Enter Policy: <br />\n");
      out.write("    <input type=\"text\" id=\"policy\" />\n");
      out.write("    <input type=\"button\" id=\"addpolicy\" value=\"+\" />\n");
      out.write("    <br/>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("document.getElementById(\"addpolicy\").onclick = function() {\n");
      out.write("    var form = document.getElementById(\"myForm\");\n");
      out.write("    var input = document.createElement(\"input\");\n");
      out.write("    input.type = \"text\";\n");
      out.write("    var br = document.createElement(\"br\");\n");
      out.write("    form.appendChild(input);\n");
      out.write("    form.appendChild(br);\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("                       \n");
      out.write("</header>\n");
      out.write("        </div>                \n");
      out.write("    </body>\n");
      out.write(" </html>\n");
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
