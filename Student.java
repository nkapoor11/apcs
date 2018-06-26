public class Student extends Person {
	private String grade;
	
	public Student() {
		grade = "";
	}
		
	public Student(String n, String a, String e, String p, Date b, String g) {
		name = n;
		address = a;
		email = e;
		phone = p;
		birthDate = b;
		grade = g;
	} 
	
	public String toString() {
		System.out.println(getClass().getName() + " " + name);
		return getClass().getName() + name;
	}
	
	public String getGrade() {
		return grade;
	}
}