public class Cat {
	private String breed;
	private int age;
	private double weight;
	private char sex;
	private String name;
	
	public String eat() {
		return "Munch, Munch, Munch";
	}
	
	public String meow() {
		return "Meeeeeooww";
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setBreed(String s) {
		breed = s;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double w) {
		weight = w;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char x) {
		sex = x;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String x) {
		name = x;
	}
}

