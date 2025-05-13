 package implementationofinterface;
  public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
    default void checkMinimumBalance(){
        if(checkBalance()<1000){
            System.out.println("Balance of minimum 1000 required! Warning issue...");
        }else{
            System.out.println("Balance is sufficient!");
        }
    }
}
