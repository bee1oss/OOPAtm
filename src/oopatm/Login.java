
package oopatm;
import java.util.Scanner;

public class Login {
   
    public boolean login(Hesap hesap){
       
       Scanner scanner = new Scanner(System.in);
       String user_name;
       String password;
            System.out.print("User Nmae:");
            user_name = scanner.nextLine();
            System.out.print("Password:");
            password = scanner.nextLine();
            
            if(hesap.getUser_name().equals(user_name) && hesap.getPassw().equals(password)){
                return true;
            }
            else{
                return false;
            }
   } 
}
