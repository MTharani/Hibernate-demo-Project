package com.edu;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		//Student sob=new Student();
		//sob.setSid(2);
		//sob.setSname("sai");
		
        Configuration conn=new Configuration().configure().addAnnotatedClass(Student.class);	
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(conn.getProperties()).buildServiceRegistry();
        SessionFactory sf=conn.buildSessionFactory(reg);
        Session sess=sf.openSession();
       Transaction tx=sess.beginTransaction();
       //retried selected record
       // Student s=(Student) sess.get(Student.class, 1);
        //System.out.println(s);
        //sess.save(sob);
       
       //retried all record
   /**  Query q =sess.createQuery("from Student");
     Iterator<Student> s=q.iterate();
     while(s.hasNext())
     {
    	 Student st=s.next();
    	 System.out.println(st.getSid()+" "+st.getSname());
     }
     **/
     Student s=new Student();
     s.setSid(2);
     sess.delete(s);

        tx.commit();
        		
	}

}
