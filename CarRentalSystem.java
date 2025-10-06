import java.util.List;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class CarRentalSystem {
    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;

    public CarRentalSystem(){
        cars=new arraylist<>;
        customers=new arraylist<>;
        rentals=new arraylist<>;
    }
    public void addCar(){
        cars.add(car);
    }
    public void addCustomer(){
        customers.add(customer);
    }
    public void rentCar(Car car,Customer customer,int days){
        if(car.isAvailable()){
            car.rent();
            rentals.add(new Rental(car, customer, days));

        }
        else{
            System.out.println("Car is not avialable for rent");
        }
    }
    public void returnCar(Car car){
        car.ReturnCar();
        Rental rentalRemove=null;
        for(Rental rental:rentals){
            if(rental.getCar()==car){
                rentalRemove=rental;
                break;
            }
        }
        if(rentalRemove!=null){
            rentals.remove(rentalRemove);

        }
        else{
            System.out.println("Car was not rented.");
        }
    }
    public void menu(){
        Scanner scanner=new Scanner(System.in);
        while (true) {
            System.out.println("----Car Rental System----");
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Exit");
            System.out.println("Enter Your choice: ");

            int choice =scanner.nextInt();
            scanner.nextLine();
            if(choice==1){
                System.out.println("\n==Rent a Car ==\n");
                System.out.println("Enter Your name: ");
                String customerName=scanner.nextLine();

                System.out.println("\nAvailable Cars: ");
                for(Car car:cars){
                    if(car.isAvailable()){
                        System.out.println(car.getID()+" - "+car.getBrand()+" - "+car.getModel());

                    }
                }
                System.out.println("\nEnter the car ID you want to rent: ");
                String carID=scanner.nextLine();
                System.out.println("Enter the number of days for rental: ");
                int rentalDays=scanner.nextInt();
                scanner.nextLine();

                Customer newCustomer=new Customer("CUS" + (customers.size()+1),customerName);
                addCustomer(newCustomer);

                Car selectedCar=null;
                for(Car car: cars)
                {
                    if(car.getID().equals(carID) && car.isAvailable()){
                        selectedCar=car;
                        break;
                    }
                }
                if(selectedCar!=null)
                {
                    double totalPrice=selectedCar.calculatePrice(rentalDays);
                    System.out.println("\n==Rental Information ==\n");
                    System.out.println("Customer ID: "+newCustomer.getCustomerID());
                    System.out.println("Customer Name: "+newCustomer.getCustomerName());
                    System.out.println("Car: "+selectedCar.getBrand()+" "+selectedCar.getModel());
                    System.out.println("Rental Days: "+rentalDays);
                    System.out.println("Total Price: $%.2f%n",totalPrice);

                    System.out.println("\nConfirm Rental (Y/N)");
                    String confirm=scanner.nextLine();

                    if(confirm.equalsIgnoreCase("Y"))
                    {
                        rentCar(selectedCar, newCustomer, rentalDays);
                        System.out.println("\n Car Rented successfully.");
                    }
                    else{
                        System.out.println("\nRental canceled.");
                    }
                }
                else{
                    System.out.println("\n Invailid car selection or car not available for rent.");
                }

                
            } 
            else if(choice ==2){
                System.out.println("\n== Return a Car ==\n");
                System.out.println("Enter the car ID you want to return:");
                String carID=scanner.nextLine();

                Car carToReturn=null;
                for(Car car:cars){
                    if(car.getID().equals(carID) && !car.isAvailable()){
                        carToReturn=car;
                        break;
                    }
                }
                if(carToReturn !=null){
                    Customer customer=null;
                    for(Rental rental : rentals){
                        if(rental.getCar()==carToReturn){
                            customer=rental.getCustomer();
                            break;
                        }
                    }

                    if(customer!=null){
                        returnCar(carToReturn);
                        System.out.println("car returned successfully by "+customer.getCustomerName());

                    }
                    else{
                        System.out.println("car was not rented or rental information is missing.");
                    }
                }
                System.out.println("Invalid car ID or car is not rented.");
            }
        }
        else if(choice==3){
            break;
        }
        else{
            System.out.println("Invalid choice. please enter a valid option.");
        }
    }
    System.out.println("\n Thank You for using the car rental system.")
}
