/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.23
 * Generated at: 2017-07-13 02:14:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.content;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <title>Tapis.com</title>\r\n");
      out.write("    <!-- load stylesheets -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,400\">  \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">                                    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">                              \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">                                 \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("    <body>        \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"tm-left-right-container\">\r\n");
      out.write("                    <!-- Left column: logo and menu -->\r\n");
      out.write("                    <div class=\"tm-blue-bg tm-left-column\">                        \r\n");
      out.write("                        <div class=\"tm-logo-div text-xs-center\">\r\n");
      out.write("                            <img src=\"image/flower-logo.png\" alt=\"Logo\">\r\n");
      out.write("                            <h1 class=\"tm-site-name\">tapis de fleurs</h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <nav class=\"tm-main-nav\">\r\n");
      out.write("                            <ul class=\"tm-main-nav-ul\">\r\n");
      out.write("                                <li class=\"tm-nav-item\">\r\n");
      out.write("                                    <a href=\"#welcome\" class=\"tm-nav-item-link\">Welcome</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"tm-nav-item\">\r\n");
      out.write("                                    <a href=\"#about\" class=\"tm-nav-item-link\">繁花似锦</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"tm-nav-item\">\r\n");
      out.write("                                    <a href=\"#galleryone\" class=\"tm-nav-item-link\">鲜花专区</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"tm-nav-item\">\r\n");
      out.write("                                    <a href=\"#secondgallery\" class=\"tm-nav-item-link\">干花专区</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"tm-nav-item\">\r\n");
      out.write("                                    <a href=\"#thirdgallery\" class=\"tm-nav-item-link\">食品专区</a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </nav>                                         \r\n");
      out.write("                    </div> <!-- Left column: logo and menu -->\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <!-- Right column: content -->\r\n");
      out.write("                    <div class=\"tm-right-column\">\r\n");
      out.write("                        <figure>\r\n");
      out.write("                            <img src=\"image/tapis-01.jpg\" alt=\"Header image\" class=\"img-fluid\">    \r\n");
      out.write("                        </figure>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"tm-content-div\">\r\n");
      out.write("                            <!-- Welcome section -->\r\n");
      out.write("                            <section id=\"welcome\" class=\"tm-section\">\r\n");
      out.write("                                <header>\r\n");
      out.write("                                    <h2 class=\"tm-blue-text tm-welcome-title tm-margin-b-45\">Welcome to Tapis De Fleurs</h2>\r\n");
      out.write("                                </header>\r\n");
      out.write("                                <p>我听见回声，来自山谷和心间\r\n");
      out.write("以寂寞的镰刀收割空旷的灵魂\r\n");
      out.write("不断地重复决绝，又重复幸福\r\n");
      out.write("终有绿洲摇曳在沙漠\r\n");
      out.write("我相信自己\r\n");
      out.write("生来如同璀璨的夏日之花\r\n");
      out.write("不凋不败，妖冶如火\r\n");
      out.write("承受心跳的负荷和呼吸的累赘\r\n");
      out.write("乐此不疲   --泰戈尔《生如夏花》</p>\r\n");
      out.write("                            </section>\r\n");
      out.write("                            <!-- About section -->\r\n");
      out.write("                            <section id=\"about\" class=\"tm-section\">\r\n");
      out.write("                                <div class=\"row\">                                                                \r\n");
      out.write("                                    <div class=\"col-lg-8 col-md-7 col-sm-12 col-xs-12 push-lg-4 push-md-5\">\r\n");
      out.write("                                        <header>\r\n");
      out.write("                                            <h2 class=\"tm-blue-text tm-section-title tm-margin-b-45\">繁花似锦</h2>\r\n");
      out.write("                                        </header>\r\n");
      out.write("                                        <p>来自顶尖花艺师的精心设计，空运昆明最新鲜的A级花材。从制作到您手中，24小时的等待只为最美的瞬间。</p>\r\n");
      out.write("                                        <p>矜贵花材,高贵礼盒，对挚爱的深情告白。不再只是瞬间，让美丽永恒，只为将“一生只爱一人”完美传达。</p>\r\n");
      out.write("                                        <p>对美食和美好的向往，对新鲜和健康的追求，精心设计，用心制作。将您的心意融化在舌尖的那一抹香醇。</p>\r\n");
      out.write("                                        <a href=\"#\" class=\"tm-button tm-button-wide\">Read More</a>  \r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-lg-4 col-md-5 col-sm-12 col-xs-12 pull-lg-8 pull-md-7 tm-about-img-container\">\r\n");
      out.write("                                        <img src=\"image/tapis-02.jpg\" alt=\"Image\" class=\"img-fluid\">    \r\n");
      out.write("                                    </div>  \r\n");
      out.write("                                </div>                            \r\n");
      out.write("                            </section>  \r\n");
      out.write("\r\n");
      out.write("                            <!-- Gallery One section -->     \r\n");
      out.write("                            <section id=\"galleryone\" class=\"tm-section\">\r\n");
      out.write("                                <header><h2 class=\"tm-blue-text tm-section-title tm-margin-b-30\">鲜花专区</h2></header>\r\n");
      out.write("                                <div class=\"tm-gallery-container tm-gallery-1\">\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-1\">\r\n");
      out.write("                                        <a href=\"image/tapis-03.jpg\"><img src=\"image/tapis-03.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-1\">\r\n");
      out.write("                                        <a href=\"image/tapis-04.jpg\"><img src=\"image/tapis-04.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-1\">\r\n");
      out.write("                                        <a href=\"image/tapis-05.jpg\"><img src=\"image/tapis-05.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-1\">\r\n");
      out.write("                                        <a href=\"image/tapis-06.jpg\"><img src=\"image/tapis-06.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-1\">\r\n");
      out.write("                                        <a href=\"image/tapis-07.jpg\"><img src=\"image/tapis-07.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </section>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Second Gallery section -->     \r\n");
      out.write("                            <section id=\"secondgallery\" class=\"tm-section\">\r\n");
      out.write("                                <header><h2 class=\"tm-blue-text tm-section-title tm-margin-b-30\">干花专区</h2></header>\r\n");
      out.write("                                <div class=\"tm-gallery-container tm-gallery-2\">\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-2\">\r\n");
      out.write("                                        <a href=\"image/tapis-08.jpg\"><img src=\"image/tapis-08.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-2\">\r\n");
      out.write("                                        <a href=\"image/tapis-09.jpg\"><img src=\"image/tapis-09.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-2\">\r\n");
      out.write("                                        <a href=\"image/tapis-10.jpg\"><img src=\"image/tapis-10.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </section>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Third Gallery section -->     \r\n");
      out.write("                            <section id=\"thirdgallery\" class=\"tm-section\">\r\n");
      out.write("                                <header><h2 class=\"tm-blue-text tm-section-title tm-margin-b-30\">食品专区</h2></header>\r\n");
      out.write("                                <div class=\"tm-gallery-container tm-gallery-3\">\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-3\">\r\n");
      out.write("                                        <a href=\"image/tapis-11.jpg\"><img src=\"image/tapis-11.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>    \r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-3\">\r\n");
      out.write("                                        <a href=\"image/tapis-12.jpg\"><img src=\"image/tapis-12.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-3\">\r\n");
      out.write("                                        <a href=\"image/tapis-13.jpg\"><img src=\"image/tapis-13.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"tm-img-container tm-img-container-3\">\r\n");
      out.write("                                        <a href=\"image/tapis-14.jpg\"><img src=\"image/tapis-14.jpg\" alt=\"Image\" class=\"img-fluid tm-img-tn\"></a>\r\n");
      out.write("                                    </div>                                    \r\n");
      out.write("                                </div>\r\n");
      out.write("                            </section>\r\n");
      out.write("                        </div>  \r\n");
      out.write("                        \r\n");
      out.write("                    </div> <!-- Right column: content -->\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> <!-- row -->\r\n");
      out.write("        </div> <!-- container -->\r\n");
      out.write("                \r\n");
      out.write("        <!-- load JS files -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>           \r\n");
      out.write("        <script src=\"js/scripts.js\"></script>    \r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>      \r\n");
      out.write("        <script>     \r\n");
      out.write("       \r\n");
      out.write("            $(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("                // Single page nav\r\n");
      out.write("                $('.tm-main-nav').singlePageNav({\r\n");
      out.write("                    'currentClass' : \"active\",\r\n");
      out.write("                    offset : 20\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // Magnific pop up\r\n");
      out.write("                $('.tm-gallery-1').magnificPopup({\r\n");
      out.write("                  delegate: 'a', // child items selector, by clicking on it popup will open\r\n");
      out.write("                  type: 'image',\r\n");
      out.write("                  gallery: {enabled:true}\r\n");
      out.write("                  // other options\r\n");
      out.write("                }); \r\n");
      out.write("\r\n");
      out.write("                $('.tm-gallery-2').magnificPopup({\r\n");
      out.write("                  delegate: 'a', // child items selector, by clicking on it popup will open\r\n");
      out.write("                  type: 'image',\r\n");
      out.write("                  gallery: {enabled:true}\r\n");
      out.write("                  // other options\r\n");
      out.write("                }); \r\n");
      out.write("\r\n");
      out.write("                $('.tm-gallery-3').magnificPopup({\r\n");
      out.write("                  delegate: 'a', // child items selector, by clicking on it popup will open\r\n");
      out.write("                  type: 'image',\r\n");
      out.write("                  gallery: {enabled:true}\r\n");
      out.write("                  // other options\r\n");
      out.write("                }); \r\n");
      out.write("\r\n");
      out.write("                $('.tm-current-year').text(new Date().getFullYear());                \r\n");
      out.write("            });\r\n");
      out.write("        </script>             \r\n");
      out.write("</body>\r\n");
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
}
