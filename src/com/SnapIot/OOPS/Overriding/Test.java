package com.SnapIot.OOPS.Overriding;

class Parent
{
public void marriage()
{
	System.out.println("SubhaLakshmi");
	}
public void property()
{
	
	System.out.println("Will give if you marry subhalakshmi");
	}
}

class Child extends Parent
{
	public void marriage()
	{
		
		System.out.println("No to SubhaLakshmi");
		}
	
	
	public void loveMarriage()
	{
		
		System.out.println("Nayanthara");
		}
}
/*
 * No to SubhaLakshmi
Will give if you marry subhalakshmi

 */



public class Test 
{

	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.marriage();
		p.property();
		//p.LoveMarriage();
		Child c = new Child();
		c.marriage();
		c.loveMarriage();
		Parent p1 = new Child();
		p1.marriage();
		p1.property();
		//p1.loveMarriage();
		((Child) p1).loveMarriage();
		//Child p2 = (Child) new Parent();
		/*p2.marriage();
		p2.loveMarriage();
		p2.property();*/
		
		

	}

}
