package implementationofinterface;
 public class SavingAccount implements BankAccount{
    private double balance;
    public SavingAccount(double balance){
        this.balance=balance;
    }
    @Override
    public void deposit(double amount){
        balance+=amount;
        System.out.println(" Amount is deposited to Saving... ");
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
     
}
