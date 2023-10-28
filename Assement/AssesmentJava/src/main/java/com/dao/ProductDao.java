package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.ProductModel;
import com.util.ProductDBUtil;

public class ProductDao 
{	Connection cn=null;	
	int x=0;
	public int productHome(ProductModel pm) 
	{
		
		cn=new ProductDBUtil().getConnectionData();
		String qry="insert into product(Name,Category,Model,Price,Description,Image)values(?,?,?,?,?,?)";
		try 
		{
			PreparedStatement st=cn.prepareStatement(qry);
			st.setString(1,pm.getName());
			st.setString(2,pm.getCategory());
			st.setString(3,pm.getModel());
			st.setString(4,pm.getPrice());
			st.setString(5,pm.getDescription());
			st.setString(6,pm.getImage());
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
