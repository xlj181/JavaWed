package xlj.wed.demo1;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpServlet4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        System.out.println("get请求4");
        //获取请求头
        String header = req.getHeader("accept");
        System.out.println("header = " + header);
        //获取参数
        String p1 = req.getParameter("p1");
        String p2 = req.getParameter("p2");
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        //其他方法
        String contextPath = req.getContextPath();// /+项目名 上下文
        String remoteAddr = req.getRemoteAddr();//获取ip
        String method = req.getMethod();//请求类型
        String remoteHost = req.getRemoteHost();//主机名
        int remotePort = req.getRemotePort();//端口
        String servletPath = req.getServletPath();// servlet的URL
        ServletContext servletContext = req.getServletContext();// 代表整个项目
        String serverName = req.getServerName();//主机名称
        int serverPort = req.getServerPort();//主机端口




        System.out.println("contextPath = " + contextPath);
        System.out.println("remoteAddr = " + remoteAddr);
        System.out.println("method = " + method);
        System.out.println("remoteHost = " + remoteHost);
        System.out.println("remotePort = " + remotePort);
        System.out.println("servletPath = " + servletPath);
        System.out.println("servletContext = " + servletContext);
        System.out.println("serverName = " + serverName);
        System.out.println("serverPort = " + serverPort);
    }
}
