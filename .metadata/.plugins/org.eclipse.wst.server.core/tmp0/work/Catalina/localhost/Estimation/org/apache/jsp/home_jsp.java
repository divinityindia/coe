/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2016-11-25 12:02:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/D:/eclipse-Git-project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Estimation/WEB-INF/lib/jstl-impl.jar!/META-INF/fn.tld", Long.valueOf(1343800018000L));
    _jspx_dependants.put("jar:file:/D:/eclipse-Git-project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Estimation/WEB-INF/lib/jstl-impl.jar!/META-INF/c.tld", Long.valueOf(1343800018000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-impl.jar", Long.valueOf(1480075158608L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Welcome To PDEA E Tender Portal</title>\n");
      out.write("<meta name=\"keywords\" content=\"free etendering  by pdea  \" />\n");
      out.write("<meta name=\"description\" content=\"Maintain and developed by divinity technologies,pune\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style/table.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"style/slimbox2.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"style/login.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("<script type=\"text/javascript\" src=\"style/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"style/slimbox2.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"stopBack.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"loadingimage\">\n");
      out.write("        <!--<img src=\"images/Preloader_21.gif\"/> <b>Please turn on javascript</b>-->\n");
      out.write("</div>\n");
      out.write("    <div id=\"templatemo_background_section_top\">\n");
      out.write("    \n");
      out.write("    \t<div class=\"templatemo_container\">\n");
      out.write("        \t<div id=\"templatemo_logo_section\">\n");
      out.write("            \t<img src=\"images/logo1.png\" style=\"margin-top: -16px; height: 80px\"   alt=\"\"/>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div id=\"templatemo_search_box\">\n");
      out.write("                 <div style=\"float: right; color: #8A4500\" >\n");
      out.write("                  <span id=\"date\">\n");
      out.write("                         \n");
      out.write("                  </span>\n");
      out.write("                  \n");
      out.write("\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("           \t \n");
      out.write("            \t<form action=\"index.html\" method=\"post\">\n");
      out.write("    \t            \t<input type=\"text\" value=\"Search\" id=\"textfield\" onfocus=\"clearText(this)\" onblur=\"clearText(this)\"/>\n");
      out.write("        \t            <input type=\"submit\" name=\"Search\" value=\"Search\" alt=\"Search\" id=\"button\" title=\"Search\" />\n");
      out.write("\t\t\t  </form>\n");
      out.write("          </div>\n");
      out.write("            \n");
      out.write("            <div id=\"templatemo_menu_section\">\n");
      out.write("               \n");
      out.write("                <ul id=\"nav_m\">\n");
      out.write("\t\n");
      out.write("            \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div><!-- End Of Top Background -->\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div id=\"js\" style=\"border: 1px solid #AAA;background: yellow;font-weight: bold;\"><marquee behavior=\"alternate\" scrollamount=\"2\"><font color=\"red\">JavaScript seems to be off, Please turn it on for better performance.</font></marquee></div>\n");
      out.write("    <script>document.getElementById(\"js\").style.display='none';</script>\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_background_section_mid\" > \n");
      out.write("         <!--<marquee scrollamount=\"4\">e-Procurement System Pune District Education Association,Pune</marquee>-->\n");
      out.write("    \t<div class=\"templatemo_container\">\n");
      out.write("        <div id=\"templatemo_content_area\" style=\"margin-top: 10px;\">\n");
      out.write("        \t<div id=\"templatemo_left_section\">\n");
      out.write("                <div class=\"templatemo_left_section_box\" style=\"width: 615px\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                \t\n");
      out.write("                        <div class=\"site_content\" style=\"width: 595px;padding: 10px\">\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "chkbrowser.jsp", out, false);
      out.write("\n");
      out.write("                            <div ><br>\n");
      out.write("            <table id=\"simple\" width=\"100%\">\n");
      out.write("                <tr><td>\n");
      out.write("            <div>\n");
      out.write("        <img src=\"images/20.jpg\" alt=\"President\" width=\"98px\" height=\"135px\"/>\n");
      out.write("        <center>President<br>Ajit Pawar</center>\n");
      out.write("        \n");
      out.write("            </div></td>\n");
      out.write("                    <td style=\"vertical-align: top\">\n");
      out.write("                        <div>\n");
      out.write("    <p style=\"font-size: 12px;\">\n");
      out.write("\n");
      out.write("    This portal facilitates all the schools and colleges coming under\n");
      out.write("    Pune District Education for centralised purchasing of chemicals, equipments, books, \n");
      out.write("    journals etc that will ensure for competitive bidding and ultimately reducing the \n");
      out.write("    cost of purchase. The e-tendering software will provide platform for schools, \n");
      out.write("    colleges and association to work cohesively to get good quantity of stuff. \n");
      out.write("    The system also enables the user including vendors to migrate to total \n");
      out.write("    electronic procurement mode.\n");
      out.write("    <p style=\"font-size: 12px;\">\n");
      out.write("    The primary objective of this portal is to provide a single point access \n");
      out.write("    to the information on procurements made across various colleges vendor and supplier.</p>\n");
      out.write("            </div>\n");
      out.write("                    </td></tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("                </div>\n");
      out.write(" </div>\n");
      out.write("\n");
      out.write("  </div><!-- End Of left Section -->\n");
      out.write("  <div id=\"templatemo_right_section\" style=\"background: #FFF;border-radius: 15px;\">\n");
      out.write("           \n");
      out.write("                \n");
      out.write("                <div class=\"templatemo_right_section_box\" style=\"background: #ccffcc;margin: auto;margin-top: 20px;border-radius: 15px;\">\n");
      out.write("                \t\n");
      out.write("                           <!--<section class=\"container\">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"homLogin\" id=\"T1\" style=\"border-bottom-left-radius: 0px;border-bottom-right-radius: 0px\">\n");
      out.write("    <a style=\"cursor:pointer;\" onclick=\"toggleLogin(1)\">Login</a>\n");
      out.write("</div>\n");
      out.write("<div class=\"homLoginDiv\" id=\"1\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <table class=\"homLogintble\">\n");
      out.write("        <tr>\n");
      out.write("            <td>\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        <form action=\"Login\" method=\"post\" onsubmit=\"return valid()\">\n");
      out.write("          <noscript>\n");
      out.write("            <input type=\"hidden\" name=\"JavaScript\" value=\"false\" />\n");
      out.write("          </noscript>\n");
      out.write("    <tr ><td>\n");
      out.write("        <span id=\"unSpan\"></span>\n");
      out.write("        <input type=\"email\" name=\"userName\" id=\"name\" required placeholder=\"Headquarter Login ID\" style=\"width: 200px\" oninvalid=\"this.setCustomValidity('Invalid User Name.')\" oninput=\"setCustomValidity('')\"/> \n");
      out.write("   </td></tr>\n");
      out.write("    <tr><td>\n");
      out.write("        <span id=\"passSpan\"></span>\n");
      out.write("        <input type=\"password\" name=\"passWord\" id=\"pass\" required placeholder=\"Password\" style=\"width: 200px\" />\n");
      out.write("    </td></tr>     \n");
      out.write("\n");
      out.write("        <tr><td ><div class='aNbutton'>\n");
      out.write("         <a href=\"resetPassadm.jsp\" >Forgot Password ?</a>\n");
      out.write("         <input type=\"hidden\" value=\"admin\" name=\"category\"/>\n");
      out.write("         <input type=\"submit\" name=\"login\" class=\"colorbutton\" value=\"   Login   \" style=\"float: right\"/>\n");
      out.write("            </div></td></tr>\n");
      out.write("        </form>\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!--</section>-->\n");
      out.write("              </div>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("            </div><!-- End Of right Section -->\n");
      out.write("            \n");
      out.write("\t\t\t<div class=\"cleaner_with_height\">&nbsp;</div>\n");
      out.write("\t\t</div><!-- End Of content area -->\n");
      out.write("                \n");
      out.write("        \n");
      out.write("        </div><!-- End Of container -->\n");
      out.write("        <div id=\"templatemo_footer\">\n");
      out.write("        \tCopyright © 2016 Pune District Education Association,Pune | Website Developed and Maintain by <a href=\"http://www.techdivinity.com\" target=\"_parent\">Tech Divinity ,Pune</a>\n");
      out.write("        </div>\n");
      out.write("    </div><!-- End Of Middle Background -->\n");
      out.write("</body>\n");
      out.write("<!--  Designed by www.divinityindia.in  --> \n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /home.jsp(122,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.errMessage !=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    <div class=\"alert-box error\" style=\"\">\n");
        out.write("                        <font color=\"red\"><b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.errMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("</b></font>\n");
        out.write("                    </div>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
