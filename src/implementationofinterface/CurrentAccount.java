package implementationofinterface;
 public class CurrentAccount implements BankAccount{
       private double balance;
    public CurrentAccount(double balance){
        this.balance=balance;
    }
    @Override
    public void deposit(double amount){
        balance+=amount;
    }
    @Override
     public void withdraw(double amount){
      if(amount<balance&&amount>0){
          balance-=amount;
            System.out.println("Withdrawn from Saving... ");
      }else{
          System.out.println("Invalid Amount");
      }
    }
    @Override
     public double checkBalance(){
         return balance;
     }
       @Override
     public void checkMinimumBalance(){
          if(checkBalance()<5000){
            System.out.println("Balance of minimum 5000 required! Current Account Warning issue...");
        }else{
            System.out.println("Current Account balance is sufficient!");
     }
     }
}
