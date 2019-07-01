package xlj.wed.demo1;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

public class HttpServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get请求");
        //获取字节流
        ServletOutputStream outputStream=resp.getOutputStream();
        //创建输入流
        FileInputStream fis=new FileInputStream("F:\\图片\\图片\\10.jpg");
        //传输图片
        int len;
        while ((len=fis.read())!=-1){
            outputStream.write(len);
        }
        //释放资源
        fis.close();
        outputStream.close();
    }
}
