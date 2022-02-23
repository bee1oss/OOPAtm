
package oopatm;

public class Main {
    public static void main(String[] args) {
        
        ATM atm =new ATM();
        
        Hesap hesap = new Hesap("Bega","1234",2000.0);
        atm.work(hesap);
        System.out.println("Exiting the program....");
        System.out.println("");
    }
}
