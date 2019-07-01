package wed.com.demo2.servlet;


import wed.com.demo2.dao.RedistersDao;
import wed.com.demo2.dao.impl.RedistersDaoImpl;
import wed.com.demo2.entity.Redisters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;


public class RedistersServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig)  {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //获取Http协议的请求和响应
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;
        //获取参数
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        //创建Redisters对象
        Redisters redisters=new Redisters(username,password);
        //调用dao保存数据
        RedistersDao redistersDao=new RedistersDaoImpl();
        try {
            redistersDao.save(redisters);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //在页面响应
        //设置响应类型为文本/html  并且设置页面字符集为utf-8
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer=response.getWriter();
        writer.println("注册成功了！");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
