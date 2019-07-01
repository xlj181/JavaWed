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
import java.util.List;


public class QuerySanguoAllServleet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        /*//创建dao
      SanguoDao sanguoDao=new SanguoDaoImpl();
        //调用方法返回结果
        List<Sanguo> sanguoList = sanguoDao.selectAll();*/

        SanguoService sanguoService=new SanguoServiceImpl();
        List<Sanguo> sanguoList=sanguoService.selectAll();


        //设置参数
        req.setAttribute("sanguoList",sanguoList);

        //请求转发给jsp
        req.getRequestDispatcher( "crud/list.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        this.doGet(req,resp);
    }
}
