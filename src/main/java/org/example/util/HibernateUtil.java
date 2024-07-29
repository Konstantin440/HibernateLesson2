package org.example.util;


import org.example.entity.Auto;
import org.example.entity.Engine;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null){
            sessionFactory = new Configuration()
                    .configure()
                    .addAnnotatedClass(Auto.class)
                    .addAnnotatedClass(Engine.class)
                    .buildSessionFactory();
        }

        return sessionFactory;
    }
    public static void closeSessionFactory() {
        if (sessionFactory != null){
            sessionFactory.close();
        }
    }
}
