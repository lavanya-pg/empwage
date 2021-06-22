package com.employeewage;

public class Emp {

	public static void main(String[] args) {
		int FULLDAY = 8;
		int WAGE_PERHOUR = 20;
		double IS_EMP_PRESENT = 1.0;
		double empcheck = Math.floor(Math.random()*10)%2;
		if(empcheck == IS_EMP_PRESENT)
		System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

}
