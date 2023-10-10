package mypack;

import java.util.ArrayList;
import java.util.List;

class product
{
	String productId,pname;
	float Price;
	product(String productId,String pname,float price)
	{
		this.productId=productId;
		this.pname=pname;
		this.Price=price;
	}
	
}
class customer
{
	String cusId,password;
	double phonenum;
	customer(String cusId,String password,double phonenum)
	{
		this.cusId=cusId;
		this.phonenum=phonenum;
		this.password=password;
	}
}
public class TwoClass {

	public static void main(String[] args) 
	{
		List <product> a1=new ArrayList<product>();
		product p1=new product("naga1234","naga",85.78f);
		product p2=new product("hamam546","hamam",47.78f);
		product p3=new product("goodday987","good day",85.78f);
		a1.add(p3);
		a1.add(p1);
		a1.add(p2);
		for(product s:a1)
		{
			System.out.println(s.productId+" "+s.pname+" "+s.Price);
		}
	
		List <customer> a2=new ArrayList<customer>();
		customer c1=new customer("kishore1234","kishore ssabari",8567875695d);
		customer c2=new customer("sahul546","sahulhammed",7397187047d);
		customer c3=new customer("tharani987","Tharani",8587964567d);
		a2.add(c2);
		a2.add(c1);
		a2.add(c3);
		for(customer s:a2)
		{
			System.out.println(s.cusId+" "+s.password+" "+s.phonenum);
		}
		
		

	}

}
