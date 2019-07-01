package wed.com.demo3.servlet;

import wed.com.demo3.dao.UserDao;
import wed.com.demo3.dao.impl.UserDaoImpl;
import wed.com.demo3.entity.User;

import javax.lang.model.element.NestingKind;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class LoginServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

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
        //
        User user=new User(username,password);
        //
        UserDao LoginuserDao=new UserDaoImpl();
        try {
            LoginuserDao.login(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String mag;
        if(LoginuserDao!=null){
            mag="登录成功";
        }else{

            mag="登录失败";
        }
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print(mag);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
