public class bankingSystem {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(342675, "Rezen ", 13243546);
        System.out.println(ba.getAccBalance());
        ba.deposit(42443);
        System.out.println(ba.getAccBalance());
        ba.withdraw(100);
        System.out.println(ba.getAccBalance());
        
    }
}
/* You are building a banking application that has a BankAccount class. 
Implement the BankAccount class with encapsulation principles in mind. 
Include private instance variables for the account number, account holder name, and account balance. 
Provide public methods to allow clients to deposit and withdraw funds, as well as access the account balance.
Ensure that the bank account balance cannot be access or modified directly.
Ensure that user cannot withdraw balnce if it can go to negative 
note make constructor to fill the attribute on account opening
make getter for the account number and account hloder name
make a function display current balance to display current balance*/

class BankAccount{
    private int accountNumber;
    private String accHolderName;
    private double accBalance;

BankAccount(int accountNumber,String accHolderName, double accBalance ){
    this.accountNumber = accountNumber;
    this.accHolderName = accHolderName;
    this.accBalance = accBalance;
}
public void deposit(double money){
    this.accBalance += money;
}
public void withdraw(double money){
   if( this.accBalance - money>0){
    this.accBalance -= money; 
   }else{
    System.out.println("Not enough money");
   }
public double getAccBalance(){
    return this.accBalance;
}
}