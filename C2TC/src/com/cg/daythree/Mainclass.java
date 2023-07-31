package com.cg.daythree;

public class Mainclass {
	    public static void main(String[] args)
	    {
	        // This would invoke the parameterized constructor.
	    	Constructors c=new Constructors();
			
			Stud s1=new Stud(001,"Priya");  
			Stud s2=new Stud(002,"Malar");  
			
			s1.display();  
			s2.display(); 
	    }
}
	       