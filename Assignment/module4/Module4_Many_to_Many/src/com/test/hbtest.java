package com.test;

import java.util.HashSet;
import java.util.Set;

import com.dao.hbdao;
import com.model.Reader;
import com.model.Subscription;

public class hbtest 
{
	public static void main(String[] args) 
	{
		hbdao dao=new hbdao();
		Set<Subscription>subscription=new HashSet<Subscription>();
		Subscription sb=new Subscription();
		sb.setSubscriptionname("amazon prime");
		dao.addSubsription(sb);
		
		
		Reader r=new Reader();
		r.setEmail("sutharvisu5602@gmail.com");
		r.setFirstname("himanshu");
		r.setLastname("suthar");
		dao.addReader(r);
	}
}
