package web.jstl.jstl2.sevrice;

import web.jstl.jstl2.entity.Book;
import web.jstl.jstl2.uitd.PageBean;

import java.util.List;

public interface BookSevrice {
    //增删查改
    public List<Book> selectAll();

    public List<Book> selectAll(PageBean pageBean);

    public Book  selectById(Integer id);

    public int delete(Integer id);

    public void save(Book book);

    public int update(Book book);
}
