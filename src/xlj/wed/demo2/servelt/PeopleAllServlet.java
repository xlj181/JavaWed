package xlj.wed.demo2.servelt;

import xlj.wed.demo2.dao.PeopleDao;
import xlj.wed.demo2.dao.PeopleDaoImpl;
import xlj.wed.demo2.entity.People;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

/*public class PeopleAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置字符集
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        //创建dao 层
        PeopleDao peopleDao=new PeopleDaoImpl();

        List<People> peopleList=null;

        try {
            peopleList=peopleDao.queryPeopleAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //响应
        resp.setContentType("text/html;charset=utf-8");

        PrintWriter out = resp.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='en'>");

        out.println("<head><meta charset='UTF-8'><title>查询所有</title></head>");
        out.println("<body>");
        out.println("<table border='1' cellspacing='0'><br>");
        out.println("<tr><th>编号</th><th>姓名</th><th>性别</th><th>年龄" +
                "</th><th>地址</th><th>薪水</th><th>身份证</th></tr><br>");

       for(People q:peopleList){

           out.println("<tr><td>"+q.getId()+"</td><td>"+q.getName()+"</td><td>"+q.getSex()+
                   "</td><td>"+q.getAge()+"</td><td>"+q.getAddress()+"</td><td>"
                   +q.getAslary()+"</td><td>"+q.getIdcard()+"</td></tr><br>");

       }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}*/
