public class Bank{
    private Customer[] customers;
    private Account[] accounts;

    private int customerCount;
    private int accountCount;

    public Bank(){
        customers = new Customer[100];
        accounts = new Account[100];

        customerCount=0;
        accountCount=0;
    }

    public void addCustomer(Customer customer){
        if(customerCount < customers.length){
        customers[customerCount] = customer;
        customerCount++;
        //System.out.println("Customer  added Successfully ");
        }else{
            System.out.println("Bank Customer Limit reached");
        }
    }

    public void addAccount(Account account){
        if(accountCount < accounts.length){
        accounts[accountCount] = account;
        accountCount++;
       // System.out.println("Account created successfully");
    }else{
        System.out.println("Bank Account limit reached");
    }
    }

    public void displayAllAccounts(){
        for(int i =0;i<accountCount;i++){
            accounts[i].displayAccountInfo();
            System.out.println("-------------------------");
        }
    }

    public Customer findCustomer(int customerId){
        for(int i=0;i<customerCount;i++){
           if(customerId==customers[i].getCustomerId()){
            return customers[i];
        }
    }
    return null;
}


    public void displayAllCustomers(){
        for(int i=0;i<customerCount;i++){
           customers[i].displayCustomerInfo();
           System.out.println("-------------------------");
        }
    }

    public Account findAccount(int accountNumber){
        for(int i=0;i<accountCount;i++){
            if(accounts[i].getAccountNumber()==accountNumber){
                return accounts[i];
            }
        }
        return null;
    }
}