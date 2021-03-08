package week4;

public class Employee {

	String name;
	int Salary;
	
	public void SalaryGrowing(int value ) {
		Salary += value;
	}
	
	public String getDatas(){
		return "name: " + name + " Salary " + Salary;
	}
}
