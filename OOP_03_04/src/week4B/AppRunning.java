package week4B;

public class AppRunning {

	public static void main(String[] args) {
			Employee Emp = new Employee();
			
			Emp.setName("Ricardo De Ronteau");
			Emp.setSalary(10000);
			
			System.out.println(Emp.getDatas());
			
			Emp.SalaryGrowing(35000);
			System.out.println(Emp.getDatas());
			
			System.out.println(Emp.getSalaryLimit(9000, 15000));
			System.out.println("The value Of Tax: " + Emp.getTax());
			
			Employee other = new Employee();
			other.setName("White Noir Nguen Johanssen");
			other.setSalary(9000);
			System.out.println(other.getDatas());
			
			if(Emp.getEmpSalaryBiggerThan(other)) {
				System.out.println(Emp.getDatas()+"'s Salary is bigger");
			}else {
				System.out.println(other.getDatas()+"'s Salary is bigger");
			}
	}

}
