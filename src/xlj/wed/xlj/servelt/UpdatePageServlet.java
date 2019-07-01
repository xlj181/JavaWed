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

public class UpdatePageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取要修改的数据，把数据给修改页面
        //1.设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //2.获取数据 id
       Integer id=Integer.parseInt(req.getParameter("id"));
       //获取单条数据
         /*SanguoDao sanguoDao=new SanguoDaoImpl();
        Sanguo sanguo= sanguoDao.selectById(id);*/

        SanguoService sanguoService=new SanguoServiceImpl();
        Sanguo sanguo=sanguoService.selectById(id);


        //把数据传递给修改页面
        req.setAttribute("sanguo",sanguo);
        //请求转发
        req.getRequestDispatcher("/crud/edit.jsp").forward(req,resp);


    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
