package filter2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


public class Filter1 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Filter1初始化");
        String name=config.getInitParameter("name");
        String age=config.getInitParameter("age");
        String filterName=config.getFilterName();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("filterName = " + filterName);
    }

}
