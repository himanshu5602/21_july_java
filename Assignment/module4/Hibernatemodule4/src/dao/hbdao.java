package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Address;
import model.Student;
import util.hbutil;

public class hbdao 
{
	Session session=null;
	Transaction tx=null;
	
	public void addstudent(Student s)
	{
		session=new hbutil().getsession();
		tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("Student Record Inserted...");
	}
	
	public void addadress(Address ad)
	{
		session=new hbutil().getsession();
		tx=session.beginTransaction();
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("Address Record Inserted...");
	}
}
