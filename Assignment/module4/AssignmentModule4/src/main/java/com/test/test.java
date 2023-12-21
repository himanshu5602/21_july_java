package com.test;

import com.dao.HBDao;
import com.model.student;
import com.model.teacher;

public class test 
{
	public static void main(String[] args) 
	{
		HBDao dao=new HBDao();
		student st=new student();
		st.setStudentname("himanshu");
		st.setAddress("Savadaravas");
		st.setCity("Sidhpur");
		st.setStreet("rajpur");
		st.setState("gujrat");
		
		
		teacher tr=new teacher();
		tr.setTeachername("Prexaben");
		tr.setSubject("social science");
	}
}
