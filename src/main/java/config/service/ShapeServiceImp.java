package config.service;

import config.dao.ShapeDao;
import config.model.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ShapeServiceImp implements ShapeService{

    @Autowired
    private ShapeDao shapeDao;


//    @Override
//    @Transactional
//    public long save(Shape config) {
//        return shapeDao.save(config);
//    }
//
//    @Override
//    @Transactional
//    public Shape get(long id) {
//        return shapeDao.get(id);
//    }

    @Override
    @Transactional
    public List<Shape> list() {
        return shapeDao.list();
    }

//    @Override
//    public void update(long id, Shape config) {
//        shapeDao.update(id,config);
//    }
//
//    @Override
//    public void delete(long id) {
//        shapeDao.delete(id);
//    }
}
