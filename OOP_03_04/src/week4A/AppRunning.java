package week4A;

public class AppRunning {

	public static void main(String[] args) {
		Employee Emp = new Employee();
		
		Emp.setName("Mario Di LakatoSchi");
		Emp.setSalary(-1);
		
		System.out.println(Emp.getDatas());
		
		Emp.SalaryGrowing(1);
		
		System.out.println(Emp.getDatas());
		
	}

}
