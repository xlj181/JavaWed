package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


public class FilterA implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterA 开始执行");
        chain.doFilter(req, resp);
        System.out.println("filterA  结束执行");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
