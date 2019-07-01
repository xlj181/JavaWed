package web.jstl.jstl2.sevrelt;

import web.jstl.jstl2.entity.Book;
import web.jstl.jstl2.sevrice.BookSevrice;
import web.jstl.jstl2.sevrice.BookSevriceImpl;
import web.jstl.jstl2.uitd.PageBean;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class QueryBookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        //
        PageBean pageBean=new PageBean();
        //获取当前页面
        String pageIndex=req.getParameter("pageIndex");
        //判断
        if(pageIndex==null|| pageIndex==""){
            pageIndex="1";
        }
        //
        pageBean.setPageIndex(Integer.parseInt(pageIndex));
        //
        String name=req.getParameter("name");
        String authorName=req.getParameter("authorName");
        String priceFrom=req.getParameter("priceFrom");
        String priceTo = req.getParameter("priceTo");
        //
        pageBean.setName(name);
        pageBean.setAuthorName(authorName);
        pageBean.setPriceFrom(priceFrom);
        pageBean.setPriceTo(priceTo);

        //2.调用service层
        BookSevrice bookSevrice=new BookSevriceImpl();
        List<Book> books = bookSevrice.selectAll(pageBean);
        //设置参数
        req.setAttribute("books",books);
        //
        req.setAttribute("pageBean",pageBean);
        //请求转发给jsp
        req.getRequestDispatcher("/jstl2/list.jsp").forward(req,resp);

    }
}
