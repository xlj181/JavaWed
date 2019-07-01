package wed.com.demo1;

import javax.servlet.*;
import java.io.IOException;

public class Servlet2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        String servletName=servletConfig.getServletName();
        System.out.println(servletName);
        //获取初始化数
        String username=servletConfig.getInitParameter("username");
        System.out.println("username"+username);
        String password=servletConfig.getInitParameter("password");
        System.out.println("password"+password);
        String java=servletConfig.getInitParameter("java");
        System.out.println("java"+java);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
