package xlj.wed.demo1;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HttpServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get请求");
        resp.setContentType("text/html;charset=utf-8");
        //获取字符流
        PrintWriter writer=resp.getWriter();
        writer.print("<H1>Hello 你好！</H1>");
    }
}
