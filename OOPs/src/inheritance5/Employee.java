package inheritance5;


class EmployeeSalary{
	public void salary(int baseSalary) {
		
		System.out.print("this will give Base salary :");
		System.out.println(baseSalary);
	}
	public void salary(int baseSalary,int bonus) {
		
		System.out.print("this will give Base salary + bonus :");
		System.out.println(baseSalary + bonus);
	}
	public void salary(int baseSalary,int bonus,int incentive) {
		
		System.out.print("this will give Base salary + bonus + incentive :");
		System.out.println(baseSalary+bonus+incentive);
	}
	
}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSalary emp=new EmployeeSalary();
		
		emp.salary(200000,2000);

	}

}
