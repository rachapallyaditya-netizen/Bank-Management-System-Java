public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(int accountNumber,double  balance,Customer customer,double overdraftLimit){
        super(accountNumber,balance,customer);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit(){
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount <=(getBalance()+getOverdraftLimit())){
            setBalance(getBalance()-amount);
            System.out.println("Withdrawal Successful");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    @Override
   public void displayAccountInfo(){
    super.displayAccountInfo();

    System.out.println("Account Type: Current");
    System.out.println("Overdraft Limit : " +overdraftLimit);
}
}