import java.util.List;
import java.util.Scanner;

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
                
            }

            
        }
    }
}
