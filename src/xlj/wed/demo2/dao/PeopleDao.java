package xlj.wed.demo2.dao;

import xlj.wed.demo2.entity.People;

import java.sql.SQLException;
import java.util.List;

public interface PeopleDao {
    //查询
    public List<People> queryPeopleAll() throws SQLException;
    //查询个体
    public People queryPeopleById(Integer id) throws SQLException;
    // 添加
    public void addPeople(People people) throws SQLException;
    //修改
    public void updatePeople(People people) throws SQLException;
    //删除
    public void daletePeople(Integer id) throws SQLException;

}
