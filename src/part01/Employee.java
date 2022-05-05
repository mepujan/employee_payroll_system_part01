package part01;

//Pujan Gautam - c0842623
//Project Part-01
//Submission Date: 4/19/2022

public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected Employee managedBy;
	protected String sinNumber;
	
	public static int numEmployee;
	
	/**
	 * 
	 * @param fName
	 * @param lName
	 * @param sinNumber
	 */
	public Employee(String fName, String lName, String sinNumber) {
		this.firstName = fName;
		this.lastName = lName;
		this.sinNumber = sinNumber;
		Employee.numEmployee++;
	}
	
	/**
	 * 
	 * @return number of employees in the system
	 */
	
	public static int count() {
		return numEmployee;
	}
	
	
	//abstract earning method
	public abstract double earnings();
	
	
	/**
	 * @return true if sin number of both object are equal otherwise false
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Employee) {
			Employee empToCompare = (Employee) obj;
			return this.sinNumber == empToCompare.sinNumber;
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "Name: "+ this.firstName + " "+ this.lastName + "\n"+
				"SIN Number: "+ this.sinNumber;
	}
	
	//getter and setter

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(String sinNumber) {
		this.sinNumber = sinNumber;
	}
	
	public Employee getManager() {
		return this.managedBy;
	}
	
	public void setManager(Employee mgr) {
		this.managedBy = mgr;
	}

	
}
