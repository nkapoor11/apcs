public class Staff extends Employee {
	private String jobTitle;
	
	public Staff() {
		jobTitle = "";
	}
		
	public Staff(String n, String a, String e, String p, Date b, String j) {
		name = n;
		address = a;
		email = e;
		phone = p;
		birthDate = b;
		jobTitle = j;
	} 
	
	public String toString() {
		System.out.println(getClass().getName() + " " + name);
		return getClass().getName() + name;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}

}