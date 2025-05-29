package com.tnsif.comparable;
import java.util.*;
public class EmployeeMain {
public static void main(String args[])
{
List<Employee> l=new ArrayList<Employee>();
l.add(new
Employee(101,"Allen",67893));
l.add(new
Employee(203,"Evan",57893));
l.add(new
Employee(301,"Bobby",20987));
l.add(new
Employee(102,"Candy",47893));
//retrieving data based on name sorting
System.out.println("Sort by name");
Collections.sort(l,new EmployeeNameCom());
for(Employee e:l) {
System.out.println(e.eid+","+e.ename+","+e.sal);
}
//retrieving data based on salary sorting
System.out.println("Sort by sal");
Collections.sort(l,new EmployeeSalcom());
for(Employee e:l) {
	System.out.println(e.eid+","+e.ename+","+e.sal);
			}
			}
			}


