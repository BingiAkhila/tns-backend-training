package com.tnsif;
//Demo for Encapsulation
public class Employee {
	private int eid;
	private String ename;
	private float sal;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid=eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal=sal;
	}
public static void main(String args[]) {
	Employee ob=new Employee();
	ob.setEid(12);
	ob.setEname("Akhila");
	ob.setSal(30000);
	
	System.out.println("Employee ID:"+ob.getEid());
	System.out.println("Employee Name:"+ob.getEname());
	System.out.println("Employee Salary:"+ob.getSal());
}
}

