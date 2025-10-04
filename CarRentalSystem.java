import java.util.List;

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
}
