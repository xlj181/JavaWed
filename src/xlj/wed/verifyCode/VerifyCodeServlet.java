package xlj.wed.verifyCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class VerifyCodeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //创建验证码类对象
        VerifyCode vc=new VerifyCode();
       // 获取图片
        BufferedImage image=vc.createImage();
        //获取文本
        String text=vc.getText();
        //设置session域数据
        HttpSession session=req.getSession();
        session.setAttribute("text",text);
        //把图片响应到页面
        vc.output(image,resp.getOutputStream());
    }
}
