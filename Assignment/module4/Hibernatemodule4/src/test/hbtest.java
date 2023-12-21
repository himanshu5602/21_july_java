package test;

import dao.hbdao;
import model.Address;
import model.Student;

public class hbtest 
{
	public static void main(String[] args) 
	{
		hbdao dao=new hbdao();
		Address add=new Address();
		add.setStreet("Street line");
		add.setCity("Bhavnagar");
		add.setState("Gujarat");
		add.setZipcode("12345");
		dao.addadress(add);
		
		Student s=new Student();
		s.setStudentname("Aniket");
		s.setAddress("Bhavnagar");
		dao.addstudent(s);
	}
}
