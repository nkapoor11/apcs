public class CreateCats {
	public static void main(String[] args) {
		// Create two Cat objects
		Cat catOne = new Cat();
		Cat catTwo = new Cat();
		
		catOne.setBreed("American Bobtail");
		catOne.setAge(5);
		catOne.setWeight(10);
		catOne.setSex('f');
		catOne.setName("Orangey");
		
		catOne.setBreed("Burmese");
		catOne.setAge(10);
		catOne.setWeight(15);
		catOne.setSex('m');
		catOne.setName("Billy");
		
		String array [] = { "catOne", "catTwo" };
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].getBreed());
			
		}
		
		// Make the cats meow
		System.out.print("cat 1 says "); catOne.meow();
		System.out.print("cat 2 says "); catTwo.meow();
	}
}