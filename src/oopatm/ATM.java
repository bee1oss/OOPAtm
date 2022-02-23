
package oopatm;
import java.util.Scanner;


public class ATM {
    public void work(Hesap hesap){
         Login login = new Login();
         
         Scanner scanner = new Scanner(System.in);
         System.out.println("welcome to our bank...");
         
         System.out.println("*************************");
         System.out.println("User Login...");
         System.out.println("*************************");
         int try_chanse = 3;
         while(true){
             if(login.login(hesap)){
                 System.out.println("Login successful...");
                 break;
             }
             else{
                 System.out.println("Login failed...");
                 try_chanse -= 1;
                 System.out.println("Remaining chance to try:" + try_chanse);
             }
             if(try_chanse == 0){
                 System.out.println("your chance to try is over...");
                 return ;
             }
         }
         
         System.out.println("*************************");
         String process = "1. View balance\n"
                 + "2. Deposit process\n"
                 + "3. Withdrawal process\n"
                 + "Press q to exit";
         System.out.println(process);
         System.out.println("*************************");
         
         while(true){
             System.out.print("Choose one of the options:");
             String proc = scanner.nextLine();
             if(proc.equals("q")){
                 break;
             }
             else if(proc.equals("1")){
                 System.out.println("Your balance:" + hesap.getBalance());
             }
             else if(proc.equals("2")){
               System.out.print("Enter the amount to deposit:");
               int dep = scanner.nextInt();
               scanner.nextLine();
               hesap.depositMon(dep);
             }
             else if(proc.equals("3")){
               System.out.print("Enter the amount to withdrawal:");
               int wit = scanner.nextInt();
               scanner.nextLine();
               hesap.widMon(wit);
             }
             else{
                 System.out.println("You made a wrong choice");
             }

         }
         
          
    }
}
