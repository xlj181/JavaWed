package wed.com.demo2.dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import wed.com.demo2.dao.RedistersDao;
import wed.com.demo2.entity.Redisters;

import java.sql.SQLException;

public class RedistersDaoImpl  implements RedistersDao {
    private QueryRunner qr=new QueryRunner(new ComboPooledDataSource());
    @Override
    public void save(Redisters redisters) throws SQLException {
        String sql=" insert into redisters(username,password) values(?,?) ";
        qr.insert(sql,new BeanHandler<Redisters>(Redisters.class),redisters.getUsername(),redisters.getPassword());
    }


}
