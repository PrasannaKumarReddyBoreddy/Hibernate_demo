package com.tyss.demoproject;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student st = new Student();
    	st.setMarks(95.324);
    	st.setSid(101);
    	st.setSName("Boreddy");
       // System.out.println( "Hello World!" );
    	Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
    	ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

    	SessionFactory factory = con.buildSessionFactory();
    	Session session =factory.openSession();
    	org.hibernate.Transaction tx = session.beginTransaction();
    	session.save(st);
    	tx.commit();
    	
    	
    }
}
