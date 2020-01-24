package com.openclassrooms.P6.Hibernate;

import com.openclassrooms.P6.User.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.io.File;
import java.sql.SQLException;
import java.util.List;

public class UserPersister {

    protected SessionFactory sessionFactory = null;

    public UserPersister() throws SQLException {

        File configFile = new File("hibernate.cfg.xml");

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure(configFile)
                .build();

        sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
    }


    public void createUser(User user) {
        updateUser(user);
    }

    public User readUser(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        User user = session.find(User.class,  id);
        session.getTransaction().commit();
        session.close();
        return user;
    }

    public void updateUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save( user ) ;
        session.getTransaction().commit();
        session.close();
    }


    public void deleteUser(User user) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete( user ) ;
        session.getTransaction().commit();
        session.close();
    }

    public List<User> listUsers() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List<User> users = (List<User>) session.createQuery( "from User" ).list();
        session.getTransaction().commit();
        session.close();
        return users;
    }
}
