package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/WEB-INF/tags/login/template.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fid_005fcommandName_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fid_005fcommandName_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fid_005fcommandName_005faction.release();
    _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.release();
    _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_t_005ftemplate_005f0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005ftemplate_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:template
    org.apache.jsp.tag.web.login.template_tag _jspx_th_t_005ftemplate_005f0 = new org.apache.jsp.tag.web.login.template_tag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_t_005ftemplate_005f0);
    _jspx_th_t_005ftemplate_005f0.setJspContext(_jspx_page_context);
    _jspx_th_t_005ftemplate_005f0.setJspBody(new Helper( 0, _jspx_page_context, _jspx_th_t_005ftemplate_005f0, null));
    _jspx_th_t_005ftemplate_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_t_005ftemplate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/jsp/login.jsp(13,30) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/images/logo.png");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/jsp/login.jsp(36,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty errMsg}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t                    <h3>Invalid login</h3>\r\n");
        out.write("\t                    <p>username or password doesn't match.</p>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      throw new SkipPageException();
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_form_005fform_005f0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fid_005fcommandName_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    // /WEB-INF/jsp/login.jsp(42,16) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("post");
    // /WEB-INF/jsp/login.jsp(42,16) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("verifyLogin.html");
    // /WEB-INF/jsp/login.jsp(42,16) name = commandName type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setCommandName("user");
    // /WEB-INF/jsp/login.jsp(42,16) null
    _jspx_th_form_005fform_005f0.setDynamicAttribute(null, "role", new String("form"));
    // /WEB-INF/jsp/login.jsp(42,16) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setId("form");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("                    <div class=\"form-group\">\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"input-group\">\r\n");
          out.write("                            <div class=\"input-group-addon\">\r\n");
          out.write("                                <i class=\"entypo-user\"></i>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            ");
          if (_jspx_meth_form_005finput_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                    </div>\r\n");
          out.write("\r\n");
          out.write("                    <div class=\"form-group\">\r\n");
          out.write("\r\n");
          out.write("                        <div class=\"input-group\">\r\n");
          out.write("                            <div class=\"input-group-addon\">\r\n");
          out.write("                                <i class=\"entypo-key\"></i>\r\n");
          out.write("                            </div>\r\n");
          out.write("\r\n");
          out.write("                            ");
          if (_jspx_meth_form_005fpassword_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\r\n");
          out.write("                        </div>\r\n");
          out.write("\r\n");
          out.write("                    </div>\r\n");
          out.write("\r\n");
          out.write("                    <div class=\"form-group\">\r\n");
          out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-block btn-login\">\r\n");
          out.write("                            <i class=\"entypo-login\"></i>\r\n");
          out.write("                            Login In\r\n");
          out.write("                        </button>\r\n");
          out.write("                    </div>\r\n");
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_0026_005frole_005fmethod_005fid_005fcommandName_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/login.jsp(52,28) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setPath("userName");
    // /WEB-INF/jsp/login.jsp(52,28) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setCssClass("form-control");
    // /WEB-INF/jsp/login.jsp(52,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setId("userName");
    // /WEB-INF/jsp/login.jsp(52,28) null
    _jspx_th_form_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("Username"));
    // /WEB-INF/jsp/login.jsp(52,28) name = autocomplete type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005finput_005f0.setAutocomplete("off");
    int[] _jspx_push_body_count_form_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005finput_005f0 = _jspx_th_form_005finput_005f0.doStartTag();
      if (_jspx_th_form_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005finput_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.reuse(_jspx_th_form_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_form_005fpassword_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:password
    org.springframework.web.servlet.tags.form.PasswordInputTag _jspx_th_form_005fpassword_005f0 = (org.springframework.web.servlet.tags.form.PasswordInputTag) _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.get(org.springframework.web.servlet.tags.form.PasswordInputTag.class);
    _jspx_th_form_005fpassword_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fpassword_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/login.jsp(65,28) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setPath("userPass");
    // /WEB-INF/jsp/login.jsp(65,28) name = cssClass type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setCssClass("form-control");
    // /WEB-INF/jsp/login.jsp(65,28) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setId("userPass");
    // /WEB-INF/jsp/login.jsp(65,28) null
    _jspx_th_form_005fpassword_005f0.setDynamicAttribute(null, "placeholder", new String("Password"));
    // /WEB-INF/jsp/login.jsp(65,28) name = autocomplete type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fpassword_005f0.setAutocomplete("off");
    int[] _jspx_push_body_count_form_005fpassword_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fpassword_005f0 = _jspx_th_form_005fpassword_005f0.doStartTag();
      if (_jspx_th_form_005fpassword_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fpassword_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fpassword_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fpassword_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fpassword_0026_005fplaceholder_005fpath_005fid_005fcssClass_005fautocomplete_005fnobody.reuse(_jspx_th_form_005fpassword_005f0);
    }
    return false;
  }

  private class Helper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public Helper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"login-header login-caret\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"login-content\">\r\n");
      out.write("\r\n");
      out.write("                <a class=\"logo\">\r\n");
      out.write("                    <img src=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\" width=\"120\" height=\"50\" alt=\"\" />\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <p class=\"description\">Dear user, log in to access the admin area!</p>\r\n");
      out.write("\r\n");
      out.write("                <!-- progress bar indicator -->\r\n");
      out.write("                <div class=\"login-progressbar-indicator\">\r\n");
      out.write("                    <h3>43%</h3>\r\n");
      out.write("                    <span>logging in...</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"login-progressbar\">\r\n");
      out.write("            <div></div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"login-form\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"login-content\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <div class=\"form-login-error\">\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                ");
      if (_jspx_meth_form_005fform_005f0(_jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <script>\r\n");
      out.write("\t        jQuery(function($) {\r\n");
      out.write("\r\n");
      out.write("   \t            var formLogin = formLogin || {};\r\n");
      out.write("\t        \t(function(e, t, n) {\r\n");
      out.write("\t        \t    \"use strict\";\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t        \t    e(\".form-login-error\").show();\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t        \t    e(document).ready(function() {\r\n");
      out.write("\t        \t        formLogin.$container = e(\"#form\");\r\n");
      out.write("\t        \t        formLogin.$container.validate({\r\n");
      out.write("\t        \t            rules: {\r\n");
      out.write("\t        \t                userName: {\r\n");
      out.write("\t        \t                    required: true\r\n");
      out.write("\t        \t                },\r\n");
      out.write("\t        \t                userPass: {\r\n");
      out.write("\t        \t                    required: true\r\n");
      out.write("\t        \t                }\r\n");
      out.write("\t        \t            },\r\n");
      out.write("\t        \t            highlight: function(t) {\r\n");
      out.write("\t        \t                e(t).closest(\".input-group\").addClass(\"validate-has-error\")\r\n");
      out.write("\t        \t            },\r\n");
      out.write("\t        \t            unhighlight: function(t) {\r\n");
      out.write("\t        \t                e(t).closest(\".input-group\").removeClass(\"validate-has-error\")\r\n");
      out.write("\t        \t            },\r\n");
      out.write("\t        \t            submitHandler: function(n) {\r\n");
      out.write("\t        \t                e(\".login-page\").addClass(\"logging-in\");\r\n");
      out.write("\t        \t                e(\".form-login-error\").slideUp(\"fast\");\r\n");
      out.write("\t        \t                setTimeout(function() {\r\n");
      out.write("\t        \t                    var n = 25 + Math.round(Math.random() * 30);\r\n");
      out.write("\t        \t                    formLogin.setPercentage(40 + n);\r\n");
      out.write("\t        \t                    setTimeout(function() {\r\n");
      out.write("\t        \t                        setTimeout(function() {\r\n");
      out.write("\t        \t                            \r\n");
      out.write("\t        \t                            var postFormStr = \"<form method='POST' action='verifyLogin.html'>\\n\";\r\n");
      out.write("\t        \t                            \r\n");
      out.write("\t        \t                            postFormStr += \"<div class='form-group'>\";\r\n");
      out.write("\r\n");
      out.write("\t        \t                            postFormStr += \"<input type='hidden' name='userName' value='\" + $(\"#userName\").val() + \"'></input>\";\r\n");
      out.write("\t        \t                            postFormStr += \"<input type='hidden' name='userPass' value='\" + $(\"#userPass\").val() + \"'></input>\";\r\n");
      out.write("\r\n");
      out.write("\t        \t                            postFormStr += \"</div>\";\r\n");
      out.write("\t        \t                            postFormStr += \"</form>\";\r\n");
      out.write("\r\n");
      out.write("\t        \t                            var formElement = $(postFormStr);\r\n");
      out.write("\r\n");
      out.write("\t        \t                            $('body').append(formElement);\r\n");
      out.write("\t        \t                            $(formElement).submit();\r\n");
      out.write("\t        \t                        }, 400)\r\n");
      out.write("\t        \t                    }, 1e3)\r\n");
      out.write("\t        \t                }, 650)\r\n");
      out.write("\t        \t            }\r\n");
      out.write("\t        \t        });\r\n");
      out.write("\t        \t        formLogin.$body = e(\".login-page\");\r\n");
      out.write("\t        \t        formLogin.$login_progressbar_indicator = e(\".login-progressbar-indicator h3\");\r\n");
      out.write("\t        \t        formLogin.$login_progressbar = formLogin.$body.find(\".login-progressbar div\");\r\n");
      out.write("\t        \t        formLogin.$login_progressbar_indicator.html(\"0%\");\r\n");
      out.write("\t        \t        if (formLogin.$body.hasClass(\"login-form-fall\")) {\r\n");
      out.write("\t        \t            var r = false;\r\n");
      out.write("\t        \t            setTimeout(function() {\r\n");
      out.write("\t        \t                formLogin.$body.addClass(\"login-form-fall-init\");\r\n");
      out.write("\t        \t                setTimeout(function() {\r\n");
      out.write("\t        \t                    if (!r) {\r\n");
      out.write("\t        \t                        formLogin.$container.find(\"input:first\").focus();\r\n");
      out.write("\t        \t                        r = true\r\n");
      out.write("\t        \t                    }\r\n");
      out.write("\t        \t                }, 550)\r\n");
      out.write("\t        \t            }, 0)\r\n");
      out.write("\t        \t        } else {\r\n");
      out.write("\t        \t            formLogin.$container.find(\"input:first\").focus()\r\n");
      out.write("\t        \t        }\r\n");
      out.write("\t        \t        formLogin.$container.find(\".form-control\").each(function(t, n) {\r\n");
      out.write("\t        \t            var r = e(n),\r\n");
      out.write("\t        \t                i = r.closest(\".input-group\");\r\n");
      out.write("\t        \t            r.prev(\".input-group-addon\").click(function() {\r\n");
      out.write("\t        \t                r.focus()\r\n");
      out.write("\t        \t            });\r\n");
      out.write("\t        \t            r.on({\r\n");
      out.write("\t        \t                focus: function() {\r\n");
      out.write("\t        \t                    i.addClass(\"focused\")\r\n");
      out.write("\t        \t                },\r\n");
      out.write("\t        \t                blur: function() {\r\n");
      out.write("\t        \t                    i.removeClass(\"focused\")\r\n");
      out.write("\t        \t                }\r\n");
      out.write("\t        \t            })\r\n");
      out.write("\t        \t        });\r\n");
      out.write("\t        \t        e.extend(formLogin, {\r\n");
      out.write("\t        \t            setPercentage: function(e, t) {\r\n");
      out.write("\t        \t                e = parseInt(e / 100 * 100, 10) + \"%\";\r\n");
      out.write("\t        \t                formLogin.$login_progressbar_indicator.html(e);\r\n");
      out.write("\t        \t                formLogin.$login_progressbar.width(e);\r\n");
      out.write("\t        \t                var r = {\r\n");
      out.write("\t        \t                    pct: parseInt(formLogin.$login_progressbar.width() / formLogin.$login_progressbar.parent().width() * 100, 10)\r\n");
      out.write("\t        \t                };\r\n");
      out.write("\t        \t                TweenMax.to(r, .7, {\r\n");
      out.write("\t        \t                    pct: parseInt(e, 10),\r\n");
      out.write("\t        \t                    roundProps: [\"pct\"],\r\n");
      out.write("\t        \t                    ease: Sine.easeOut,\r\n");
      out.write("\t        \t                    onUpdate: function() {\r\n");
      out.write("\t        \t                        formLogin.$login_progressbar_indicator.html(r.pct + \"%\")\r\n");
      out.write("\t        \t                    },\r\n");
      out.write("\t        \t                    onComplete: t\r\n");
      out.write("\t        \t                })\r\n");
      out.write("\t        \t            },\r\n");
      out.write("\t        \t            resetProgressBar: function(t) {\r\n");
      out.write("\t        \t                TweenMax.set(formLogin.$container, {\r\n");
      out.write("\t        \t                    css: {\r\n");
      out.write("\t        \t                        opacity: 0\r\n");
      out.write("\t        \t                    }\r\n");
      out.write("\t        \t                });\r\n");
      out.write("\t        \t                setTimeout(function() {\r\n");
      out.write("\t        \t                    TweenMax.to(formLogin.$container, .6, {\r\n");
      out.write("\t        \t                        css: {\r\n");
      out.write("\t        \t                            opacity: 1\r\n");
      out.write("\t        \t                        },\r\n");
      out.write("\t        \t                        onComplete: function() {\r\n");
      out.write("\t        \t                            formLogin.$container.attr(\"style\", \"\")\r\n");
      out.write("\t        \t                        }\r\n");
      out.write("\t        \t                    });\r\n");
      out.write("\t        \t                    formLogin.$login_progressbar_indicator.html(\"0%\");\r\n");
      out.write("\t        \t                    formLogin.$login_progressbar.width(0);\r\n");
      out.write("\t        \t                    if (t) {\r\n");
      out.write("\t        \t                        var n = e(\".form-login-error\");\r\n");
      out.write("\t        \t                        n.show();\r\n");
      out.write("\t        \t                        var r = n.outerHeight();\r\n");
      out.write("\t        \t                        n.css({\r\n");
      out.write("\t        \t                            height: 0\r\n");
      out.write("\t        \t                        });\r\n");
      out.write("\t        \t                        TweenMax.to(n, .45, {\r\n");
      out.write("\t        \t                            css: {\r\n");
      out.write("\t        \t                                height: r\r\n");
      out.write("\t        \t                            },\r\n");
      out.write("\t        \t                            onComplete: function() {\r\n");
      out.write("\t        \t                                n.css({\r\n");
      out.write("\t        \t                                    height: \"auto\"\r\n");
      out.write("\t        \t                                })\r\n");
      out.write("\t        \t                            }\r\n");
      out.write("\t        \t                        });\r\n");
      out.write("\t        \t                        formLogin.$container.find('input[type=\"password\"]').val(\"\")\r\n");
      out.write("\t        \t                    }\r\n");
      out.write("\t        \t                }, 800)\r\n");
      out.write("\t        \t            }\r\n");
      out.write("\t        \t        });\r\n");
      out.write("\t        \t    })\r\n");
      out.write("\t        \t})(jQuery, window)\r\n");
      out.write("\t        });\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        this.jspContext.getELContext().putContext(JspContext.class,this.jspContext);
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
