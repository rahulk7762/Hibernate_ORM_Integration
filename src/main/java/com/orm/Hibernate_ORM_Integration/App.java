package com.orm.Hibernate_ORM_Integration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.orm.config.HibernateConfig;
import com.orm.entities.User;


public class App 
{
    public static void main( String[] args ) {
        User user = new User("Kunal","male",22200);
        
        SessionFactory sf = HibernateConfig.getSessionfactory();
        Session session = sf.openSession();
      Transaction tx =  session.beginTransaction();
        
        
        session.persist(user);
        tx.commit();
    }
}
