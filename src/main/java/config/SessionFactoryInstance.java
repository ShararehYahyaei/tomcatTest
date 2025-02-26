package config;

import entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryInstance {
    private static final SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure()
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
