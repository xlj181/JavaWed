package xlj.wed.demo2.servelt;

import xlj.wed.demo2.dao.PeopleDao;
import xlj.wed.demo2.dao.PeopleDaoImpl;
import xlj.wed.demo2.entity.People;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class DeletePeopleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        PeopleDao peopleDao=new PeopleDaoImpl();
        Integer id=Integer.parseInt(req.getParameter("id"));
        try {
            peopleDao.daletePeople(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("删除成功");
    }
}
