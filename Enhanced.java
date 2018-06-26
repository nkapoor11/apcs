public class Enhanced {
	public static void main(String[] args) {
		int [] a = {  20, 30, 40, 50 };
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		doubleValues(a);
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
	
	public static void doubleValues(int [] b) {
		for(int i = 0; i < b.length; i++) {
			b[i] = 2 * b[i];
			
		}
	}
}