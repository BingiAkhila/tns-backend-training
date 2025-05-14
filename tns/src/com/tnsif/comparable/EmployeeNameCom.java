package com.tnsif.comparable;

import java.util.Comparator;

public class EmployeeNameCom implements Comparator<Employee>{
//allen,candy,bobby
//allen-->e1
//candy-->e2
@Override
public int compare(Employee e1,
Employee e2) {
return e1.ename.compareTo(e2.ename);
}
}
