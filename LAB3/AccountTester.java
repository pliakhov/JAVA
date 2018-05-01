
public class AccountTester {
		
	public static void main( String args[] ) {

	   Account paul,john,joe;
	   
	   // Create Accounts
       john = new Account (null, null,-1);
       paul = new Account ("Paul Liakhov","TD12345",180000);
       joe = new Account ("joey","bs1334",10000);
       
     
       
       // LAB#2
       Account paulClone, nullAcc, sam;
       paulClone = new Account ("Paul Liakhov","TD12345",180000);
       nullAcc = null;
       sam = new Account ("SamIam", "DT78910", 170000);
       
       // True when two objects are equal
       System.out.println(paul.equals(paulClone));
       
       // False when two objects are not equal
       System.out.println(paul.equals(sam));
       
       // false when the null reference is passed as the parameter.
       System.out.println(paul.equals(nullAcc));
       
 }
}
