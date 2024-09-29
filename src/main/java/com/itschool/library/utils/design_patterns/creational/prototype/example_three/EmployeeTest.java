package com.itschool.library.utils.design_patterns.creational.prototype.example_three;

import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees)  emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Robert");
        List<String> list2 = empsNew1.getEmpList();
        list.add("Karinya");

        	System.out.println("emps List: "+emps.getEmpList());
		System.out.println("empsNew List: "+list);
		System.out.println("empsNew1 List: "+list2);
     }
}