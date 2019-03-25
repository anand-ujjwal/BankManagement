package AccountTestMain;
import Balance.*;
import java.util.Scanner;
public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		         account account1 = new account("Ujjwal", 50.00); 
		         account account2 = new account("Anand", -7.53);  
		 
		        // display initial balance of each object
		          System.out.printf("%s balance: Rs.%.2f%n",
		             account1.getName(), account1.getBalance());
		         System.out.printf("%s balance: Rs.%.2f%n%n",
		            account2.getName(), account2.getBalance());
		 
		        // create a Scanner to obtain input from the command window
		         Scanner input = new Scanner(System.in);
		         System.out.println("--------Depositing the amount---------------");
		         System.out.print("Enter deposit amount for account1: "); // prompt
		         double depositAmount = input.nextDouble(); // obtain user input
		          System.out.printf("%nadding %.2f to account1 balance%n%n",
		             depositAmount);
		          account1.deposit(depositAmount); // add to account1's balance  
		 
		         // display balances
		          System.out.printf("%s balance: Rs.%.2f%n",
		             account1.getName(), account1.getBalance());
		          System.out.printf("%s balance: Rs.%.2f%n%n",
		             account2.getName(), account2.getBalance());
		 
		          System.out.print("Enter deposit amount for account2: "); // prompt
		          depositAmount = input.nextDouble(); // obtain user input
		         System.out.printf("%nadding %.2f to account2 balance%n%n",
		             depositAmount);
		          account2.deposit(depositAmount); // add to account2 balance 
		 
		          // display balances
		          System.out.printf("%s balance: Rs.%.2f%n",
		             account1.getName(), account1.getBalance());
		          System.out.printf("%s balance: Rs.%.2f%n%n",
		             account2.getName(), account2.getBalance());
		          
		          
		          System.out.println("--------Withdrwaing the amount---------------");
		          System.out.print("Enter withdrawal amount for account1: "); // prompt
			         double withdrawAmount = input.nextDouble(); // obtain user input
			          System.out.printf("%nsubtracting %.2f to account1 balance%n%n",
			        		  withdrawAmount);
			          account1.withdraw(withdrawAmount); // add to account1's balance  
			 
			         // display balances
			          System.out.printf("%s balance: Rs.%.2f%n",
			             account1.getName(), account1.getBalance());
			          System.out.printf("%s balance: Rs.%.2f%n%n",
			             account2.getName(), account2.getBalance());
			 
			          System.out.print("Enter withdrawal amount for account2: "); // prompt
			          withdrawAmount = input.nextDouble(); // obtain user input
			         System.out.printf("%nsubtracting %.2f to account2 balance%n%n",
			        		 withdrawAmount);
			          account2.withdraw(withdrawAmount); // add to account2 balance 
			 
			          // display balances
			          System.out.printf("%s balance: Rs.%.2f%n",
			             account1.getName(), account1.getBalance());
			          System.out.printf("%s balance: Rs.%.2f%n%n",
			             account2.getName(), account2.getBalance());
	}

}
