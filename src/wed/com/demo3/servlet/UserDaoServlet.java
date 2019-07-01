package wed.com.demo3.servlet;

import wed.com.demo3.dao.UserDao;
import wed.com.demo3.dao.impl.UserDaoImpl;
import wed.com.demo3.entity.User;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class UserDaoServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        HttpServletResponse response=(HttpServletResponse)servletResponse;

        String username=request.getParameter("username");
        String password=request.getParameter("password");

        User user=new User(username,password);

        UserDao userDao=new UserDaoImpl();
        try {
            userDao.vase(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer=response.getWriter();
        writer.print("注册成功了！");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
