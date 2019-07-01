package xlj.wed.cookie;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cookie1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建时间
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyy-MM-dd&HH:mm:ss");
        String format=simpleDateFormat.format(new Date());
        //创建coolie
        Cookie cookie=new Cookie("lasttime",format);
        resp.addCookie(cookie);
        //获取请求中的cookie
        Cookie[] cookies=req.getCookies();
        String s="您第一次登入";
        //判断cookies是否存在
        if(cookies!=null) {
            for (Cookie c : cookies) {
                //获取指定cookie
                if ("lasttime".equals(c.getName())) {
                    String value = c.getValue();
                    s = "您上次登入的时间是：" + value;
                }
            }
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println(s);
    }



}
