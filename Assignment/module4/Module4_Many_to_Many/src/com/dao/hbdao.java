package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Reader;
import com.model.Subscription;
import com.util.hbutil;

public class hbdao 
{
	Session session=null;
	Transaction tx=null;
	
	public void addReader(Reader r)
	{
		session=new hbutil().getsession();
		tx=session.beginTransaction();
		session.save(r);
		tx.commit();
		System.out.println("Readers Record Inserted...");
	}
	
	public void addSubsription(Subscription sb)
	{
		session= new hbutil().getsession();
		tx=session.beginTransaction();
		session.save(sb);
		tx.commit();
		System.out.println("Subscriptions Record Inserted...");
	}
}
