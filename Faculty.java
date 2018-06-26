public class Faculty extends Employee {
	private String officeHours;
	private String rank; 
	
	public Faculty() {
		officeHours = "";
		rank = "";
	}
		
	public Faculty(String n, String a, String e, String p, Date b, String o, String r) {
		name = n;
		address = a;
		email = e;
		phone = p;
		birthDate = b;
		officeHours = o;
		rank = o;
	} 
	
	public String toString() {
		System.out.println(getClass().getName() + " " + name);
		return getClass().getName() + name;
	}
	
	public String getOfficeHours() {
		return officeHours;
	}
	
	public String getRank() {
		return rank;
	}
}