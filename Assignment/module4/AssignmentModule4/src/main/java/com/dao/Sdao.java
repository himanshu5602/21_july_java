package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.model.Smodel;
import com.util.Sutil;

public class Sdao
{

	Connection cn=null;
	int x=0;
	public int student(Smodel model) 
	{
		cn=new Sutil().getConnectionData();
		String qry="insert into student(firstname,lastname,email,mobile,gender,password) values(?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1,model.getFirstname());
			st.setString(2,model.getLastname());
			st.setString(3,model.getEmail());
			st.setString(4,model.getMobile());
			st.setString(5, model.getGender());
			st.setString(6,model.getPassword());
			x=st.executeUpdate();
			cn.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return x;
	}
}
