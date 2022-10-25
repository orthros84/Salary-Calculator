package salaryCalc;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employees [] = new Employee[3];
		
		employees[0] = new HourlyEmployee(1,"Rahul","Sharma",49,21.25);
		employees[1] = new SalariedEmployee(2,"Neha","Mital",9000);
		employees[2] = new CommissionEmployee(3,"Joe","Smith",0.5,1500,120000);
		
		for(int i=0; i < employees.length; i++) {
			System.out.println(employees[i]);
			System.out.println("\n");
		}
		

	}

}
