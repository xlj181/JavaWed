package xlj.wed.demo2.servelt;

import xlj.wed.demo2.dao.PeopleDao;
import xlj.wed.demo2.dao.PeopleDaoImpl;
import xlj.wed.demo2.entity.People;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class QueryPeopleByIdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        Integer id=Integer.parseInt(req.getParameter("id"));
        PeopleDao peopleDao=new PeopleDaoImpl();
        People q=null;
        try {
            q=peopleDao.queryPeopleById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");

        out.println("<head><meta charset='UTF-8'><title>查询所有</title></head>");
        out.println("<body>");
        out.println("<table border='1' cellspacing='0'><br>");
        out.println("<tr><th>编号</th><th>姓名</th><th>性别</th><th>年龄" +
                "</th><th>地址</th><th>薪水</th><th>身份证</th></tr><br>");


            out.println("<tr><td>"+q.getId()+"</td><td>"+q.getName()+"</td><td>"+q.getSex()+
                    "</td><td>"+q.getAge()+"</td><td>"+q.getAddress()+"</td><td>"
                    +q.getAslary()+"</td><td>"+q.getIdcard()+"</td></tr><br>");


        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
