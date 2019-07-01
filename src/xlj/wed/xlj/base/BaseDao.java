package xlj.wed.xlj.base;

import java.util.List;

public interface BaseDao<T>{
    //增删查改
    public List<T> selectAll();

    public T  selectById(Integer id);

    public int delete(Integer id);

    public void save(T t);

    public int update(T t);
}
