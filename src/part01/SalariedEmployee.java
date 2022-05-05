package part01;

//Pujan Gautam - c0842623
//Project Part-01
//Submission Date: 4/19/2022

public class SalariedEmployee extends Employee  {
	private double weeklySalary;
	
	public SalariedEmployee(String fName, String lName, String sinNumber,double weeklySalary) {
		super(fName,lName,sinNumber);
		this.weeklySalary = weeklySalary;
	}
	
	
	@Override
	public double earnings() {
		return this.weeklySalary;
	}
	
	@Override
	public String toString() {
		return "Type: Salaried\n"+
				"Name: "+this.firstName+ " "+this.lastName+"\n"+
				"SIN: "+this.sinNumber+"\n"+
				"Weekly Salary: $"+this.weeklySalary+"\n";
	}

	
	//getter and setter

	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	
	

	
}
