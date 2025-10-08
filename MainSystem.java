public class MainSystem {
    public static void main(String[] args) {

         CarRentalSystem rentalSystem = new CarRentalSystem();

        Car car1 = new Car("C001", "Suzuki", "Alto", 35.0);
        Car car2 = new Car("C002", "Toyota", "Corolla", 50.0);
        Car car3 = new Car("C003", "Honda", "City", 55.0);
        Car car4 = new Car("C004", "Kia", "Sportage", 90.0);
        Car car5 = new Car("C005", "Hyundai", "Tucson", 95.0);
        Car car6 = new Car("C006", "Suzuki", "Cultus", 40.0);
        Car car7 = new Car("C007", "Toyota", "Yaris", 48.0);
        Car car8 = new Car("C008", "Honda", "Civic", 70.0);
        Car car9 = new Car("C009", "MG", "HS", 100.0);
        Car car10 = new Car("C010", "Changan", "Oshan X7", 110.0);

        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);
        rentalSystem.addCar(car4);
        rentalSystem.addCar(car5);
        rentalSystem.addCar(car6);
        rentalSystem.addCar(car7);
        rentalSystem.addCar(car8);
        rentalSystem.addCar(car9);
        rentalSystem.addCar(car10);

        rentalSystem.menu();
        
    }
}
