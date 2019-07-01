package xlj.wed.xlj.servelt;

import xlj.wed.xlj.dao.SanguoDao;
import xlj.wed.xlj.dao.impl.SanguoDaoImpl;
import xlj.wed.xlj.service.SanguoService;
import xlj.wed.xlj.service.impl.SanguoServiceImpl;


import java.io.IOException;

/*public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        //获取页面数据
        Integer id=Integer.parseInt(req.getParameter("id"));
       *//* //创建dao
        SanguoDao sanguoDao=new SanguoDaoImpl();
        //删除
        sanguoDao.delete(id);*//*

        SanguoService sanguoService=new SanguoServiceImpl();
        sanguoService.delete(id);



        //删除完毕之后应该做什么
        //应该要展示全部数据，发送/JavaWed/queryPeopleAll
        //使用重定向：因为是两次请求，消除请求域中的数据
        resp.sendRedirect(req.getContextPath()+"/querySanguoAll");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);

    }
}*/
