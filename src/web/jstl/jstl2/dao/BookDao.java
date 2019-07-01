package web.jstl.jstl2.dao;

import web.jstl.jstl2.entity.Book;
import web.jstl.jstl2.uitd.PageBean;
import xlj.wed.xlj.base.BaseDao;

import java.util.List;

public interface BookDao extends BaseDao<Book> {
  //重写
    public List<Book> selectAll(PageBean pageBean);
    //获取总条数
    public long  selectAllCount();

    public long selectAllCount(PageBean pageBean);
}
