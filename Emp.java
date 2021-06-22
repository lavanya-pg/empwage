package com.employeewage;

public class Emp {

	public static void main(String[] args) {
		int IS_PARTTIME_PRESENT = 2;
		int IS_FULLTIME_PRESENT = 1;
		int WAGE_PERHOUR = 20;
		int FULLDAY_HOUR = 8;
		int PARTTIME_HOUR = 4;
		int dailywage = 0;
		double empcheck = Math.floor(Math.random()*10)%3;
		System.out.println(empcheck);
		if(IS_FULLTIME_PRESENT == empcheck) {
		System.out.println("Employee is present");
		dailywage = WAGE_PERHOUR * FULLDAY_HOUR;
		} 
		else if(IS_PARTTIME_PRESENT == empcheck) {
			System.out.println("Employee is present for partime");
			dailywage = WAGE_PERHOUR * PARTTIME_HOUR;
			}
		else {
			System.out.println("Employee is absent");
		}
			
		}
}
