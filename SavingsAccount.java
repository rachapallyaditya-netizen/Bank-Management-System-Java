public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(int accountNumber,double  balance,Customer customer,double interestRate){
        super(accountNumber,balance,customer);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }
    @Override
    public void withdraw(double amount){
        if(getBalance() >= amount){
            setBalance(getBalance()-amount);
            System.out.println("Amount Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
   @Override
   public void displayAccountInfo(){
    super.displayAccountInfo();

    System.out.println("Account Type: Savings");
    System.out.println("Interest Rate : " +interestRate + " % ");
}
}