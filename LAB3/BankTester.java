
public class BankTester {
	
	public static void main( String args[] ) {
	
		String accountNames [] = { "John Doe", "Mary Ryan", "Peter Liu", "John Doe", "Peter Liu" };
		String accountNumbers [] = { "A1234", "B5678", "C9999", "A1234", "D8901" };
		int accountBalances [] = { 1000, 3000, 5000, 7000, 3000 };
		
		Bank bankOfP = new Bank("Paul Liakhov");
		Bank bankOfT = new Bank("Paul Liakhov");
		Bank bankOfS = new Bank("Paul Liakhov");
		// Test Case 2. a)
		System.out.println(bankOfP);
		
		
		
		// Concatenate the acNames, acNumbers, acBalances and insert into bank
		for(int i = 0; i < accountNames.length; i++) {
			
			Account temp = new Account (accountNames[i],accountNumbers[i],accountBalances[i]);
			
			bankOfP.addAccount(temp);
			bankOfS.addAccount(temp);
		}
		
		// Test Case 2. b)
		System.out.println(bankOfP);

		
		// Test Case 2. c)
		System.out.println("--Test for null addAccount--");
		System.out.println(bankOfP.addAccount(null));
		
		
		// Test Case 2. d) MIGHT NOT WORK
		
		System.out.println("--Test for searchByBalance--");
		
		Account[] s_acc =  bankOfP.searchByBalance(3000);
		
		System.out.println("Two accounts are found   ");
		for(int j = 0; j < bankOfP.searchByBalance(3000).length; j++) {
			
			System.out.println(j+1 + ". number: " + s_acc[j].getAccountNumber() 
					+ ", name: " + s_acc[j].getFullName()
					+ ", balance: $" + s_acc[j].getAccountBalance() );
		
		}
		
		if( bankOfP.searchByBalance(-1111).length == 0) {
			System.out.println("*** NO ACCOUNT FOUND ***");
		}
		else {
			System.out.println("*** ACCOUNT FOUND ***");
		}
		
		
		
		//Test Case 3
		// Concatenates in reverse order
		for(int x = accountNames.length-1; x >= 0; x--) {
			
			Account temp = new Account (accountNames[x],accountNumbers[x],accountBalances[x]);
			
			bankOfT.addAccount(temp);
			
		}
		
		System.out.println("--Test for different Sequence--");
		// Test for Different Sequence same accounts.
		if(bankOfP.equals(bankOfT)) {
			System.out.println("Same Bank!");
		}
		else {
			System.out.println("Different Bank!");
		}
		
		
		
		System.out.println("--Test for Same Sequence--");
		// Test for Same Sequence same accounts.
		if(bankOfP.equals(bankOfS)) {
			System.out.println("Same Bank!");
		}
		else {
			System.out.println("Different Bank!");
		}
		
	}
}
