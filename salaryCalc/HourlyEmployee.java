package salaryCalc;

public class HourlyEmployee extends Employee {
	
	private double hoursWorked;
	private double hourlyRate;
	
	public HourlyEmployee() {
		super();
	}
	
	public HourlyEmployee(int employeeId, String firstName, String lastName, double hoursWorked, double hourlyRate) {
		super(employeeId,firstName,lastName);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public double getHoursWorked() {return this.hoursWorked;}
	public double getHourlyRate()  {return this.hourlyRate;}
	
	public void setHoursWorked(double hours) {this.hoursWorked = hours;}
	public void setHourlyRate(double rate) {this.hourlyRate = rate;}
	
	public double calculateSalary() {
		double salary = 0;
		double overtime = 0;
		
		if(hoursWorked > 40) {
			double hours = hoursWorked - 40;
			hoursWorked = 40;
			overtime = hours * (hourlyRate * 1.5);
		}
		
		return salary = (hoursWorked * hourlyRate) + overtime;	
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%-20s %.2f%n", "Salary: ", calculateSalary());
	}

}
