package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Sdao;

import com.model.Smodel;



@WebServlet("/Scontroller")
public class Scontroller extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    public Scontroller()
    {
    	 super();
	} 
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("submit"))
		{
			Smodel model=new Smodel();
			model.setFirstname(request.getParameter("firstname"));
			model.setLastname(request.getParameter("lastname"));
			model.setGender(request.getParameter("gender"));
			model.setMobile(request.getParameter("mobile"));
			model.setEmail(request.getParameter("email"));
			model.setPassword(request.getParameter("password"));
			
			int x=new Sdao().student(model);
			if(x>0)
			{
				request.getRequestDispatcher("ViewTable.jsp").forward(request, response);
				
			}
			else
			{
				request.getRequestDispatcher("error.jsp").forward(request, response);
				
			}
			
		}
		System.out.println(request.getParameter("firstname"));
		System.out.println(request.getParameter("lastname"));
		System.out.println(request.getParameter("gender"));
		System.out.println(request.getParameter("mobile"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("password"));
	}

}
