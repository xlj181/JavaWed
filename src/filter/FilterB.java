package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


public class FilterB implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        System.out.println("filterB 开始执行");
        chain.doFilter(req, resp);
        System.out.println("filterB  结束执行");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
