package test;

import dao.hbdao;
import model.Address;
import model.Student;

public class hbtest 
{
	public static void main(String[] args) 
	{
		hbdao dao=new hbdao();
		Address ad=new Address();
		ad.setStreet("Street line");
		ad.setCity("");
		ad.setState("Gujarat");
		ad.setZipcode("12345");
		dao.address(ad);
		
		Student s=new Student();
		s.setStudentname("vishu");
		s.setAddress("rajpur");
		s.setAd(ad);
		dao.addstudent(s);	}
}
