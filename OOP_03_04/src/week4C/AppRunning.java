package week4C; 

public class AppRunning {

	public static void main(String[] args) {
		Employee[] empArray = new Employee[5];
		
		upload(empArray);
		print(empArray);
		Employee maxSalary = getTheBiggestSalary(empArray);
		System.out.println("\nThe employee whose have the biggest salary: " + maxSalary.getData()+"\n");
		System.out.println("Salary is between 100 to 500 : " + getEmpSalaryIntervalle(empArray,100,500)+"\n");
		System.out.println("The Average Salary: " + getAverageSalary(empArray));
		System.out.println("\nThe All Taxes paid: " + getTaxDivide(empArray));
		
	}
	private static void print(Employee[] empArray) {
		for (int i = 0; i < empArray.length; i++) {
			System.out.println(empArray[i].getData());
		}
	}
	private static void upload(Employee[] empArray) {
		for (int i = 0; i < empArray.length; i++) {
			empArray[i] = new Employee();
			empArray[i].setName("Ghandi Gandlafson\t"+(i+1)+"\t");
			empArray[i].setSalary((int)(Math.random()*500+100));
		}
	}
	private static Employee getTheBiggestSalary(Employee[] input) {
		Employee max = input[0];
		
		for(Employee emp : input) {
			if(emp.getSalary() > max.getSalary()) {
				max = emp;
			}
		}
		return max;
	}
	private static int getEmpSalaryIntervalle(Employee[] input, int Lower, int Higher) {
		int db = 0;
		for(Employee emp: input) {
			if(emp.getSalaryLimit(Lower,Higher)) {
				db++;
			}
		}
		return db;
	}
	private static double getTaxDivide(Employee[] input) {
		double sum = 0;
		for(Employee emp : input) {
			sum += emp.getTax();
		}
		return sum;
	}
	private static double getAverageSalary(Employee[] input) {
		double sum = 0;
		
		for(Employee emp : input) {
			sum += emp.getSalary();
		}
		
		return sum / input.length;
	}
	

}
