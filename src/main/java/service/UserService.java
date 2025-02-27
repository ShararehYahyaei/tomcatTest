package service;

import entity.User;
import repository.UserRepository;
import config.SessionFactoryInstance;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        try (var session = SessionFactoryInstance.getSessionFactory().openSession()) {

            try {
                session.beginTransaction();
                User saveUser = userRepository.save(session, user);
                session.getTransaction().commit();
                return saveUser;

            } catch (Exception e) {
                e.printStackTrace();
                session.getTransaction().rollback();
            }
        }
        return null;
    }

    public User findUserById(Long id) {
        try (var session = SessionFactoryInstance.getSessionFactory().openSession()) {
            try {
                session.beginTransaction();
                User byId = userRepository.findById(session, id);
                session.getTransaction().commit();
                return byId;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public User findByUserName(String userName) {
        try (var session = SessionFactoryInstance.getSessionFactory().openSession()) {
            try {
                session.beginTransaction();
                User byId = userRepository.findByUserName(session, userName);
                session.getTransaction().commit();
                return byId;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public List<User> users() {
        try (var session = SessionFactoryInstance.getSessionFactory().openSession()) {
            try {
                session.beginTransaction();
                List<User> all = userRepository.findAll(session);
                session.getTransaction().commit();
                return all;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;

    }

}
