package web.jstl.jstl2.sevrice;

import web.jstl.jstl2.dao.BookDao;
import web.jstl.jstl2.dao.BookDaoImpl;
import web.jstl.jstl2.entity.Book;
import web.jstl.jstl2.uitd.PageBean;

import java.util.List;

public class BookSevriceImpl implements BookSevrice {
    private BookDao bookDao=new BookDaoImpl();
    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public Book selectById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public int delete(Integer id) {
        return bookDao.delete(id);
    }

    @Override
    public List<Book> selectAll(PageBean pageBean) {
        //获取总条数
        long lo = bookDao.selectAllCount(pageBean);
        //计算出总页数
        int totalCount =(int)lo;
        int totalPage =(totalCount%pageBean.getPageSize()==0)?totalCount/pageBean.getPageSize() :totalCount/pageBean.getPageSize()+1;
        pageBean.setTotalPage(totalPage);
        pageBean.setTotalCount(totalCount);

        return bookDao.selectAll(pageBean);

    }

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public int update(Book book) {
        return bookDao.update(book);
    }
}
