/**
 * This program uses an LinkedList to display the properties of various print job items.
 * @author Neil Kapoor
*/
import java.util.*;

public class Unit12Lab2 {
	public static void main(String[] args) {
		// initialize for user input.
		Scanner input = new Scanner(System.in);
		LinkedList<Job> q = new LinkedList<Job>();
		
		// initialize variables. 
		long rnSeed = 0;
		Random rnGenerator = new Random(rnSeed); // creates Random object.
		int n = 1; // number in queue.
		int printTime = 0;
		boolean getInput = true;
		
		// get user input and run program.
		while(getInput) {
			// get user input
			System.out.print("Enter \"add\" to add a job to the queue or \"quit\" to quit: ");
			String action = input.next();
			
			// do appropriate action based on user input.
			if (action.equals("add")) {
				printTime = rnGenerator.nextInt(1000) + 10; // next int in range 0 to 30. 
				q.add(new Job(n, printTime));
				n++; // increment queue number.
			} else {
				// user input must have been quit.
				// display the jobs (i.e., the job id and print time) in the queue, 
				// in the order in which they were added.
				System.out.println( "Job id and print time:");
				for (Job j : q) {
					System.out.println("Job id: " + j.getNumber() + "\t" + "Print time: " + j.getPrintTime());
				}
				getInput = false;
			}
		}
		
		
		
	}
}