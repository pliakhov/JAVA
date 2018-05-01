
public class AccountTester {
		
	public static void main( String args[] ) {

	   Account paul,john,joe;
	   
	   // Create Accounts
       john = new Account (null, null,-1);
       paul = new Account ("Paul Liakhov","TD12345",180000);
       joe = new Account ("joey","bs1334",10000);
       
       // Display the Accounts
       System.out.println(john);
       System.out.println(paul);
       System.out.println(joe);
 }
}
