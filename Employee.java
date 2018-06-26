public class Employee extends Person {
	private Date hireDate;
	private double salary; 
	
	public Employee() {
		hireDate = new Date(0,0,0);
		salary = 0;
	}
		
	public Employee(String n, String a, String e, String p, Date b, Date h, double s) {
		name = n;
		address = a;
		email = e;
		phone = p;
		birthDate = b;
		hireDate = h;
		salary = s;
	} 
	
	public String toString() {
		System.out.println(getClass().getName() + " " + name);
		return getClass().getName() + name;
	}
	
	public Date getHireDate() {
		return hireDate;
	}
	
	public double getSalary() {
		return salary;
	}
}