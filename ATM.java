import java.util.Scanner;

public class ATM {
  public ATM() {
    System.out.println("Welcome to the ATM ;)");
  }Scanner scan = new Scanner(System.in);  

  public void displayMenu() {
    System.out.println("Please select an option :");
    System.out.println("1. Withdraw $");
    System.out.println("2. Deposit $");
    System.out.println("3. Check Balance$"); 
    System.out.println("4. Exit!");
  } 
  
  public int requiredOperation() {
    System.out.print("Please Enter Your option : ");
    int option = scan.nextInt();
    return option ; 
  }
  public void makeCheck(int inputNumber) {
 	  while(true)  { 
 	       	if((inputNumber<0)||(inputNumber>4))
 	       	{System.out.println("Please Enter a number from 1:4 only !!!");}
 	       	 break;}}

  public void withdraw(Client client) {
	  System.out.print("Please Enter an amount: ");
	    double amount = scan.nextDouble();
    if (client.balance >= amount) {
    	client.balance -= amount;  
      System.out.println("Withdrawal operation successful ;)");
    } else {
      System.out.println("Sorry Insufficient funds :(");
    }
  }

  public void deposit(Client client) {
	  System.out.print("Enter amount: ");
	    double amount = scan.nextDouble();
	    client. balance += amount;
    System.out.println("Deposit operation successful ;]");
  }

  public void checkBalance(Client client) {
    System.out.println("Your balance is : " + client.balance+"$");
  }

}