package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Cart;
import model.Item;
import util.dbutil;

public class hbdao 
{
	Session session=null;
	Transaction tx=null;
	
	public void addcart(Cart c)
	{
		session=new dbutil().getsession();
		tx=session.beginTransaction();
		session.save(c);
		session.close();
		System.out.println("Cart Record Inserted...");
	}
	
	public void additem(Item i)
	{
		session=new dbutil().getsession();
		tx=session.beginTransaction();
		session.save(i);
		tx.commit();
		session.close();
		System.out.println("Item Record Inserted...");
	}
}
