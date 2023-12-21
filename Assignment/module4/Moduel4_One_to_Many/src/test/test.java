package test;

import dao.hbdao;
import model.Cart;
import model.Item;

public class test 
{
	public static void main(String[] args) 
	{
		hbdao dao=new hbdao();
		Cart c=new Cart();
		c.setName("periperi pizza");
		c.setTotal(2);
		
		Item i=new Item();
		i.setItemid("1");
		i.setItemtotal(2);
		i.setQuantity(1);
	}

}
