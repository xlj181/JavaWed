package web.jstl.jstl2.sevrelt;

import web.jstl.jstl2.entity.Book;
import web.jstl.jstl2.sevrice.BookSevrice;
import web.jstl.jstl2.sevrice.BookSevriceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //
        Integer id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String authorName=req.getParameter("authorName");
        Integer price=Integer.parseInt(req.getParameter("price"));
        String press=req.getParameter("press");
        //
        Book book=new Book(id,name,authorName,price,press);

        //
        BookSevrice bookSevrice=new BookSevriceImpl();
        bookSevrice.update(book);
        //
        resp.sendRedirect(req.getContextPath()+"/queryBookServlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
