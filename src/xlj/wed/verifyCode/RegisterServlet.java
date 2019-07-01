package xlj.wed.verifyCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //获取你输入的验证码文本
        String vCode=req.getParameter("vCode");
        //获取数据
        HttpSession session=req.getSession();
        String text =(String) session.getAttribute("text");
        String msg=" ";
                //判断
        if(vCode.equalsIgnoreCase(text)){
            msg="验证成功！";
        }else{
            msg="验证码错误！";
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(msg);
    }
}
