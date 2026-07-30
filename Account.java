public abstract class Account{
    private int accountNumber;
    private double balance;
    private Customer customer;

    public Account(int accountNumber, double balance, Customer customer){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    protected void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("Deposited successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        customer.displayCustomerInfo();
    }

    public abstract void withdraw(double amount);
}