package salaryCalc;

public class CommissionEmployee extends Employee {
	
	private double commissionRate;
	private double totalSales;
	private double baseSalary;
	
	public CommissionEmployee() {
		super();
	}
	
	public CommissionEmployee(int employeeId, String firstName, String lastName, double commissionRate, double totalSales, double baseSalary) {
		super(employeeId, firstName, lastName);
		this.commissionRate = commissionRate;
		this.totalSales = totalSales;
		this.baseSalary = baseSalary;
	}
	
	public double getCommissionRate() {return this.commissionRate;}
	public double getTotalSales() {return this.totalSales;}
	public double getBaseSalary() {return this.baseSalary;}
	
	public void setCommissionRate(double rate) {this.commissionRate = rate;}
	public void setTotalSales(double sales) {this.totalSales = sales;}
	public void setBaseSalary(double salary) {this.baseSalary = salary;}
	
	public double calculateCommission() {
		return totalSales * commissionRate;
	}
	
	public double calculateSalary() {
		return calculateCommission() + baseSalary;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%-20s %.2f%n", "Salary: ", calculateSalary());
	}

}
