package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.student;
import com.model.teacher;
import com.util.HBUtil;

public class HBDao 
{
	Session session=null;
	Transaction tx=null;
	public void addstudent(student s)
	{
		session=new HBUtil().getSessionData();
		tx=session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		System.out.println("student recored inserted");
	}
	public void addteacher(teacher t)
	{
		session=new HBUtil().getSessionData();
		tx=session.beginTransaction();
		session.save(t);
		tx.commit();
		session.close();
		System.out.println("student recored inserted");
	}
}

