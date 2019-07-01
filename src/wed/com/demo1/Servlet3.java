package wed.com.demo1;

import sun.net.httpserver.HttpServerImpl;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet3 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("找到Servlet3");
        //把请求和响应对象转换具有Http协议
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        //获取页面提交的参数
        String usernameValue=request.getParameter("username");
        String passwordValue=request.getParameter("password");

        System.out.println("usernameValue="+usernameValue);
        System.out.println("passwordValue="+passwordValue);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
