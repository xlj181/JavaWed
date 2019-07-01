package xlj.wed.xlj.dao.impl;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import xlj.wed.xlj.dao.SanguoDao;
import xlj.wed.xlj.entity.Sanguo;

import java.sql.SQLException;
import java.util.List;

public class SanguoDaoImpl implements SanguoDao {
    private QueryRunner queryRunner=new QueryRunner(new ComboPooledDataSource());
   //查询
    @Override
    public List<Sanguo> selectAll() {
        String sql=" select * from sanguo ";
        List<Sanguo> sanguoList=null;
        try {
            sanguoList = queryRunner.query(sql, new BeanListHandler<Sanguo>(Sanguo.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanguoList;
    }

    @Override
    public Sanguo selectById(Integer id) {
        String sql=" select * from sanguo where id=? ";
        Sanguo sanguo=null;
        try {
            sanguo=queryRunner.query(sql,new BeanHandler<Sanguo>(Sanguo.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sanguo;
    }

    //删除
    @Override
    public int delete(Integer id) {
        String sql=" delete from sanguo where id=? ";
        int i=0;
        try {
            i=queryRunner.update(sql,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    //添加
    @Override
    public void save(Sanguo sanguo) {
        String sql=" insert into sanguo(name,age,address,birthday) values(?,?,?,?) ";
        try {
            queryRunner.insert(sql,new BeanHandler<Sanguo>(Sanguo.class),sanguo.getName(),sanguo.getAge(),
                   sanguo.getAddress(),sanguo.getBirthday());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //修改
    @Override
    public int update(Sanguo sanguo) {
        String sql=" update sanguo set name=?,age=?,address=?,birthday=? where id=? ";
        int i=0;
        try {
            i=queryRunner.update(sql,sanguo.getName(),sanguo.getAge(),
                    sanguo.getAddress(),sanguo.getBirthday(),sanguo.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }
}
