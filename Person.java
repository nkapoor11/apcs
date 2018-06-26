public class Person {
	public String name;
	public String address;
	public String email;
	public String phone;
	public Date birthDate;
		
	public Person() {
		name = "";
		address = "";
		email = "";
		phone = "";
		birthDate = new Date(0,0,0);
	}
		
	public Person(String n, String a, String e, String p, Date b) {
		name = n;
		address = a;
		email = e;
		phone = p;
		birthDate = b;
	}
		
	public String toString() {
		System.out.println(getClass().getName() + " " + name);
		return getClass().getName() + name;
	}
		
	public String getName() {
		return name;
	}
		
	public String getAddress() {
		return address;
	}
		
	public String getEmail() {
		return email;
	}
		
	public String getPhone() {
		return phone;
	}
		
	public Date getBirthDate() {
		return birthDate;
	}
}