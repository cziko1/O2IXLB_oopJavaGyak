package week4;

public class AppRunning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Emp = new Employee();

		Emp.name = "Fernando Von Lakatos";
		Emp.Salary = -1;
		
		System.out.println(Emp.getDatas());
		
		Emp.SalaryGrowing(10);
		System.out.println(Emp.getDatas());
		
	}

}
