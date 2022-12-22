package ATM; 
import java.text.NumberFormat;
import java.util.Scanner; 
public class AtmInterface { 
   public static void main(String[] args) { 
   try (Scanner sc = new Scanner(System.in)) {
      int balance = 10000; 
      NumberFormat.getCurrencyInstance(); 
      System.out.println("Welcome to BOI ATM! \nKindly Enter your UserId :"); 
      String Name = sc.nextLine(); 
      System.out.println("Kindly Enter your 4-digit Pin :");
      int Pin = sc.nextInt(); 
      System.out.println("Login Completed!!!!");
         do{
           System.out.println("1.Withdraw");
           System.out.println("2.Deposit");
           System.out.println("3.Check Balance");
           System.out.println("4.Transfer Amount");
           System.out.println("5.Exit");
           System.out.print("Enter your choice:");
           int ch = sc.nextInt();
           if(ch==5){
                 System.out.println("Thank You... Have a nice day !");
                 break;
             }
           switch(ch){
             case 1: { 
               System.out.println("Enter amount to be withdrawn :"); 
               int withdrawn = sc.nextInt(); 
               if (balance >= withdrawn) { 
                  balance -= withdrawn; 
                  System.out.println("Available balance : " + balance + "\nPlease collect your cash and card !");
                  System.out.println("Transaction History :RS" + withdrawn + " is your total withdrawal amount."); 
               
               }
             else { 
                  System.out.println("Insufficient Balance..."); 
               } 
            } 
            break;
            case 2: { 
               System.out.println("Enter amount to be deposited :"); 
               int deposits = sc.nextInt(); 
               balance += deposits; 
               System.out.println("Available balance : " + balance); 
            }
            break; 
            case 3: 
            System.out.println("Current Balance :" + balance);
            break; 
            case 4: { 
               System.out.println("Enter Receiver's account number :"); 
               int other=sc.nextInt(); 
               System.out.println("Enter amount to be transferred :"); 
               int amount= sc.nextInt();
                if(balance >= amount) { 
                  System.out.println("Enter your PIN :"); 
                  int pin = sc.nextInt(); 
                  if (pin == Pin) { 
                     balance -= amount; 
                     System.out.println("Amount has been transferred successfully from " + Name + " to account no. :" + other);
                     System.out.println("Transaction History :Transfered amount RS" + amount +" to receiver " + other); 
                     System.out.println("Available Balance:" + balance);
                      
                  } 
                     else { System.out.println("Invalid PIN provided..."); 
                  } 
               } 
               else{ 
                  System.out.println("Insufficient Balance..."); 
               } 
            }
         } 
                   
      }while(true);
   }
 }
}