package xlj.wed.xlj.service;

import xlj.wed.xlj.entity.Sanguo;

import java.util.List;

public interface SanguoService {
    //增删查改
    public List<Sanguo> selectAll();

    public Sanguo  selectById(Integer id);

    public int delete(Integer id);

    public void save(Sanguo sanguo);

    public int update(Sanguo sanguo);
}
