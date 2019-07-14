package config.service;

import config.model.Shape;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShapeService {

//    long save(Shape config);
//    Shape get(long id);
    List<Shape> list();
//    void update(long id, Shape config);
//    void delete(long id);
}
