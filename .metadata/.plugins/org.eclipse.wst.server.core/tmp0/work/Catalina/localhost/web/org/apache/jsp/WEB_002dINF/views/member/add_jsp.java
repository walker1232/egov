/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2018-08-30 05:03:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

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
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');
 String ctx = application.getContextPath(); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"content\" align=\"center\">\r\n");
      out.write("\t\t<h1>회원가입</h1>\r\n");
      out.write("\t<form id=\"add_form\" name=\"add_form\" >\r\n");
      out.write("\t\tID: <input type=\"text\" name=\"memID\" required><br />\r\n");
      out.write("\t\tName: <input type=\"text\" name=\"name\" required><br />\r\n");
      out.write("\t\tPass: <input type=\"text\" name=\"password\" required><br />\r\n");
      out.write("\t\tSsn : <input type=\"text\" name=\"ssn\" required><br />\r\n");
      out.write("\t\t소속팀\r\n");
      out.write("\t\t<input type=\"radio\" name=\"teamID\" value=\"none\" checked=\"checked\" />없음\r\n");
      out.write("\t\t<input type=\"radio\" name=\"teamID\" value=\"nolja\"/>걍놀자\r\n");
      out.write("\t\t<input type=\"radio\" name=\"teamID\" value=\"jieunHouse\"/>지은이네\r\n");
      out.write("\t\t<input type=\"radio\" name=\"teamID\" value=\"turtleKing\"/>터틀킹\r\n");
      out.write("\t\t<input type=\"radio\" name=\"teamID\" value=\"codingZzang\"/>코딩짱 <br />\r\n");
      out.write("\t\t프로젝트역할\r\n");
      out.write("\t\t<select name=\"roll\" id=\"roll\">\r\n");
      out.write("\t\t\t<option value=\"leader\">팀장</option>\r\n");
      out.write("\t\t\t<option value=\"front\">프론트개발</option>\r\n");
      out.write("\t\t\t<option value=\"back\">백단개발</option>\r\n");
      out.write("\t\t\t<option value=\"android\">안드로이드개발</option>\r\n");
      out.write("\t\t\t<option value=\"minfe\">민폐</option> <br />\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t수강과목\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"java\" checked=\"checked\"/>Java\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"clang\"/>c\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"JSP\"/>JSP\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"PHP\"/>PHP\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"nodejs\"/>NodeJs\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"linux\"/>Linux\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"html\"/>HTML\r\n");
      out.write("\t\t<input type=\"checkbox\" name=\"subject\" value=\"spring\"/>Spring <br />\r\n");
      out.write("\t\t<input id=\"add_submit\" type=button value=\"Join\">\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div> <!-- content end -->\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t");
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
}
