package config.dao;

import config.model.Circle;
import config.model.Rectangle;
import config.model.Shape;
import config.model.Square;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ShapeDaoImp implements ShapeDao{

    @Autowired
    private EntityManager entityManager;

    public Session getSessionFactory(){return entityManager.unwrap(Session.class);}


//
//    @Override
//    public long save(Shape config) {
//        Circle circle = new Circle();
//        circle.setRadius(5);
//        Square square = new Square();
//        square.setLength(5);
//        sessionFactory.getCurrentSession().save(circle);
//        sessionFactory.getCurrentSession().save(square);
//        return config.getId();
//    }
//
//    @Override
//    public Shape get(long id) {
//        return sessionFactory.getCurrentSession().get(Shape.class, id);
//    }

    @Override
    public List<Shape> list() {
        Session currentSession = getSessionFactory();

        Circle circle = new Circle();circle.setColor("blue");circle.setRadius(7);
        Rectangle rectangle = new Rectangle();rectangle.setHeight(5);rectangle.setWidth(6);rectangle.setColor("pink");
        Square square = new Square();square.setLength(6);square.setColor("white");

        currentSession.saveOrUpdate(circle);currentSession.saveOrUpdate(rectangle);currentSession.saveOrUpdate(square);

        CriteriaQuery<Shape> criteriaQuery = currentSession.getCriteriaBuilder().createQuery(Shape.class);
        criteriaQuery.from(Shape.class);
        List<Shape> shapeList = currentSession.createQuery(criteriaQuery).getResultList();
        return shapeList;
    }
//
//    @Override
//    public void update(long id, Shape config) {
//        Session session = sessionFactory.getCurrentSession();
//        Shape shape1 = session.byId(Shape.class).load(id);
//    }
//
//    @Override
//    public void delete(long id) {
//        Session session = sessionFactory.getCurrentSession();
//        Shape config = session.byId(Shape.class).load(id);
//        session.delete(config);
//    }
}
