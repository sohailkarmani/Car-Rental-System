public class Customer {
    private String customerID;
    private String customerName;
    Customer(String customerID,String customerName){
        this.customerID=customerID;
        this.customerName=customerName;
    }

    public String getCustomerID(){
        return customerID;
    }
    public String getCustomerName(){
        return customerName;
    }
}
