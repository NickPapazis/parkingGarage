public class Truck extends Vehicle {

    //args constructor
    public Truck(String vehicleId, String brand, String model, int parkingDuration)
    {
        super(vehicleId, brand, model, parkingDuration);
    }

    //definds the abstract method from Vehicle class
    @Override
    public void park()
    {
        System.out.println("Parking truck " + getVehicleId());
        System.out.println();
    }
    
}
