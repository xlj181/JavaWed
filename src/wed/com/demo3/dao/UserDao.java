package wed.com.demo3.dao;

import wed.com.demo3.entity.User;

import java.sql.SQLException;

public interface UserDao {
    public void vase(User user) throws SQLException;
    //
    public User login(User user) throws SQLException;
}
