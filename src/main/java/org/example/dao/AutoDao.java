package org.example.dao;

import org.example.entity.Auto;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AutoDao {
    public void create (Auto auto) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(auto);
        tx.commit();
        session.close();

    }

    public Auto  read (int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Auto auto = session.get(Auto.class, id);
        tx.commit();
        session.close();
        return auto;
    }


    public void delete(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Auto auto = session.get(Auto.class, id);
        session.remove(auto);
        tx.commit();
        session.close();
    }
    public void update(Auto auto) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.merge(auto);
        tx.commit();
        session.close();

    }
}
