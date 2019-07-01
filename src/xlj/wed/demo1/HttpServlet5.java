package xlj.wed.demo1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HttpServlet5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");

        String ip=req.getRemoteAddr();
        if("0:0:0:0:0:0:0:1".equals(ip)){
            resp.getWriter().println("查封了");
        }else{
            resp.getWriter().println("可以使用");
        }
    }
}
