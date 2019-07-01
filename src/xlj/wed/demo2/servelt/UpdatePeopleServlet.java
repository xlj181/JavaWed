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

public class UpdatePeopleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        Integer id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String address = req.getParameter("address");
        Integer aslary = Integer.parseInt(req.getParameter("aslary"));
        Integer idcard = Integer.parseInt(req.getParameter("idcard"));

        People people=new People(id,name,sex,age,address,aslary,idcard);

        PeopleDao peopleDao=new PeopleDaoImpl();
        try {
            peopleDao.updatePeople(people);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("修改成功!");
    }
}
