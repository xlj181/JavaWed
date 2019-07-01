package filter;

import javax.servlet.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public class IpCountFilter implements Filter {
    private ServletContext servletContext;
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
        //获取http请求
        HttpServletRequest request=(HttpServletRequest)req;
        //获取IP地址
        String ipAddr=request.getRemoteAddr();

        //获取map集合
        Map<String,Integer> ipMap=(Map<String,Integer>)servletContext.getAttribute("ipMap");
        //获取次数
        Integer integer=ipMap.get(ipAddr);
        //判断
        if(integer==null){
            integer=1;
        }else {
            integer+=1;
        }
        //更新map集合
        ipMap.put(ipAddr,integer);
        //把map重新放回servletContext对象中
        servletContext.setAttribute("ipMap",ipMap);

        chain.doFilter(req,resp);
    }

    public void init(FilterConfig config) throws ServletException {
        //先获取servletContext对象
        servletContext=config.getServletContext();
        //创建一个Map集合
        Map<String,Integer> ipMap= Collections.synchronizedMap(new LinkedHashMap<String, Integer>());
        //放在servletContext对象中
        servletContext.setAttribute("ipMap",ipMap);
    }

}
