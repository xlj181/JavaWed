package xlj.wed.xlj.service.impl;

import xlj.wed.xlj.dao.SanguoDao;
import xlj.wed.xlj.dao.impl.SanguoDaoImpl;
import xlj.wed.xlj.entity.Sanguo;
import xlj.wed.xlj.service.SanguoService;

import java.util.List;

public class SanguoServiceImpl implements SanguoService {
    //
    private SanguoDao sanguoDao=new SanguoDaoImpl();

    @Override
    public List<Sanguo> selectAll() {
        return sanguoDao.selectAll();
    }

    @Override
    public Sanguo selectById(Integer id) {
        return sanguoDao.selectById(id);
    }

    @Override
    public int delete(Integer id) {
        return sanguoDao.delete(id);
    }

    @Override
    public void save(Sanguo sanguo) {
        sanguoDao.save(sanguo);
    }

    @Override
    public int update(Sanguo sanguo) {
        return sanguoDao.update(sanguo);
    }
}
