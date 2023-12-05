public class Car extends Vehicle {
    
    //args constructor
    public Car(String vehicleId, String brand, String model, int parkingDuration)
    {
        super(vehicleId, brand, model, parkingDuration);
        
    }

    //definds the abstract method from Vehicle class
    @Override
    public void park()
    {
        System.out.println("Parking car " + getVehicleId());
        System.out.println();
        //implement car parking logic
    }
    

}
