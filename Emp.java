package com.employeewage;

public class Emp {
		public static final int IS_PARTTIME_PRESENT = 2;
		public static final int IS_FULLTIME_PRESENT = 1;
		public static final int EMPLOYEE_WAGE_PERHOUR = 20;
		public static final int MAX_HOURS_ALLOWED = 100;
		public static final int DAYS_IN_A_MONTH = 20;
		public static void main(String[] args) {
			int monthlywage =0;
			int totalworkingDays =0;
			int totalEmployeeHours =0;
			
			while(totalEmployeeHours < MAX_HOURS_ALLOWED && totalworkingDays < DAYS_IN_A_MONTH) 
			{
				int dailyEmpwage =0;
				totalworkingDays++;
				int empHours = 0;
				
		double empcheck = Math.floor(Math.random()*10)%3;

		switch ((int)empcheck) {
		case IS_FULLTIME_PRESENT:
			empHours = 8;
			System.out.println("employee is present for full time");
			break;
		case IS_PARTTIME_PRESENT: 
			empHours = 4;
			System.out.println("employee is present for part time");
			break;

		default:
			empHours = 0;
			System.out.println("Employee is absent");
			break;
			}
			dailyEmpwage = EMPLOYEE_WAGE_PERHOUR * empHours;
			totalEmployeeHours = totalEmployeeHours * empHours;
			monthlywage = monthlywage +dailyEmpwage;
			System.out.println("employee wage is: "+ dailyEmpwage);
		}	
			System.out.println("total employee hours : "+ totalEmployeeHours);
			System.out.println("total employee working days : "+ totalworkingDays);
			System.out.println("monthly employee wage : "+ monthlywage);
	}
			
}
