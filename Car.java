//package Car-Rental-System;

public class Car {
    private String carID;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(String carID,String brand, String model,boolean isAvailable){
        this.carID=carID;
        this.brand=brand;
        this.model=model;
        this.isAvailable=true;
    }
    public String getID(){
        return carID;
    }
    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double calculatePrice(int rentalDays){
        return pricePerDay*rentalDays;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void rent(){
        isAvailable=false;
    }
    public void ReturnCar(){
        isAvailable = true;
    }

    
}
