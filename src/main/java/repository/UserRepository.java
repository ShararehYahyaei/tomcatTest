package repository;

import entity.User;
import org.hibernate.Session;

import java.util.List;


public class UserRepository {

    public User save(Session session, User user) {
        session.persist(user);
        return user;
    }

    public User findById(Session session, Long id) {
        User user = session.get(User.class, id);
        return user;

    }

    public User findByUserName(Session session, String userName) {
        return session.createQuery("FROM User u WHERE u.username =:userName", User.class)
                .setParameter("userName", userName).uniqueResult();

    }

    public List<User> findAll(Session session) {
        return session.createQuery("FROM User").list();
    }


}
