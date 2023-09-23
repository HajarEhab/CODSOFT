import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    ATM atm = new ATM();
    
    Scanner scan = new Scanner(System.in);
    double initialBalance;
    
    while(true) {
        System.out.print("Please Enter Your initial balance: ");
        initialBalance = scan.nextDouble();

        if((initialBalance > 0)||(initialBalance==0)) {
          break;
        } else {
          System.out.println("Balance must be greater than or equal zero!!!"); 
        }
        }
    Client client = new Client (initialBalance); 
    
    boolean tryAgain =true; 
    
    while(tryAgain) {
    
    	  atm.displayMenu();
          
          int choice = atm.requiredOperation();
    
      if(choice== 1) {
        atm.withdraw(client); 
      } else if(choice== 2) {
        atm.deposit(client); 
      } else if(choice == 3) {
        atm.checkBalance(client);
      } else if(choice==4){
    	  System.out.println("Thanks For Using Our  ATM");
    	   System.out.print("Do you want to make another transaction? (yes/no): ");
           String operateAgain = scan.next().toLowerCase();
       if (operateAgain .equals("no")) {
           tryAgain = false;
          
       }
    }else { atm. makeCheck(choice);}

  }

}}