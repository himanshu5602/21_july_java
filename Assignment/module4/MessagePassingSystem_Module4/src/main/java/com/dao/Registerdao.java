package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Usermodel;
import com.util.dbutil;

public class Registerdao 
{
	Connection cn=null;
	int x=0;
	public int doRegister(Usermodel rmodel)
	{
		cn=new dbutil().getconnection();
		try
		{
			PreparedStatement st=cn.prepareStatement("insert into message(fname,lname,email,mobile,password) values(?,?,?,?,?)");
			st.setString(1, rmodel.getFname());
			st.setString(2, rmodel.getLname());
			st.setString(3, rmodel.getEmail());
			st.setString(4, rmodel.getMobile());
			st.setString(5, rmodel.getPassword());
			
			x=st.executeUpdate();
			cn.close();
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return x;
}
}
