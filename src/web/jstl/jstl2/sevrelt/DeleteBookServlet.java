package web.jstl.jstl2.sevrelt;

import web.jstl.jstl2.sevrice.BookSevrice;
import web.jstl.jstl2.sevrice.BookSevriceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //
        Integer id=Integer.parseInt(req.getParameter("id"));
        //
        BookSevrice bookSevrice=new BookSevriceImpl();
        //
        bookSevrice.delete(id);
        //
        resp.sendRedirect(req.getContextPath()+"/queryBookServlet");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        doGet(req,resp);
    }
}
