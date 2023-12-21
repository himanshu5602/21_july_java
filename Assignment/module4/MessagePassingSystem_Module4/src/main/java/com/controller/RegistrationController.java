package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.Registerdao;
import com.model.Usermodel;


@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegistrationController()
    {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		Usermodel rmodel=new Usermodel();
		rmodel.setFname(request.getParameter("fname"));
		rmodel.setFname(request.getParameter("lname"));
		rmodel.setFname(request.getParameter("email"));
		rmodel.setFname(request.getParameter("mobile"));
		rmodel.setFname(request.getParameter("password"));
		
		int x=new Registerdao().doRegister(rmodel);
		
		if(x>0)
		{
			request.setAttribute("msg", "Record Inserted...");
			response.sendRedirect("login.jsp");
		}
		else
		{
			request.setAttribute("msg", "Record Not Inserted...");
			request.getRequestDispatcher("register.jsp");
		}
	}

}
