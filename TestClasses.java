public class TestClasses {
	public static void main(String args[]) {
		Person [] array = {
		
		new Person("John", "1 Main St.", "john@gmail.com", "1234567890", new Date(2,1,2018)),
		new Student("Tim", "12345 Washington Way", "tim@tim.com", "1472583693", new Date(1,4,2008), "Sophomore"),
		new Employee("Lisa", "1 Jefferson Way", "lisa@lisa.com", "3215678945", new Date(2,7,2008), new Date(3,4,2005), 100000),
		new Faculty("Heather", "4 Madison Way", "heather@heather.com", "1254689452", new Date(4,8,2000), "5pm-9pm", "assistant professor"),
		new Staff("Jake", "5 Lincoln Way", "jake@jake.com", "1456925647", new Date(2,4,2002), "Administrator")

		};
		
		for(int i = 0; i < array.length; i++) {
			array[i].toString();
		}
		
	}
}

