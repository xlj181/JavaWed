package xlj.wed.xlj.servelt;

import xlj.wed.xlj.dao.SanguoDao;
import xlj.wed.xlj.dao.impl.SanguoDaoImpl;
import xlj.wed.xlj.entity.Sanguo;
import xlj.wed.xlj.service.SanguoService;
import xlj.wed.xlj.service.impl.SanguoServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取要修改页面提交的数据，把数据保存在数据库
        //1.设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        //2.获取页面参数
        Integer id = Integer.parseInt(req.getParameter("id")) ;
        String name=req.getParameter("name");
        Integer age=Integer.parseInt(req.getParameter("age"));
        String address=req.getParameter("address");
        Date birthday= new Date(new java.util.Date(req.getParameter("birthday")).getTime());


        //封装数据
        Sanguo sanguo=new Sanguo(id,name,age,address,birthday);
        //修改数据
       /* SanguoDao sanguoDao=new SanguoDaoImpl();
        sanguoDao.update(s);*/

        SanguoService sanguoService=new SanguoServiceImpl();
        sanguoService.update(sanguo);

        //重定向
        resp.sendRedirect(req.getContextPath()+"/querySanguoAll");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
