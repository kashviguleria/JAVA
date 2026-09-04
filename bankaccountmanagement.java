// package evaluation2;
// Question

// Create a class named BankAccount.

// Each customer has:

// Account Number
// Customer Name
// Balance

// Create a constructor to initialize all values and display all account information.
import java.util.Scanner;
class bankaccount{
    int accountnumber;
    String customername;
    double balance;


bankaccount(int accountnumber, String customername, double balance){
 this.accountnumber=accountnumber;
 this.customername=customername;
 this.balance=balance;
}

void display(){
    System.out.println(accountnumber);
      System.out.println(customername);
        System.out.println(balance);
}
}
public class bankaccountmanagement {
    public static void main(String[] args) {
        
    
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Balance: ");
        double bal = sc.nextDouble();

     bankaccount customer = new bankaccount(accNo, name, bal);

        System.out.println("\nCustomer Details");
        customer.display();

        sc.close();
    }
}
