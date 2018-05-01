
public class ArrayTester {

	
	public static void main( String args[] ) {
		
		Account list [] = new Account [7];
		
		list[0] = new Account("Peter Liu", "A12345", 5000);
		list[1] = new Account("Peter Liu", "A67890", 6000);
		list[2] = new Account("Abraham Lincoln", "Z6789", 7777);
		list[3] = new Account("Peter Liu", "A12345", 5000);
		list[4] = new Account("Paul Liakhov", "E3333", 9000);
		list[5] = new Account("Abraham Lincoln", "Z6789", 7777);
		list[6] = new Account("Abraham Lincoln", "Z6789", 7777);
		
	
		System.out.println("SUMMARY");
		System.out.println("+ total number of accounts: " + list.length);
		
		// Array for Objects that have already been used 
		Account alreadyUsed [] = new Account[list.length];
		int matches;
		int usedC = 0;
		
		for (int i = 0; i < list.length; i++ ) {
			
			boolean used = false;
			
			// Loop to check if already used.
			for(int x = 0; x < alreadyUsed.length; x++) {
				if( list[i].equals(alreadyUsed[x]) ) {
					used = true;
				}
			}
			
			// Run process if not used.
			if(used == false) {
				
				// Set and Reset
				matches = 0;
				
				// Find number of matches in list 
				for ( int h = i; h < list.length; h++) {
					if( list[i].equals(list[h]) ) {
						matches++;
					}
				}
				usedC++;
				System.out.println( usedC + ". " + list[i].getFullName() 
				+ ", " + list[i].getAccountNumber() + ", " 
				+ list[i].getAccountBalance() 
				+ ": " + matches);
				alreadyUsed[usedC-1] = list[i];
				
				
			}// Not used Process
			
		}// Main Loop
	
	
	}
	
	
}
