public class Customer {
    private int customerId;
    private String customerName;
    private String phoneNumber;

    public Customer(int customerId,String customerName,String phoneNumber){
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
    }
    public int getCustomerId() {
        return customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }   

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayCustomerInfo(){
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Phone Number: " + phoneNumber);
    }
}