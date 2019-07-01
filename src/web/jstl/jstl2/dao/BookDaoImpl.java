package web.jstl.jstl2.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import web.jstl.jstl2.entity.Book;
import web.jstl.jstl2.uitd.PageBean;

import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDao {
    private QueryRunner queryRunner=new QueryRunner(new ComboPooledDataSource());
    @Override
    public List<Book> selectAll() {
        String sql=" select * from book ";
        try {
           return queryRunner.query(sql,new BeanListHandler<Book>(Book.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Book selectById(Integer id) {
        String sql=" select * from book where id=? ";
        try {
           return queryRunner.query(sql,new BeanHandler<Book>(Book.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int delete(Integer id) {
        String sql=" delete from book where id=? ";
        try {
            return queryRunner.update(sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void save(Book book) {
    String sql=" insert into book values(null,?,?,?,?)";
        try {
            queryRunner.insert(sql,new BeanHandler<Book>(Book.class),book.getName(),
                    book.getAuthorName(),book.getPrice(),book.getPress());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public int update(Book book) {
        String sql=" update book set name=?,authorName=?,price=?,press=? where id=? ";
        try {
            return queryRunner.update(sql,book.getName(),
                    book.getAuthorName(),book.getPrice(),book.getPress(),book.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Book> selectAll(PageBean pageBean) {
        String sql=" select * from book where 1=1 ";
        //
        if(pageBean.getName()!=null && ! "".equals(pageBean.getName().trim()))
            sql += "    and  name like '%"+pageBean.getName()+"%'  ";
        if(pageBean.getAuthorName()!=null && ! "".equals(pageBean.getAuthorName().trim()))
            sql +=" and authorName like  '%"+pageBean.getAuthorName()+"%' ";
        if(pageBean.getPriceFrom()!=null && !"".equals(pageBean.getPriceFrom().trim()))
            sql +="     and price >= "+pageBean.getPriceFrom();
        if(pageBean.getPriceTo()!=null && !"".equals(pageBean.getPriceTo().trim()))
            sql +="     and price <= "+pageBean.getPriceTo();

        sql +=" limit ?,? ";
        int start=(pageBean.getPageIndex()-1)*pageBean.getPageSize();
        int pageSize=pageBean.getPageSize();
        try {
            return  queryRunner.query(sql,new BeanListHandler<Book>(Book.class),start,pageSize);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //获取总条数
    @Override
    public long selectAllCount() {
        String sql ="select count(*) from book ";
        try {
            return queryRunner.query(sql,new ScalarHandler<Long>());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public long selectAllCount(PageBean pageBean) {
        String sql = " select count(*) from book where 1=1 ";

        if(pageBean.getName()!=null && ! "".equals(pageBean.getName().trim()))
            sql += "    and  name like '%"+pageBean.getName()+"%'  ";
        if(pageBean.getAuthorName()!=null && ! "".equals(pageBean.getAuthorName().trim()))
            sql +=" and authorName like  '%"+pageBean.getAuthorName()+"%' ";
        if(pageBean.getPriceFrom()!=null && !"".equals(pageBean.getPriceFrom().trim()))
            sql +="     and price >= "+pageBean.getPriceFrom();
        if(pageBean.getPriceTo()!=null && !"".equals(pageBean.getPriceTo().trim()))
            sql +="     and price <= "+pageBean.getPriceTo();

        try {
            return queryRunner.query(sql,new ScalarHandler<Long>());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
