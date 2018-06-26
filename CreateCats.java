public class CreateCats {
	public static void main(String[] args) {
		// Create two Cat objects
		Cat catOne = new Cat();
		Cat catTwo = new Cat();
		
		//  Set the values of their attributes and display the attribute information
		catOne.setBreed("American Bobtail");
		catOne.setAge(5);
		catOne.setWeight(10);
		catOne.setSex('f');
		catOne.setName("Orangey");
		
		catTwo.setBreed("Burmese");
		catTwo.setAge(10);
		catTwo.setWeight(15);
		catTwo.setSex('m');
		catTwo.setName("Billy");

		
		Cat array [] = { catOne, catTwo };
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getBreed());
			System.out.println(array[i].getAge());
			System.out.println(array[i].getWeight());
			System.out.println(array[i].getSex());
			System.out.println(array[i].getName());
			
		}
		
		// Change the name and age of the first Cat object and display its attributes.
		catOne.setName("Blackie");
		catOne.setAge(6);
		System.out.println(catOne.getName());
		System.out.println(catOne.getAge());
		
		// Change the age and weight of the second Cat object, display its attributes, and invoke its meow() method.
		catTwo.setWeight(20);
		catOne.setAge(16);
		System.out.println(catTwo.getWeight());
		System.out.println(catTwo.getAge());
		catTwo.meow();
		
	}
}