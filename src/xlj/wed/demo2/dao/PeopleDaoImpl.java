package xlj.wed.demo2.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import xlj.wed.demo2.entity.People;

import java.sql.SQLException;
import java.util.List;

public class PeopleDaoImpl implements PeopleDao {
    private QueryRunner queryRunner=new QueryRunner(new ComboPooledDataSource());
    //查询
    @Override
    public List<People> queryPeopleAll() throws SQLException {
        String sql=" select * from people ";
        return queryRunner.query(sql,new BeanListHandler<People>(People.class));
    }
    //查询个体
    @Override
    public People queryPeopleById(Integer id) throws SQLException {
        String sql=" select * from people where id=?";
        return queryRunner.query(sql,new BeanHandler<People>(People.class),id);
    }
    //添加
    @Override
    public void addPeople(People people) throws SQLException {
        String sql=" insert into people(id,name,sex,age,address,aslary,idcard) values(?,?,?,?,?,?,?)";
        queryRunner.insert(sql,new BeanHandler<People>(People.class),people.getId(),people.getName(),people.getSex(),people.getAge()
        ,people.getAddress(),people.getAslary(),people.getIdcard());
    }
    //修改
    @Override
    public void updatePeople(People people) throws SQLException {
        String sql=" update people set name=?,sex=?,age=?,address=?,aslary=?,idcard=? where id=?";
        queryRunner.insert(sql,new BeanHandler<People>(People.class),people.getName(),people.getSex(),people.getAge()
                ,people.getAddress(),people.getAslary(),people.getIdcard(),people.getId());
    }
    //删除
    @Override
    public void daletePeople(Integer id) throws SQLException {
        String sql=" delete from people where id=? ";
        queryRunner.update(sql,id);
    }
}
