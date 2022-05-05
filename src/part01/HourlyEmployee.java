package part01;

//Pujan Gautam - c0842623
//Project Part-01
//Submission Date: 4/19/2022


public class HourlyEmployee extends Employee  {
	private double hourlyRate;
	private double hoursWorked;
	
	
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param sinNumber
	 * @param hourlyRate
	 * @param hoursWorked
	 */
	public HourlyEmployee(String fName, String lName, String sinNumber,double hourlyRate,double hoursWorked) {
		super(fName,lName,sinNumber);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	/**
	 * returns the earnings of the employee
	 */
	@Override
	public double earnings() {
		if(this.hoursWorked <= 40)
			return this.hourlyRate * hoursWorked;
		else
		{
			double overtime = this.hourlyRate - 40;
			return (this.hourlyRate * 40)+ (overtime *1.5); 
		}
			
	}
	
	/**
	 * return string representation of HourlyEmployee Class
	 */
	@Override
	public String toString() {
		return "Type: Hourly\n"+
				"Name: "+this.firstName+ " "+this.lastName+"\n"+
				"SIN: "+this.sinNumber+"\n"+
				"Hours Worked: "+this.hoursWorked+"\n"+
				"Hourly Rate: $"+this.hourlyRate+"\n";
		
	}
	
	//getter and setter

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
}
