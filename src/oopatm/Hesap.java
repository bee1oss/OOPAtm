
package oopatm;


public class Hesap {
    private String user_name;
    private String passw;
    private double balance;
    
    public Hesap(String user_name,String passw,double balance){
        this.user_name = user_name;
        this.passw = passw;
        this.balance = balance;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void depositMon(double amount){
        
        balance += amount;
        System.out.println("Your new balance:" + balance);
    }
    public void widMon(double amount){
        if(balance<amount){
            System.out.println("Not enough funds were found in your account...");
            
        }
        else{
            balance -= amount;
            System.out.println("New balance:" + balance);
        }
    }
}
