public class Main{
    public static void main(String[] args){
        Bank bank = new Bank();
        Customer customer1 = new Customer(101,"Aditya","1234567890");
        bank.addCustomer(customer1);
        Customer customer2 = new Customer(102,"Rahul","1234356783");
        bank.addCustomer(customer2);

        Account account1 = new SavingsAccount(1001,5000,customer1,4.5);
        Account account2 = new CurrentAccount(1002,10000,customer2,3000);

        bank.addAccount(account1);
        bank.addAccount(account2);

        System.out.println("===== Customers =====");
        bank.displayAllCustomers();

        System.out.println("===== Accounts =====");
        bank.displayAllAccounts();
        System.out.println("\n===== Search Account =====");
        Account foundAccount = bank.findAccount(1001);

        if(foundAccount!=null){
            foundAccount.displayAccountInfo();
        }else{
            System.out.println("Account Not Found");
        }
        System.out.println("\n===== Deposit =====");
       Account depositAccount = bank.findAccount(1001);

       if(depositAccount != null){
        depositAccount.deposit(2000);
        System.out.println("Deposit Successful");
        depositAccount.displayAccountInfo();
       }else{
        System.out.println("Account Not Found");
       }
        System.out.println("\n===== Withdrawal =====");
    Account withdrawAccount = bank.findAccount(1002);

if (withdrawAccount != null) {
    withdrawAccount.withdraw(5000);
    withdrawAccount.displayAccountInfo();
}
System.out.println("\n===== Search Customer =====");
Customer foundCustomer = bank.findCustomer(101);

if (foundCustomer != null) {
    foundCustomer.displayCustomerInfo();
} else {
    System.out.println("Customer Not Found");
}
    }
}