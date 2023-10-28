package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.dao.ProductDao;
import com.model.ProductModel;

@WebServlet("/ProductController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512, // 512MB
maxFileSize = 1024 * 1024 * 512, // 512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class ProductController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
   
    public ProductController() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
    private String extractfilename(Part file) 
    {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) 
	    {
	        if (string.trim().startsWith("filename")) 
	        {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
	if(action.equalsIgnoreCase("submit")) 
	{
	    String savePath = "D:\\java\\AssesmentJava\\src\\main\\webapp\\ProductImage";
	    File fileSaveDir=new File(savePath);
		if (!fileSaveDir.exists())
		{
			fileSaveDir.mkdir();
			
		}
		Part file=request.getPart("Image");
	 	String fileName=extractfilename(file);
	    file.write(savePath+File.separator+fileName);
	    String filePath=savePath+File.separator+fileName;
	    System.out.println(filePath);
	
		ProductModel pm=new ProductModel();
		pm.setName(request.getParameter("Name"));
		pm.setCategory(request.getParameter("Category"));
		pm.setModel(request.getParameter("Model"));
		pm.setPrice(request.getParameter("Price"));
		pm.setDescription(request.getParameter("Description"));
		pm.setImage(fileName);
		int x=new ProductDao().productHome(pm);
		if(x>0)
		{
			request.getRequestDispatcher("HomePage.jsp").forward(request, response);
		}
		else
		{
			request.getRequestDispatcher("AddProduct.jsp").forward(request, response);
			
		}
	}
	}

}
