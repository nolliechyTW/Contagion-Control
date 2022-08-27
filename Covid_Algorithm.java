import java.util.Scanner;

public class Covid_Algorithm {
	
	public static void main (String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter numer of citizens");
		
		//part one: create an array called ID according to input
		int id = input.nextInt();
		int [] ID =  new int [id];
		for (int i = 0; i < ID.length; i++) {
		    ID[i] = i;
		} 
		System.out.printf("%10s ","ID"); 
		for (int i =0; i <ID.length; i++) {
			System.out.printf("%3d", i);
		}
		System.out.println();
		
		//part two: Shuffle numbers to create an array called Contactee
		for (int i = 0; i < ID.length; i++) {
			int j = (int) (Math.random() * (ID.length - i) + i);
			int temp = ID[i];
			ID[i] = ID[j];
			ID[j] = temp;
		}
		
		System.out.printf("%10s ","Contactee");
		for (int i = 0; i <ID.length; i++) {
			System.out.printf("%3d", ID[i]);
		}
		System.out.println();
		System.out.println("----------------------------");
		
		//part three: find the chain of the virus from one person to the next
		System.out.println("Enter id of infected citizen: ");
		int infectedid = input.nextInt();
		System.out.println("These citizens are to be self-isolated in the following 14 days: ");
		int contacteeid = infectedid;
		do {
			System.out.printf("%d ", contacteeid);
			contacteeid = ID [contacteeid];
		} while (infectedid != contacteeid);
		System.out.println();

	}
	
}
