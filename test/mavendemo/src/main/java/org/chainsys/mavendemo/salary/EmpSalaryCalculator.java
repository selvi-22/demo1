package org.chainsys.mavendemo.salary;

public class EmpSalaryCalculator {

	public static void main(String[] args) {
		float yearlyTakeHome = yearlyTakeHome();
		
		boolean promotion = promotion(2);
		System.out.println(promotion);
		//String role = roles("admin");
		//System.out.println(role);

	}

	public static boolean promotion(int yearsOfExp) {
		String roles = roles("admin");
		if (yearsOfExp > 6) {
			System.out.println("Yes promotion avaiabe");
			return true;
		} else
			return false;
	}

	public static String roles(String designation) {
		if (designation.equals("developer"))
			return "you  are into development";
		else
			return "you are into admin";
	}

//return ty
	public static float yearlyTakeHome() {
		int gross = 30000;
		// int deduction = 200;\
		int deductions = deductions(300, 150, 100);
		int salary = gross - deductions;
		
		return salary;
	}

	public static int deductions(int HRA, int MA, int food) {
		int deduction = HRA + MA + food;//5000
		return deduction;

	}
}
