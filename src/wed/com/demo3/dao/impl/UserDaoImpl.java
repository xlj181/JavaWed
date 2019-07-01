package wed.com.demo3.dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import wed.com.demo3.dao.UserDao;
import wed.com.demo3.entity.User;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    //创建操作数据库的工具类
    private QueryRunner queryRunner =new QueryRunner(new ComboPooledDataSource());
    @Override
    public void vase(User user) throws SQLException {
        String sql=" insert into user(username,password) values(?,?) ";
        queryRunner.insert(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
    }

    @Override
    public User login(User user) throws SQLException {
        String sql=" selset * from user where username=? and password=? ";
        return queryRunner.query(sql,new BeanHandler<User>(User.class),user.getUsername(),user.getPassword());
    }
}
