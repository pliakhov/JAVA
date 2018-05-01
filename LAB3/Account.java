/* Student: Paul Liakhov
 * #: 108048166
 * 
 */

public class Account {
		private String m_name;
		private String m_number;
		private int m_balance;
		
		
		public Account() {
			this.m_name = "";
			this.m_number = "";
			this.m_balance = 0;
		}
		
		/* Function: Account (String name, String no, int balance) 
		 * ---------------
		 * Desc: Account constructor which recieves in the Fullname,
		 * Account number and balance as parameters 
		 * and assigns them to the member variables.
		 * 
		 */
		public Account (String name, String no, int balance) {
			
			// Fill the name
			if(name == null)
				this.m_name = "";
			else
				this.m_name = name;
			// Fill the Account Number
			if(no == null)
				this.m_number ="";
			else
				this.m_number = no;
			// Fill the Balance
			if(balance <0)
				this.m_balance = 0;
			else
				this.m_balance = balance;
		}
		
		public void setFullName(String fname){
			this.m_name = fname;
		}
		
		public void setAccountNumber(String accNum){
			this.m_number = accNum;
		}
		
		public void setAccountBalance(int balance){
			this.m_balance = balance;
		}
		
		public String getFullName() {
			return this.m_name;
		}
		public String getAccountNumber() {
			return this.m_number;
		}
		public int getAccountBalance() {
			return this.m_balance;
		}
		
		
		 public String toString() {

		       String ts;
		       
		       ts = "*****************************************\n" +
		               "*           Account Information         *\n" +
		 	          "*****************************************\n" +
		               "Full Name      : " + this.m_name + "\n" +
		               "Account Number : " + this.m_number + "\n" +
		               "Account Balance: $" + this.m_balance + "\n";

		        return ts;
		 }
		 
		 /*
		  * (non-Javadoc)
		  * This .equals function for the Account Object 
		  * compares the two Account objects, checks if it is of 
		  * object type Account.
		  * Checks if all the member values are the same between the 
		  * two Accounts(m_name, m_number, m_balance). 
		  */
		 public boolean equals( Object e ) {
			 
			 // Result of comparison 
			 boolean flag = false;
			 
			 // Check if Account type 
			 if ( e instanceof Account ) {
				 
				 Account test = (Account) e;
				 
				 if(test.m_name.equals(m_name) &&
					test.m_number.equals(this.m_number) &&
					test.m_balance == this.m_balance)   {
					  flag = true;
				 }
				 
			 }
			 
			 
			 return flag; 
		 }
		 
		 
}
