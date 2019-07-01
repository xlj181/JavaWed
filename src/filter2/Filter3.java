package filter2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter3")
public class Filter3 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filter3  开始执行");
        chain.doFilter(req, resp);
        System.out.println("filter3  结束执行");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
