public class B {
	public static void main(String[] args) {
		String counts = "cws";
		System.out.println("counts is " + counts);
		System.out.println("here");
		for (int i = 0; i < counts.length(); i++) {
			if (counts.contains("c")) {
				System.out.println("here1");	
			}
			else if (counts.contains("w")) {
				System.out.println("here2");	
			}
		}
	}
}


// and paragraphs. A blank space or tab character should be used to delimit a word, a period (.)