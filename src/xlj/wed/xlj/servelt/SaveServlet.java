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

public class SaveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //2.获取前台数据
        String name=req.getParameter("name");
        Integer age=Integer.parseInt(req.getParameter("age"));
        String address=req.getParameter("address");
        Date birthday= new Date(new java.util.Date(req.getParameter("birthday")).getTime());
        Sanguo sanguo=new Sanguo(name,age,address,birthday);
        /*//创建dao
        SanguoDao sanguoDao=new SanguoDaoImpl();
        //保存
        sanguoDao.save(sanguo);*/

        SanguoService sanguoService=new SanguoServiceImpl();
        sanguoService.save(sanguo);

        //保存完之后该做什么  添加结束、删除结束、修改结束时
        //qeuryPeopleAll
        //重定向
        resp.sendRedirect(req.getContextPath()+"/querySanguoAll");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}