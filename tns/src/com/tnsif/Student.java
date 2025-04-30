package com.tnsif;

public class Student {
	int sid;
	String sname;
	static String collegename="Sri indu";
	 void display() {
		 System.out.println("The details of the student"
				 		+sid+","+sname+","+collegename);
	 }



	public static void main(String[] args) {
		Student ob=new Student();
	     ob.sid=101;
	     ob.sname="kavya";
	     ob.display();
	    
	     Student o=new Student();
	     o.sid=102;
	     o.sname="kavitha";
	     o.display();
	    
	     Student b=new Student();
	     b.sid=103;
	     b.sname="Bobby";
	     b.display();


	}

}
