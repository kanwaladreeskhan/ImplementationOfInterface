package implementationofinterface;
 public class ImplementationOfInterface {
     public static void main(String[] args) {
       BankAccount account1=new SavingAccount(40000);
       account1.deposit(2000);
       account1.withdraw(5000);
       System.out.println(account1.checkBalance());
       account1.checkMinimumBalance();
       BankAccount account2=new CurrentAccount(6000);
       account2.deposit(2000);
       account2.withdraw(5000);
       System.out.println(account2.checkBalance());
       account2.checkMinimumBalance();
    }
    
}
