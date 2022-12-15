package com.qa;

public class Demo1 {
	
	int i=1;
    public void subofmain()
    {
	       if(i<=5)
	       {
	          System.out.println(i);
	          i++;
	          subofmain();
	       }
    }
	public static void main(String[] args) {
		System.out.println("Hello Arun");
		
		Demo1 d=new Demo1();
		d.subofmain();

	}

}
